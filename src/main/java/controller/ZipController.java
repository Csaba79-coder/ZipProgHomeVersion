package controller;

import model.IZipImpl;
import utils.FileHandler;

import java.io.File;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Objects;

public class ZipController {

    boolean exit = false;

    // TODO the zip controller to check the the condition for unzipping!

    // TODO logger!!!

    // TODO
    // split the file name + path (last 2 index == txt file name test.txt) if this is equals the source folder last 2 index
    // and the only txt in folder make the zip!!!

    IZipImpl zip = new IZipImpl();
    FileHandler fileHandler = new FileHandler();

    public boolean unzipFile(String pathTxt, String fileNameTxt, String zipFilePath, String destDirector) {

        if (Objects.requireNonNull(new File(pathTxt).listFiles()).length == 1) {
            if (!zipFilePath.isEmpty() && !destDirector.isEmpty() && !pathTxt.isEmpty()) {
                LinkedHashSet<String> tempList = fileHandler.readTxt(pathTxt);

                for (int i = 0; i < tempList.size(); i++) {
                    if (tempList.contains(fileNameTxt)) {
                        zip.unzip(zipFilePath, destDirector);
                    } else if  (!tempList.contains(fileNameTxt)) {
                        // error message!!! LOG!
                        exit = true;
                        return false;
                    }
                }
                exit = true;
                return true;
            } else {
                // error message!!! LOG!
                exit = true;
                return false;
            }
        }
        // error message!!! LOG!
        exit = true;
        return false;
    }
}
