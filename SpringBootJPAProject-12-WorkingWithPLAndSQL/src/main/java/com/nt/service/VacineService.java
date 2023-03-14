package com.nt.service;

import java.sql.CallableStatement;
import java.sql.Types;
import java.util.List;
import java.util.concurrent.Callable;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.CoronaVacine;

import jakarta.persistence.EntityManager;
import jakarta.persistence.ParameterMode;
import jakarta.persistence.StoredProcedureQuery;
@Service
public class VacineService implements IVacineService {
	@Autowired
	private EntityManager manager;
	/*CREATE OR REPLACE PROCEDURE P_GET_VACCINE_BY_PRICERANGE 
(
  STARTPRICE IN FLOAT 
, ENDPRICE IN FLOAT 
, DETAILS OUT SYS_REFCURSOR 
) AS
  
BEGIN
   Open DETAILS FOR
      SELECT REG_NO,COMPANY,COUNTRY,NAME,PRICE,REQUIRED_DOSE_COUNT 
      FROM CORONA_VACINE WHERE price>=startprice AND price<=endprice;
END P_GET_VACCINE_BY_PRICERANGE;*/
	@Override
	public List<CoronaVacine> searchByPriceRange(double min, double max) {
		
		//Create Stroed procedure Object storing PL/SQL Procedure
	StoredProcedureQuery query=	 manager.createStoredProcedureQuery("P_GET_VACCINE_BY_PRICERANGE", CoronaVacine.class);
	
	//Register parameters of PL/SQL  procedure
	 query.registerStoredProcedureParameter(1, Double.class, ParameterMode.IN);
	 query.registerStoredProcedureParameter(2, Double.class, ParameterMode.IN);
	 query.registerStoredProcedureParameter(3, CoronaVacine.class, ParameterMode.REF_CURSOR);
	 
	 //set values to parameters
	 query.setParameter(1, min);
	 query.setParameter(2, max);
	 
	 //call PL/SQL procedure
	 List<CoronaVacine> list = query.getResultList();
		return list;
	}
	/*create or replace PROCEDURE P_AUTHENTICATION 
(
  UNAME IN VARCHAR2 
, PWD IN VARCHAR2 
, RESULT OUT VARCHAR2 
) AS 
 CNT NUMBER(5);
BEGIN
  SELECT COUNT(*) INTO CNT FROM DETAILS WHERE USERNAME=UNAME AND PASSWORD=PWD;
  IF(CNT<>0) THEN
    RESULT:='Valid Credential';
    ELSE
      RESULT:='InValid Credential';
      END IF;
END P_AUTHENTICATION;*/
	@Override
	public String authentication(String username, String Password) {
		//Create Stored Procedure Query object
		StoredProcedureQuery query = manager.createStoredProcedureQuery("P_AUTHENTICATION");
		
		//register parameters 
		query.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
		query.registerStoredProcedureParameter(2, String.class, ParameterMode.IN);
		query.registerStoredProcedureParameter(3, String.class, ParameterMode.OUT);
		//set parameters Value
		 query.setParameter(1, username);
		 query.setParameter(2, Password);
		 
		 //call procedure
		 query.execute();
		 
		 //gather results from out parameters
		 String result=(String)query.getOutputParameterValue(3);
		return result;
	}
@Override
public Object[] getEmpDetailsByEmoNO(Integer number) {
	//Unwrap Session ibject from EntityManager
	Session sec = manager.unwrap(Session.class);
	//work with  ReturningWork<T> Callbak interface to write plain jdbc code to call PL/SQL function
	Object [] objs = sec.doReturningWork(con->{
		//call callable Statement obj
		CallableStatement cs=con.prepareCall("{?=call FX_GET_EMP_DETAILS(?,?,?)}");
		//register return,out parameter
		cs.registerOutParameter(2,Types.VARCHAR);//Name
		cs.registerOutParameter(3, Types.FLOAT);//salary
		cs.registerOutParameter(4, Types.VARCHAR);//Ejob
		//set In param
		cs.setInt(1, number);
		//call pl/sql fucntion
		cs.execute();
		//gather results from return, out param
		Object obj[]=new Object[3];
		obj[0]=cs.getString(1);
		obj[1]=cs.getFloat(2);
		obj[2]=cs.getString(3);
		return obj;
	});
	return null;
}
}
