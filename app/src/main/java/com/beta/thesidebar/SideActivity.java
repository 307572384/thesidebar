package com.beta.thesidebar;

import android.app.Activity;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class SideActivity extends FragmentActivity{
	private List<ContentModel> mList = new ArrayList<ContentModel>();
	private DrawerLayout mDrawerLayout;
	private ListView     mListView;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.la_sidebar);
		initData();

		mListView = (ListView) findViewById(R.id.left_listview);
		ContentAdapter adapter = new ContentAdapter(this,mList);
		mListView.setAdapter(adapter);
		/**切换listview的item背景色，选中为红色；否则为黑色的方式二。当点击item的时候，就会触发子项item的焦点*/
		mListView.setOnFocusChangeListener(new View.OnFocusChangeListener() {
			@Override
			public void onFocusChange(View v, boolean hasFocus) {
				if(hasFocus == true){
					//获得焦点
					mListView.setSelector(android.R.color.holo_red_light) ;
				}   else{
					//失去焦点
					mListView.setSelector(android.R.color.black) ;
				}
			}
		});
		mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
				switch (position) {
					//模拟两条数据

					case 0://新闻
						//切换新闻的Fragment
						replaceFragment(new newsFragment());
						break;
					case 1://订阅
						//切换订阅的Fragment
						replaceFragment(new SubscibeFragment());
						break;

					default:
						break;
				}
				//点击任一项item项，都关闭左侧菜单
				mDrawerLayout.closeDrawer(Gravity.LEFT);
			}
		});


	}
	private void initData()
	{
		mList.add(new ContentModel(R.mipmap.ic_launcher,"用户",1));
		mList.add(new ContentModel(R.mipmap.ic_launcher,"订阅0",2));
		mList.add(new ContentModel(R.mipmap.ic_launcher,"订阅1",3));
		mList.add(new ContentModel(R.mipmap.ic_launcher,"订阅2",4));
		mList.add(new ContentModel(R.mipmap.ic_launcher,"订阅3",5));
		mList.add(new ContentModel(R.mipmap.ic_launcher,"订阅4",6));
		mList.add(new ContentModel(R.mipmap.ic_launcher,"订阅5",7));
		mList.add(new ContentModel(R.mipmap.ic_launcher,"订阅6",8));


	}
	public void replaceFragment(Fragment fragment){
		//1、拿到FragmentManager管理器
		FragmentManager manager = getSupportFragmentManager();

		//2、获取事物
		FragmentTransaction transaction = manager.beginTransaction();

		//3、fragment的替换
		transaction.replace(R.id.content,fragment);

		//4、提交事物
		transaction.commit();
	}
}
