
import com.example.a03v2jdk11.PasswordDigit;
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
    void checkIfDigitInPass(String password) {
        boolean check = testedPassword.test(password);
        assertThat(check).isTrue();
    }

    @Test
    void shouldNotFail(){
        this.checkIfDigitInPass("P4SSW0RD");

    }

    @Test
    void shouldFail(){
        this.checkIfDigitInPass("PASSWORD");

    }
}
