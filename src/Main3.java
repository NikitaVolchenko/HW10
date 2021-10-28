import java.io.IOException;

public class Main3 {
    public static void main(String[] args) throws IOException {
        FileWork3 fileWork3 = new FileWork3();

        fileWork3.writeToFile(fileWork3.readFromFile("D:\\Users\\user\\IdeaProjects\\10\\src\\fileForRead3.txt"));
    }
}
