package com.pakistan.jkutils.utils;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;

import com.bumptech.glide.Glide;

public final class GlideGIFUtils {

    public static void loadImage(Context context, String image, ImageView holder){
        Glide
                .with(context)
                .asGif()
                .load(image)
                .into(holder);
    }

    public static void loadImage(Context context, int image, ImageView holder){
        Glide
                .with(context)
                .asGif()
                .load(image)
                .into(holder);
    }

    public static void loadImage(Fragment context, String image, ImageView holder){
        Glide
                .with(context)
                .asGif()
                .load(image)
                .into(holder);
    }

    public static void loadImage(Fragment context, int image, ImageView holder){
        Glide
                .with(context)
                .asGif()
                .load(image)
                .into(holder);
    }

    public static void loadImage(FragmentActivity context, String image, ImageView holder){
        Glide
                .with(context)
                .asGif()
                .load(image)
                .into(holder);
    }

    public static void loadImage(FragmentActivity context, int image, ImageView holder){
        Glide
                .with(context)
                .asGif()
                .load(image)
                .into(holder);
    }

    public static void loadImage(Context context, Bitmap image, ImageView holder){
        Glide
                .with(context)
                .asGif()
                .load(image)
                .into(holder);
    }

    public static void loadImage(Fragment context, Bitmap image, ImageView holder){
        Glide
                .with(context)
                .asGif()
                .load(image)
                .into(holder);
    }

    public static void loadImage(FragmentActivity context, Bitmap image, ImageView holder){
        Glide
                .with(context)
                .asGif()
                .load(image)
                .into(holder);
    }

    public static void loadImage(Context context, Drawable image, ImageView holder){
        Glide
                .with(context)
                .asGif()
                .load(image)
                .into(holder);
    }

    public static void loadImage(Fragment context, Drawable image, ImageView holder){
        Glide
                .with(context)
                .asGif()
                .load(image)
                .into(holder);
    }

    public static void loadImage(FragmentActivity context, Drawable image, ImageView holder){
        Glide
                .with(context)
                .asGif()
                .load(image)
                .into(holder);
    }

}
