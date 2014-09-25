package com.example.dstutorial;

import android.app.Activity;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;

public class Queue7 extends Activity implements OnClickListener{
	 Button start,stop;
	    AnimationDrawable animationDrawable=null;
	    @Override
	    public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.queue7);
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
			BitmapDrawable image1=(BitmapDrawable)getResources().getDrawable(R.drawable.q81);
			BitmapDrawable image2=(BitmapDrawable)getResources().getDrawable(R.drawable.q91);
			BitmapDrawable image3=(BitmapDrawable)getResources().getDrawable(R.drawable.q101);
			BitmapDrawable image4=(BitmapDrawable)getResources().getDrawable(R.drawable.q111);
			BitmapDrawable image5=(BitmapDrawable)getResources().getDrawable(R.drawable.q71);
			
			int reasonableduration=1500;
			animationDrawable=new AnimationDrawable();
			
			animationDrawable.addFrame(image1, reasonableduration);
			animationDrawable.addFrame(image2, reasonableduration);
			animationDrawable.addFrame(image3, reasonableduration);
			animationDrawable.addFrame(image4, reasonableduration);
			animationDrawable.addFrame(image5, reasonableduration);
			
			
			
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
