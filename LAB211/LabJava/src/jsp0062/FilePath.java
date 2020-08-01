package jsp0062;

import java.util.Arrays;

/**
 * @date Jul 3, 2020
 * @author Nguyen Xuan Nghiep
 */
public class FilePath {

    private String pathOfFile;

    public FilePath() {
    }

    public FilePath(String pathOfFile) {
        this.pathOfFile = pathOfFile;
    }

    public String getPathOfFile() {
        return pathOfFile;
    }

    public void setPathOfFile(String pathOfFile) {
        this.pathOfFile = pathOfFile;
    }

    public String getFilePath() {
        int index = pathOfFile.lastIndexOf('\\');
        return pathOfFile.substring(0, index);
    }

    public String getFileName() {
        int index = pathOfFile.lastIndexOf('\\');
        String fileName = pathOfFile.substring(index + 1);
        int indexDot = fileName.lastIndexOf('.');
        return fileName.substring(0, indexDot);
    }

    public String getExtension() {
        int index = pathOfFile.lastIndexOf('\\');
        String fileName = pathOfFile.substring(index);
        int indexDot = fileName.lastIndexOf('.');
        return fileName.substring(indexDot + 1);
    }

    public String getDisk() {
        int index = pathOfFile.indexOf(':');
        return pathOfFile.substring(0, index + 1);
    }

    public void getFolders() {
        int firstBackSlash = pathOfFile.indexOf("\\");
        int lastBackSlash = pathOfFile.lastIndexOf("\\");
        if (firstBackSlash == lastBackSlash) {
            System.out.println("No folder");
            return;
        }
        do {
            pathOfFile = pathOfFile.substring(firstBackSlash + 1, lastBackSlash);
            if (!pathOfFile.contains("\\")) {
                System.out.print("[" + pathOfFile + "] ");
            } else {
                System.out.print("[" + pathOfFile.substring(0, pathOfFile.indexOf("\\")) + "] ");
                firstBackSlash = pathOfFile.indexOf("\\");
                lastBackSlash = pathOfFile.length();
            }
        } while (pathOfFile.contains("\\"));
        System.out.println("");
    }
}
