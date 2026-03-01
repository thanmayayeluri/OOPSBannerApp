import java.util.HashMap;
import java.util.Map;

public class OopsBannerApp7 {

    public static void main(String[] args) {

        CharacterPatternMap map = new CharacterPatternMap();
        String word = "OOPS";

        for (int row = 0; row < 7; row++) {

            StringBuilder line = new StringBuilder();

            for (char ch : word.toCharArray()) {
                line.append(map.getPattern(ch)[row]).append("  ");
            }

            System.out.println(line);
        }
    }

    static class CharacterPatternMap {

        private final Map<Character, String[]> store = new HashMap<>();

        public CharacterPatternMap() {

            store.put('O', new String[]{
                " ***** ", "*     *", "*     *",
                "*     *", "*     *", "*     *", " ***** "
            });

            store.put('P', new String[]{
                "****** ", "*     *", "*     *",
                "****** ", "*      ", "*      ", "*      "
            });

            store.put('S', new String[]{
                " ***** ", "*     *", "*      ",
                " ***** ", "      *", "*     *", " ***** "
            });
        }

        public String[] getPattern(char ch) {
            return store.get(ch);
        }
    }
}