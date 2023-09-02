package com.stage.usercrud.controller;
import com.stage.usercrud.controller.UserController;
import com.stage.usercrud.model.User;
import com.stage.usercrud.service.UserService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class UserControllerTest {

    @InjectMocks
    private UserController userController;

    @Mock
    private UserService userService;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testGetAllUsers() {
        // Créez une liste d'utilisateurs de test
        List<User> users = new ArrayList<>();
        users.add(new User(11, "John", "Doe","jjj",23651,"man","ekksss","oird"));
        users.add(new User(12, "chayma", "riahi","qqq",6665,"man","mmlp","oird"));

        // Simulez le comportement du service pour renvoyer la liste d'utilisateurs
        when(userService.findAll()).thenReturn(users);

        // Appelez la méthode du contrôleur pour obtenir la liste d'utilisateurs
        ResponseEntity<List<User>> response = userController.get();

        // Vérifiez que la réponse est OK (code HTTP 200) et que la liste d'utilisateurs correspond
        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertEquals(users, response.getBody());
    }

}
