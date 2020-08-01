package jlp0025;

import java.io.File;
import java.io.IOException;

/**
 * @date Jul 15, 2020
 * @author Nguyen Xuan Nghiep
 */
public class Main {

    public static void main(String[] args) throws IOException {
        File input = new File("src\\jlp0025\\input.txt");
        File output = new File("src\\jlp0025\\output.txt");
        Normalize normalizeText = new Normalize(input, output);
        normalizeText.readFile();
        normalizeText.handle();
        normalizeText.writeToFile();
    }
}
