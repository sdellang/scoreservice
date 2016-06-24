package com.redhat.services.scoreservice;


import javax.jws.WebParam;
import javax.jws.WebService;
import java.util.concurrent.ThreadLocalRandom;

@WebService(name = "scoreservice",endpointInterface = "com.redhat.services.scoreservice.ScoreService")
public class ScoreServiceImpl implements ScoreService {

    public int getScore(@WebParam(name = "codicefiscale") String codiceFiscale) {
        return ThreadLocalRandom.current().nextInt(1, 101);
    }
}
