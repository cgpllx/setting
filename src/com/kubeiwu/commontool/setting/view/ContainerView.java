package com.kubeiwu.commontool.setting.view;

import java.util.ArrayList;
import java.util.List;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;

public class ContainerView extends LinearLayout {

	@SuppressLint("NewApi")
	public ContainerView(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
		initView();
	}

	private void initView() {
		setOrientation(VERTICAL);
	}

	public ContainerView(Context context, AttributeSet attrs) {
		this(context, attrs, 0);
	}

	public ContainerView(Context context) {
		super(context);
		initView();
	}

	public void addGroupView(List<GroupView> groupViews) {
		this.groupViews.addAll(groupViews);
	}

	private ArrayList<GroupView> groupViews = new ArrayList<>();
	public void notifyDataChanged() {
		if (groupViews != null && groupViews.size() > 0) {
			for (GroupView groupView : groupViews) {
				addView(groupView);
			}
		} else {
			setVisibility(View.GONE);
		}
	}
}
