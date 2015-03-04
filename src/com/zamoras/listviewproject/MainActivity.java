package com.zamoras.listviewproject;


import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends Activity {

	ListView list;
	String[] memeTitles;
	String[] memeDescriptions;
	int[] images={R.drawable.img1,R.drawable.img2,R.drawable.img3,R.drawable.img4,R.drawable.img5,
			R.drawable.img6,R.drawable.img7,R.drawable.img8,R.drawable.img9,R.drawable.img10};
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Resources res=getResources();
		memeTitles=res.getStringArray(R.array.titles);
		memeDescriptions=res.getStringArray(R.array.descriptions);
		
		list=(ListView) findViewById(R.id.listView1);
		ListAdapter adapter = new ListAdapter(MainActivity.this, memeTitles,memeDescriptions,images);
		list.setAdapter(adapter);
		list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
				// TODO Auto-generated method stub
				Intent intent=new Intent(MainActivity.this,listactivity.class);
				intent.putExtra("position", position);
				startActivity(intent);
				
			}
			
			
		});
	}
	
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}


}
