package org.uber.controller;


import org.uber.entity.User;
import org.uber.excption.ArrayOutOfBound;
import org.uber.repository.UserRepository;

public class UserController {


    UserRepository userRepository ;

    public void onboardUser(String userInput) {
        String[] userString = userInput.split(" ");
        User user = new User();
        try {
            user.setUserName(userString[0]);
            user.setGender(userString[1]);
            user.setAge(userString[2]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        }

        userRepository.addUser(user);

    }

    public UserRepository getUserRepository() {
        return userRepository;
    }

    public void setUserRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
}
