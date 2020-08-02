package workshop8;

import java.io.*;

/**
 * @date Mar 13, 2020
 * @author Nguyen Xuan Nghiep
 */
public class Question1 {

    public static void main(String[] args) throws IOException {
        File file1 = new File("src\\question1\\input.txt");
        File file2 = new File("src\\question1\\output.txt");
        BufferedReader br = new BufferedReader(new FileReader(file1));
        BufferedWriter bw = new BufferedWriter(new FileWriter(file2));
        String s = br.readLine();
        StringBuilder sb = new StringBuilder(s);
        System.out.println("Input's Content: " + s);
        for (int i = 0; i < s.length(); i++) {
            if (Character.isUpperCase(s.charAt(i))) {
                int j = sb.charAt(i) - 65;
                j = (j + 3) % 26;
                sb.setCharAt(i, (char) (j + 65));
            } else {
                int j = sb.charAt(i) - 97;
                j = (j + 3) % 26;
                sb.setCharAt(i, (char) (j + 97));
            }
        }
        System.out.println("Output's Content: " + sb);
        bw.write(sb.toString());
        bw.close();
        br.close();
    }
}
