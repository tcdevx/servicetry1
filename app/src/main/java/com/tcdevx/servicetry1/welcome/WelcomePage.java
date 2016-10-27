package com.tcdevx.servicetry1.welcome;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.tcdevx.servicetry1.MainActivity;
import com.tcdevx.servicetry1.R;

/**
 * Created by tomapopescu on 27/10/2016.
 */

public class WelcomePage extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome_page);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        new Handler().postDelayed(
            new Runnable() {
            @Override
            public void run() {
                final Intent mainIntent = new Intent(WelcomePage.this, MainActivity.class);
                WelcomePage.this.startActivity(mainIntent);
                WelcomePage.this.finish();
            }
        }, 1000);
    }
}
