package com.example.dstutorial;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Linklist extends Activity{
	Button b1,b2,b3;
protected void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.linklist);
		b1=(Button) findViewById(R.id.button1);
		b2=(Button) findViewById(R.id.button2);
		b3=(Button) findViewById(R.id.button3);
b1.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
			Intent i1 = new Intent("com.example.dstutorial.LINKLIST1");	
			startActivity(i1);
			}
	});
b2.setOnClickListener(new View.OnClickListener() {
	
	public void onClick(View v) {
	Intent i2 = new Intent("com.example.dstutorial.LINKLIST4");	
	startActivity(i2);
	}
});
b3.setOnClickListener(new View.OnClickListener() {
	
	public void onClick(View v) {
	Intent i3 = new Intent("com.example.dstutorial.LINKLIST7");	
	startActivity(i3);
	}
});
}
}