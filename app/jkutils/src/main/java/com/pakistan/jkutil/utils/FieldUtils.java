package com.pakistan.jkutil.utils;

import android.text.TextUtils;
import android.util.Patterns;
import android.widget.EditText;

import java.util.Random;

public class FieldUtils {

    public static boolean isFieldEmpty(EditText... fields){
        boolean isEmpty = false;

        for(EditText field : fields){
            if(TextUtils.isEmpty(field.getText().toString().trim())){
                field.setError("Type Something");
                isEmpty = true;

                break;
            }
        }

        return isEmpty;
    }

    public static void clearFields(EditText... fields){

        for(EditText field : fields){
            field.setText("");
        }
    }

    public static String randomStringGen(int maxLength) {
        Random generator = new Random();
        StringBuilder randomStringBuilder = new StringBuilder();
        int randomLength = generator.nextInt(maxLength);
        char tempChar;
        for (int i = 0; i < randomLength; i++){
            tempChar = (char) (generator.nextInt(96) + 32);
            randomStringBuilder.append(tempChar);
        }
        return randomStringBuilder.toString();
    }

    public static int randomNumberGen(int maxLength){
        return new Random().nextInt(maxLength);
    }

    public static boolean isValidEmail(String email){
        return Patterns.EMAIL_ADDRESS.matcher(email).matches();
    }

    public static boolean isEmpty(String value){
        return TextUtils.isEmpty(value);
    }

    public static boolean hasMinLength(String value, int minLength){
        return value.length() < minLength;
    }


}
