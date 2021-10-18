package com.everestcore.model;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Map;

@Getter
@Setter
public class RequestData implements Serializable {


    private static final long serialVersionUID = 145929368389546734L;
    private String buc;
    private transient Map<String, Object> context;

    }