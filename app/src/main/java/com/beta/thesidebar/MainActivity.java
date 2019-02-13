package com.beta.thesidebar;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Kevein on 2019/2/13.21:19
 */

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
	private Button thesidebar1;
	private Button thesidebar2;

	@Override
	protected void onCreate(@Nullable Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		initView();

	}

	private void initView() {
		thesidebar1 = (Button) findViewById(R.id.thesidebar1);
		thesidebar2 = (Button) findViewById(R.id.thesidebar2);

		thesidebar1.setOnClickListener(this);
		thesidebar2.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
			case R.id.thesidebar1:
				Intent sidedemo1 = new Intent(MainActivity.this, SideaActivity.class);
				startActivity(sidedemo1);
				break;
			case R.id.thesidebar2:
				Intent sidedemo2 = new Intent(MainActivity.this, SideActivity.class);
				startActivity(sidedemo2);
				break;
		}
	}
}
