import java.util.HashMap;
import java.util.Map;

public class OopsBannerApp8 {

    private static final Map<Character, String[]> patternMap = new HashMap<>();

    public static void main(String[] args) {
        initializePatterns();
        renderBanner("OOPS");
    }

    private static void initializePatterns() {

        patternMap.put('O', new String[]{
            " ***** ", "*     *", "*     *",
            "*     *", "*     *", "*     *", " ***** "
        });

        patternMap.put('P', new String[]{
            "****** ", "*     *", "*     *",
            "****** ", "*      ", "*      ", "*      "
        });

        patternMap.put('S', new String[]{
            " ***** ", "*     *", "*      ",
            " ***** ", "      *", "*     *", " ***** "
        });
    }

    public static void renderBanner(String word) {

        for (int row = 0; row < 7; row++) {

            StringBuilder line = new StringBuilder();

            for (char ch : word.toCharArray()) {
                line.append(patternMap.get(ch)[row]).append("  ");
            }

            System.out.println(line);
        }
    }
}