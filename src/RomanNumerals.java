/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author cjt1496
 */
import java.util.Scanner;
public class RomanNumerals {
    int number;
    String proceed;
    String romanNumeral;
    Scanner input = new Scanner(System.in);
    
    public void enterNumberToConvert(){
        do{
        System.out.println("Enter a number to convert to a Roman Numeral.");
        number = input.nextInt();
       
        String[] thousands = new String[]{"", "M", "MM", "MMM"};
        String[] hundreds = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String[] tens = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String[] units = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        
        romanNumeral = thousands[number / 1000] +
                hundreds[(number % 1000) / 100] +
                tens[(number % 100) / 10] +
                units[number % 10];
        
        System.out.println(romanNumeral);
        System.out.println("Do you want to continue? \"y\" or \" n\"?");
        proceed = input.next();
        }while(!"n".equals(proceed));

    }
    
}
