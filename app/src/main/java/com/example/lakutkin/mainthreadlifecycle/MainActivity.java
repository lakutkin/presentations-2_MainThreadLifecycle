package com.example.lakutkin.mainthreadlifecycle;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {
	public static final String TAG = "MainThreadLifecycle";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
		setSupportActionBar(toolbar);

		Log.d(TAG, "onCreate()");
		if (savedInstanceState == null) {
			Log.d(TAG, "Requesting orientation change");
			setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
		}
	}

	protected void onResume() {
		super.onResume();
		Log.d(TAG, "onResume()");
	}

	protected void onPause() {
		super.onPause();
		Log.d(TAG, "onPause()");
	}

	protected void onDestroy() {
		super.onDestroy();
		Log.d(TAG, "onDestroy()");
	}
}
