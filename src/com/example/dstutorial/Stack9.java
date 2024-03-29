package com.example.dstutorial;

import android.app.Activity;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;

public class Stack9 extends Activity implements OnClickListener{
	 Button start,stop;
	    AnimationDrawable animationDrawable=null;
	    @Override
	    public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.stack9);
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
			BitmapDrawable image1=(BitmapDrawable)getResources().getDrawable(R.drawable.s161);
			BitmapDrawable image2=(BitmapDrawable)getResources().getDrawable(R.drawable.s171);
			BitmapDrawable image3=(BitmapDrawable)getResources().getDrawable(R.drawable.s181);
			BitmapDrawable image4=(BitmapDrawable)getResources().getDrawable(R.drawable.s191);
			BitmapDrawable image5=(BitmapDrawable)getResources().getDrawable(R.drawable.s201);
			BitmapDrawable image6=(BitmapDrawable)getResources().getDrawable(R.drawable.s211);
			BitmapDrawable image7=(BitmapDrawable)getResources().getDrawable(R.drawable.s221);
			BitmapDrawable image8=(BitmapDrawable)getResources().getDrawable(R.drawable.s231);
			BitmapDrawable image9=(BitmapDrawable)getResources().getDrawable(R.drawable.s151);
			
			int reasonableduration=1500;
			animationDrawable=new AnimationDrawable();
			
			animationDrawable.addFrame(image1, reasonableduration);
			animationDrawable.addFrame(image2, reasonableduration);
			animationDrawable.addFrame(image3, reasonableduration);
			animationDrawable.addFrame(image4, reasonableduration);
			animationDrawable.addFrame(image5, reasonableduration);
			animationDrawable.addFrame(image6, reasonableduration);
			animationDrawable.addFrame(image7, reasonableduration);
			animationDrawable.addFrame(image8, reasonableduration);
			animationDrawable.addFrame(image9, reasonableduration);
			
			
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
