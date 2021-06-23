package assignment5.data;

public class Data {
    int i;
    char ch;
    public void printLocalVariables(){
        int i ;
        char ch;
        //System.out.println("Local Variables:"+i+" "+ch);
        // Local Variables must be initialized explicitly
        // global variables are initialized to  default values when class loads
    }
    public void printGlobalVariables()
    {
        System.out.println("Global Variables:"+i+" "+ch);
    }
}
