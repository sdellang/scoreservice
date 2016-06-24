package com.redhat.services.scoreservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService(name = "scoreservice")
public interface ScoreService {

    @WebMethod(operationName = "getscore")
    public int getScore(@WebParam(name = "codicefiscale") String codiceFiscale);

}
