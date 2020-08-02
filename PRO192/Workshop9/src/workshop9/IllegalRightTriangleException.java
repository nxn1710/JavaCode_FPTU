package workshop9;

/**
 * @date Mar 22, 2020
 * @author Nguyen Xuan Nghiep
 */
public class IllegalRightTriangleException extends Exception{
    String message;

    public IllegalRightTriangleException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return this.message;
    }
    
    
}
