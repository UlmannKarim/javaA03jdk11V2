
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.assertj.core.api.Assertions.assertThat;

public class PasswordDigitTest {
    private PasswordDigit testedPassword;

    @BeforeEach
    void starter() {
        testedPassword = new PasswordDigit();
    }

    @Test
    void checkPassLength(String password) {
        boolean check = testedPassword.test(password);
        assertThat(check).isTrue();
    }

}
