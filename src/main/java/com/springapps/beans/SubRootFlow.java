package com.springapps.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.springapps.services.Activity;

import jakarta.annotation.PostConstruct;

@Component
public class SubRootFlow {
	@Autowired
	private Activity activity;

	@PostConstruct() 
	public void find() {
		System.out.println(activity.hashCode()+" is the hash Code in subrooot");
		activity.perform();
		System.out.println("Called in Subroot flow");
	}
}
