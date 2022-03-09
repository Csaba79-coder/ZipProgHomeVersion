package controller;

import model.IZipImpl;
import utils.FileHandler;

import java.io.File;
import java.util.LinkedHashSet;
import java.util.Objects;

public class ZipController {

    // TODO the zip controller to check the the condition for unzipping!

    // TODO logger!!!

    // TODO
    // split the file name + path (last 2 index == txt file name test.txt) if this is equals the source folder last 2 index
    // and the only txt in folder make the zip!!!

    IZipImpl zip = new IZipImpl();
    FileHandler fileHandler = new FileHandler();

    public boolean unzipFile(String path, String fileName, String zipFilePath, String destDirector) {

        if (Objects.requireNonNull(new File(path).listFiles()).length == 1) {
            if (!zipFilePath.isEmpty() && !destDirector.isEmpty() && !path.isEmpty()) {
                LinkedHashSet<String> tempList = fileHandler.readTxt(path);

                for (int i = 0; i < tempList.size(); i++) {
                    if (tempList.contains(fileName)) {
                        zip.unzip(zipFilePath, destDirector);
                    }
                    return true;
                }
            } else {
                return false;
            }
            return false;
        }
        return false;
    }
}
