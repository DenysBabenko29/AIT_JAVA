package util;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilTest {

    @Test
    @DisplayName("Тестирование от 'a' до 'z'")
    void testGenerateSymbols_symbolFromAToZGenerate() {
    String result = StringUtil.generateLowerCharters();
    String expected = "abcdefghijklmnopqrstuvwxyz";
    assertEquals(expected, result);
    }
}