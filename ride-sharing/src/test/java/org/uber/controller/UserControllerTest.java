package org.uber.controller;

import org.uber.entity.User;
import org.uber.excption.ArrayOutOfBound;
import org.uber.repository.UserRepository;

public class UserControllerTest {

    public static void main(String[] args) throws ArrayOutOfBound {
        testOnboardUser();
        testOnboardUser_invalidInput();
    }

    public static void testOnboardUser() {
        UserRepository userRepository = new UserRepository(); // Or use a mock implementation
        UserController userController = new UserController();
        userController.setUserRepository(userRepository);

        String userInput = "Alice Female 30";
        userController.onboardUser(userInput);

        // Check if the user was added to the repository correctly
        User user = userRepository.getUser("Alice");
        if (user != null && user.getGender().equals("Female") && Integer.parseInt(user.getAge()) == 30) {
            System.out.println("testOnboardUser: Passed");
        } else {
            System.out.println("testOnboardUser: Failed");
        }
    }

    public static void testOnboardUser_invalidInput() throws ArrayOutOfBound {
        UserRepository userRepository = new UserRepository(); // Or use a mock implementation
        UserController userController = new UserController();
        userController.setUserRepository(userRepository);

        String userInput = "Bob Male";
        userController.onboardUser(userInput);

        // Check if the user with invalid input was not added to the repository
        User user = userRepository.getUser("Bob");
        if (user == null) {
            System.out.println("testOnboardUser_invalidInput: Passed");
        } else {
            System.out.println("testOnboardUser_invalidInput: Failed");
        }
    }
}
