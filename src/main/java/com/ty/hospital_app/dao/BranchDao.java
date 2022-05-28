package com.ty.hospital_app.dao;

import java.util.List;

import com.ty.hospital_app.dto.Address;
import com.ty.hospital_app.dto.Branch;
import com.ty.hospital_app.dto.Hospital;

public interface BranchDao {

		public Branch saveBranch(int hi, Branch branch);
		public Branch getBranchById(int id);
		public boolean deleteBranchById(int id);
		public Branch updateBranchById(int id, Hospital hospital);
		public List<Branch> getAllBranches();
		public Branch getBranchByState(String state);
		public Branch getBranchByCountry(String country);
		public Address getBranchAddress(int id);

}
