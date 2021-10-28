import java.io.IOException;

public class Main2 {
    public static void main(String[] args) throws IOException {
        FileWork2 fileWork2 = new FileWork2();

        fileWork2.writeToFileWindows1251(fileWork2.readFromFileUTF8("D:\\Users\\user\\IdeaProjects\\10\\src\\fileForRead2.txt"));
    }
}
