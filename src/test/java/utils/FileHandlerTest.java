package utils;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.LinkedHashSet;

import static org.junit.jupiter.api.Assertions.*;

class FileHandlerTest {

    FileHandler fileHandler = new FileHandler();
    LinkedHashSet<String> testSet = new LinkedHashSet<>();

    @BeforeEach
    void setUp() {
        testSet = null;
    }

//    @Test
    void readTxt() {
        assertNull(testSet);
        testSet = fileHandler.readTxt(new FileHandler().getPath());
        assertNotNull(testSet);
        assertEquals(7, testSet.size());
    }
}
