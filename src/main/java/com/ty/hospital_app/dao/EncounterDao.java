package com.ty.hospital_app.dao;

import java.util.List;

import com.ty.hospital_app.dto.Encounter;

public interface EncounterDao {
	public Encounter saveEncounter(Encounter encounter);

	public Encounter getEncounterById(int id);

	public boolean deleteEncounterById(int id);

	public Encounter updateEncounterById(int id, Encounter encounter);

	public Encounter getEncounterByPersonID(int personId);

	public List<Encounter> getAllEncounters();

}
