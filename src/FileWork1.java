import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FileWork1 {
    public List<String> readFromFile(String fileName) throws IOException {
        List<String> lines = new ArrayList<>();
        try(BufferedReader in = new BufferedReader(new FileReader(fileName))) {
            String value = in.readLine();
            while (value != null) {
                StringWork stringWork = new StringWork();
                value += " " + stringWork.countCharacters(value);
                lines.add(value);
                value = in.readLine();
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        return lines;
    }

    public void writeToFile(List<String> lines) throws IOException {
        try {
            Path file = Paths.get("D:\\Users\\user\\IdeaProjects\\10\\src\\fileForWrite.txt");
            Files.write(file, lines, StandardCharsets.UTF_8);
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
