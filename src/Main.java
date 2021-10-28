import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        FileWork1 fileWork1 = new FileWork1();

        fileWork1.writeToFile(fileWork1.readFromFile("D:\\Users\\user\\IdeaProjects\\10\\src\\fileForRead.txt"));
    }
}
