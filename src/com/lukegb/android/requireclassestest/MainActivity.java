package com.lukegb.android.requireclassestest;

import android.os.Bundle;
import android.view.Menu;

// Note how MainActivity extends LaunchCheckActivity, not Activity
// This means when onCreate is triggered it will check requirements.
//
// Apart from that it does normal Activity-y stuff.
public class MainActivity extends LaunchCheckActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
}
