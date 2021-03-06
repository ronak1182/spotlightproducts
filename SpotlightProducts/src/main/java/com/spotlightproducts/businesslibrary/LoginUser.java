package com.spotlightproducts.businesslibrary;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import com.mysql.jdbc.CallableStatement;
import com.mysql.jdbc.Connection;
import com.spotlightproducts.dao.DatabaseResponse;
import com.spotlightproducts.dao.User;
import com.spotlightproducts.utilities.SpotLightConstants;

public class LoginUser {

	//method to register a new user in the system
	public DatabaseResponse registerUser(User user) {
		DatabaseResponse response = new DatabaseResponse();
		String firstName = user.getFirstName();
		String lastName = user.getLastName();
		String email = user.getEmail();
		String password = user.getPassword();
		String userType = user.getUserType();
		boolean isDeletedBoolean = user.isDeleted();
		int isDeleted = 0;
		int userTypeInt = 0;
		if (isDeletedBoolean) {
			isDeleted = 1;
		} else {
			isDeleted = 0;
		}

		if (userType.equalsIgnoreCase(SpotLightConstants.CONSTANT_BUYER)) {
			userTypeInt = 1;
		} else if (userType.equalsIgnoreCase(SpotLightConstants.CONSTANT_SELLER)) {
			userTypeInt = 2;
		}
		try {
			
			Connection con = DatabaseConnection.getDatabaseConnection();			
			CallableStatement cStmt = (CallableStatement) con.prepareCall(SpotLightConstants.SP_ADD_NEW_USER);
			cStmt.setString(1, firstName);
			cStmt.setString(2, lastName);
			cStmt.setString(3, email);
			cStmt.setString(4, password);
			cStmt.setInt(5, userTypeInt);
			boolean hadResults = cStmt.execute();
			while (hadResults) {
				ResultSet rs = (ResultSet) cStmt.getResultSet();
				while (rs.next()) {
					int id = rs.getInt(1);
					String message = rs.getString(2);
					if (id == 1) {
						int userId = rs.getInt(3);
						response.setStatus(SpotLightConstants.CONSTANT_SUCCESS);
						response.setMessage(message);
						con.close();
						return response;
					} else {
						con.close();
						response.setStatus(SpotLightConstants.CONSTANT_FAILURE);
						response.setMessage(message);
						return response;
					}

				}
				hadResults = cStmt.getMoreResults();
			}
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
		response.setStatus(SpotLightConstants.CONSTANT_FAILURE);
		response.setMessage(SpotLightConstants.CONSTANT_TECHNICAL_FAILURE);
		return response;

	}

	//method to validate a User into the system
	public boolean validateUser(User user) {

		try {
			Connection con = DatabaseConnection.getDatabaseConnection();
			CallableStatement cStmt = (CallableStatement) con.prepareCall(SpotLightConstants.SP_CHECK_AUTHORIZED_USER);
			String email = user.getEmail();
			String password = user.getPassword();
			cStmt.setString(1, email);
			cStmt.setString(2, password);
			boolean hadResults = cStmt.execute();
			while (hadResults) {
				ResultSet rs = (ResultSet) cStmt.getResultSet();
				while (rs.next()) {
					// retrieve values of fields
					String Email = rs.getString(4);
					if (email.equals(Email)) {
						con.close();
						return true;
					} else {
						con.close();
						return false;
					}
				}
				// hadResults = cStmt.getMoreResults();
			}
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
		return false;
	}

	//method to handle forgot password request for the user
	public DatabaseResponse forgotPassword(User user){
		DatabaseResponse response = new DatabaseResponse();
		String password = null;
		String message = null;
		try {
			
			Connection con = DatabaseConnection.getDatabaseConnection();
			CallableStatement cStmt = (CallableStatement) con.prepareCall(SpotLightConstants.SP_FORGET_PASSWORD);
			cStmt.setString(1, user.getEmail());
			boolean hadResults = cStmt.execute();
			while (hadResults) {
				ResultSet rs = (ResultSet) cStmt.getResultSet();
				while (rs.next()) {
					password = rs.getString(1);
					SpotLightConstants.sendEmail(user.getEmail(), password);
					con.close();
					response.setMessage(SpotLightConstants.RECEIVE_EMAIL_MESSAGE);
					response.setStatus(SpotLightConstants.CONSTANT_SUCCESS);
					return response;

				}
				hadResults = cStmt.getMoreResults();
			}
			response.setMessage(SpotLightConstants.USER_NOT_FOUND_MESSAGE);
			response.setStatus(SpotLightConstants.CONSTANT_FAILURE);
			con.close();
			return response;
		} catch (Exception e) {
			System.out.println(e);
		}
		response.setMessage(SpotLightConstants.TECHNICAL_ERROR_MESSAGE);
		response.setStatus(SpotLightConstants.CONSTANT_FAILURE);
		return response;

	}

	
	
	// method to change user password
		public DatabaseResponse changeUserPassword(User user) {
			DatabaseResponse response = new DatabaseResponse();
			String password = user.getPassword();
			try {
				String message = null;
				int success = 0;
				
				
				Connection con = DatabaseConnection.getDatabaseConnection();
				CallableStatement cStmt = (CallableStatement) con.prepareCall(SpotLightConstants.SP_UPDATE_USER_PASSWORD);
				cStmt.setInt(1, user.getUserId());
				cStmt.setString(2, user.getPassword());
				cStmt.setString(3, user.getNewPassword());
				boolean hadResults = cStmt.execute();
				while (hadResults) {
					ResultSet rs = (ResultSet) cStmt.getResultSet();
					while (rs.next()) {
						
						 success = rs.getInt(1);
						 message = rs.getString(2);
						 
						if(success == 1){
						response.setMessage(message);
						response.setStatus(SpotLightConstants.CONSTANT_SUCCESS);
						con.close();
						return response;
						}

					}
					hadResults = cStmt.getMoreResults();
				}
				response.setMessage(message);
				response.setStatus(SpotLightConstants.CONSTANT_FAILURE);
				con.close();
				return response;
			} catch (Exception e) {
				System.out.println(e);
			}

			response.setStatus(SpotLightConstants.CONSTANT_FAILURE);
			response.setMessage(SpotLightConstants.CONSTANT_TECHNICAL_FAILURE);
			return response;
		}

}
