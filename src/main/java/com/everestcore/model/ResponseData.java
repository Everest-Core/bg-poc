package com.everestcore.model;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class ResponseData implements Serializable {

    private String statusCode;
    private String statusDesc;


}

