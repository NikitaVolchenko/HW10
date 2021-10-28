import java.util.List;

public class StringWork {

    public int countCharacters(String string) {
        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            if (string.toCharArray()[i] != ' ') {
                count++;
            }
        }
        return count;
    }
}
