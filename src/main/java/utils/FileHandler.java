package utils;

import lombok.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.LinkedHashSet;
import java.util.logging.Level;
import java.util.logging.Logger;

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
            FileReader fileReader = new FileReader(path, StandardCharsets.UTF_8);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            for (String line; (line = bufferedReader.readLine()) != null  && !line.equals("");) {
                lineSet.add(line);
            }
        } catch (IOException e) {
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
}
