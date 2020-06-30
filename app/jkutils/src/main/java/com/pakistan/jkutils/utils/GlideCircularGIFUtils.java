package com.pakistan.jkutils.utils;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageView;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

public final class GlideCircularGIFUtils {

    private GlideCircularGIFUtils(){}
    
    public static void loadCircularImage(Context context, String image, int placeholder, ImageView holder){
        Glide
                .with(context)
                .asGif()
                .load(image)
                .placeholder(placeholder)
                .apply(RequestOptions.circleCropTransform())
                .into(holder);
    }

    public static void loadCircularImage(Context context, int image, int placeholder, ImageView holder){
        Glide
                .with(context)
                .asGif()
                .load(image)
                .placeholder(placeholder)
                .apply(RequestOptions.circleCropTransform())
                .into(holder);
    }

    public static void loadCircularImage(Fragment context, String image, int placeholder, ImageView holder){
        Glide
                .with(context)
                .asGif()
                .load(image)
                .placeholder(placeholder)
                .apply(RequestOptions.circleCropTransform())
                .into(holder);
    }

    public static void loadCircularImage(Fragment context, int image, int placeholder, ImageView holder){
        Glide
                .with(context)
                .asGif()
                .load(image)
                .placeholder(placeholder)
                .apply(RequestOptions.circleCropTransform())
                .into(holder);
    }

    public static void loadCircularImage(FragmentActivity context, String image, int placeholder, ImageView holder){
        Glide
                .with(context)
                .asGif()
                .load(image)
                .placeholder(placeholder)
                .apply(RequestOptions.circleCropTransform())
                .into(holder);
    }

    public static void loadCircularImage(FragmentActivity context, int image, int placeholder, ImageView holder){
        Glide
                .with(context)
                .asGif()
                .load(image)
                .placeholder(placeholder)
                .apply(RequestOptions.circleCropTransform())
                .into(holder);
    }

    public static void loadCircularImage(Context context, Bitmap image, int placeholder, ImageView holder){
        Glide
                .with(context)
                .asGif()
                .load(image)
                .placeholder(placeholder)
                .apply(RequestOptions.circleCropTransform())
                .into(holder);
    }

    public static void loadCircularImage(Fragment context, Bitmap image, int placeholder, ImageView holder){
        Glide
                .with(context)
                .asGif()
                .load(image)
                .placeholder(placeholder)
                .apply(RequestOptions.circleCropTransform())
                .into(holder);
    }

    public static void loadCircularImage(FragmentActivity context, Bitmap image, int placeholder, ImageView holder){
        Glide
                .with(context)
                .asGif()
                .load(image)
                .placeholder(placeholder)
                .apply(RequestOptions.circleCropTransform())
                .into(holder);
    }

    public static void loadCircularImage(Context context, Drawable image, int placeholder, ImageView holder){
        Glide
                .with(context)
                .asGif()
                .load(image)
                .placeholder(placeholder)
                .apply(RequestOptions.circleCropTransform())
                .into(holder);
    }

    public static void loadCircularImage(Fragment context, Drawable image, int placeholder, ImageView holder){
        Glide
                .with(context)
                .asGif()
                .load(image)
                .placeholder(placeholder)
                .apply(RequestOptions.circleCropTransform())
                .into(holder);
    }

    public static void loadCircularImage(FragmentActivity context, Drawable image, int placeholder, ImageView holder){
        Glide
                .with(context)
                .asGif()
                .load(image)
                .placeholder(placeholder)
                .apply(RequestOptions.circleCropTransform())
                .into(holder);
    }

    public static void loadCircularImage(Context context, Uri image, int placeholder, ImageView holder){
        Glide
                .with(context)
                .asGif()
                .load(image)
                .placeholder(placeholder)
                .apply(RequestOptions.circleCropTransform())
                .into(holder);
    }

