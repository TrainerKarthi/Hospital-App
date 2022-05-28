package com.ty.hospital_app.dao;

import com.ty.hospital_app.dto.Hospital;

public interface HospitalDao {
		public Hospital saveHospitalData(Hospital hospital);
		public Hospital getHospitalDetailsById(int id);
		public boolean deleteHospitalById(int id);
		public Hospital updateHospitalById(int id,Hospital hospital);

}
