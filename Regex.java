import java.io.Console;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

class Regex {
  public static void main(String[] args) {
    Console c = System.console();

    String zipCode = c.readLine("Enter your zipcode: ");
    if(zipCode.matches("\\d{5}")) {
      System.out.printf("%s is a valid zip code\n", zipCode);
    } else {
      System.out.printf("%s is a NOT valid zip code\n", zipCode);
    }
  }
}
