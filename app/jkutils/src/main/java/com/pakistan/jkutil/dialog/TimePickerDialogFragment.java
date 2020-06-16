package com.pakistan.jkutil.dialog;

import android.app.Dialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.widget.TimePicker;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

import java.util.Calendar;

public class TimePickerDialogFragment extends DialogFragment
        implements TimePickerDialog.OnTimeSetListener {
    
    private TimePickerListener mListener;

    // 0 means 1st Shift and 1 means 2nd Shift
    private int mTimer = 0;

    public interface TimePickerListener {
        void onTimeSet(TimePicker timePicker, int hour, int minute, int timer);
    }
    
    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
    
        Calendar calendar = Calendar.getInstance();
        int hour = calendar.get(Calendar.HOUR);
        int minute = calendar.get(Calendar.MINUTE);
        
        return new TimePickerDialog(getContext(),this,hour,minute,false);
    }

    public void cancelDialog(){
        if(getDialog() != null && getDialog().isShowing()){
            getDialog().cancel();
        }
    }

    public void setListener(TimePickerListener listener){
        mListener = listener;
    }

    public void setTimer(int mTimer) {
        this.mTimer = mTimer;
    }

    @Override
    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
        if(mListener != null)
            mListener.onTimeSet(view,hourOfDay, minute, mTimer);
    }
    
}
