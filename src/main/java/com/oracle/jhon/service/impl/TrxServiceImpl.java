package com.oracle.jhon.service.impl;

import com.oracle.jhon.model.request.Request;
import com.oracle.jhon.model.response.Response;
import com.oracle.jhon.model.response.Sampleservicers;
import com.oracle.jhon.service.TrxService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class TrxServiceImpl implements TrxService {
    @Override
    public Response getTrx(Request request) {
            log.info("start getTrx {}",request.getSampleservicerq().getTrx_id());
            Response  response=new Response();

            try {
                Sampleservicers sampleservicers = new Sampleservicers();
                sampleservicers.setError_code("0000");
                sampleservicers.setError_msg("Success");
                sampleservicers.setTrx_id(request.getSampleservicerq().getTrx_id());

                response.setSampleservicers(sampleservicers);
            }catch (Exception e){
                Sampleservicers sampleservicers = new Sampleservicers();
                sampleservicers.setError_code("11111");
                sampleservicers.setError_msg("Failed");
                sampleservicers.setTrx_id(request.getSampleservicerq().getTrx_id());
                response.setSampleservicers(sampleservicers);
                return response;
            }
            return response;
    }
}
