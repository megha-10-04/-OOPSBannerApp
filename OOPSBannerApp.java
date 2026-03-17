/**
 * OOPSBannerApp
 * UC7: Banner using CharacterPattern Class
 * 
 * @author Megha
 * @version 7.0
 */
public class OOPSBannerApp {

    /**
     * Inner Static Class to store character and pattern
     */
    static class CharacterPattern {
        private char character;
        private String[] pattern;

        /**
         * Constructor
         * @param character
         * @param pattern
         */
        public CharacterPattern(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        /**
         * Getter for character
         * @return character
         */
        public char getCharacter() {
            return character;
        }

        /**
         * Getter for pattern
         * @return pattern array
         */
        public String[] getPattern() {
            return pattern;
        }
    }

    // Utility methods for patterns
    public static String[] getOPattern() {
        return new String[]{
            "********",
            "*      *",
            "*      *",
            "*      *",
            "*      *",
            "*      *",
            "********"
        };
    }

    public static String[] getPPattern() {
        return new String[]{
            "********",
            "*      *",
            "*      *",
            "********",
            "*       ",
            "*       ",
            "*       "
        };
    }

    public static String[] getSPattern() {
        return new String[]{
            "********",
            "*       ",
            "*       ",
            "********",
            "       *",
            "       *",
            "********"
        };
    }

    public static void main(String[] args) {

        // Create objects
        CharacterPattern o = new CharacterPattern('O', getOPattern());
        CharacterPattern p = new CharacterPattern('P', getPPattern());
        CharacterPattern s = new CharacterPattern('S', getSPattern());

        // Store in array
        CharacterPattern[] word = {o, o, p, s};

        // Build banner using StringBuilder
        for (int i = 0; i < 7; i++) {
            StringBuilder line = new StringBuilder();

            for (CharacterPattern cp : word) {
                line.append(cp.getPattern()[i]).append("   ");
            }

            System.out.println(line);
        }
    }
}