//
package com.nt.service;

import com.nt.entity.CoronaVacine;

public interface ICoronaVaccineMgmtService {
	public String registerVaccine(CoronaVacine vaccine);
	
	//method-2 (For batch processing)-->Common supper class for all Collection
	public Iterable<CoronaVacine> batchProcessing(Iterable<CoronaVacine> vacine);
	
	//for vaccines count
	public long getCount();
	
	//check vaccine availability by regNo
	public boolean checkAval(long regNo);
}
