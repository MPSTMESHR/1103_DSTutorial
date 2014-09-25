package com.example.dstutorial;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;

public class MainActivity extends Activity {

	
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Thread timer = new Thread()
		{
			public void run()
			{
				try
				{
					sleep(5000);
				}
				catch(InterruptedException e)
				{
					e.printStackTrace();
				}
				finally
				{
					Intent openList = new Intent("com.example.dstutorial.LIST");	
					startActivity(openList);
				}
			}
		};
		timer.start();
	}

	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		finish();
	}

}
