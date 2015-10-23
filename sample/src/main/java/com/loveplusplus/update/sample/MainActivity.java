package com.loveplusplus.update.sample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import com.loveplusplus.update.UpdateChecker;

public class MainActivity extends AppCompatActivity {

    protected static final String APP_UPDATE_SERVER_URL = "https://dl.dropboxusercontent.com/u/34318932/updateinfo.json";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		UpdateChecker.checkForNotification(MainActivity.this, APP_UPDATE_SERVER_URL);

	}

}
