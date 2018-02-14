import java.util.Scanner;
import java.lang.String;
import java.math.BigDecimal;
//change to lab 4
public class Main {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        System.out.print("Enter a hexadecimal number: ");
        String userInput = scnr.next();
        if(userInput.startsWith("0x")) {
            userInput = userInput.substring(2, userInput.length());
        }
        userInput = userInput.toUpperCase();
        String OverString = "0123456789ABCDEF";
        int a;
        String lastCharacter;
        long runningTotal = 0;
        int powerCt = 0;
        while(userInput.length() > 0) {
            lastCharacter = userInput.substring(userInput.length()-1);
            a = OverString.indexOf(lastCharacter);
            runningTotal += a*Math.pow(16,powerCt);
            powerCt++;
            userInput = userInput.substring(0,userInput.length()-1);
        }

           System.out.println("Your number is " + BigDecimal.valueOf(runningTotal).toPlainString() + " in decimal");
    }
}



