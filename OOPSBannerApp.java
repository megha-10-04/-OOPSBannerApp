import java.util.HashMap;
import java.util.Map;

/**
 * OOPSBannerApp
 * UC8: Banner using HashMap for character patterns
 *
 * @author Megha
 * @version 8.0
 */
public class OOPSBannerApp {

    /**
     * Utility method to build character pattern map
     * @return Map of Character to pattern array
     */
    public static Map<Character, String[]> buildCharacterMap() {

        Map<Character, String[]> map = new HashMap<>();

        map.put('O', new String[]{
                "********",
                "*      *",
                "*      *",
                "*      *",
                "*      *",
                "*      *",
                "********"
        });

        map.put('P', new String[]{
                "********",
                "*      *",
                "*      *",
                "********",
                "*       ",
                "*       ",
                "*       "
        });

        map.put('S', new String[]{
                "********",
                "*       ",
                "*       ",
                "********",
                "       *",
                "       *",
                "********"
        });

        return map;
    }

    /**
     * Render banner message
     * @param message
     * @param characterMap
     */
    public static void renderBanner(String message, Map<Character, String[]> characterMap) {

        for (int row = 0; row < 7; row++) {

            StringBuilder line = new StringBuilder();

            for (char c : message.toCharArray()) {
                String[] pattern = characterMap.get(c);
                line.append(pattern[row]).append("   ");
            }

            System.out.println(line);
        }
    }

    public static void main(String[] args) {

        Map<Character, String[]> characterMap = buildCharacterMap();

        String message = "OOPS";

        renderBanner(message, characterMap);
    }
}