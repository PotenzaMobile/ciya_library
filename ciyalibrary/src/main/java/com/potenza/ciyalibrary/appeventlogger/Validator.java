package com.potenza.ciyalibrary.appeventlogger;

import android.content.Context;
import android.util.Log;

/**
 * Created by Harsh Prajapati on 04-05-2022.
 */
public class Validator {

    private static final String TAG = "Validator";

    public AppEventLogger validator(Context context, boolean flag) {
        if (isCalling) {
            Log.e(TAG, "validator: " + "Class is calling");
            return new AppEventLogger(context);

        } else {
            Log.e(TAG, "validator: " + "Class is not calling");
            return null;

        }

    }

}
