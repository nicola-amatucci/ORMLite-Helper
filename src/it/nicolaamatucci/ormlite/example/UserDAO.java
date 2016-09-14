package it.nicolaamatucci.ormlite.example;

import java.sql.SQLException;
import java.util.List;

import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;

import it.nicolaamatucci.ormlite.util.DAOTemplate;
import it.nicolaamatucci.ormlite.util.DBConnection;

public class UserDAO extends DAOTemplate<User>{

	public UserDAO() {
		super(User.class);
	}

	public User findByEmail(String email) {

		User user = null;
		try {
			Dao<User, Integer> dao = DaoManager.createDao(DBConnection.getConnection(), User.class);
			List<User> results = dao.queryBuilder().where().eq("email",email).query();
			
			if (results.size() > 0) {
				user = results.get(0);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return user;

	}
}

