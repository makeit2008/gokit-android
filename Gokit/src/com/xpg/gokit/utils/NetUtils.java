package com.xpg.gokit.utils;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;


public class NetUtils {

	 static public boolean isWifiConnected(Context context) {  
		      if (context != null) {  
		          ConnectivityManager mConnectivityManager = (ConnectivityManager) context  
		                  .getSystemService(Context.CONNECTIVITY_SERVICE);  
		          NetworkInfo mWiFiNetworkInfo = mConnectivityManager  
		                  .getNetworkInfo(ConnectivityManager.TYPE_WIFI);  
		          if (mWiFiNetworkInfo != null) {  
		              if( mWiFiNetworkInfo.isAvailable()){
		            	  return mWiFiNetworkInfo.isConnected();
		              }else{
		            	  return false;
		              }
		          }  
		     }  
		     return false;  
		 }  
	 static public boolean isMobileConnected(Context context) {  
		      if (context != null) {  
		          ConnectivityManager mConnectivityManager = (ConnectivityManager) context  
		                  .getSystemService(Context.CONNECTIVITY_SERVICE);  
		          NetworkInfo mMobileNetworkInfo = mConnectivityManager  
		                 .getNetworkInfo(ConnectivityManager.TYPE_MOBILE);  
		          if (mMobileNetworkInfo != null) {  
		             if( mMobileNetworkInfo.isAvailable()){
		            	 return mMobileNetworkInfo.isConnected();
		             }else{
		            	 return false;
		             }
		          }  
		     }  
		     return false;  
		 } 
	 public static int getConnectedType(Context context) {  
		      if (context != null) {  
		          ConnectivityManager mConnectivityManager = (ConnectivityManager) context  
		                  .getSystemService(Context.CONNECTIVITY_SERVICE);  
		          NetworkInfo mNetworkInfo = mConnectivityManager.getActiveNetworkInfo();  
		          if (mNetworkInfo != null && mNetworkInfo.isAvailable()) {  
		              return mNetworkInfo.getType();  
		          }  
		      }  
		     return -1;  
		 }
	 public static String getCurentWifiSSID(Context context){
		 String ssid = "";
		 if(context!=null){
			 WifiManager wifiManager = (WifiManager)context.getSystemService(Context.WIFI_SERVICE);
			 WifiInfo wifiInfo = wifiManager.getConnectionInfo();
			 ssid = wifiInfo.getSSID();
			 
		 }
		 return ssid;
	 }

}