package workshop6;

/**
 * @date Mar 6, 2020
 * @author Nguyen Xuan Nghiep
 */
public class Question1to6 {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Able was I ere I saw Elba.");
        System.out.println("Question 1: ");
        String hannah = "Did Hannah see bees? Hannah did.";
        System.out.println("Question 2: ");
        System.out.println("a. Value displayed by the expression " + hannah.length());
        System.out.println("b. Value displayed by the expression " + hannah.charAt(12));
        System.out.println("c. hannah.charAt(15)");
        System.out.println("Question 3: ");
        System.out.println("It's 3 characters in length: car");
        System.out.println("Question 4: ");
        String original = "software";
        StringBuilder result = new StringBuilder("hi");
        int index = original.indexOf('a');
        /*1*/ result.setCharAt(0, original.charAt(0));

        //result = "si"
/*2*/ result.setCharAt(1, original.charAt(original.length() - 1));

        //result = "se"
/*3*/ result.insert(1, original.charAt(4));

        //result = "swe"
/*4*/ result.append(original.substring(1, 4));

        //result = "sweoft"
/*5*/ result.insert(3, (original.substring(index, index + 2) + " "));
        //result = "swear oft"
        System.out.println(result);
        System.out.println("Question 5: ");
        System.out.println("1. hi.concat(mom)");
        System.out.println("2. hi + mom");
        System.out.println("Question 6");
        String myName = "Nguyen Xuan Nghiep";
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < myName.length(); i++) {
            if (Character.isUpperCase(myName.charAt(i)) == true) {
                stringBuffer.append(myName.charAt(i));
            }
        }
        System.out.println("My initials are: " + stringBuffer);
    }

}
