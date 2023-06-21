package com.example.yogaapp;

import android.util.Log;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

public class GettingDeviceTokenService extends FirebaseMessagingService {

    @Override
    public void onNewToken(String token) {
        Log.d("DEVICE TOKEN:", token);
    }

    @Override
    public void onMessageReceived(RemoteMessage remoteMessage) {
        // Handle incoming FCM messages here if needed
        // This method is optional and can be removed if not used
    }
}
