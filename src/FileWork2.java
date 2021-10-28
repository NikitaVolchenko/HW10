import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FileWork2 {

    public List<String> readFromFileWindows1251(String fileName) throws IOException {
        List<String> lines = new ArrayList<>();
        try (BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream(fileName), "windows-1251"))) {
            String value = "";
            while ((value = in.readLine()) != null) {
                lines.add(value);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return lines;
    }

    public List<String> readFromFileUTF8(String fileName) throws IOException {
        List<String> lines = new ArrayList<>();
        try (BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream(fileName), StandardCharsets.UTF_8))) {
            String value = "";
            while ((value = in.readLine()) != null) {
                lines.add(value);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return lines;
    }

    public void writeToFileUTF8(List<String> lines) throws IOException {
        try {
            Path file = Paths.get("D:\\Users\\user\\IdeaProjects\\10\\src\\fileForWrite2.txt");
            Files.write(file, lines, StandardCharsets.UTF_8);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void writeToFileWindows1251(List<String> lines) throws IOException {
        try {
            Path file = Paths.get("D:\\Users\\user\\IdeaProjects\\10\\src\\fileForWrite2.txt");
            Charset inputCharset = Charset.forName("windows-1251");
            Files.write(file, lines, inputCharset);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}