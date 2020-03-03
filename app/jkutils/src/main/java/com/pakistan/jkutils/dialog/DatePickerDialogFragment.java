package com.pakistan.jkutils.dialog;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.widget.DatePicker;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Objects;

public class DatePickerDialogFragment extends DialogFragment
        implements DatePickerDialog.OnDateSetListener {

    private DatePickerDialogFragmentListener mDatePickerListener;

    public void setDatePickerListener(DatePickerDialogFragmentListener listener){
        if(listener == null)
            return;

        mDatePickerListener = listener;
    }

    public void cancelDialog(){
        if(getDialog() != null && getDialog().isShowing()){
            getDialog().cancel();
        }
    }

    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {

        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);
        int day = calendar.get(Calendar.DAY_OF_MONTH);

        return new DatePickerDialog(Objects.requireNonNull(getActivity()), this, year, month, day);
    }

    @Override
    public void onDateSet(DatePicker datePicker, int year, int month, int dayOfMonth) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.MONTH, month);
        calendar.set(Calendar.DAY_OF_MONTH, dayOfMonth);

        String selectedDate = DateFormat.getDateInstance().format(calendar.getTime());

        if(mDatePickerListener != null)
            mDatePickerListener.onDateSelected(calendar, selectedDate);
    }


    public interface DatePickerDialogFragmentListener{
        void onDateSelected(Calendar calendar, String date);
    }

}
