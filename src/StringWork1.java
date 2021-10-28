import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringWork1 {

    public List<String> coding(List<String> list) {
        List<String> result = new ArrayList<>();
        char c = ' ';
        for (int i = 0; i < list.size(); i++) {
            String buff = "";
            for (int j = 0; j < list.get(i).length(); j++) {
                c = list.get(i).toCharArray()[j];
                if (Character.isLetter(c)) {
                    Code code = new Code();
                    c = code.getCodingLetter(c);
                }
                buff += c;
            }
            result.add(i, buff);
        }
        return result;
    }

    public List<String> decoding(List<String> list) {
        List<String> result = new ArrayList<>();
        char c = ' ';
        for (int i = 0; i < list.size(); i++) {
            String buff = "";
            for (int j = 0; j < list.get(i).length(); j++) {
                c = list.get(i).toCharArray()[j];
                if (Character.isLetter(c)) {
                    Code code = new Code();
                    c = code.getDecodingLetter(c);
                }
                buff += c;
            }
            result.add(i, buff);
        }
        return result;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    private static class Code {
        private final Pair[] letters;

        Code() {
            String lowercaseLetters = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
            String lowercaseLettersCode = "гдеёжзийклмнопрстуфхцчшщъыьэюяабв";
            letters = new Pair[lowercaseLetters.length()];
            for (int i = 0; i < lowercaseLetters.length(); i++) {
                letters[i] = new Pair();
                letters[i].setLetter(lowercaseLetters.toCharArray()[i]);
                letters[i].setCodeLetter(lowercaseLettersCode.toCharArray()[i]);
            }
            //System.out.println(Arrays.toString(letters));
        }

        @Override
        public String toString() {
            return "Code{" +
                    "letters=" + Arrays.toString(letters) +
                    '}';
        }

        public char getCodingLetter(char c) {
            for (Pair letter : letters) {
                if (letter.letter == c) {
                    return letter.codeLetter;
                }
            }
            return ' ';
        }

        public char getDecodingLetter(char c) {
            for (Pair letter : letters) {
                if (letter.codeLetter == c) {
                    return letter.letter;
                }
            }
            return ' ';
        }

        private static class Pair {
            char letter;
            char codeLetter;

            public char getCodeLetter(char c) {
                return codeLetter;
            }

            public void setCodeLetter(char codeLetter) {
                this.codeLetter = codeLetter;
            }

            public char getLetter() {
                return letter;
            }

            public void setLetter(char letter) {
                this.letter = letter;
            }

            @Override
            public String toString() {
                return "Pair{" +
                        "letter=" + letter +
                        ", codeLetter=" + codeLetter +
                        '}';
            }
        }
    }
}
