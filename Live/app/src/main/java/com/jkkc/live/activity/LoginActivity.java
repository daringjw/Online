package com.jkkc.live.activity;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.EditText;

import com.andruby.live.R;
import com.andruby.live.presenter.LoginPresenter;
import com.andruby.live.presenter.ipresenter.ILoginPresenter;

/**
 * description:
 * author: zhm
 * time:2016/12/28 0:48
 */

public class LoginActivity extends BaseActivity implements View.OnClickListener, ILoginPresenter.ILoginView {

	private EditText etUsername;
	private EditText etPassword;

	LoginPresenter mLoginPresenter;

	@Override
	protected int getLayoutId() {
		return R.layout.activity_login;
	}

	@Override
	protected void initView() {
		etUsername = obtainView(R.id.et_login);
		etPassword = obtainView(R.id.et_password);

	}

	@Override
	protected void initData() {
		mLoginPresenter = new LoginPresenter(this);
	}

	@Override
	protected void setListener() {
		obtainView(R.id.btn_register).setOnClickListener(this);
		obtainView(R.id.btn_login).setOnClickListener(this);

	}


	public static void invoke(Context context) {
		Intent intent = new Intent(context, LoginActivity.class);
		context.startActivity(intent);
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
			case R.id.btn_register:
				RegisterActivity.invoke(this);
				break;

			case R.id.btn_login:
				mLoginPresenter.phoneLogin(etUsername.getText().toString(), etPassword.getText().toString());
				break;
		}
	}

	@Override
	public void normalLoginSuccess() {

	}

	@Override
	public void normalLoginFailed(String errorMsg) {

	}

	@Override
	public void phoneLoginSuccess() {
		showToast("login success");
	}

	@Override
	public void phoneLoginFailed(String errorMsg) {
		showToast(errorMsg);
	}

	@Override
	public void usernameError(String errorMsg) {

	}

	@Override
	public void phoneError(String errorMsg) {
		showToast(errorMsg);
	}

	@Override
	public void verifyCodeError(String errorMsg) {
		showToast(errorMsg);
	}

	@Override
	public void showLoading() {

	}

	@Override
	public void dismissLoading() {

	}

	@Override
	public void showMsg(String msg) {

	}

	@Override
	public void showMsg(int msg) {

	}

	@Override
	public Context getContext() {
		return this;
	}
}
