package com.rebel.BlogAPIv2.repo;

import com.rebel.BlogAPIv2.enitities.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class UserRepoTest
{
    @Autowired
    private UserRepo userRepo;

    //there might be some error because of Optional User

    @Test
    void findUserByEmail(String email)
    {
     //given
        User user = new User();
        user.setId(1);
        user.setName("Hiren");
        user.setEmail("1@g.com");

        userRepo.save(user);

        //when
        Optional<User> exists = userRepo.findByEmail(user.getEmail());

        //then
        assertEquals(exists, user, " ");


    }

}