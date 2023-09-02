package com.stage.userCrud;

import com.stage.userCrud.model.User;
import com.stage.userCrud.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class UserCrudApplicationTests {
	@Autowired
	private UserService userService;

	@Test
	void contextLoads() {
		// Exécutez votre code sous test ici
		List<User> users = userService.findAll();

		// Ajoutez une assertion pour vérifier que le résultat est conforme à vos attentes
		assertNotNull(users);
		assertTrue(users.size() > 0);
	}
}
