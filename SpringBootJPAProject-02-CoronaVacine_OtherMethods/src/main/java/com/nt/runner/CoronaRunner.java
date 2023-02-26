//Developing client code using spring boot runners
package com.nt.runner;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Component;

import com.nt.entity.CoronaVacine;
import com.nt.service.ICoronaVaccineMgmtService;
@Component
public class CoronaRunner implements CommandLineRunner {
	@Autowired
	private ICoronaVaccineMgmtService service;
	@Override
	public void run(String... args) throws Exception {
		try {
			/*CoronaVacine vaccine = new CoronaVacine(null,"Covishild","India-BioTech","India",600.0,5);
			System.out.println(service.registerVaccine(vaccine));*/
			// Bulk insertion---> batch insertion
			/*Iterable<CoronaVacine> batchVaccine = service.batchProcessing(List.of(new CoronaVacine(null,"Sputnik","Russie","Rusia",578.0,10),
					                                                              new CoronaVacine(null,"Pyzer", "Pyzer", "USA",456.6,6),
					                                                              new CoronaVacine(null,"Moderena","Moderena","USA",560.6,5)
					));*/
			/*			Iterable<CoronaVacine> batchVaccine = service
								.batchProcessing(Arrays.asList(
										new CoronaVacine(null, "Sputnik", "Russie", "Rusia",
												578.0, 10),
										new CoronaVacine(null, "Pyzer", "Pyzer", "USA",
												456.6, 6),
										new CoronaVacine(null, "Moderena", "Moderena",
												"USA", 560.6, 5)));
						System.out.println("Registor Number count is::");
						batchVaccine
								.forEach(vacine -> System.out.println(vacine.getRegNo()));*/
			System.out.println("Vaccine Count is :: "+service.getCount());
			System.out.println("Vaccine availablity ::"+service.checkAval(103));
		} catch (DataAccessException dae) {
			dae.printStackTrace();
		} // catch
	}

}
