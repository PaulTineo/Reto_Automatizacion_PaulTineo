package bdd.runner;

import com.intuit.karate.Results;
import com.intuit.karate.Runner;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RunnerApiTest {

    @Test
    void test() {
        Results results =
                Runner.path("classpath:features/api")
                        .parallel(1);
        assertEquals(0, results.getFailCount(), results.getErrorMessages());
    }

    @BeforeAll
    static void beforeClass() {
        System.setProperty("Ejecutando pruebas", "Karate Runner");
    }

    @AfterAll
    static void afterClass() {
        System.out.println("Pruebas finalizadas");
    }
}
