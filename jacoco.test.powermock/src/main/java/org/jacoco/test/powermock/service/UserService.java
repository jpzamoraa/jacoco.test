package org.jacoco.test.powermock.service;

import org.jacoco.test.powermock.UserDAO;
import org.jacoco.test.powermock.dto.UserDTO;

public class UserService {

	
	public UserDTO getUser (String user) {
		UserDTO dto = null;
		
		if (null != user) {
			UserDAO userDAO = new UserDAO();
			dto = userDAO.getUser(user);
		}
		
		if (null != dto) {
			System.out.println(dto.getPass());
		}
		
		return dto;
	}
}
