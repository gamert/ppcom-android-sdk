package com.ppmessage.ppcomdemo;

import android.app.Application;
import android.graphics.Color;

import com.ppmessage.ppcomlib.PPComSDK;
import com.ppmessage.ppcomlib.PPComSDKConfiguration;

/**
 * Created by ppmessage on 5/13/16.
 */
public class App extends Application {

//    private static final String TEST_APP_UUID = "914feafd-42a1-11e6-bbfe-58b035f16bf4";
//    private static final String TEST_API_KEY = "MGEzNzFhOTNjMGI2ZjgyMGViYzAzNmI5NTFlYWY2M2IyMTUyODVlZg==";
//    private static final String TEST_API_SECRET = "NjM1MTY4MWU0ZDlmYWEzMzhhZWU4ZjhjNzM5YTJkZDY2N2M0YTRjNA==";
//    private static final String TEST_SERVER_URL = "http://192.168.0.51:8945";

    private static final String TEST_APP_UUID = "d9340d1f-1749-11ea-a7be-1c872cd106a8";
    private static final String TEST_API_KEY = "ZTY3YmU2OTNmZGRhYzQxYzZlNTFiZGE3MmFjYjFiZGNiYzU4MGRjZg==";
    private static final String TEST_API_SECRET = "ZGJjYzNiMjA4ZmUwNDU2MzA4NGJmOTJmMzlmZTc3NWIyMGM3M2Y3Nw==";
    private static final String TEST_SERVER_URL = "http://192.168.82.19:8945";

    @Override
    public void onCreate() {

        PPComSDK sdk = PPComSDK.getInstance();
        PPComSDKConfiguration.Builder builder = new PPComSDKConfiguration.Builder();
        sdk.init(builder.setContext(this)
                .setAppUUID(TEST_APP_UUID)
                .setApiKey(TEST_API_KEY)
                .setApiSecret(TEST_API_SECRET)
                .setServerUrl(TEST_SERVER_URL)
                .setInputHint("Any questions")
                .setActionbarBackgroundColor(getResources().getColor(
                        android.R.color.holo_blue_dark))
                .setActionbarTitleColor(Color.WHITE)
                .setEnableLog(true)
                .setEnableEnterKeyToSendText(true)
                .build());

        super.onCreate();
    }
}
