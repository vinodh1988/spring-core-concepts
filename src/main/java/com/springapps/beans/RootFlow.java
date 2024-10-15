package com.springapps.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.springapps.services.Activity;
import com.springapps.services.Task;

import jakarta.annotation.PostConstruct;

@Component
public class RootFlow {
	
	@Autowired
	private Activity activity; //if no injection , null will the value
	
	@Autowired
	@Qualifier("packaging")
	private Task task;
	
	
	{
		System.out.println("RootFlow is instantiated");
		// activity.perform(); activity is null at this point of time
	}
	
	public RootFlow() {
		System.out.println("Rootflow Constructor");
	}
	
	@PostConstruct
	public void runLogic() {
		System.out.println(activity.hashCode()+" is the hash Code in rooot");
		activity.perform();
		task.doIt();
	}
	
	
}
