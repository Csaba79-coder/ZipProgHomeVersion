package bootstrap;

import controller.ZipController;
import model.IZipImpl;
import org.apache.log4j.Logger;
import utils.FileHandler;
import utils.Print;

import java.util.LinkedHashSet;

public class DataLoader {

    FileHandler fileHandler = new FileHandler();
    Print print = new Print();
    IZipImpl zip = new IZipImpl();
    String zipFilePath1 = "C:\\Users\\Computer\\Documents\\Java\\Progmatic\\ZipProgHomeVersionGradle\\src\\main\\resources\\source_zip_dir\\VadaszCsaba_01.zip";
    String destDirectory = "C:\\Users\\Computer\\Documents\\Java\\Progmatic\\ZipProgHomeVersionGradle\\src\\main\\resources\\target_dir";
    String zipFilePath2 = "C:\\Users\\Computer\\Documents\\Java\\Progmatic\\ZipProgHomeVersionGradle\\src\\main\\resources\\source_zip_dir\\TestWordUnzip.zip";
    String zipFilePath3 = "C:\\Users\\Computer\\Documents\\Java\\Progmatic\\ZipProgHomeVersionGradle\\src\\main\\resources\\source_zip_dir\\Karrierterv.zip";

    public static final Logger LOGGER = Logger.getLogger(FileHandler.class);

    public void loadTestData() {

        LinkedHashSet<String> resultSet = fileHandler.readTxt(new FileHandler().getPath());
        System.out.println(resultSet.size());
        print.printSet(resultSet);

        // String message = ": no file found";

        boolean firstResult = zip.unzip(zipFilePath1, destDirectory);
        boolean secondResult = zip.unzip(zipFilePath2, destDirectory);
        boolean thirdResult = zip.unzip(zipFilePath3, destDirectory);
        boolean fourthResult = zip.unzip(zipFilePath3, "C:\\Users\\Computer\\Desktop\\proba");

        // LOGGER.error("ERROR" + "-> reading file! Date: " + new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date()));

        /*logger.error("ERROR" + message);
        logger.warn("WARNING");
        logger.fatal("FATAL");
        logger.debug("DEBUG");
        logger.info("INFO");

        System.out.println("Final Output");*/

        String path = "C:\\Users\\Computer\\Documents\\Java\\Progmatic\\ZipProgHomeVersionGradle\\test-resources\\txt";
        new ZipController().testFileNameAndPath(path);
    }
}
