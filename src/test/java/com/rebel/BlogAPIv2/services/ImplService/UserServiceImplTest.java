package com.rebel.BlogAPIv2.services.ImplService;

import com.rebel.BlogAPIv2.repo.UserRepo;
import com.rebel.BlogAPIv2.services.UserService;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;

class UserServiceImplTest {

    @Mock
    private UserRepo userRepo;
    private AutoCloseable autoCloseable;
    private UserServiceImpl userService;


    @BeforeEach
    void setUp() {
        autoCloseable = MockitoAnnotations.openMocks(this);
        userService = new UserServiceImpl(userRepo);

    }

    @AfterEach
    void tearDown() throws Exception {
        autoCloseable.close();
    }

    @Test
    void canGetAllUser()
    {
        //whem
        userService.getAllUser(0,1);

        //then
        verify(userRepo).findAll();


    }
}