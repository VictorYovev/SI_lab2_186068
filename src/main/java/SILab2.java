import java.util.List;

class User {
    String username;
    String password;
    String email;

    public User(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }
}

public class SILab2 {

    public static boolean function(User user, List<String> allUsers) {//0
        String specialCharacters = "!#$%&'()*+,-./:;<=>?@[]^_`{|}"; //1
        if (user == null)  //2
            throw new RuntimeException("The user is not instantiated");//3
        if (user.getUsername() == null || user.getPassword() == null)//4
            throw new RuntimeException("The user is missing some mandatory information");//5
        String password = user.getPassword();//6
        String passwordLower = password.toLowerCase();//7
        if (passwordLower.contains(user.getUsername().toLowerCase()))//8
            return false;//9
        else if (passwordLower.length() < 8)//10
            return false;//11
        else {
            boolean digit = false, upper = false, special = false;//12

            for (int i = 0; i < password.length(); i++) {//13.1,13.2,13.3
                if (Character.isDigit(password.charAt(i))) //14
                    digit = true;//15
                if (Character.isUpperCase(password.charAt(i)))//16
                    upper = true;//17
                if (specialCharacters.contains(String.valueOf(password.charAt(i))))//18
                    special = true;//19
            }//20
            if (!digit || !upper || !special)//21
                return false;//22
        }//23
        return true;//24
    }//25
}
