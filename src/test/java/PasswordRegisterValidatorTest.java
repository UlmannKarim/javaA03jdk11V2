import com.example.a03v2jdk11.PasswordRegisterValidator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.assertj.core.api.Assertions.assertThat;

public class PasswordRegisterValidatorTest {

    private PasswordRegisterValidator testedPassword;

    @BeforeEach
    void starter() {
        testedPassword = new PasswordRegisterValidator();
    }

    @Test
    void checkPassLength(String password) {
        boolean check = testedPassword.test(password);
        assertThat(check).isTrue();
    }


}
