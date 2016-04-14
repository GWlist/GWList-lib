package com.javaeeee.dao;

import org.mongodb.morphia.Datastore;

import com.javaeeee.entities.Item;
import com.javaeeee.entities.Profile;


public interface ProfileDAO  {

	// need optional?
	
	public Profile getProfile(String userid) throws ProfileDaoException;
	
	public void saveProfile(Profile profile, Datastore ds) throws ProfileDaoException;
	
	public boolean updateProfile(Profile profile) throws ProfileDaoException;
	
}
