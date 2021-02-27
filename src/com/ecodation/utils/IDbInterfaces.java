package com.ecodation.utils;

import java.sql.Connection;
import java.util.ArrayList;

public interface IDbInterfaces <T> {

	//C - R -U -D (Gövdesiz metotlar)
	public void create(T t);
	public void update(T t);
	public void delete(T t);
	ArrayList<T> list();
	
	//gövdeli method
	default Connection dbConnection() {
		return DbConnectionUtil.dbConnectionUtilMethod();
	}
	
}
