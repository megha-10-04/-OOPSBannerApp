/**
 * OOPSBannerApp
 * UC5: Banner using Inline Array Initialization
 * 
 * @author Megha
 * @version 5.0
 */
public class OOPSBannerApp {

    public static void main(String[] args) {

        // Inline array initialization with String.join()
        String[] banner = {
            String.join(" ", "********", "  ", "********", "  ", "********", "  ", "********"),
            String.join(" ", "*      *", "  ", "*      *", "  ", "*      *", "  ", "*       "),
            String.join(" ", "*      *", "  ", "*      *", "  ", "*      *", "  ", "*       "),
            String.join(" ", "*      *", "  ", "*      *", "  ", "********", "  ", "********"),
            String.join(" ", "*      *", "  ", "*      *", "  ", "*       ", "  ", "*       "),
            String.join(" ", "*      *", "  ", "*      *", "  ", "*       ", "  ", "*       "),
            String.join(" ", "********", "  ", "********", "  ", "*       ", "  ", "********")
        };

        // Loop to print banner
        for (String line : banner) {
            System.out.println(line);
        }
    }
}