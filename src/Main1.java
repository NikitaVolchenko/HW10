import java.io.IOException;

public class Main1 {
    public static void main(String[] args) throws IOException {
        FileWork1 fileWork1 = new FileWork1();

        StringWork1 stringWork1 = new StringWork1();
        fileWork1.writeToFile(stringWork1.decoding(fileWork1.readFromFile("D:\\Users\\user\\IdeaProjects\\10\\src\\fileForRead1.txt")));
    }
}
