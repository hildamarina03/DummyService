package org.mdsd2017.android.dummyservice;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity implements View.OnClickListener {

    private static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnStartService = (Button) findViewById(R.id.btn_start_service);
        btnStartService.setOnClickListener(this);

        Button btnStartBoundService = (Button) findViewById(R.id.btn_start_bound_service);
        btnStartBoundService.setOnClickListener(this);

        Button btnStartIntentService = (Button) findViewById(R.id.btn_start_intent_service);
        btnStartIntentService.setOnClickListener(this);
    }

    @Override
    public void onClick(View whichView) {
        if(whichView.getId() == R.id.btn_start_service){
            Log.i("OnClickClass", "Button StartService clicked");

            Intent intent = new Intent(this, CustomStartService.class);
            startService(intent);
        }else if(whichView.getId() == R.id.btn_start_bound_service){
            Log.i("OnClickClass", "Button StartBoundService clicked");


        }else if(whichView.getId() == R.id.btn_start_intent_service){
            Log.i("OnClickClass", "Button StartIntentService clicked");

            Intent intent = new Intent(this, MyIntentService.class);
            startService(intent);

        }else{
            Log.i("OnClickClass", "Problem!");
        }
    }
}
