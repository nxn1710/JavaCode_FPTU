import com.sun.xml.internal.ws.util.StringUtils;
import java.io.*;
import java.util.regex.*;


public class Main {

    public static void main(String[] args) throws IOException {
//
        String text = "as you can see , detecting whether a string is normalized can be quite efficient . a lot of the cost of normalizing in the \" second row  \" is for the initialization of buffers. The cost of which is amortized when one is processing larger strings.\n" +
"    as it turns out, these buffers are rarely needed, so we may change the implementation at some point to speed up the common case for small strings even further";
        System.out.println(convert(text));
    }

    static String convert(String text) {
//        text = text.replaceAll("[\\s&&[^\\n]]+", " ").replaceAll("\\s*,\\s*", ", ").replaceAll("\\s*\\.[\\s&&[^\n]]*", ", ").
//                replaceAll("\\s*:\\s*", ": ").replaceAll("\\n+", "\n").replaceAll("^\n|\n$", "");
        String temp = "";
        String []str = text.split("\\.");
            for (String string : str) {              
                temp += StringUtils.capitalize(string) + ".";
        } 
        text = temp;

        Pattern pattern = Pattern.compile("(\")(.+)(\")");
        Matcher matcher = pattern.matcher(text);      
        if (matcher.find()){
            text = text.replace(matcher.group(2), matcher.group(2).trim());
        }                  
        return text;  
    }
}