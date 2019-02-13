package com.beta.thesidebar;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Kevein on 2019/2/8.12:48
 */

public class ContentAdapter extends BaseAdapter {
	private Context            context;
	private List<ContentModel> list;

	public ContentAdapter(Context context, List<ContentModel> list) {
		super();
		this.context = context;
		this.list = list;
	}

	@Override
	public int getCount() {
		if(list!=null)
		{
			return list.size();
		}
		return 0;
	}

	@Override
	public Object getItem(int position) {
		if(list!=null)
		{
			return list.get(position);
		}
		return null;
	}

	@Override
	public long getItemId(int position) {
		return list.get(position).getId();
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		ViewHold hold;

		if(convertView == null)
		{
			hold = new ViewHold();
			convertView = LayoutInflater.from(context).inflate(R.layout.la_listview_leftsider,null);
			convertView.setTag(hold);

		}
		else{
			hold = (ViewHold)convertView.getTag();
		}
		hold.mImageView = (ImageView)convertView.findViewById(R.id.item_imageview);
		hold.mTextView = (TextView)convertView.findViewById(R.id.item_textview);
		hold.mTextView.setText(list.get(position).getText());
		return convertView;
	}
	class ViewHold{
		public ImageView mImageView;
		public TextView mTextView;
	}
}
