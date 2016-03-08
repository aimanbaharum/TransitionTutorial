package com.aimanbaharum.transitiontutorial;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by cliqers on 3/3/2016.
 */
public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.container, new SecondFragment())
                .commit();
    }
}
