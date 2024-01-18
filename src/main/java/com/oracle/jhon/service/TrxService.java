package com.oracle.jhon.service;

import com.oracle.jhon.model.request.Request;
import com.oracle.jhon.model.response.Response;

public interface TrxService {
    public Response getTrx(Request request);
}
