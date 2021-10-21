package com.everestcore.service;


import com.everestcore.model.ResponseData;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class ServiceBusinessImpl  implements ISeviceBusiness{

    public ResponseData getMsj(String param){
        String msj="Usuario Ingresado: ";

        log.info("Entrando el bean de servicio correccion. FIX");
        log.info("Regresando mensaje");
        ResponseData data=new ResponseData();
        data.setStatusCode("01");
        data.setStatusDesc(msj.concat(param));
        return data;
    }
}
