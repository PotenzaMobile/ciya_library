package com.potenza.ciyalibrary.onesignal;

import android.content.Context;
import android.util.Log;

/**
 * Created by Harsh Prajapati on 27-05-2022.
 */
public class OneSignalValidator {


    private static final String TAG = "OneSignalValidator";

    public OneSignalClass validator(Context context, Boolean isCalling, String appId) {
        if (isCalling) {
            com.example.libtest.Constant.ONE_SIGNAL_APP_ID = appId;
            Log.e(TAG, "validator: " + com.example.libtest.Constant.ONE_SIGNAL_APP_ID);
            Log.e(TAG, "validator: " + "Class is calling");
            return new OneSignalClass(context);
        } else {
            Log.e(TAG, "validator: " + "class is not calling");
            return null;
        }
    }

}
