import com.example.a03v2jdk11.EmailRegisterValidator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.assertj.core.api.Assertions.assertThat;

public class EmailRegisterValidatorTest {

    private EmailRegisterValidator testedEmail;

    @BeforeEach
    void starter() {
        testedEmail = new EmailRegisterValidator();
    }

    @Test
    void checkEmail(String emailAddress) {
        boolean check = testedEmail.test(emailAddress);
        assertThat(check).isTrue();
    }

    @Test
    void shouldNotFail(){
        this.checkEmail("123@gmail.com");

    }
}