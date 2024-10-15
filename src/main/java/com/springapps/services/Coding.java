package com.springapps.services;

import org.springframework.stereotype.Service;

@Service("coding")
public class Coding implements Task {

	@Override
	public void doIt() {
		// TODO Auto-generated method stub
          System.out.println("Coding Task");
	}

}
