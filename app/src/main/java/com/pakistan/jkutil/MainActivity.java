package com.pakistan.jkutil;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        final ImageView holder = findViewById(R.id.thumbnail);
//
//        findViewById(R.id.image_dialog_btn)
//                .setOnClickListener(new View.OnClickListener() {
//                    @Override
//                    public void onClick(View v) {
//                        ImagePickerDialogFragment dialogFragment = new ImagePickerDialogFragment();
//                        dialogFragment.setListener(new ImagePickerDialogFragment.ImagePickerDialogListener() {
//                            @Override
//                            public void onImagePickedFromCamera(Uri videoUri, String imagePath) {
//                                GlideBitmapUtils.loadImage(MainActivity.this, imagePath, R.drawable.ic_camera, holder);
//                            }
//
//                            @Override
//                            public void onImagePickedFromGallery(List<String> imagePaths) {
//                                String imagePath = imagePaths.get(0);
//                                GlideBitmapUtils.loadImage(MainActivity.this, imagePath, R.drawable.ic_image_gallery, holder);
//                            }
//                        });
//
//                        dialogFragment.show(getSupportFragmentManager(), dialogFragment.getTag());
//                    }
//                });
//
//        findViewById(R.id.video_dialog_btn)
//                .setOnClickListener(new View.OnClickListener() {
//                    @Override
//                    public void onClick(View v) {
//                        VideoPickerDialogFragment dialogFragment = new VideoPickerDialogFragment();
//                        dialogFragment.setListener(new VideoPickerDialogFragment.VideoPickerDialogListener() {
//                            @Override
//                            public void onVideoPickedFromCamera(Uri videoUri, String videoPath) {
//                                GlideBitmapUtils.loadImage(MainActivity.this, videoPath, R.drawable.ic_video_camera, holder);
//                            }
//
//                            @Override
//                            public void onVideoPickedFromGallery(List<String> videoPaths) {
//                                String videoPath = videoPaths.get(0);
//                                GlideBitmapUtils.loadImage(MainActivity.this, videoPath, R.drawable.ic_video_gallery, holder);
//                            }
//                        });
//
//                        dialogFragment.show(getSupportFragmentManager(), dialogFragment.getTag());
//                    }
//                });
    }
}
