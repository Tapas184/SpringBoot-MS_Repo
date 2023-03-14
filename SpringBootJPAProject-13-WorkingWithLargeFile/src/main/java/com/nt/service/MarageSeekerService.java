package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.MarageSeeker;
import com.nt.repository.IMarrigeSeekerRepo;
@Service("marrageService")
public class MarageSeekerService implements IMarageManagementService {
	@Autowired
	private IMarrigeSeekerRepo repo;
	@Override
	public String getIdByDetails(MarageSeeker seeker) {
		return "Sussfully Registered, Id is ::"+repo.save(seeker).getId();
	}

}
