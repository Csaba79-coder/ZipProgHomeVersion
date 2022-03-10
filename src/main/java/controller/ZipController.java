package controller;

import model.IZip;
import model.IZipImpl;
import utils.FileHandler;

import java.io.File;
import java.util.LinkedHashSet;
import java.util.Objects;

public class ZipController {

    boolean exit = false;

    IZip zip = new IZipImpl();
    FileHandler fileHandler = new FileHandler();

    public boolean unzipFile(String fileNameTxt, String txtFilePath,  String zipFilePath, String destDirector) {

        if (Objects.requireNonNull(new File(txtFilePath).listFiles()).length == 1) {
            if (!zipFilePath.isEmpty() && !destDirector.isEmpty() && !txtFilePath.isEmpty()) {
                LinkedHashSet<String> tempList = fileHandler.readTxt(txtFilePath);

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


    private String[] getFolderPathAndFileName(String path) {
        File folder = new File(path);
        File[] listOfFiles = folder.listFiles();
        String fileName = "";
        String folderPath = "";
        String[] pathOfTxt;

        for (int i = 0; i < Objects.requireNonNull(listOfFiles).length; i++) {
            if (listOfFiles[i].isFile()) {
                System.out.println("File " + listOfFiles[i].getName());
                fileName = listOfFiles[i].getName();
            } else if (listOfFiles[i].isDirectory()) {
                System.out.println("Directory " + listOfFiles[i].getName());
                folderPath = listOfFiles[i].getName();
            }
        }
        pathOfTxt = new String[] {folderPath, fileName};

        return pathOfTxt;
    }

    public void testFileNameAndPath(String path) {
        String[] testPath = getFolderPathAndFileName(path);
        System.out.println("Folder path: " + testPath[0]);
        System.out.println("File name: " + testPath[1]);
    }

}
