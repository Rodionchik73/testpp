package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullSource;

import static org.junit.jupiter.api.Assertions.*;

public class AssertTest {
    @Test
    public void assertTest(){
        assertFalse(1>3, "Выражение не верно");
    }

    @ParameterizedTest
    @NullSource
    public void assertTest(String str){
        str = "строка";
        assertNotNull(str, "Значение str null");
    }
}
