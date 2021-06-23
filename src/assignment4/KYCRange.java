package assignment4;


import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;
import java.text.*;

public class KYCRange {
    public static void main(String[] args) throws ParseException {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        Date startDate, endDate;
        while(n-->0){
            SimpleDateFormat simpleDateFormat=new SimpleDateFormat("dd-MM-yyyy");
            Date signUpDate = simpleDateFormat.parse(scanner.next());
            Date currentDate = simpleDateFormat.parse(scanner.next());
            Calendar calendar1 = new GregorianCalendar();
            calendar1.setTime(signUpDate);
            Calendar calendar2 = new GregorianCalendar();
            calendar2.setTime(currentDate);
            if(calendar1.get(Calendar.YEAR)==calendar2.get(Calendar.YEAR)){
                System.out.println("No Range");
            }
            else {
                calendar1.add(Calendar.DATE, -30);
                calendar1.set(Calendar.YEAR,calendar2.get(Calendar.YEAR));
                startDate=calendar1.getTime();
                calendar1.add(Calendar.DATE, 60);
                endDate=calendar1.getTime();
                if(currentDate.after(endDate)){
                    System.out.println(simpleDateFormat.format(startDate)+" "+simpleDateFormat.format(endDate));
                }
                else {
                    System.out.println(simpleDateFormat.format(startDate)+" "+simpleDateFormat.format(currentDate));
                }

            }

        }
    }
}



/* input:
5
16-07-1998 27-06-2017
04-02-2016 04-04-2017
04-05-2017 04-04-2017
04-04-2015 04-04-2016
04-04-2015 15-03-2016

 */
