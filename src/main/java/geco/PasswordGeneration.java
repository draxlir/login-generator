package geco;

import java.util.Random;

public class PasswordGeneration {
    String getRandomPassword(){
        String password = "";
        Random r = new Random();

        for(int i = 0; i<8; i++){
            char c = (char) (r.nextInt(26) + 'a');
            password = password + c;
        }
        return password;
    }

//test
}
