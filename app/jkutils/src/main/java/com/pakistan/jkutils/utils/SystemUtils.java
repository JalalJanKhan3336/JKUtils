package com.pakistan.jkutils.utils;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.Log;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

@SuppressLint("SimpleDateFormat")
public class SystemUtils {

    public static final String KEY_DATE_FORMAT = "MM/dd/yyyy";
    public static final String KEY_DATE_MM_DD_YY_FORMAT = "MM/dd/yy";
    public static final String KEY_DATE_YMD_SLASH_FORMAT = "yyyy/MM/dd";
    public static final String KEY_DATE_YMD_DASH_FORMAT = "yyyy-MM-dd";
    public static final String KEY_DATE_WITH_DAY_FORMAT = "EEEE, MM/dd/yyyy";
    
    private SystemUtils(){}

    // End Point: Get System's Current Time & Returns it in 12 (AM/PM) or 24 Format
    public static String getCurrentTime(boolean is24Format){

        String format = "HH:mm:ss"; // will show 24 hour format (0 to 23)

        if(!is24Format){
            format = "hh:mm:ss a"; // will show 12 hour format with AM / PM
        }

        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        return sdf.format(calendar.getTime());
    }

    // End Point: Get System's Current Date & Returns it
    public static String getCurrentDate(){
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat mdformat = new SimpleDateFormat(KEY_DATE_FORMAT);
        return mdformat.format(calendar.getTime());
    }

