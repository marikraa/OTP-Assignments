import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

class AccountTest {
    private Account account;

    @BeforeEach
    void setUp() {
        account = new Account();
    }

    @Test
    void deposit() {
        account.deposit(100.0);
        assertEquals(100.0, account.getBalance());
        account.deposit(-50.0);
        assertEquals(100.0, account.getBalance());
    }

    @Test
    void withdraw() {
        account.deposit(200.0);
        double withdrawn1 = account.withdraw(100.0);
        assertEquals(100.0, withdrawn1);
        assertEquals(100.0, account.getBalance());

        double withdrawn2 = account.withdraw(200.0);
        assertEquals(0.0, withdrawn2);
    }

    @Test
    void getBalance() {
        assertEquals(0.0, account.getBalance());
    }

    @Test
    public void Maria_Aalto() {
        assertEquals(0, 0);
    }
}