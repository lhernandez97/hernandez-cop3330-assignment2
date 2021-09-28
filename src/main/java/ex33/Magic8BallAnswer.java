package ex33;

import java.security.SecureRandom;

public class Magic8BallAnswer {
     static String randomAnswer() {
        //create a SecureRandom object
        SecureRandom rnd = new SecureRandom();
        //create a String array for the Magic 8 Ball answers
        String[] answer = {"Yes.", "No.", "Maybe.", "Ask again later."};
        //now get a random answer
        int i = rnd.nextInt(4);
        //return the String
        return answer[i];
    }
}
