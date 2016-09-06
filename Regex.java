import java.io.Console;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

class Regex {
  public static void main(String[] args) {
    Console c = System.console();

    String zipCode = c.readLine("Enter your zipcode: ");
    if(zipCode.matches("^\\d{5}(-\\d{4})?$")) {
      System.out.printf("%s is a valid zip code\n", zipCode);
    } else {
      System.out.printf("%s is a NOT valid zip code\n", zipCode);
    }

    String skills = c.readLine("Enter your job skills seperated by commas: ");
    for(String s:skills.split("\\W+(and\\w+)?")) {
      System.out.println("Great! We need someone with " + s + "!");
    }

  }
}
