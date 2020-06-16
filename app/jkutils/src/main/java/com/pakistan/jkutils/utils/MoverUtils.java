package com.pakistan.jkutils.utils;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;


import com.pakistan.jkutils.model.Parcel;

import java.io.Serializable;

public class MoverUtils {

    private MoverUtils(){}

    public static void moveTo(Context fromContext, Class toContext){
        Intent intent = new Intent(fromContext, toContext);
        if(intent.resolveActivity(fromContext.getPackageManager()) != null)
            fromContext.startActivity(intent);
    }

    public static void moveTo(Context fromContext, Class toContext, String bundleKey, String dataKey, Object data){
        Intent intent = new Intent(fromContext, toContext);
        Bundle bundle = new Bundle();
        bundle.putSerializable(dataKey, (Serializable) data);
        intent.putExtra(bundleKey, bundle);
        fromContext.startActivity(intent);
    }

    public static void moveTo(Context fromContext, Class toContext, String key, String value){
        Intent intent = new Intent(fromContext, toContext);
        intent.putExtra(key, value);
        fromContext.startActivity(intent);
    }

    public static void moveTo(Context fromContext, Class toContext, String key, Serializable value){
        Intent intent = new Intent(fromContext, toContext);
        intent.putExtra(key, value);
        fromContext.startActivity(intent);
    }

    public static void moveTo(Context fromContext, Class toContext, String key, Parcelable value){
        Intent intent = new Intent(fromContext, toContext);
        intent.putExtra(key, value);
        fromContext.startActivity(intent);
    }

    public static void moveTo(Context fromContext, Class toContext, String key, Parcel value){
        Intent intent = new Intent(fromContext, toContext);
        intent.putExtra(key, value);
        fromContext.startActivity(intent);
    }

}
