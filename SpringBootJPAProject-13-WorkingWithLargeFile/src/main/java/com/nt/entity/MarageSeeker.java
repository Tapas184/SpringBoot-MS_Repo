package com.nt.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@SuppressWarnings("serial")
@Entity
@Data
@Table
@AllArgsConstructor
@RequiredArgsConstructor
@NoArgsConstructor
public class MarageSeeker implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@NonNull
	@Column(length = 20)
	private String name;
	@NonNull
	@Column(length = 30)
	private String address;
	@NonNull
	private Integer age;
	@NonNull
	@Lob
	private byte[] image;
	@NonNull
	@Lob
	private char[] biodata;
	private boolean isIndian;

}//class
