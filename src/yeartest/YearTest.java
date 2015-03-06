/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yeartest;

import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author class
 */
public class YearTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int year = LocalDate.now().getYear();

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Please enter a year: ");
        year = keyboard.nextInt();
        
        if (year % 2 == 0)
            System.out.println("Year " + year +" is even." );
        else 
            System.out.println("Year " + year +" is odd.");

    }

}
