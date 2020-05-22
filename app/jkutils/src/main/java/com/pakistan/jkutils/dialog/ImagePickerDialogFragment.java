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
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.pakistan.jkutils.R;
import com.pakistan.jkutils.databinding.FragmentImagePickerDialogBinding;
import com.pakistan.jkutils.engine.Glide4Engine;
import com.zhihu.matisse.Matisse;
import com.zhihu.matisse.MimeType;
import com.zhihu.matisse.internal.entity.CaptureStrategy;

import java.io.File;
import java.util.List;


// Add this to your app's Manifest file inside application tag
//
// <provider
//     android:name="android.support.v4.content.FileProvider"
//     android:authorities="your_package_name.fileprovider"
//     android:grantUriPermissions="true"
//     android:exported="false">
//     <meta-data
//         android:name="android.support.FILE_PROVIDER_PATHS"
//         android:resource="@xml/file_path_provider" />
// </provider>
//
// to Use Camera add following lines to Mattise code
//
// .capture(true)
//  .captureStrategy(new CaptureStrategy(true,String authority))


public class ImagePickerDialogFragment extends DialogFragment {

    private static final String TAG = "ImagePickerDialogFragme";

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
        if(getActivity() != null){
            String authority = getActivity().getPackageName()+".fileprovider";

            Matisse.from(this)
                    .choose(MimeType.ofImage())
                    .countable(true)
                    .maxSelectable(100)
                    .capture(true)
                    .captureStrategy(new CaptureStrategy(true, authority))
                    .gridExpectedSize(getResources().getDimensionPixelSize(com.intuit.sdp.R.dimen._120sdp))
                    .restrictOrientation(ActivityInfo.SCREEN_ORIENTATION_UNSPECIFIED)
                    .thumbnailScale(0.85f)
                    .imageEngine(new Glide4Engine())
                    .showPreview(false) // Default is `true`
                    .forResult(REQUEST_CODE_IMAGE_CAMERA);
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
        Log.d(TAG, "_onActivityResult_RESULT_CODE: "+resultCode);
        Log.d(TAG, "_onActivityResult_RESULT_DATA: "+data);

        super.onActivityResult(requestCode, resultCode, data);

        if(resultCode == Activity.RESULT_OK && data != null){
            if(REQUEST_CODE_IMAGE_CAMERA == requestCode){ // Capture Image by Camera
                List<String> paths = Matisse.obtainPathResult(data);
                List<Uri> uris = Matisse.obtainResult(data);

                String path = paths.get(0);
                Uri uri = uris.get(0);

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