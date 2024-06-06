import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import ru.netology.javaqa.javaqamvn.services.ChillService;


public class ChillServiceTest {
    @ParameterizedTest
    @CsvSource({
            "2, 100000, 60000, 150000" ,
            "3, 10000, 3000, 20000"
    })

    public void testChill (int expected, int income, int expenses, int threshold) {
        ChillService service = new ChillService();
        int actual = service.calculate(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);

    }





}
