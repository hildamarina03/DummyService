package org.mdsd2017.android.dummyservice;

import android.app.IntentService;
import android.content.Intent;
import android.util.Log;


/**
 * An {@link IntentService} subclass for handling asynchronous task requests in
 * a service on a separate handler thread.
 * <p>
 * TODO: Customize class - update intent actions and extra parameters.
 */
public class MyIntentService extends IntentService {
    private static final String TAG = MyIntentService.class.getSimpleName();

    public MyIntentService() {
        super("");
    }

    @Override
    protected void onHandleIntent(Intent intent) {

        CustomStartService.waitForSeconds(5);
        Log.i(MyIntentService.TAG, "Intent Service");

    }

}
