package com.pakistan.jkutils.utils;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class SystemUtils {

    private SystemUtils(){}

    @SuppressLint("SimpleDateFormat")
    // End Point: Get System's Current Time & Returns it in 12 (AM/PM) or 24 Format
    public static String getCurrentTime(boolean is24Format){

        if(is24Format){
            Calendar calendar = Calendar.getInstance();
            SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
            return sdf.format(calendar.getTime());
        }else{
            Calendar calendar = Calendar.getInstance();
            SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss a");
            return sdf.format(calendar.getTime());
        }
    }

    @SuppressLint("SimpleDateFormat")
    // End Point: Get System's Current Date & Returns it
    public static String getCurrentDate(){
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat mdformat = new SimpleDateFormat("yyyy / MM / dd ");
        return mdformat.format(calendar.getTime());
    }

    @SuppressLint("MissingPermission")
    public static boolean isConnectedToNetwork(Context context){
        boolean hasWIFI = false;
        boolean hasMobileData = false;

        ConnectivityManager cm = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);

        if (cm != null) {
            NetworkInfo[] networkInfos = cm.getAllNetworkInfo();

            for (NetworkInfo info : networkInfos){
                if(info.getTypeName().equalsIgnoreCase("WIFI")){
                    if(info.isConnected()){
                        hasWIFI = true;
                    }
                }
                else if(info.getTypeName().equalsIgnoreCase("MOBILE")){
                    if(info.isConnected()){
                        hasMobileData = true;
                    }
                }
            }
        }

        return (hasMobileData || hasWIFI);
    }

    public static boolean hasBluetoothLowEnergyFeature(Context context){
        return context.getPackageManager().hasSystemFeature(PackageManager.FEATURE_BLUETOOTH_LE);
    }

    public static boolean isBluetoothFeatureEnabled(Context context){
        final BluetoothManager bluetoothManager = (BluetoothManager) context.getSystemService(Context.BLUETOOTH_SERVICE);

        if(bluetoothManager != null){
            final BluetoothAdapter bluetoothAdapter = bluetoothManager.getAdapter();
            return bluetoothAdapter != null && bluetoothAdapter.isEnabled();
        }

        return false; //Bluetooth isn't enabled
    }

}
