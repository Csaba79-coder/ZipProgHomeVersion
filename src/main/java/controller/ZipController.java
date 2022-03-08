package controller;

import model.IZipImpl;
import utils.FileHandler;

import java.util.LinkedHashSet;

public class ZipController {

    IZipImpl zip = new IZipImpl();
    FileHandler fileHandler = new FileHandler();

    public boolean unzipFile(String path, String zipFilePath, String destDirector) {

        if (!zipFilePath.isEmpty() && !destDirector.isEmpty() && !path.isEmpty()) {
            LinkedHashSet<String> tempList = fileHandler.readTxt(path);
            for (int i = 0; i < tempList.size(); i++) {
                if (tempList.contains(path)) {
                    zip.unzip(zipFilePath, destDirector);
                }
                return true;
            }
        } else {
            return false;
        }
        return true;
    }
}
