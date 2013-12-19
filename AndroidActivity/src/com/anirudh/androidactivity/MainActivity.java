package com.anirudh.androidactivity;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;

public class MainActivity extends Activity {

	private static final String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "Entered onCreate");
    }

    @Override
    protected void onStart(){
    	super.onStart();
    	Log.d(TAG, "Entered onStart");
    }
    
    @Override
    protected void onPause(){
    	super.onPause();
    	Log.d(TAG, "Entered onPause");
    }
    
    @Override
    protected void onResume(){
    	super.onResume();
    	Log.d(TAG, "Entered onResume");
    }
    
    @Override
    protected void onStop(){
    	super.onStop();
    	Log.d(TAG, "Entered onStop");
    }
    
    @Override
    protected void onDestroy(){
    	super.onDestroy();
    	Log.d(TAG, "Entered onDestroy");
    }
    
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
