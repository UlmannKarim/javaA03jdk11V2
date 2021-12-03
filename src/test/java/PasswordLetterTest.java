import com.example.a03v2jdk11.PasswordLengthValidator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.assertj.core.api.Assertions.assertThat;

public class PasswordLetterTest {

    private PasswordLetter testedPassword;

    @BeforeEach
    void starter() {
        testedPassword = new PasswordLetter();
    }

    @Test
    void checkPassLength(String password) {
        boolean check = testedPassword.test(password);
        assertThat(check).isTrue();
    }

}
