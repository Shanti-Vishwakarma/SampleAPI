package com.shanti.service;

import com.shanti.manager.TimeProcessManager;
import com.shanti.response.Time;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/time")
public class TimeService {
    private static Integer invocationCount = 0;
    private TimeProcessManager processManager = new TimeProcessManager();

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getTime() {
        invocationCount++;
        Time time = processManager.execute();
        time.setInvocationCount(invocationCount);
        return Response.ok(time).build();
    }
}