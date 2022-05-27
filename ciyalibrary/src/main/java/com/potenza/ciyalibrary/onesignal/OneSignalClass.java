package com.potenza.ciyalibrary.onesignal;

import android.content.Context;
import android.util.Log;

import com.onesignal.OneSignal;

/**
 * Created by Harsh Prajapati on 27-05-2022.
 */
public class OneSignalClass {


    private static final String TAG = "OneSignalClass";

    Context context;

    public OneSignalClass(Context context){
        this.context = context;
    }

    public void initilizationOneSignal(Context context,String appId){
        Log.e(TAG, "Onesignal class is calling: ");

        OneSignal.setLogLevel(OneSignal.LOG_LEVEL.ERROR, OneSignal.LOG_LEVEL.NONE);

        OneSignal.initWithContext(context);

        OneSignal.setAppId(appId);
        Log.e(TAG, "onCreate: " + Constant.ONE_SIGNAL_APP_ID);
    }

}
