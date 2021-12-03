import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.assertj.core.api.Assertions.assertThat;

public class PasswordSpecialCharsTest {

    private PasswordSpecialChars testedPassword;

    @BeforeEach
    void starter() {
        testedPassword = new PasswordSpecialChars();
    }

    @Test
    void checkPassLength(String password) {
        boolean check = testedPassword.test(password);
        assertThat(check).isTrue();
    }

}
