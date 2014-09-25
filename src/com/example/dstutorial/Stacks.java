package com.example.dstutorial;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Stacks extends Activity{
	Button b1,b2;
	protected void onCreate(Bundle savedInstanceState) {
			
			super.onCreate(savedInstanceState);
			setContentView(R.layout.stacks);
			b1=(Button) findViewById(R.id.button1);
			b2=(Button) findViewById(R.id.button2);
			
	b1.setOnClickListener(new View.OnClickListener() {
				
				public void onClick(View v) {
				Intent i1 = new Intent("com.example.dstutorial.STACK1");	
				startActivity(i1);
				}
		});
	b2.setOnClickListener(new View.OnClickListener() {
		
		public void onClick(View v) {
		Intent i2 = new Intent("com.example.dstutorial.STACK4");	
		startActivity(i2);
		}
	});
	
	}
}
