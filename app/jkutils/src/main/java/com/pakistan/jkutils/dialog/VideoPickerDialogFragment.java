package com.pakistan.jkutils.dialog;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.LayoutInflater;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.DialogFragment;

import com.pakistan.jkutils.databinding.FragmentVideoPickerDialogBinding;
import com.pakistan.jkutils.engine.Glide4Engine;
import com.zhihu.matisse.Matisse;
import com.zhihu.matisse.MimeType;

import java.io.File;
import java.util.List;

public class VideoPickerDialogFragment extends DialogFragment {

    private static final int REQUEST_CODE_VIDEO_PICKER = 3654;
    private static final int REQUEST_CODE_VIDEO_CAMERA = 3584;

    private VideoPickerDialogListener mListener;

    public void setListener(VideoPickerDialogListener mListener) {
        this.mListener = mListener;
    }

    public VideoPickerDialogFragment() {
        // Required empty public constructor
    }

    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {

        AlertDialog dialog = null;

        if(getContext() != null){
            FragmentVideoPickerDialogBinding binding = FragmentVideoPickerDialogBinding.inflate(LayoutInflater.from(getContext()), null, false);

            AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
            builder.setView(binding.getRoot());

            binding.videoViaCameraIv.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    dismiss();
                    recordVideo();
                }
            });

            binding.videoViaGalleryIv.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    dismiss();
                    pickVideo();
                }
            });

            dialog = builder.create();
        }

        return dialog;
    }

    private void recordVideo() {
        Intent intent = new Intent(MediaStore.ACTION_VIDEO_CAPTURE);

        if(getActivity() != null){
            if(intent.resolveActivity(getActivity().getPackageManager()) != null)
                startActivityForResult(intent, REQUEST_CODE_VIDEO_CAMERA);
        }

    }

    private void pickVideo() {
        Matisse.from(this)
                .choose(MimeType.ofVideo())
                .countable(true)
                .maxSelectable(100)
                .gridExpectedSize(getResources().getDimensionPixelSize(com.intuit.sdp.R.dimen._120sdp))
                .restrictOrientation(ActivityInfo.SCREEN_ORIENTATION_UNSPECIFIED)
                .thumbnailScale(0.85f)
                .imageEngine(new Glide4Engine())
                .showPreview(false) // Default is `true`
                .forResult(REQUEST_CODE_VIDEO_PICKER);
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(resultCode == Activity.RESULT_OK && data != null){
            if(REQUEST_CODE_VIDEO_CAMERA == requestCode){ // Record Video by Camera
                Uri uri = data.getData();
                File file = new File(String.valueOf(uri));
                String path = file.getAbsolutePath();

                if(mListener != null)
                    mListener.onVideoPickedFromCamera(uri, path);
            }
            else if(REQUEST_CODE_VIDEO_PICKER == requestCode){ // Browse Videos from Gallery
                List<String> paths = Matisse.obtainPathResult(data);

                if(mListener != null)
                    mListener.onVideoPickedFromGallery(paths);
            }
        }

    }

    // Video Picker Dialog Listener
    public interface VideoPickerDialogListener {
        void onVideoPickedFromCamera(Uri videoUri, String videoPath);
        void onVideoPickedFromGallery(List<String> videoPaths);
    }

}