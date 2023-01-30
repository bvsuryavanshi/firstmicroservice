package com.capillaryinterview.capmicroservice.Controller;

import com.capillaryinterview.capmicroservice.service.Iservicecall;
import com.fasterxml.jackson.core.JsonProcessingException;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.retry.annotation.Retry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CapserviceController {

    @Autowired
     Myservice msc;

    @GetMapping (value = "/getservicename/{id}")
    public String getServiceName(@PathVariable int id) throws JsonProcessingException {


        return "Dummy response " + id;

    }



}