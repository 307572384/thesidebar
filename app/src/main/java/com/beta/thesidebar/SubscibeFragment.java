package com.beta.thesidebar;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Kevein on 2019/2/13.15:14
 */

public class SubscibeFragment extends android.support.v4.app.Fragment {
	@Nullable
	@Override
	public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
		View subView = inflater.inflate(R.layout.f_subfragment, container, false);
		return subView;
	}
}
