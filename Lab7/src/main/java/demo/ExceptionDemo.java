package demo;

import javax.management.InvalidAttributeValueException;
import java.io.FileNotFoundException;
import java.io.IOError;
import java.io.IOException;
import java.util.List;

public class ExceptionDemo {

    public static void main(String[] args) {
        try {
            int n = 1;
            int m = 1;
            int ans = n / m;
            System.out.println(ans);

            List<String> l = null;

            l.add("a");

        }

        catch (ArithmeticException e) {
            System.out.println("this is ArithmeticException");
            e.printStackTrace();
            System.out.println("division is 0!");
        }

        catch (NullPointerException e) {
            System.out.println("this is the nullpointerexception");
            e.printStackTrace();
        }

        finally {
            System.out.println("this is a finally block");
        }


        System.out.println("program finished.");

//        catch (FileNotFoundException e) {
//
//        }
//        finally {
//            System.out.println("finally statment.");
//
//        }
//
//        try {
//            throwDemo(1, 0);
//        }
//        catch (InvalidAttributeValueException e) {
//            e.printStackTrace();
//        }
//        divide(1, 0);


    }

    private static int divide(int n, int m)  {
        if (m == 0) throw new ArithmeticException();

        int result = n / m;

        return result;
    }
}
