package com.shanti.manager;

import com.shanti.response.Time;

import java.time.LocalDateTime;

public class TimeProcessManager {

	public TimeProcessManager() {
		//Empty constructor
	}

	public Time execute() {
		Time time = new Time(getCurrentTime());
		return time;
	}

	private String getCurrentTime() {
		return LocalDateTime.now().toString();
	}

}
