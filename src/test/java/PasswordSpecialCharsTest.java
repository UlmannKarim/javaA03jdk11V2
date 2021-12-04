import com.example.a03v2jdk11.PasswordSpecialChars;
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
    void checkIfSpecialChars(String password) {
        boolean check = testedPassword.test(password);
        assertThat(check).isTrue();
    }

    @Test
    void shouldNotFail() {
        this.checkIfSpecialChars("123abc!");
    }

    @Test
    void shouldFail(){
        this.checkIfSpecialChars("123abc78");

    }
}


