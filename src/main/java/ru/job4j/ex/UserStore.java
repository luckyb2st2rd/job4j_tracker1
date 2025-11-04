package ru.job4j.ex;

public class UserStore {
    public static User findUser(User[] users, String login) throws UserNotFoundException {
        User username = null;
        for (User user : users) {
            if (login.equals(user.getUsername())) {
                username = user;
            }
        }

        if (username == null) {
            throw new UserNotFoundException("Users is not in system");
        }

        return username;
    }

    public static boolean validate(User user) throws UserInvalidException {

        if (!user.isValid()) {
            throw new UserInvalidException("User invalid");
        }

        if (user.getUsername().length() < 3) {
            throw new UserInvalidException("Username < 3 symbols");
        }

        return true;
    }

    public static void main(String[] args) {
        User[] users = {
                new User("Artem Tschigarov", true)
        };

        try {
            User user = findUser(users, "Artem Tschigarov");
            validate(user);
            System.out.println("User in system");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
