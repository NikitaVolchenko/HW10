import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FileWork3 {

    public List<String> readFromFile(String fileName) throws IOException {
        ArrayList<Pair> lines = new ArrayList<>();
        try (BufferedReader in = new BufferedReader(new FileReader(fileName))) {
            String value = in.readLine();
            while (value != null) {
                Pair pair = new Pair();
                for (int i = 0; i < value.length(); i++) {
                    if (!Character.isDigit(value.toCharArray()[i]) && value.toCharArray()[i] != ' ') {
                        pair.key += value.toCharArray()[i];
                    }
                }
                pair.value = Integer.parseInt(value.replaceAll("[^0-9]", ""));
                lines.add(pair);
                value = in.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        Collections.sort(lines);
        Collections.reverse(lines);

        List<String> list = new ArrayList<>();
        for (int i = 0; i < lines.size(); i++) {
            list.add(i, lines.get(i).toString());
        }
        return list;
    }

    public void writeToFile(List<String> lines) throws IOException {
        try {
            Path file = Paths.get("D:\\Users\\user\\IdeaProjects\\10\\src\\fileForWrite3.txt");
            Files.write(file, lines, StandardCharsets.UTF_8);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private class Pair implements Comparable<Pair> {
        private String key = "";
        private int value = 0;

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public String getKey() {
            return key;
        }

        public void setKey(String key) {
            this.key = key;
        }

        @Override
        public String toString() {
            return key + " " + value;
        }

        @Override
        public int compareTo(Pair o) {
            return this.value > o.getValue() ? 1 : -1;
        }
    }
}
