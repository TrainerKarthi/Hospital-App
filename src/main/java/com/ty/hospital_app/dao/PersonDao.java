package com.ty.hospital_app.dao;

import java.util.List;

import com.ty.hospital_app.dto.Person;

public interface PersonDao {
	public Person savePerson(Person person);

	public Person getPersonById(int id);

	public Person updatePersonById(int id, Person person);

	public boolean deletePersonById(int id);

	public List<Person> getPersonByGender(String gender);

	public List<Person> getPersonByAge(String age);

	public Person getPersonByphone(long phone);

	public Person getEncounterById(int encId);

}
