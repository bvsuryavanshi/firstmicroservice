package com.capillaryinterview.proxyfoo.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient("CapserviceModel")
public interface Iservicecall {

    @GetMapping("/myservice/{itemId}")
    public  String getServiceAtrributes(int itemId);



}
