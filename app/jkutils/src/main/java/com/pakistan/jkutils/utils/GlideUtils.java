package com.pakistan.jkutils.utils;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

public final class GlideUtils {

    public static void loadCircularImage(Context context, String image, int placeholder, ImageView holder){
        Glide
                .with(context)
                .load(image)
                .placeholder(placeholder)
                .placeholder(placeholder)
                .apply(RequestOptions.circleCropTransform())
                .into(holder);
    }

    public static void loadCircularImage(Context context, int image, int placeholder, ImageView holder){
        Glide
                .with(context)
                .load(image)
                .placeholder(placeholder)
                .apply(RequestOptions.circleCropTransform())
                .into(holder);
    }

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

    public static void loadCircularImage(Fragment context, String image, int placeholder, ImageView holder){
        Glide
                .with(context)
                .load(image)
                .placeholder(placeholder)
                .apply(RequestOptions.circleCropTransform())
                .into(holder);
    }

    public static void loadCircularImage(Fragment context, int image, int placeholder, ImageView holder){
        Glide
                .with(context)
                .load(image)
                .placeholder(placeholder)
                .apply(RequestOptions.circleCropTransform())
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

    public static void loadCircularImage(FragmentActivity context, String image, int placeholder, ImageView holder){
        Glide
                .with(context)
                .load(image)
                .placeholder(placeholder)
                .apply(RequestOptions.circleCropTransform())
                .into(holder);
    }

    public static void loadCircularImage(FragmentActivity context, int image, int placeholder, ImageView holder){
        Glide
                .with(context)
                .load(image)
                .placeholder(placeholder)
                .apply(RequestOptions.circleCropTransform())
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

    public static void loadCircularImage(Context context, Bitmap image, int placeholder, ImageView holder){
        Glide
                .with(context)
                .load(image)
                .placeholder(placeholder)
                .apply(RequestOptions.circleCropTransform())
                .into(holder);
    }

    public static void loadImage(Context context, Bitmap image, int placeholder, ImageView holder){
        Glide
                .with(context)
                .load(image)
                .placeholder(placeholder)
                .into(holder);
    }

    public static void loadCircularImage(Fragment context, Bitmap image, int placeholder, ImageView holder){
        Glide
                .with(context)
                .load(image)
                .placeholder(placeholder)
                .apply(RequestOptions.circleCropTransform())
                .into(holder);
    }

    public static void loadImage(Fragment context, Bitmap image, int placeholder, ImageView holder){
        Glide
                .with(context)
                .load(image)
                .placeholder(placeholder)
                .into(holder);
    }

    public static void loadCircularImage(FragmentActivity context, Bitmap image, int placeholder, ImageView holder){
        Glide
                .with(context)
                .load(image)
                .placeholder(placeholder)
                .apply(RequestOptions.circleCropTransform())
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

    public static void loadCircularImage(Context context, Drawable image, int placeholder, ImageView holder){
        Glide
                .with(context)
                .load(image)
                .placeholder(placeholder)
                .apply(RequestOptions.circleCropTransform())
                .into(holder);
    }

    public static void loadCircularImage(Fragment context, Drawable image, int placeholder, ImageView holder){
        Glide
                .with(context)
                .load(image)
                .placeholder(placeholder)
                .apply(RequestOptions.circleCropTransform())
                .into(holder);
    }

    public static void loadCircularImage(FragmentActivity context, Drawable image, int placeholder, ImageView holder){
        Glide
                .with(context)
                .load(image)
                .placeholder(placeholder)
                .apply(RequestOptions.circleCropTransform())
                .into(holder);
    }

    public static void loadCircularGIF(Context context, Drawable image, int placeholder, ImageView holder){
        Glide
                .with(context)
                .asGif()
                .load(image)
                .placeholder(placeholder)
                .apply(RequestOptions.circleCropTransform())
                .into(holder);
    }

    public static void loadCircularGIF(Fragment context, Drawable image, int placeholder, ImageView holder){
        Glide
                .with(context)
                .asGif()
                .load(image)
                .placeholder(placeholder)
                .apply(RequestOptions.circleCropTransform())
                .into(holder);
    }

    public static void loadCircularGIF(FragmentActivity context, Drawable image, int placeholder, ImageView holder){
        Glide
                .with(context)
                .asGif()
                .load(image)
                .placeholder(placeholder)
                .apply(RequestOptions.circleCropTransform())
                .into(holder);
    }

    public static void loadImageGIF(Context context, Drawable image, int placeholder, ImageView holder){
        Glide
                .with(context)
                .asGif()
                .load(image)
                .placeholder(placeholder)
                .into(holder);
    }

    public static void loadImageGIF(Fragment context, Drawable image, int placeholder, ImageView holder){
        Glide
                .with(context)
                .asGif()
                .load(image)
                .placeholder(placeholder)
                .into(holder);
    }

    public static void loadImageGIF(FragmentActivity context, Drawable image, int placeholder, ImageView holder){
        Glide
                .with(context)
                .asGif()
                .load(image)
                .placeholder(placeholder)
                .into(holder);
    }

}
