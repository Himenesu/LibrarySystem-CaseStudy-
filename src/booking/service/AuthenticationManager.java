    package booking.service;

    import booking.model.User;

    import java.util.*;

    public class AuthenticationManager {
        private static List<User> registeredUsers;

        private static void Initialize() {
            if (registeredUsers == null) {
                registeredUsers = new ArrayList<>();
            }
        }

        public static void setRegisteredUsers(List<User> users) {
            registeredUsers = users;
        }

        public static boolean login(String username, String password) {
            Initialize();

            for (User user : registeredUsers) {
                if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                    return true;
                }
            }
            return false;
        }
    }
