package com.everestcore.model;


import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class UserDTO implements Serializable {

    private String partyId;
    private RequestData requestData;

    public UserDTO(){}

    public UserDTO(String partyId){
        this.partyId=partyId;
    }
}