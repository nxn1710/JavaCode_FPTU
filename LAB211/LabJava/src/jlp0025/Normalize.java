package jlp0025;

import com.sun.xml.internal.ws.util.StringUtils;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @date Jul 15, 2020
 * @author Nguyen Xuan Nghiep
 */
public class Normalize {

    String text;
    File fileInput;
    File fileOutput;
    BufferedReader br;
    PrintWriter pw;

    public Normalize() {
    }

    public Normalize(File fileInput, File fileOutput) throws FileNotFoundException, IOException {
        this.fileInput = fileInput;
        this.fileOutput = fileOutput;
        br = new BufferedReader(new FileReader(fileInput));
        pw = new PrintWriter(new FileWriter(fileOutput));
    }

    public void readFile() throws IOException {
        text = "";
        String str;
        while ((str = br.readLine()) != null) {
            text += str;
        }
        br.close();
        System.out.println("Read file success");
    }

    public void handle() {
        //only one space between word
        text = text.replaceAll("\\s+", " ");
        // no space before and only one space after , :
        text = text.replaceAll("\\s*,\\s*", ", ").replaceAll("\\s*:\\s*", ": ");
        // no space before and only one space after .
        text = text.replace("[\\s&&[^\\n]]+", " ").replaceAll("\\s*\\.[\\s&&[^\n]]*", ", ");
        // change \n to space
        text = text.replaceAll("\\n+", "\n").replaceAll("^\n|\n$", "");
        String temp = "";
        String[] str = text.split(" ");
        // capitalize after dot
        for (String string : str) {
            string = string.toLowerCase();
            temp += StringUtils.capitalize(string) + " ";
        }
        text = temp ;
        Pattern pattern = Pattern.compile("(\")(.+)(\")");
        Matcher matcher = pattern.matcher(text);
        if (matcher.find()) {
            text = text.replace(matcher.group(2), matcher.group(2).trim());
        }
        System.out.println("Normalize success");
    }

    public void writeToFile() {
        pw.print(text);
        pw.close();
        System.out.println("Write to file success");
    }

}
