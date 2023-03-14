package com.nt.service;

import java.util.List;

import com.nt.entity.CoronaVacine;

public interface IVacineService {
	public List<CoronaVacine> searchByPriceRange(double min, double max);
	
	public String authentication(String username, String Password);
	
	public Object[] getEmpDetailsByEmoNO(Integer number);
}//class
