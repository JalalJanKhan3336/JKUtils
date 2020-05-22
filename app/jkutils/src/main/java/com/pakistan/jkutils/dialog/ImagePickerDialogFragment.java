package com.pakistan.jkutils.dialog;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;

import android.provider.MediaStore;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.pakistan.jkutils.R;
import com.pakistan.jkutils.databinding.FragmentImagePickerDialogBinding;
import com.pakistan.jkutils.engine.Glide4Engine;
import com.zhihu.matisse.Matisse;
import com.zhihu.matisse.MimeType;

import java.io.File;
import java.util.List;

public class ImagePickerDialogFragment extends DialogFragment {

    private static final int REQUEST_CODE_IMAGE_PICKER = 6554;
    private static final int REQUEST_CODE_IMAGE_CAMERA = 9884;

    private ImagePickerDialogListener mListener;

    public void setListener(ImagePickerDialogListener mListener) {
        this.mListener = mListener;
    }

    public ImagePickerDialogFragment() {
        // Required empty public constructor
    }

    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {

        AlertDialog dialog = null;

        if(getContext() != null){
            FragmentImagePickerDialogBinding binding = FragmentImagePickerDialogBinding.inflate(LayoutInflater.from(getContext()), null, false);

            AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
            builder.setView(binding.getRoot());

            binding.imageViaCameraIv.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    dismiss();
                    captureImage();
                }
            });

            binding.imageViaGalleryIv.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    dismiss();
                    pickImage();
                }
            });

            dialog = builder.create();
        }

        return dialog;
    }

    private void captureImage() {
        Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);

        if(getActivity() != null){
            if(intent.resolveActivity(getActivity().getPackageManager()) != null)
                startActivityForResult(intent, REQUEST_CODE_IMAGE_CAMERA);
        }

    }

    private void pickImage() {
        Matisse.from(this)
                .choose(MimeType.ofImage())
                .countable(true)
                .maxSelectable(100)
                .gridExpectedSize(getResources().getDimensionPixelSize(com.intuit.sdp.R.dimen._120sdp))
                .restrictOrientation(ActivityInfo.SCREEN_ORIENTATION_UNSPECIFIED)
                .thumbnailScale(0.85f)
                .imageEngine(new Glide4Engine())
                .showPreview(false) // Default is `true`
                .forResult(REQUEST_CODE_IMAGE_PICKER);
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(resultCode == Activity.RESULT_OK && data != null){
            if(REQUEST_CODE_IMAGE_CAMERA == requestCode){ // Capture Image by Camera
                Uri uri = data.getData();
                File file = new File(String.valueOf(uri));
                String path = file.getAbsolutePath();

                if(mListener != null)
                    mListener.onImagePickedFromCamera(uri, path);
            }
            else if(REQUEST_CODE_IMAGE_PICKER == requestCode){ // Browse images from Gallery
                List<String> paths = Matisse.obtainPathResult(data);

                if(mListener != null)
                    mListener.onImagePickedFromGallery(paths);
            }
        }

    }

    // Image Picker Dialog Listener
    public interface ImagePickerDialogListener {
        void onImagePickedFromCamera(Uri videoUri, String imagePath);
        void onImagePickedFromGallery(List<String> imagePaths);
    }


}