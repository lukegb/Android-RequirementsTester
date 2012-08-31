package com.lukegb.android.requireclassestest;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;

public abstract class LaunchCheckActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
    	super.onCreate(savedInstanceState);
    	
    	// check requirements
    	if (!RequirementsTester.isAppSupported()) {
    		// requirements failed.
        	Intent nextActivity = new Intent(this, FailedActivity.class);
        	startActivity(nextActivity);
        	finish();
        	return;
    	}
    	// requirements passed. continue.
    }
}
