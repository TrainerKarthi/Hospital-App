package com.ty.hospital_app.dao;

import com.ty.hospital_app.dto.Item;

public interface ItemsDao {
	public Item saveItems(Item item);

	public Item getItemByID(int id);

	public Item getItemByMedOrderId(int medId);

	public boolean deleteItemById(int id);

	public Item updateItemById(int id, Item item);

	public Item getItemByName(String name);

}
