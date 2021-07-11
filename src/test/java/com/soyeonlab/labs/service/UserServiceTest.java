package com.soyeonlab.labs.service;

import com.soyeonlab.labs.domain.user.User;
import com.soyeonlab.labs.domain.user.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;


@SpringBootTest
class UserServiceTest {

    @Autowired
    UserRepository userRepository;

    @Test
    public void 유저_생성() {
        // given
        String name = "이름";
        userRepository.save(User.builder().name(name).build());

        //when
        List<User> postsList = userRepository.findAll();

        //then
        User user = postsList.get(0);
        assertThat(user.getName()).isEqualTo(name);
    }

}