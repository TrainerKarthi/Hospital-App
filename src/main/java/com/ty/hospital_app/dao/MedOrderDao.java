package com.ty.hospital_app.dao;

import java.util.List;

import com.ty.hospital_app.dto.MedOrder;

public interface MedOrderDao {

		public MedOrder saveMedOrder(MedOrder medOrder);
		public MedOrder getMedOrderById(int id);
		public MedOrder updateMedOrderById(int id,MedOrder medOrder);
		public boolean deleteMedOderById(int id);
		public MedOrder getMedOrderByDoctorName(String docName);
		public List<MedOrder> getAllOrders();
		public MedOrder getMedOrderByDate(String date);

}