    public static void loadCircularImage(Fragment context, Uri image, int placeholder, ImageView holder){
        Glide
                .with(context)
                .asGif()
                .load(image)
                .placeholder(placeholder)
                .apply(RequestOptions.circleCropTransform())
                .into(holder);
    }

    public static void loadCircularImage(FragmentActivity context, Uri image, int placeholder, ImageView holder){
        Glide
                .with(context)
                .asGif()
                .load(image)
                .placeholder(placeholder)
                .apply(RequestOptions.circleCropTransform())
                .into(holder);
    }

    // Load Circular Image without Placeholder
    public static void loadCircularImage(Context context, String image, ImageView holder){
        Glide
                .with(context)
                .asGif()
                .load(image)
                .apply(RequestOptions.circleCropTransform())
                .into(holder);
    }

    public static void loadCircularImage(Context context, int image, ImageView holder){
        Glide
                .with(context)
                .asGif()
                .load(image)
                .apply(RequestOptions.circleCropTransform())
                .into(holder);
    }

    public static void loadCircularImage(Fragment context, String image, ImageView holder){
        Glide
                .with(context)
                .asGif()
                .load(image)
                .apply(RequestOptions.circleCropTransform())
                .into(holder);
    }

    public static void loadCircularImage(Fragment context, int image, ImageView holder){
        Glide
                .with(context)
                .asGif()
                .load(image)
                .apply(RequestOptions.circleCropTransform())
                .into(holder);
    }

    public static void loadCircularImage(FragmentActivity context, String image, ImageView holder){
        Glide
                .with(context)
                .asGif()
                .load(image)
                .apply(RequestOptions.circleCropTransform())
                .into(holder);
    }

    public static void loadCircularImage(FragmentActivity context, int image, ImageView holder){
        Glide
                .with(context)
                .asGif()
                .load(image)
                .apply(RequestOptions.circleCropTransform())
                .into(holder);
    }

    public static void loadCircularImage(Context context, Bitmap image, ImageView holder){
        Glide
                .with(context)
                .asGif()
                .load(image)
                .apply(RequestOptions.circleCropTransform())
                .into(holder);
    }

    public static void loadCircularImage(Fragment context, Bitmap image, ImageView holder){
        Glide
                .with(context)
                .asGif()
                .load(image)
                .apply(RequestOptions.circleCropTransform())
                .into(holder);
    }

    public static void loadCircularImage(FragmentActivity context, Bitmap image, ImageView holder){
        Glide
                .with(context)
                .asGif()
                .load(image)
                .apply(RequestOptions.circleCropTransform())
                .into(holder);
    }

    public static void loadCircularImage(Context context, Drawable image, ImageView holder){
        Glide
                .with(context)
                .asGif()
                .load(image)
                .apply(RequestOptions.circleCropTransform())
                .into(holder);
    }

    public static void loadCircularImage(Fragment context, Drawable image, ImageView holder){
        Glide
                .with(context)
                .asGif()
                .load(image)
                .apply(RequestOptions.circleCropTransform())
                .into(holder);
    }

    public static void loadCircularImage(FragmentActivity context, Drawable image, ImageView holder){
        Glide
                .with(context)
                .asGif()
                .load(image)
                .apply(RequestOptions.circleCropTransform())
                .into(holder);
    }

    public static void loadCircularImage(Context context, Uri image, ImageView holder){
        Glide
                .with(context)
                .asGif()
                .load(image)
                .apply(RequestOptions.circleCropTransform())
                .into(holder);
    }

    public static void loadCircularImage(Fragment context, Uri image, ImageView holder){
        Glide
                .with(context)
                .asGif()
                .load(image)
                .apply(RequestOptions.circleCropTransform())
                .into(holder);
    }

    public static void loadCircularImage(FragmentActivity context, Uri image, ImageView holder){
        Glide
                .with(context)
                .asGif()
                .load(image)
                .apply(RequestOptions.circleCropTransform())
                .into(holder);
    }
}
