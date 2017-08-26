package com.jkkc.live.http.request;


import com.google.gson.reflect.TypeToken;
import com.jkkc.live.http.data.UserInfo;
import com.jkkc.live.http.response.Response;

import java.lang.reflect.Type;

/**
 * @description: 登陆请求
 *
 * @author: Andruby
 * @time: 2016/11/2 18:07
 */
public class LoginRequest extends IRequest {

	public LoginRequest(int requestId, String userName, String password) {
		mRequestId = requestId;
		mParams.put("action", "login");
		mParams.put("userName", userName);
		mParams.put("password", password);
	}

	@Override
	public String getUrl() {
		return getHost() + "User";
	}

	@Override
	public Type getParserType() {
		return new TypeToken<Response<UserInfo>>() {
		}.getType();
	}
}
