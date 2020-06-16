package com.pakistan.jkutils.utils;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageView;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;

import com.bumptech.glide.Glide;

public final class GlideBitmapUtils {

    public static void loadImage(Context context, String image, int placeholder, ImageView holder){
        Glide
                .with(context)
                .load(image)
                .placeholder(placeholder)
                .into(holder);
    }

    public static void loadImage(Context context, int image, int placeholder, ImageView holder){
        Glide
                .with(context)
                .load(image)
                .placeholder(placeholder)
                .into(holder);
    }

    public static void loadImage(Fragment context, String image, int placeholder, ImageView holder){
        Glide
                .with(context)
                .load(image)
                .placeholder(placeholder)
                .into(holder);
    }

    public static void loadImage(Fragment context, int image, int placeholder, ImageView holder){
        Glide
                .with(context)
                .load(image)
                .placeholder(placeholder)
                .into(holder);
    }

    public static void loadImage(FragmentActivity context, String image, int placeholder, ImageView holder){
        Glide
                .with(context)
                .load(image)
                .placeholder(placeholder)
                .into(holder);
    }

    public static void loadImage(FragmentActivity context, int image, int placeholder, ImageView holder){
        Glide
                .with(context)
                .load(image)
                .placeholder(placeholder)
                .into(holder);
    }

    public static void loadImage(Context context, Bitmap image, int placeholder, ImageView holder){
        Glide
                .with(context)
                .load(image)
                .placeholder(placeholder)
                .into(holder);
    }

    public static void loadImage(Fragment context, Bitmap image, int placeholder, ImageView holder){
        Glide
                .with(context)
                .load(image)
                .placeholder(placeholder)
                .into(holder);
    }

    public static void loadImage(FragmentActivity context, Bitmap image, int placeholder, ImageView holder){
        Glide
                .with(context)
                .load(image)
                .placeholder(placeholder)
                .into(holder);
    }

    public static void loadImage(Context context, Drawable image, int placeholder, ImageView holder){
        Glide
                .with(context)
                .load(image)
                .placeholder(placeholder)
                .into(holder);
    }

    public static void loadImage(Fragment context, Drawable image, int placeholder, ImageView holder){
        Glide
                .with(context)
                .load(image)
                .placeholder(placeholder)
                .into(holder);
    }

    public static void loadImage(FragmentActivity context, Drawable image, int placeholder, ImageView holder){
        Glide
                .with(context)
                .load(image)
                .placeholder(placeholder)
                .into(holder);
    }

    public static void loadImage(Context context, Uri image, int placeholder, ImageView holder){
        Glide
                .with(context)
                .load(image)
                .placeholder(placeholder)
                .into(holder);
    }

    public static void loadImage(Fragment context, Uri image, int placeholder, ImageView holder){
        Glide
                .with(context)
                .load(image)
                .placeholder(placeholder)
                .into(holder);
    }

    public static void loadImage(FragmentActivity context, Uri image, int placeholder, ImageView holder){
        Glide
                .with(context)
                .load(image)
                .placeholder(placeholder)
                .into(holder);
    }
}