    // End Point: Get System's Current Date & Returns it
    public static Date getCurrentDateInFormat(){
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat mdformat = new SimpleDateFormat(KEY_DATE_FORMAT);
        try {
            return mdformat.parse(mdformat.format(calendar.getTime()));
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return null;
    }

    // Will convert string date to Date object & return it
    public static Date getFormattedDateOf(String date, String format){
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat formatter = new SimpleDateFormat(format);

        try {
            Date formattedDate = formatter.parse(date);

            if(formattedDate != null)
                calendar.setTime(formattedDate);

        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }

        SimpleDateFormat sdf = new SimpleDateFormat(KEY_DATE_FORMAT);
        try {
            return sdf.parse(sdf.format(calendar.getTime()));
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return null;
    }

    public static Date convertDateToGivenFormat(String givenDateStr, String givenDateFormat, String toFormat){
        DateFormat dateFormat = new SimpleDateFormat(givenDateFormat);
        try {
            Date givenDate = dateFormat.parse(givenDateStr);
            if (givenDate != null) {
                DateFormat newDateFormat = new SimpleDateFormat(toFormat);
                String newDateStr = newDateFormat.format(givenDate);
                return newDateFormat.parse(newDateStr);
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return null;
    }

    // Will change given date's old format to new format
    public static String changeGivenDateFormat(String date, String oldFormat, String newFormat){
        SimpleDateFormat oldSdf = new SimpleDateFormat(oldFormat);
        try {
            SimpleDateFormat sdf = new SimpleDateFormat(newFormat);
            Date oldDate = oldSdf.parse(date);
            if(oldDate != null)
                return sdf.format(oldDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return date;
    }

    // Will get Next 7 days from specific date
    public static List<String> getNext7DaysListFrom(Date date) {
        List<String> dayList = new ArrayList<>();

        for(int i = 0; i < 7; i++){
            String day = SystemUtils.getDayNameOfDate(SystemUtils.getNextDateFrom(date, i));
            dayList.add(day);
        }

        return dayList;
    }

    // Will get Next 7 days from specific date
    public static List<String> getNext7DaysByDatesFrom(String date) {
        List<String> dayList = new ArrayList<>();

        for(int i = 0; i < 7; i++){
            SimpleDateFormat sdf = new SimpleDateFormat(KEY_DATE_WITH_DAY_FORMAT);
            String dayWithDate = sdf.format(SystemUtils.getNextDateFrom(getFormattedDateOf(date,KEY_DATE_FORMAT), i));
            Log.d("TAG", "getNext7DaysByDatesFrom_: "+dayWithDate);
            dayList.add(dayWithDate);
        }

        return dayList;
    }

    // Will get Next 7 days from specific date
    public static List<String> getNext7DaysByDatesFrom(Date date) {
        List<String> dayList = new ArrayList<>();

        for(int i = 0; i < 7; i++){
            SimpleDateFormat sdf = new SimpleDateFormat(KEY_DATE_WITH_DAY_FORMAT);
            String dayWithDate = sdf.format(SystemUtils.getNextDateFrom(date, i));
            Log.d("TAG", "getNext7DaysByDatesFrom_: "+dayWithDate);
            dayList.add(dayWithDate);
        }

        return dayList;
    }

    // End Point: Get System's Current Date & Returns it
    public static String getCurrentDate(String format){
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat mdformat = new SimpleDateFormat(format);
        return mdformat.format(calendar.getTime());
    }

    // Returns Tomorrow's date from specified date
    public static Date getNextDateFrom(Date date){
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.DAY_OF_MONTH,1);
        return calendar.getTime();
    }

    // Returns next date from specified date
    public static String getNextDateInStringFrom(Date date, int dayGap){
        Date nextDate = getNextDateFrom(date, dayGap);
        SimpleDateFormat sdf = new SimpleDateFormat(KEY_DATE_FORMAT);
        String dateInString = sdf.format(nextDate);
        Log.d("TAG", "getNextDateInStringFrom_Date: "+dateInString);
        return dateInString;
    }

    // Returns next date from specified date
    public static Date getNextDateFrom(Date date, int dayGap){
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.DAY_OF_MONTH, dayGap);
        return calendar.getTime();
    }

    // Returns difference of time from current time
    public static long timeDifference(Date startTime, Date endTime){
        return endTime.getTime() - startTime.getTime();
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

    // Parse given time to Date
    public static Date parseToDate(String time){
        String format = "HH:mm:ss"; // will show 24 hour format (0 to 23)
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        try {
            return sdf.parse(time);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return null;
    }

    public static String getDayNameOfDate(Date fromDate){
        SimpleDateFormat outFormat = new SimpleDateFormat("EEEE");
        return outFormat.format(fromDate);
    }

    // Finds Current Day and returns it i.e. Monday, Tuesday... Sunday
    public static String findToday(){
        String today; // Default Day

        Calendar calendar = Calendar.getInstance();
        int day = calendar.get(Calendar.DAY_OF_WEEK);

        switch (day){
            case Calendar.SUNDAY:{
                today = "Sunday";
                break;
            }
            case Calendar.TUESDAY:{
                today = "Tuesday";
                break;
            }
            case Calendar.WEDNESDAY:{
                today = "Wednesday";
                break;
            }
            case Calendar.THURSDAY:{
                today = "Thursday";
                break;
            }
            case Calendar.FRIDAY:{
                today = "Friday";
                break;
            }
            case Calendar.SATURDAY:{
                today = "Saturday";
                break;
            }
            default:{
                today = "Monday";
                break;
            }
        }

        return today;
    }

    // Will return total week gap between given dates
    public static long findWeekDifference(String fromDate, Date toDate) {
        Date startDate = convertDateToGivenFormat(fromDate, KEY_DATE_YMD_DASH_FORMAT, KEY_DATE_FORMAT);

        if(startDate == null || toDate == null || toDate.before(startDate))
            return -1;

        long differenceInMilliSeconds = toDate.getTime() - startDate.getTime();

        long differenceInDays = TimeUnit.DAYS.convert(differenceInMilliSeconds, TimeUnit.MILLISECONDS);
        Log.d("TAG", "findWeekDifference_Difference_Days: "+differenceInDays);

        long weeks = differenceInDays / 7;
        Log.d("TAG", "findWeekDifference_Weeks: "+weeks);

        return weeks;
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
