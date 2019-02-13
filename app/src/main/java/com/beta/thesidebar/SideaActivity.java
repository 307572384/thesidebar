package com.beta.thesidebar;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

/**
 * Created by Kevein on 2019/2/13.21:09
 */

public class SideaActivity extends AppCompatActivity {
	private ImageView btn_back;
	private SlideMenu mSlideMenu;

	@Override
	protected void onCreate(@Nullable Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.ot_layout_main);
		btn_back = (ImageView)findViewById(R.id.btn_back);
		mSlideMenu = (SlideMenu)findViewById(R.id.slideMenu);
		//点击返回键打开或关闭Menu
		btn_back.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				mSlideMenu.switchMenu();
			}
		});
	}
}
