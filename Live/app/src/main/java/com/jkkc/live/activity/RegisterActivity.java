package com.jkkc.live.activity;

import android.content.Context;
import android.content.Intent;

import com.andruby.live.R;

/**
 * description:
 * author: zhm
 * time:2016/12/28 1:12
 */

public class RegisterActivity extends BaseActivity {
	@Override
	protected int getLayoutId() {
		return R.layout.activity_register;
	}

	@Override
	protected void initView() {

	}

	@Override
	protected void initData() {

	}

	@Override
	protected void setListener() {

	}

	public static void invoke(Context context) {
		Intent intent = new Intent(context, RegisterActivity.class);
		context.startActivity(intent);
	}
}
