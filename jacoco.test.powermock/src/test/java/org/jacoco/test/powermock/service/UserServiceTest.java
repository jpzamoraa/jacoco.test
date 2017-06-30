package org.jacoco.test.powermock.service;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.jacoco.test.powermock.UserDAO;
import org.jacoco.test.powermock.dto.UserDTO;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

@RunWith(PowerMockRunner.class)
@PrepareForTest({UserService.class, UserDAO.class})
public class UserServiceTest {
	@Mock
	private UserDAO userDaoMock;
	
	@Test
	public void testNullUser () {
		UserDTO dto = null;
		UserService sr  = new UserService();
		dto = sr.getUser("juan");
		assertEquals(dto, null);
	}
	
	@Test
	public void testGetUser () {
		UserDTO userDTO = new UserDTO();
		UserDTO resultDTO = null;
		
		try {
			userDTO.setName("jzamoraa");
			userDTO.setPass("satelite");
			
			when(this.userDaoMock.getUser("jzamoraa")).thenReturn(userDTO);
			PowerMockito.whenNew(UserDAO.class).withAnyArguments().thenReturn(this.userDaoMock);
			
			UserService usMock = new UserService();
			
			resultDTO = usMock.getUser("jzamoraa");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		assertEquals(resultDTO.getPass(), "satelite");
		
	}

}
