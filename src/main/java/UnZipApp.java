import model.IZip;
import model.IZipImpl;
import module.Processor;

public class UnZipApp {

    public static void main(String[] args) {
        if (args.length == 3) {
            IZip iZip = new IZipImpl();
            String txtDirectory = args[0];
            String zipDirectory = args[1];
            String targetDirectory = args[2];
            iZip.unzip(zipDirectory, targetDirectory);

        } else {
            new Processor().run();
        }
    }
}
