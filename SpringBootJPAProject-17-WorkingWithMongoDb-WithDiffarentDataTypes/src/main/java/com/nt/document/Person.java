package com.nt.document;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

//Person Class
@Data
@Document
public class Person implements Serializable {
	@Id
	private Integer id;
	private String name;
	private String addrs;
	private boolean merriterials;
	private Set<Long> phoneNumber;
	private String[] friendsName;
	private LocalDateTime dob;
	private List<String> accademics;
	private Map<String,Long> bank;
	private Properties govIdCard;

}//class
