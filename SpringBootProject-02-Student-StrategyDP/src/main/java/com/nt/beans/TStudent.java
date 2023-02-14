//target class
package com.nt.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ImportResource;
import org.springframework.stereotype.Component;

@Component("student")
@ImportResource("com/nt/cfg/applicationContext.xml")
public final class TStudent {
	
	public TStudent() {
		System.out.println("TStudent::0-ParamConstructor");
	}
//data type interface
	@Autowired
	@Qualifier("dn")
	public ICourseMaterials material;
	
	//b.logic
	public void preparation(String career) {
		System.out.println("TStudent.preparation()");
		String course = material.content();
		//price
		double price = material.price();
		System.out.println("For career preparation for "+career+" Material required "+material.content()+" Price is ::"+material.price());
	}//preparation
}//class
