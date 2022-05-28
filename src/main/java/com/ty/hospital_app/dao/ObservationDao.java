package com.ty.hospital_app.dao;

import com.ty.hospital_app.dto.Observation;

public interface ObservationDao {

	public Observation saveObservation(Observation observation);

	public Observation getObservationById(int id);

	public boolean deleteObservationById(int id);

	public Observation updateObservationById(int id, Observation observation);

	public Observation getObservationByDoctorName(String doctorName);

}
