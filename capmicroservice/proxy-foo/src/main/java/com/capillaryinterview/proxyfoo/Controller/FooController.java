package com.capillaryinterview.proxyfoo.Controller;

import com.capillaryinterview.proxyfoo.service.Iservicecall;
import com.fasterxml.jackson.core.JsonProcessingException;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.retry.annotation.Retry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FooController {

    @Autowired
    Iservicecall iscall;


    @GetMapping (value = "/getservicename/{id}")
    @CircuitBreaker(name = "detailsforsevice",fallbackMethod ="myserviceFallBack")
    @Retry(name = "retryMethod", fallbackMethod = "myserviceFallBack")
    public String getServiceName(@PathVariable int id) throws JsonProcessingException {

        String csm = iscall.getServiceAtrributes(id);

        return csm;

    }


    private String myserviceFallBack(int id, Throwable t){
        return "Failed";
    }

}
