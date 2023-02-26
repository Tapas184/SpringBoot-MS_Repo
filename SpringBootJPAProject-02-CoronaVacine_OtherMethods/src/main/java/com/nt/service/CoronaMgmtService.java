package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.coronarepo.ICoronaRepo;
import com.nt.entity.CoronaVacine;
@Service("coronaService")
public class CoronaMgmtService implements ICoronaVaccineMgmtService {
	@Autowired
	private ICoronaRepo repo;
	@Override
	public String registerVaccine(CoronaVacine vaccine) {
		System.out.println("In memory proxy class"+repo.getClass());
		CoronaVacine corona= null;
		//use repo
		if(vaccine!=null)
			 corona=repo.save(vaccine);
		return corona!=null?"Vaccine Registered/Update Sucessfully"+corona.getRegNo():"Registration Failed";
	}
	//For Batch insertion
	@Override
	public Iterable<CoronaVacine> batchProcessing(
			Iterable<CoronaVacine> vacine) {
		if(vacine!=null)
		return repo.saveAll(vacine);
		else
			throw new IllegalArgumentException("Batch updation failed");
	}
	@Override
	public long getCount() {
		// TODO Auto-generated method stub
		return repo.count();
	}
	@Override
	public boolean checkAval(long regNo) {
		
		return repo.existsById(regNo);
	}

}
