package it.nicolaamatucci.ormlite.util;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;

public class DAOTemplate<T> {

	final Class<T> typeParameterClass;

	public DAOTemplate(Class<T> typeParameterClass) {
		super();
		this.typeParameterClass = typeParameterClass;
	}

	public int create(T item) {

		int index = -1;

		T object = (T) item;
		try {
			Dao<T, Integer> dao = DaoManager.createDao(DBConnection.getConnection(), this.typeParameterClass);
			index = dao.create(object);
			dao.getConnectionSource().close();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return index;
	}

	public int update(Object item) {

		int index = -1;

		T object = (T) item;
		try {
			Dao<T, Integer> dao = DaoManager.createDao(DBConnection.getConnection(), this.typeParameterClass);
			index = dao.update(object);
			dao.getConnectionSource().close();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return index;
	}

	public int delete(Object item) {

		int index = -1;

		T object = (T) item;
		try {
			Dao<T, Integer> dao = DaoManager.createDao(DBConnection.getConnection(), this.typeParameterClass);
			index = dao.delete(object);
			dao.getConnectionSource().close();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return index;

	}

	public T findById(int id) {

		T list = null;
		try {
			Dao<T, Integer> dao = DaoManager.createDao(DBConnection.getConnection(), this.typeParameterClass);
			list = dao.queryForId(id);
			dao.getConnectionSource().close();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return list;

	}

	public List<T> findAll() {

		List<T> items = null;

		try {
			Dao<T, Integer> dao = DaoManager.createDao(DBConnection.getConnection(), this.typeParameterClass);
			items = dao.queryForAll();
			dao.getConnectionSource().close();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return items;
	}

}
