package Regulerexpression;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.*;

public class REgulerExpression {
	public static boolean Valid(String email)
    {
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+
                            "[a-zA-Z0-9_+&*-]+)*@" +
                            "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
                            "A-Z]{2,7}$";
                              
        Pattern pat = Pattern.compile(emailRegex);
        if (email == null)
            return false;
        return pat.matcher(email).matches();
    }
	public static void main(String[] args)
    {
        ArrayList<String> email = new ArrayList<>();
            
          email.add("tom.Jerry@gmail.com");
          email.add("Acg844145@.com");
          email.add("john.smith@gmail.com");
          email.add("peter.parker@zylker.com");
          email.add("firstname@domain.com");
          email.add("ram@453gmail.com");
          email.add("Raji8454@gmail.com");
          email.add("pooja.puvi@gmail.com");
          email.add("dhanush@gmail.com");
            
        for(String i : email){
            if (Valid(i))
                System.out.println(i + " - Yes");
            else
                System.out.println(i + " - No");
        }
    }

}
