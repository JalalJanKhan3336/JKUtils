package com.pakistan.jkutils.utils;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

public final class GlideCircularBitmapUtils {

    public static void loadCircularImage(Context context, String image, ImageView holder){
        Glide
                .with(context)
                .load(image)
                .apply(RequestOptions.circleCropTransform())
                .into(holder);
    }

    public static void loadCircularImage(Context context, int image, ImageView holder){
        Glide
                .with(context)
                .load(image)
                .apply(RequestOptions.circleCropTransform())
                .into(holder);
    }

    public static void loadCircularImage(Fragment context, String image, ImageView holder){
        Glide
                .with(context)
                .load(image)
                .apply(RequestOptions.circleCropTransform())
                .into(holder);
    }

    public static void loadCircularImage(Fragment context, int image, ImageView holder){
        Glide
                .with(context)
                .load(image)
                .apply(RequestOptions.circleCropTransform())
                .into(holder);
    }

    public static void loadCircularImage(FragmentActivity context, String image, ImageView holder){
        Glide
                .with(context)
                .load(image)
                .apply(RequestOptions.circleCropTransform())
                .into(holder);
    }

    public static void loadCircularImage(FragmentActivity context, int image, ImageView holder){
        Glide
                .with(context)
                .load(image)
                .apply(RequestOptions.circleCropTransform())
                .into(holder);
    }

    public static void loadCircularImage(Context context, Bitmap image, ImageView holder){
        Glide
                .with(context)
                .load(image)
                .apply(RequestOptions.circleCropTransform())
                .into(holder);
    }

    public static void loadCircularImage(Fragment context, Bitmap image, ImageView holder){
        Glide
                .with(context)
                .load(image)
                .apply(RequestOptions.circleCropTransform())
                .into(holder);
    }

    public static void loadCircularImage(FragmentActivity context, Bitmap image, ImageView holder){
        Glide
                .with(context)
                .load(image)
                .apply(RequestOptions.circleCropTransform())
                .into(holder);
    }

    public static void loadCircularImage(Context context, Drawable image, ImageView holder){
        Glide
                .with(context)
                .load(image)
                .apply(RequestOptions.circleCropTransform())
                .into(holder);
    }

    public static void loadCircularImage(Fragment context, Drawable image, ImageView holder){
        Glide
                .with(context)
                .load(image)
                .apply(RequestOptions.circleCropTransform())
                .into(holder);
    }

    public static void loadCircularImage(FragmentActivity context, Drawable image, ImageView holder){
        Glide
                .with(context)
                .load(image)
                .apply(RequestOptions.circleCropTransform())
                .into(holder);
    }

}
