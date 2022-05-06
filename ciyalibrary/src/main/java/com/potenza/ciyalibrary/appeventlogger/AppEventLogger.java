package com.potenza.ciyalibrary.appeventlogger;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;

import com.facebook.appevents.AppEventsConstants;
import com.facebook.appevents.AppEventsLogger;

import java.math.BigDecimal;
import java.util.Currency;

/**
 * Created by Harsh Prajapati on 04-05-2022.
 */

public class AppEventLogger {

    private static final String TAG = "AppEventLogger";

    Context context;

    public AppEventLogger(Context context) {
        this.context = context;
    }

    public void logSearchedEvent(String contentType, String searchString, boolean success) {
        Bundle params = new Bundle();
        AppEventsLogger logger = AppEventsLogger.newLogger(context);
        params.putString(AppEventsConstants.EVENT_PARAM_CONTENT_TYPE, contentType);
        params.putString(AppEventsConstants.EVENT_PARAM_SEARCH_STRING, searchString);
        params.putInt(AppEventsConstants.EVENT_PARAM_SUCCESS, success ? 1 : 0);
        logger.logEvent(AppEventsConstants.EVENT_NAME_SEARCHED, params);

        Log.e(TAG, "logSearchedEvent: " + params);
    }

    //Product Details
    public void logViewedContentEvent(String contentType, String contentId, String currency, double price) {
        AppEventsLogger logger = AppEventsLogger.newLogger(context);
        Bundle params = new Bundle();
        params.putString(AppEventsConstants.EVENT_PARAM_CONTENT_TYPE, contentType);
        params.putString(AppEventsConstants.EVENT_PARAM_CONTENT_ID, contentId);
        params.putString(AppEventsConstants.EVENT_PARAM_CURRENCY, currency);
        logger.logEvent(AppEventsConstants.EVENT_NAME_VIEWED_CONTENT, price, params);

        Log.e(TAG, "logViewedContentEvent: " + params);
    }

    //Add To WishList Details
    public void logAddedToWishlistEvent(String contentId, String contentType, String currency, double price) {
        AppEventsLogger logger = AppEventsLogger.newLogger(context);
        Bundle params = new Bundle();
        params.putString(AppEventsConstants.EVENT_PARAM_CONTENT_ID, contentId);
        params.putString(AppEventsConstants.EVENT_PARAM_CONTENT_TYPE, contentType);
        params.putString(AppEventsConstants.EVENT_PARAM_CURRENCY, currency);
        logger.logEvent(AppEventsConstants.EVENT_NAME_ADDED_TO_WISHLIST, price, params);

        Log.e(TAG, "logAddedToWishlistEvent: " + params);
    }

    //Add To Cart
    public void logAddedToCartEvent(String contentId, String contentType, String currency, double price) {
        AppEventsLogger logger = AppEventsLogger.newLogger(context);
        Bundle params = new Bundle();
        params.putString(AppEventsConstants.EVENT_PARAM_CONTENT_ID, contentId);
        params.putString(AppEventsConstants.EVENT_PARAM_CONTENT_TYPE, contentType);
        params.putString(AppEventsConstants.EVENT_PARAM_CURRENCY, currency);
        logger.logEvent(AppEventsConstants.EVENT_NAME_ADDED_TO_CART, price, params);
        Log.e("logAddedToCartEvent ", "Done");

        Log.e(TAG, "logAddedToCartEvent: " + params);
    }

    //Purchase Event
    public void logPurchasedEvent(int numItems, String contentType, String contentId, String currency, double price) {
        AppEventsLogger logger = AppEventsLogger.newLogger(context);
        Bundle params = new Bundle();
        params.putInt(AppEventsConstants.EVENT_PARAM_NUM_ITEMS, numItems);
        params.putString(AppEventsConstants.EVENT_PARAM_CONTENT_TYPE, contentType);
        params.putString(AppEventsConstants.EVENT_PARAM_CONTENT_ID, contentId);
        params.putString(AppEventsConstants.EVENT_PARAM_CURRENCY, currency);
        logger.logPurchase(BigDecimal.valueOf(price), Currency.getInstance(currency), params);

        Log.e(TAG, "logPurchasedEvent: " + params);
    }

    //Initial Checkout
    public void logInitiatedCheckoutEvent(String contentId, String contentType, int numItems, boolean paymentInfoAvailable, String currency, double totalPrice) {
        AppEventsLogger logger = AppEventsLogger.newLogger(context);
        Bundle params = new Bundle();
        params.putString(AppEventsConstants.EVENT_PARAM_CONTENT_ID, contentId);
        params.putString(AppEventsConstants.EVENT_PARAM_CONTENT_TYPE, contentType);
        params.putInt(AppEventsConstants.EVENT_PARAM_NUM_ITEMS, numItems);
        params.putInt(AppEventsConstants.EVENT_PARAM_PAYMENT_INFO_AVAILABLE, paymentInfoAvailable ? 1 : 0);
        params.putString(AppEventsConstants.EVENT_PARAM_CURRENCY, currency);
        logger.logEvent(AppEventsConstants.EVENT_NAME_INITIATED_CHECKOUT, totalPrice, params);

        Log.e(TAG, "logInitiatedCheckoutEvent: " + params);
    }

    public void logAbandoned_CartEvent(String contentId, String contentType, int numItems, String currency, double price) {
        AppEventsLogger logger = AppEventsLogger.newLogger(context);
        Bundle params = new Bundle();
        params.putString("contentId", contentId);
        params.putString("contentType", contentType);
        params.putInt("numItems", numItems);
        params.putString("currency", currency);
        params.putDouble("price", price);
        logger.logEvent("Abandoned_Cart", params);

        Log.e(TAG, "logAbandoned_CartEvent: " + params);
    }

}
