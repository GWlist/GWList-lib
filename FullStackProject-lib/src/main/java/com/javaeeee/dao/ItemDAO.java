package com.javaeeee.dao;

import org.mongodb.morphia.Datastore;

import com.javaeeee.entities.Item;
import com.javaeeee.entities.Profile;


public interface ItemDAO  {

	// need optional?
	
	public Item getItem(String itemid) throws ItemDaoException;
	
	public void saveItem(Item item, Datastore ds) throws ItemDaoException;
	
	public boolean updateItem(Item item) throws ItemDaoException;
	
	public void deleteItem(String itemid) throws ItemDaoException;
	
	
}
