package com.udacity.gradle.builditbigger.backend;

import com.bytepair.jokes.JokeMachine;
import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiNamespace;

/** An endpoint class we are exposing */
@Api(
        name = "myApi",
        version = "v1",
        namespace = @ApiNamespace(
                ownerDomain = "backend.builditbigger.gradle.udacity.com",
                ownerName = "backend.builditbigger.gradle.udacity.com",
                packagePath = ""
        )
)
public class MyEndpoint {

    /** Endpoint that returns a joke **/
    @ApiMethod(name = "getJoke")
    public MyBean getJoke() {
        JokeMachine jokeMachine = new JokeMachine();
        MyBean response = new MyBean();
        response.setData(jokeMachine.getJoke());

        return response;
    }

}
