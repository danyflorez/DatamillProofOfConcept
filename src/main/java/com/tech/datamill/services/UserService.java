package com.tech.datamill.services;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import foundation.stack.datamill.http.Response;
import foundation.stack.datamill.http.ServerRequest;
import foundation.stack.datamill.http.annotations.GET;
import foundation.stack.datamill.http.annotations.PATCH;
import foundation.stack.datamill.http.annotations.POST;
import foundation.stack.datamill.http.annotations.Path;
import foundation.stack.datamill.http.impl.ResponseBuilderImpl;
import rx.Observable;

@Path("/users")
public class UserService {
    @POST
    public Observable<Response> addUser(ServerRequest request) {
    	ExecutorService executor = Executors.newSingleThreadExecutor();
    	ResponseBuilderImpl builder = new ResponseBuilderImpl(executor);
    	return null;
    }

    @GET
    @Path("/{userName}")
    public Observable<Response> getUser(ServerRequest request) {
    	return null;
    }

    @PATCH
    @Path("/{userName}/password")
    public Observable<Response> updatePassword(ServerRequest request) {
    	return null;
    }

    @PATCH
    @Path("/{userName}")
    public Observable<Response> updateUser(ServerRequest request) {
    	return null;
    }
}