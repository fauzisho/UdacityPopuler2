package com.uzi.populermovie2.service;

import java.io.IOException;

import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;


public class TheMovieDbInterceptor implements Interceptor {

    @Override
    public Response intercept(Chain chain) throws IOException {

        final HttpUrl url = chain.request()
                .url()
                .newBuilder()
                .addQueryParameter("api_key", "0330bdb6511e406804265feac315a286")
                .build();
        final Request request = chain.request().newBuilder().url(url).build();
        return chain.proceed(request);
    }

}
