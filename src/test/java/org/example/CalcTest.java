package org.example;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class CalcTest {

    @BeforeAll
    public static void setUp() {
        System.out.println("Before All");
    }

    @BeforeEach
    public void setUpEach() {
        System.out.println("Before Each");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("After All");
    }

    @AfterEach
    public void afterAllEach() {
        System.out.println("After Each");
    }

    @Test
    @DisplayName("Проверка суммирования")
    @Timeout(3)
    void summ1() {
        Calc calc = new Calc();
        int result = calc.summ(1, 6);
        Assertions.assertEquals(7, result, "Суммирование работает не верно");
    }

    @Test
    @DisplayName("Проверка суммирования2")
    @Timeout(3)
    void summ2() {
        Calc calc = new Calc();
        int result = calc.summ(1, 6);
        Assertions.assertEquals(7, result, "Суммирование работает не верно");
    }

    @ParameterizedTest(name = "#{index} - сложение {0} и {1}, ожидаем {2}")
    @CsvSource({"1, 2, 3", "-1, 2, 1", "0, 0, 0"})
    @DisplayName("Проверка суммирования 3")
    @Tag("param")
    void summ3(int a, int b, int expectedResult) {
        Calc calc = new Calc();
        int result = calc.summ(a, b);
        Assertions.assertEquals(expectedResult, result, "Суммирование работает не верно в параметризованном тесте");
    }

    @ParameterizedTest(name = "#{index} - вычитание {0} и {1}, ожидаем {2}")
    @CsvSource({"9, 2, 7", "10, 5, 5", "0, 0, 0"})
    @DisplayName("Проверка вычитания 1")
    @Tag("param")
    void subt(int a, int b, int expectedResult) {
        Calc calc = new Calc();
        int result = calc.subt(a, b);
        Assertions.assertEquals(expectedResult, result, "Вычитание работает не верно в параметризованном тесте");
    }
}