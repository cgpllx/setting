package com.kubeiwu.commontool.setting.view;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;

public class ContainerView extends LinearLayout {

	@SuppressLint("NewApi")
	public ContainerView(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
		initView();
	}

	private void initView() {
//addChildrenForAccessibility(childrenForAccessibility);
	}
	public ContainerView(Context context, AttributeSet attrs) {
		this(context, attrs, 0);
	}

	public ContainerView(Context context) {
		super(context);
	}

	public void addGroupView(GroupView groupView) {
		groupViews.add(groupView);
	}

	public void addGroupView(GroupView... groupViews) {
		this.groupViews.addAll(Arrays.asList(groupViews));
	}

	public void addGroupView(List<GroupView> groupViews) {
		this.groupViews.addAll(groupViews);
	}

	private LinkedList<GroupView> groupViews = new LinkedList<>();
}
