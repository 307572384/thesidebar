package com.beta.thesidebar;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Kevein on 2019/2/13.15:14
 */

public class newsFragment extends android.support.v4.app.Fragment {
	@Nullable
	@Override
	public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
		View newsView = inflater.inflate(R.layout.f_newfragment, container, false);
		return newsView;
	}
}
