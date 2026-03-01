public class OopsBannerApp6 {

    public static void main(String[] args) {

        String[] o = buildO();
        String[] p = buildP();
        String[] s = buildS();

        for (int i = 0; i < 7; i++) {
            System.out.println(String.join("  ", o[i], o[i], p[i], s[i]));
        }
    }

    public static String[] buildO() {
        return new String[]{
            " ***** ", "*     *", "*     *",
            "*     *", "*     *", "*     *", " ***** "
        };
    }

    public static String[] buildP() {
        return new String[]{
            "****** ", "*     *", "*     *",
            "****** ", "*      ", "*      ", "*      "
        };
    }

    public static String[] buildS() {
        return new String[]{
            " ***** ", "*     *", "*      ",
            " ***** ", "      *", "*     *", " ***** "
        };
    }
}