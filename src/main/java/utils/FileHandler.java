package utils;

import lombok.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedHashSet;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class FileHandler {

    // "C:\\Users\\Computer\\Documents\\Java\\Progmatic\\ZipProgHomeVersionGradle\\src\\main\\resources\\test.txt"
    private String path = "C:\\Users\\Computer\\Documents\\Java\\Progmatic\\ZipProgHomeVersionGradle\\src\\main\\resources\\source_txt_dir\\test.txt";
    FileReader fileReader;
    BufferedReader bufferedReader;

    public LinkedHashSet<String> readTxt(String path) {

        LinkedHashSet<String> lineSet = new LinkedHashSet<>();
        try {
            FileReader fileReader = new FileReader(path);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            for (String line; (line = bufferedReader.readLine()) != null  && !line.equals("");) {
                lineSet.add(line);
            }
        } catch (IOException e) {

            new Error("ERROR" + "-> reading file! Date: " + new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date()));
            e.printStackTrace();

        /*} finally {
            try {
                bufferedReader.close();
                fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        */
        }
        return lineSet;
    }

    private static class Error {

        public Error(String s) {
        }
    }
}
