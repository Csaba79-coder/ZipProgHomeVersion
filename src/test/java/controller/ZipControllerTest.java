package controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ZipControllerTest {

    String testPath1TxtMoreFiles = "C:\\Users\\Computer\\Documents\\Java\\Progmatic\\ZipProgHomeVersionGradle\\src\\test\\resources\\test_source_duplicated_txt_dir";
    String testFileName1 = "test1.txt";
    String testZipFilePath1 = "C:\\Users\\Computer\\Documents\\Java\\Progmatic\\ZipProgHomeVersionGradle\\src\\main\\resources\\source_zip_dir\\VadaszCsaba_01.zip";
    String testResultFolderUnsuccessful = "C:\\Users\\Computer\\Desktop\\unsuccessful";

    String testMissingZipFileNameFromTxt = "C:\\Users\\Computer\\Documents\\Java\\Progmatic\\ZipProgHomeVersionGradle\\src\\test\\resources\\test_source_txt_dir";
    String testFileName2 = "test.txt";

    ZipController zipController;

    @BeforeEach
    void setUp() {
        zipController = new ZipController();
    }

    @Disabled
    @Test
    void unzipFile() {
        assertFalse(zipController.exit);
        assertFalse(zipController.unzipFile(testPath1TxtMoreFiles, testFileName1, testZipFilePath1, testResultFolderUnsuccessful));
        assertTrue(zipController.exit);
    }
}
