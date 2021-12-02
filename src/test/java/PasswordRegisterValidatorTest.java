
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.assertj.core.api.Assertions.assertThat;

public class PasswordRegisterValidatorTest {

    private PasswordRegisterValidatorTest testedPassword;

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
