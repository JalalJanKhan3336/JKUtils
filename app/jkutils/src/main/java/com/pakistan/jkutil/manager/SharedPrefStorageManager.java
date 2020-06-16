package com.pakistan.jkutil.manager;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;

import java.util.Set;

@SuppressLint({"CommitPrefEdits","StaticFieldLeak"})
public class SharedPrefStorageManager {

    private static SharedPrefStorageManager ourInstance;
    private Context mContext;

    public static SharedPrefStorageManager getInstance(Context context, String key) {
        if(ourInstance == null)
            ourInstance = new SharedPrefStorageManager(context, key);

        return ourInstance;
    }

    // Shared Pref Ref
    private SharedPreferences mSharedPref;

    private SharedPrefStorageManager(Context context, String key) {
        mContext = context;
        mSharedPref = mContext.getSharedPreferences(key, Context.MODE_PRIVATE);
    }

    public void storeData(String key, String value){
        SharedPreferences.Editor editor = mSharedPref.edit();
        editor.putString(key, value);
        editor.apply();
    }

    public void storeData(String key, boolean value){
        SharedPreferences.Editor editor = mSharedPref.edit();
        editor.putBoolean(key, value);
        editor.apply();
    }

    public String retrieveData(String key, String value){
        return mSharedPref.getString(key, value);
    }

    public Boolean retrieveData(String key, boolean value){
        return mSharedPref.getBoolean(key, value);
    }

    public void storeData(String key, int value){
        SharedPreferences.Editor editor = mSharedPref.edit();
        editor.putInt(key, value);
        editor.apply();
    }

    public void storeData(String key, float value){
        SharedPreferences.Editor editor = mSharedPref.edit();
        editor.putFloat(key, value);
        editor.apply();
    }

    public int retrieveData(String key, int value){
        return mSharedPref.getInt(key, value);
    }

    public float retrieveData(String key, float value){
        return mSharedPref.getFloat(key, value);
    }

    public void storeData(String key, long value){
        SharedPreferences.Editor editor = mSharedPref.edit();
        editor.putLong(key, value);
        editor.apply();
    }

    public void storeData(String key, Set<String> value){
        SharedPreferences.Editor editor = mSharedPref.edit();
        editor.putStringSet(key, value);
        editor.apply();
    }

    public long retrieveData(String key, long value){
        return mSharedPref.getLong(key, value);
    }

    public Set<String> retrieveData(String key, Set<String> value){
        return mSharedPref.getStringSet(key, value);
    }

}
