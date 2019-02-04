package col.alb.eatabit;

import android.util.Patterns;

public class Utils {

    private static final int LEN_PASSWORD = 6;


    private boolean checkEmail(String email) {
        return Patterns.EMAIL_ADDRESS.matcher(email).matches();
    }


    public static boolean isPasswordValid(String password) {
        return password.length() > LEN_PASSWORD;
    }

    private boolean checkPhone(String ph) {
        return Patterns.PHONE.matcher(ph).matches();
    }
}

