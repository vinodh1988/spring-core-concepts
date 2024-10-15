package com.springapps.services;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope("prototype")
public class Documentation implements Activity {

	@Override
	public void perform() {
		// TODO Auto-generated method stub
		System.out.println("Documentation is being done");
	}

}
