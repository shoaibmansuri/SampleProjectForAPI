package com.example.mobiweb.testapp.util;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

import com.example.mobiweb.testapp.BaseApplication;

public class Utils {

    private Context mContext;


    public static boolean isNetworkAvail() {
        ConnectivityManager mContextSystemService = (ConnectivityManager) BaseApplication.getBaseApplication().getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo mNetworkInfoactiveNetwork = mContextSystemService.getActiveNetworkInfo();
        return mNetworkInfoactiveNetwork != null && mNetworkInfoactiveNetwork.isConnectedOrConnecting();
    }
}
