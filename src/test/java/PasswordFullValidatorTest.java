import com.example.a03v2jdk11.PasswordFullValidator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PasswordFullValidatorTest {

        private PasswordFullValidator testedPassword;

        @BeforeEach
        void starter() {
            testedPassword = new PasswordFullValidator();
        }

        @Test
        void validateThePassword(String password) {
            boolean check = testedPassword.test(password);
            assertThat(check).isTrue();
        }

        @Test
        void shouldNotFail(){
            this.validateThePassword("1234567ABC!@");

        }

        @Test
        void shouldFail(){
            this.validateThePassword("1234567!#");

        }
    }
