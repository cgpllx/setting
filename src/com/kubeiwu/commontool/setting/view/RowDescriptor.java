package com.kubeiwu.commontool.setting.view;

public class RowDescriptor {
	private String lable;
	private OnRowClickListener listener;

	public OnRowClickListener getListener() {
		return listener;
	}

	public void setListener(OnRowClickListener listener) {
		this.listener = listener;
	}

	public String getLable() {
		return lable;
	}

	public void setLable(String lable) {
		this.lable = lable;
	}

	public int getIconResId() {
		return iconResId;
	}

	public void setIconResId(int iconResId) {
		this.iconResId = iconResId;
	}

	public RowViewActionEnum getAction() {
		return action;
	}

	public void setAction(RowViewActionEnum action) {
		this.action = action;
	}

	public RowDescriptor(String lable, OnRowClickListener listener, int iconResId, RowViewActionEnum action) {
		super();
		this.lable = lable;
		this.listener = listener;
		this.iconResId = iconResId;
		this.action = action;
	}

	private int iconResId;
	private RowViewActionEnum action;
}
