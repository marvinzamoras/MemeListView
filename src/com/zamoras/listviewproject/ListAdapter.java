package com.zamoras.listviewproject;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;


public class ListAdapter extends ArrayAdapter<String> {
	private final Activity context;
	private final String[] memeTitles;
	private final String[] memeDescriptions;
	private final int[] images;
	
	public ListAdapter(Activity context,String[] memeTitles, String[] memeDescriptions, int[] images) {
		super(context, R.layout.row_layout, memeTitles);
		this.context=context;
		this.memeTitles=memeTitles;
		this.memeDescriptions=memeDescriptions;
		this.images=images;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		LayoutInflater inflater=context.getLayoutInflater();
		View rowview=inflater.inflate(R.layout.row_layout,null,true);
		TextView title=(TextView) rowview.findViewById(R.id.label1);
		TextView description= (TextView) rowview.findViewById(R.id.label2);
		ImageView image=(ImageView) rowview.findViewById(R.id.icon);
		title.setText(memeTitles[position]);
		description.setText(memeDescriptions[position]);
		image.setBackgroundResource(images[position]);
		return rowview;
	}
	
	
	
	

}
