package org.jacoco.test.powermock;

import org.jacoco.test.powermock.dto.UserDTO;

public class UserDAO {

	
	public UserDAO () {
		
	}
	
	public UserDTO getUser (String user) {
		
		UserDTO userDTO = new UserDTO();
		if (null != user && user.equals("jzamoraa")) {
			userDTO.setName(user);
			userDTO.setPass("satelite");
		} else {
			userDTO = null;
		}
		
		return userDTO;
		
	}
}
