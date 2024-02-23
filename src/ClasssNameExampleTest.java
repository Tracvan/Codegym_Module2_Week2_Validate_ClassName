import java.util.regex.Pattern;

public class ClasssNameExampleTest {
    private static  ClassNameExample classNameExample;
    public static final String[] validClassName = new String[]{"C0223G", "A0323K"};
    public static final String[] invalidClassName = new String[]{"M0318G", "P0323A"};

    public static void main(String[] args) {
        classNameExample = new ClassNameExample();
        for(String classNameExample1 : validClassName){
            boolean isValid = classNameExample.validate(classNameExample1);
            System.out.println("Class name is " + classNameExample1 + "is valid " + isValid);
        }
        for(String classNameExample2 : invalidClassName){
            boolean isValid = classNameExample.validate(classNameExample2);
            System.out.println("Class name is " + classNameExample2 + " is valid " + isValid);
        }
    }
}
