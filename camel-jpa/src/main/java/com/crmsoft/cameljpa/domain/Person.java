package com.crmsoft.cameljpa.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "person")
@SequenceGenerator(name = "person_sequence", sequenceName = "person_sequence")
public class Person {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "person_sequence")
	public Long id;
	
	@Column(name = "name", length = 255, nullable = false)
	public String name;
	
	@Override
	public String toString() {
		return String.format("ID: %d, Name: %s", this.id, this.name);
	}
}