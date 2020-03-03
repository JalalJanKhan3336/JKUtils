package com.pakistan.jkutils.utils;

import android.content.Context;
import android.graphics.Bitmap;
import android.widget.ImageView;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;

import com.bumptech.glide.Glide;

public final class GlideBitmapUtils {

    public static void loadImage(Context context, String image, ImageView holder){
        Glide
                .with(context)
                .load(image)
                .into(holder);
    }

    public static void loadImage(Context context, int image, ImageView holder){
        Glide
                .with(context)
                .load(image)
                .into(holder);
    }

    public static void loadImage(Fragment context, String image, ImageView holder){
        Glide
                .with(context)
                .load(image)
                .into(holder);
    }

    public static void loadImage(Fragment context, int image, ImageView holder){
        Glide
                .with(context)
                .load(image)
                .into(holder);
    }

    public static void loadImage(FragmentActivity context, String image, ImageView holder){
        Glide
                .with(context)
                .load(image)
                .into(holder);
    }

    public static void loadImage(FragmentActivity context, int image, ImageView holder){
        Glide
                .with(context)
                .load(image)
                .into(holder);
    }

    public static void loadImage(Context context, Bitmap image, ImageView holder){
        Glide
                .with(context)
                .load(image)
                .into(holder);
    }

    public static void loadImage(Fragment context, Bitmap image, ImageView holder){
        Glide
                .with(context)
                .load(image)
                .into(holder);
    }

    public static void loadImage(FragmentActivity context, Bitmap image, ImageView holder){
        Glide
                .with(context)
                .load(image)
                .into(holder);
    }

}
