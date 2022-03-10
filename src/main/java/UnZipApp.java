import controller.ZipController;
import model.IZip;
import model.IZipImpl;
import module.Processor;
import utils.FileHandler;

public class UnZipApp {

    public static void main(String[] args) {
        if (args.length == 3) {
            IZip iZip = new IZipImpl();
            FileHandler fileHandler = new FileHandler();
            String txtDirectory = args[0];
            String zipDirectory = args[1];
            String targetDirectory = args[2];
            fileHandler.readTxt(txtDirectory);
            iZip.unzip(zipDirectory, targetDirectory);
            // new ZipController().unzipFile(txtDirectory, zipDirectory, targetDirectory);
        } else {
            new Processor().run();
        }
    }
}
