package com.example.dstutorial;

import android.app.Activity;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;

public class Stack10 extends Activity implements OnClickListener{
	 Button start,stop;
	    AnimationDrawable animationDrawable=null;
	    @Override
	    public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.stack10);
	        start=(Button)findViewById(R.id.button1);
	        stop=(Button)findViewById(R.id.button2);
	        start.setOnClickListener(this);
	        stop.setOnClickListener(this);
	    }
		public void onClick(View v) {
			switch (v.getId()) {
			case R.id.button1:
				startanimation();
				break;
				
			case R.id.button2:
				stopanimation();
				break;
			default:
				break;
			}
			
		}
		
		@SuppressWarnings("deprecation")
		void startanimation()
		{
			ImageView img=(ImageView)findViewById(R.id.imageView1);
			
			//A Drawable is a class that wraps a bitmap and can be tiled, stretched, or aligned
			BitmapDrawable image1=(BitmapDrawable)getResources().getDrawable(R.drawable.s31);
			BitmapDrawable image2=(BitmapDrawable)getResources().getDrawable(R.drawable.s41);
			BitmapDrawable image3=(BitmapDrawable)getResources().getDrawable(R.drawable.s51);
			BitmapDrawable image4=(BitmapDrawable)getResources().getDrawable(R.drawable.s61);
			
			
			int reasonableduration=1500;
			animationDrawable=new AnimationDrawable();
			
			animationDrawable.addFrame(image1, reasonableduration);
			animationDrawable.addFrame(image2, reasonableduration);
			animationDrawable.addFrame(image3, reasonableduration);
			animationDrawable.addFrame(image4, reasonableduration);
			
			
			
			
			animationDrawable.setOneShot(false);		
			img.setBackgroundDrawable(animationDrawable);
			animationDrawable.setVisible(true, true);
			animationDrawable.start();
		}
		
			void stopanimation()
			{
				animationDrawable.stop();
				}
}
