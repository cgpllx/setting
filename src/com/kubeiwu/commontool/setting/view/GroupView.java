package com.kubeiwu.commontool.setting.view;

import java.util.ArrayList;
import java.util.LinkedList;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;

public class GroupView extends LinearLayout {

	public GroupView(Context context, AttributeSet attrs, int defStyleAttr) {
		super(context, attrs, defStyleAttr);
		initGroupView();
	}

	public GroupView(Context context, AttributeSet attrs) {
		this(context, attrs, 0);
	}

	public GroupView(Context context) {
		super(context);
		initGroupView();
	}

	private void initGroupView() {
		setOrientation(VERTICAL);
	}

	private ArrayList<RowDescriptor> descriptors = new ArrayList<>();

 
	public void addAllRowView(ArrayList<RowDescriptor> descriptors) {
		this.descriptors.addAll(descriptors);
	}

	public void notifyDataChanged() {
		if (descriptors != null && descriptors.size() > 0) {
			RowView rowView;
			for (RowDescriptor descriptor : descriptors) {
				rowView=new RowView(getContext());
				rowView.initRowViewData(descriptor);
				rowView.notifyDataChanged();
				addView(rowView);
			}
		} else {
			setVisibility(View.GONE);
		}
	}
}
