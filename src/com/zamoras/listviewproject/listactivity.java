package com.zamoras.listviewproject;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;

import android.widget.ImageView;
import android.widget.TextView;

public class listactivity extends Activity {
	ImageView imageView;
	TextView title, description;
	String[]titles;
	String[]descriptions;
	int[]memepics={R.drawable.img1,R.drawable.img2,R.drawable.img3,R.drawable.img4,
			R.drawable.img5,R.drawable.img6,R.drawable.img7,R.drawable.img8,
			R.drawable.img9,R.drawable.img10};
	@Override
	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.meme_details);
		Resources res=getResources();
		titles=res.getStringArray(R.array.titles);
		descriptions=res.getStringArray(R.array.descriptions);
		int pos=(int)getIntent().getExtras().getInt("position");
		imageView=(ImageView)findViewById(R.id.memeImage);
		title=(TextView)findViewById(R.id.memeTitle);
		description=(TextView)findViewById(R.id.memeDescription);
		
		imageView.setBackgroundResource(memepics[pos]);
		title.setText(titles[pos]);
		description.setText(descriptions[pos]);
		
	}
	

}
