package com.rnsocketmobile;
import android.content.Context;

import com.facebook.react.BuildConfig;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.socketmobile.capture.AppKey;
//import com.socketmobile.capture.client.DeviceClient;
// import com.socketmobile.capture.client.DeviceState;
// import com.socketmobile.capture.client.DeviceStateEvent;
// import com.socketmobile.capture.client.DataEvent;
// import com.socketmobile.capture.CaptureError;

// import org.greenrobot.eventbus.Subscribe;
// import org.greenrobot.eventbus.ThreadMode;
import com.facebook.react.bridge.ReactContext;

import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.Arguments;
// import com.socketmobile.capture.client.ConnectionState;
// import com.socketmobile.capture.client.CaptureClient;
// import com.socketmobile.capture.client.ConnectionCallback;


public class ReactNativeSocketMobile extends ReactContextBaseJavaModule {
    // private Context appContext;
    private Boolean deviceConnected = false;
    private String value;
    private ReactApplicationContext reactContext;
    // private CaptureClient client;
    //constructor

    public ReactNativeSocketMobile(ReactApplicationContext reactContext) {
        super(reactContext);
        // appContext = reactContext.getApplicationContext();
        this.reactContext = reactContext;
    }

    //Mandatory function getName that specifies the module name
    @Override
    public String getName() {
        return "SocketMobile";
    }

    // public CaptureClient.Listener mListener = new CaptureClient.Listener() {
    //   @Override public void onData(DataEvent event) {
    //     DeviceClient device = event.getDevice();
    //     String data = event.getData().getString();
    //     // do something
    //     value = "Scanned";
    //     WritableMap params = Arguments.createMap();
    //     params.putString("barcodeScanned", data);
    //     sendEvent("BarcodeScanned", params);
    //   }

    //   @Override public void onDeviceStateEvent(DeviceStateEvent event) {
    //     DeviceClient device = event.getDevice();
    //     DeviceState state = event.getState();
    //     WritableMap params = Arguments.createMap();
    //     switch(state.intValue()) {
    //         case DeviceState.READY:
    //           // Ready to use
    //           params.putString("barcodeStatus", "Connected");
    //           sendEvent("BarcodeStatus", params);
    //             break;
    //         default:
    //           // Device not ready for use
    //           params.putString("barcodeStatus", "Disconnected");
    //           sendEvent("BarcodeStatus", params);
    //     }   
    //   }

    //   @Override public void onError(CaptureError error) {
    //     value = "Scan error";
    //   }
    // };

    // public ConnectionCallback connectionCallback = new ConnectionCallback() {
    //   @Override public void onConnectionStateChanged(ConnectionState state) {
    //     value = "Worked";
    //     // switch(state.get()) {
    //     //   case ConnectionState.CONNECTING:
    //     //     // do something or nothing
    //     //     break;
    //     //   case ConnectionState.CONNECTED:
    //     //     // client is now usable
    //     //     break;
    //     //   case ConnectionState.DISCONNECTING:
    //     //     // only called when shutting down gracefully
    //     //     break;
    //     //   case ConnectionState.DISCONNECTED:
    //     //     if(state.disconnectCausedByError()) {
    //     //         // Handle error
    //     //     } else {
    //     //         // Shut down normally
    //     //     }
    //     //   default:
    //     //       // Unreachable
    //     //       break;
    //     // }
    //   }
    // };
    // //Custom function that we are going to export to JS
    // @ReactMethod
    // //Testing Bridge
    // public void getDeviceName(Callback cb) {
    //     try{
    //        cb.invoke(null, android.os.Build.MODEL);
    //     }catch (Exception e){
    //      cb.invoke(e.toString(), null);
    //     }
    // }

    // @ReactMethod
    // //should init
    // public void start(String appKey , String bundleId , String devId) {
    //     try{
    //         AppKey appkey = new AppKey(appKey, bundleId, devId);
    //         client = new CaptureClient(appkey);
    //         this.client.setListener(this.mListener);
    //         this.client.connect(this.connectionCallback);
    //         //cb.invoke(null, "Worked");
    //     }catch (Exception e){
    //         //cb.invoke(e.toString(), null);
    //     }
    // }

    // @ReactMethod
    // public void setDeviceStatusListener(Callback cb){
    //     cb.invoke(this.deviceConnected);
    // }

    // @ReactMethod
    // public void getStatus(Callback cb){
    //   cb.invoke(this.client.getDevices().toArray().length);
    // }

    // public void sendEvent(String eventName, WritableMap params) {    
    //   this.reactContext
    //     .getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)
    //     .emit(eventName, params);
    // }
}
