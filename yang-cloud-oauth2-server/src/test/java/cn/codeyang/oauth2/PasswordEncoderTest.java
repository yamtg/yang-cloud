package cn.codeyang.oauth2;

import org.junit.Test;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * Created by yangzhongyang on 17/11/12
 */
public class PasswordEncoderTest {
    @Test
    public void encoder(){
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        String encoderStr = encoder.encode("jazr932832");
        System.out.println(encoderStr);

        boolean match = encoder.matches("jazr932832", encoderStr);
        System.out.println(match);
    }
}
