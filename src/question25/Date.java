/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question25;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Nikitha Kethireddy
 */
public class Date {

    /**
     * @param args the command line arguments
     */
    public static void LocalDateTimeApi() {

        // the current date 
        LocalDate date = LocalDate.now();
        System.out.println("the current date is " + date);

        // the current time 
        LocalTime time = LocalTime.now();
        System.out.println("the current time is " + time);

        // will give us the current time and date 
        LocalDateTime current = LocalDateTime.now();
        System.out.println("current date and time : " + current);

        // to print in a particular format 
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        String formatedDateTime = current.format(format);

        System.out.println("in foramatted manner " + formatedDateTime);

        // printing months days and seconds 
        Month month = current.getMonth();
        int day = current.getDayOfMonth();
        int seconds = current.getSecond();
        System.out.println("Month : " + month + " day : " + day + " seconds : " + seconds);

        // printing some specified date 
        LocalDate date2 = LocalDate.of(1950, 1, 26);
        System.out.println("the repulic day :" + date2);

        // printing date with current time. 
        LocalDateTime specificDate = current.withDayOfMonth(24).withYear(2016);

        System.out.println("specfic date with current time : " + specificDate);
    }

    public static void main(String[] args) {
        // TODO code application logic here
        LocalDateTimeApi();
    }

}
