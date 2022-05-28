package com.ty.hospital_app.dao;

import com.ty.hospital_app.dto.Address;

public interface AddressDao {
	public Address saveAddress(Address address);

	public Address getAddressById(int id);

	public boolean deleteAddressById(int id);

	public Address updateAddressById(int id, Address address);

}
