package com.example.usingstring;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView txtVMsg2 = findViewById(R.id.TvMsg2);
        txtVMsg2.setText(R.string.Msg2);

        Log.i("Lifecycle","OnCreate() invoked");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("Lifecycle","OnStart() invoked");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("Lifecycle", "OnResume() invoked");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("Lifestyle", "OnPause() invoked");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("Lifestyle", "OnStop() invoked");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("Lifestyle", "OnDestroy() invoked");
    }
}