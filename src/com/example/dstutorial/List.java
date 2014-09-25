package com.example.dstutorial;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class List extends Activity {
	Button b1,b2,b3,b4,b5;
	
	protected void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.list);
		b1=(Button) findViewById(R.id.button1);
		b2=(Button) findViewById(R.id.button2);
		b3=(Button) findViewById(R.id.button3);
		b4=(Button) findViewById(R.id.button4);
		b5=(Button) findViewById(R.id.button5);
		
b1.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
			Intent i1 = new Intent("com.example.dstutorial.LINKLIST");	
			startActivity(i1);
			}
	});
b2.setOnClickListener(new View.OnClickListener() {
	
	public void onClick(View v) {
	Intent i2 = new Intent("com.example.dstutorial.STACKS");	
	startActivity(i2);
	}
});
b3.setOnClickListener(new View.OnClickListener() {
	
	public void onClick(View v) {
	Intent i3 = new Intent("com.example.dstutorial.QUEUE");	
	startActivity(i3);
	}
});
b4.setOnClickListener(new View.OnClickListener() {
	
	public void onClick(View v) {
	Intent i4 = new Intent("com.example.dstutorial.TREES");	
	startActivity(i4);
	}
});
b5.setOnClickListener(new View.OnClickListener() {
	
	public void onClick(View v) {
	Intent i5 = new Intent("com.example.dstutorial.ABOUT");	
	startActivity(i5);
	}
});
}
}
