package com.springapps.services;

import org.springframework.stereotype.Service;

@Service("packaging")
public class Packaging implements Task {

	@Override
	public void doIt() {
		// TODO Auto-generated method stub
             System.out.println("Packaging Task");
	}

}
