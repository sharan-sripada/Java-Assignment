package assignment8;

public class ErrorHandling {
    public void method() throws Exception{
        //throw new Exception1("exception1");
        //throw new Exception2("exception2");
        //throw new Exception3("exception3");
        throw new NullPointerException();
    }

    public static void main(String[] args) {
        ErrorHandling errorHandling=new ErrorHandling();
        try {
            errorHandling.method();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("finally");
        }

    }
}
