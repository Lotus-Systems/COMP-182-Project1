package com.company;

public class Person {

    String firstName;   //firstName
    String lastName;    //last Name
    int monthBirth;     //month of date of birth
    int dayBirth;       //day of date of birth
    int yearBirth;      //year of date of birth

    Person(String fn, String ln, int mb, int db, int yb)
    {
        firstName = fn;
        lastName = ln;
        monthBirth = mb;
        dayBirth = db;
        yearBirth = yb;
    }
}
