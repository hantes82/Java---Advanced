package pl;

import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

/**
 * Created by kondzio on 2017-04-06.
 */
public class StringZad {

    //psvm


    public static void main(String[] args) {

        //Duration - sekundy/godziny/minuty
        //Peroid - dni/miesiace/tygodnie/lata

        LocalDateTime time = LocalDateTime.now();
        LocalDateTime timeAfter10Days = time.minus(Period.ofDays(10));

        if(time.isAfter(timeAfter10Days)){
            System.out.println("TAK");
        }else{
            System.out.println("NIE");
        }


        System.out.println(time);

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy<>MM<>dd HH:mm");




//        LocalDate date  = LocalDate.now();
//        System.out.println(date.toString());
//
//        LocalTime localTime = LocalTime.now();
//        System.out.println(localTime);
    }


}