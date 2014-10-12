package com.kubeiwu.commontool.setting.view;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.kubeiwu.commontool.R;

public class RowView extends LinearLayout implements OnClickListener {

	private ImageView mWidgetRowActionImg;
	private TextView mWidgetRowLabel;
	private ImageView mWidgetRowIconImg;

	public RowView(Context context, AttributeSet attrs, int defStyleAttr) {
		super(context, attrs, defStyleAttr);
		initRowView();
	}

	public RowView(Context context, AttributeSet attrs) {
		this(context, attrs, 0);
	}

	public RowView(Context context) {
		super(context);
		initRowView();
	}

	private void initRowView() {
		LayoutInflater.from(getContext()).inflate(R.layout.rowviewlayout, this);
		mWidgetRowActionImg = (ImageView) findViewById(R.id.mWidgetRowActionImg);
		mWidgetRowLabel = (TextView) findViewById(R.id.mWidgetRowLabel);
		mWidgetRowIconImg = (ImageView) findViewById(R.id.mWidgetRowIconImg);
		mWidgetRowIconImg.setBackgroundResource(R.id.icon);
	}

	private RowDescriptor rowDescriptor;

	public void initRowViewData(RowDescriptor rowDescriptor) {
		this.rowDescriptor = rowDescriptor;
		mWidgetRowActionImg.setBackgroundResource(rowDescriptor.getIconResId());
		mWidgetRowLabel.setText(rowDescriptor.getLable());
		if (rowDescriptor.getAction() != null) {
			setOnClickListener(this);
			setBackgroundResource(R.drawable.widgets_general_row_selector);
			mWidgetRowActionImg.setVisibility(View.VISIBLE);
		} else {
			setBackgroundColor(Color.WHITE);
			mWidgetRowActionImg.setVisibility(View.GONE);
		}

	}

	@Override
	public void onClick(View v) {
		if (rowDescriptor.getListener() != null) {
			rowDescriptor.getListener().onRowClick(rowDescriptor.getAction());
		}
	}
	public void notifyDataChanged() {
		
	}
}
