public class PasswordUtil {

    public enum SecurityLevel{
        WEAK, MEDIUM, STRONG

    }

    public static SecurityLevel aseessPassword(String password){
        if(password.length()<8){                   //Si la contrasenia tienes menos de 8 de escritura
            return SecurityLevel.WEAK;
        }
        if (password.matches("[a-za-z]+")){ //Con expresiones regulares, matches -> Para saber si la palabra cierta estructura

            return SecurityLevel.WEAK;
        }

        if(password.matches("[a-zA-z0-9]]+")){//Con expresiones regulares, matches -> Para saber si la palabra cierta estructura
            return SecurityLevel.MEDIUM;
        }
        return SecurityLevel.STRONG;
    }
}
