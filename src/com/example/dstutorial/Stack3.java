package com.example.dstutorial;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Stack3 extends Activity{
	Button b1;
	protected void onCreate(Bundle savedInstanceState) {
			
			super.onCreate(savedInstanceState);
			setContentView(R.layout.stack3);
			b1=(Button) findViewById(R.id.button1);
			
			
	b1.setOnClickListener(new View.OnClickListener() {
				
				public void onClick(View v) {
				Intent i1 = new Intent("com.example.dstutorial.STACK2");	
				startActivity(i1);
				}
		});
	
}
	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		finish();
	}
	
}