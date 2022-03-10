package model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IZipImplTest {

    boolean isSuccess;
    IZipImpl zip = new IZipImpl();

    @BeforeEach
    void setUp() {
        isSuccess = true;
    }

    @Disabled
    @Test
    void unzip() {
        assertTrue(zip.unzip("C:\\Users\\Computer\\Documents\\Java\\Progmatic\\ZipProgHomeVersionGradle\\src\\main\\resources\\source_zip_dir\\Karrierterv.zip",
                "C:\\Users\\Computer\\Documents\\Java\\Progmatic\\ZipProgHomeVersionGradle\\src\\main\\resources\\target_dir"));
    }
}
