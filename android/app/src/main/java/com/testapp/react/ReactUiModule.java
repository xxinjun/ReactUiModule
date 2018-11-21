package com.testapp.react;

import android.widget.Toast;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

public class ReactUiModule extends ReactContextBaseJavaModule {

    public ReactUiModule(ReactApplicationContext reactContext) {
        super(reactContext);
    }

    @Override
    public String getName() {
        return "ReactUiModule";
    }

    //toast
    @ReactMethod
    public void showToast(String msg) {
        Toast.makeText(getReactApplicationContext(), msg, Toast.LENGTH_LONG).show();
    }

}
