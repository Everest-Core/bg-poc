package com.everestcore.controller;


import com.everestcore.model.ResponseData;
import com.everestcore.model.UserDTO;
import com.everestcore.service.ISeviceBusiness;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@Slf4j
@RestController
@RequestMapping("/test-controller")
public class TestController {



    @Autowired
    private ISeviceBusiness service;


    @RequestMapping(path = "/test", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE,method= RequestMethod.POST)
    @ResponseBody
    public ResponseEntity<ResponseData> validate(@RequestBody UserDTO request, @RequestHeader Map<String, String> headers) {

        log.info("Modificacion Controlador Peticion en controllador, llamada desde microservicio "+request.getPartyId());
        return new ResponseEntity<>(service.getMsj(request.getPartyId()), HttpStatus.OK);
    }
}
