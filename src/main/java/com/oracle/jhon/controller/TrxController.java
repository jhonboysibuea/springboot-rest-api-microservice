package com.oracle.jhon.controller;

import com.oracle.jhon.model.request.Request;
import com.oracle.jhon.model.response.Response;
import com.oracle.jhon.service.TrxService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/external/services/rest")
@Slf4j
public class TrxController {

    @Autowired
    TrxService trxService;

    @PostMapping("/sample-service")
    public ResponseEntity<Response> getTrx(@RequestBody Request request) {
        log.info("start getTrx");
        Response res= trxService.getTrx(request);
        return ResponseEntity.ok(res);
    }
}
