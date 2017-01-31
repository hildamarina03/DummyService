package org.mdsd2017.android.dummyservice;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

public class CustomStartService extends Service {

    private static final String TAG = CustomStartService.class.getSimpleName();

    public CustomStartService() {
    }

    @Override
    public void onCreate(){
        super.onCreate();

        Log.i(CustomStartService.TAG, "onCreate");
    }

    public int onStartCommand(Intent intent, int flags, int startId){

        waitForSeconds(1);
        Log.i(CustomStartService.TAG, "onStartCommand");

        return Service.START_NOT_STICKY;
    }

    public static void waitForSeconds(int timeLapseSec){
        long endTime = System.currentTimeMillis() + (timeLapseSec*1000);

        while (System.currentTimeMillis() < endTime){
        }

    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
