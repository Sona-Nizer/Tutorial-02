package com.example.usingstrings;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView TvMsg2;
    private static final String TAG = "Lifecycle";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TvMsg2 =findViewById(R.id.TvMsg2);
        TvMsg2.setText(R.string.Msg2);

        Log.i(TAG, "onCreate: ");

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "onStart: ");

    }

    @Override
    protected void onStop() {

        super.onStop();
        Log.i(TAG, "onStop: ");
    }

    @Override
    protected void onPostResume() {

        super.onPostResume();
        Log.i(TAG, "onPostResume: ");
    }

    @Override
    protected void onRestart()
    {
        super.onRestart();
        Log.i(TAG, "onRestart: ");
    }
}