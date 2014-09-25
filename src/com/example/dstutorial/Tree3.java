package com.example.dstutorial;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Tree3 extends Activity{
	Button b1,b2;
	protected void onCreate(Bundle savedInstanceState) {
			
			super.onCreate(savedInstanceState);
			setContentView(R.layout.tree3);
			b1=(Button) findViewById(R.id.button1);
			b2=(Button) findViewById(R.id.button2);
			
	b1.setOnClickListener(new View.OnClickListener() {
				
				public void onClick(View v) {
				Intent i1 = new Intent("com.example.dstutorial.TREE6");	
				startActivity(i1);
				}
		});
	b2.setOnClickListener(new View.OnClickListener() {
		
		public void onClick(View v) {
		Intent i2 = new Intent("com.example.dstutorial.TREE7");	
		startActivity(i2);
		}
	});
}
}