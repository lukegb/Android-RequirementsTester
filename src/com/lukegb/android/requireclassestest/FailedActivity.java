package com.lukegb.android.requireclassestest;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

/**
 * This activity is run when the RequirementsTester reports that
 * the requirements are not fulfilled.
 * 
 * It's likely that you will want to diagnose why there was a failure,
 * e.g. by calling RequirementsTester.
 * 
 * @author lukegb
 *
 */
public class FailedActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_failed);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_failed, menu);
        return true;
    }
}
