package com.jkkc.live.http.request;

import com.andruby.live.http.response.Response;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;

/**
 * @description: 直播状态接口请求
 *
 * @author: Andruby
 * @time: 2016/11/2 18:07
 */
public class LiveStatusRequest extends IRequest {

    public LiveStatusRequest(int requestId,String userId ,int status) {
        mRequestId = requestId;
        mParams.put("action","liveStatus");
        mParams.put("userId",userId);
        mParams.put("status", status);
    }

    @Override
    public String getUrl() {
        return getHost() + "Live";
    }

    @Override
    public Type getParserType() {
        return new TypeToken<Response>() {}.getType();
    }
}
