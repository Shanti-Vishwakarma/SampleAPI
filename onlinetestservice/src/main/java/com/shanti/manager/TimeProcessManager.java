package com.shanti.manager;

import com.shanti.response.Time;

import java.time.LocalDateTime;

public class TimeProcessManager {
	private Integer invocationCount;

	public TimeProcessManager() {
		//Empty constructor
	}

	public void setInvocationCount(Integer invocationCount) {
		this.invocationCount = invocationCount;
	}

	public Time execute() {
		Time time = new Time(LocalDateTime.now().toString(), invocationCount);
		return time;
	}


}
