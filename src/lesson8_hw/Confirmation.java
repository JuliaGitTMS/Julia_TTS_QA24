package lesson8_hw;

public class Confirmation {
    public static void main(String[] args) {
        System.out.println(confirmation("skjfh", "sdgjh7", "sdgjh7"));
    }
    public static boolean confirmation(String login, String password, String confirmPassword) {
        try {
            if (login.length() > 20) {
                throw new WrongLoginException("Длина логина больше 20 символов");
            }
        } catch (WrongLoginException ex) {
            ex.printStackTrace();
            return false;
        }
        try {
            char[] loginStr = login.toCharArray();
            for (char c : loginStr) {
                if (c == ' ') {
                    throw new WrongLoginException("Логин содержит пробелы");
                }
            }
        } catch (WrongLoginException ex) {
            ex.printStackTrace();
            return false;
        }
        try {
            if (password.length() > 20) {
                throw new WrongPasswordException("Длина пароля больше 20 символов");
            }
        } catch (WrongPasswordException ex) {
            ex.printStackTrace();
            return false;
        }
        try {
            char[] passwordStr = password.toCharArray();
            boolean passwordHasNumber = false;
            for (char c : passwordStr) {
                if (c == ' ') {
                    throw new WrongPasswordException("Пароль содержит пробелы");
                }
                if (Character.isDigit(c)) {
                    passwordHasNumber = true;
                    break;
                }
            }
            if (passwordHasNumber == false) {
                throw new WrongPasswordException("Пароль должен содержать цифры");
            }
            if (!password.equals(confirmPassword)){
                throw new WrongPasswordException("Пароль не совпадает с подтверждением");
            }
        } catch (WrongPasswordException ex) {
            ex.printStackTrace();
            return false;
        }
        return true;
    }
}
