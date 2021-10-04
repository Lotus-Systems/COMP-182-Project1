package com.company;

import java.io.File;

public class UniversityDriver {
    public static University uni;


    UniversityDriver(String name, String motto)
    {



    }

    public static void quit()
    {

    }

    public static void command(String com)
    {
        System.out.println("Welcome To " +
                uni.universityName + "\n" +
                uni.motto +
                "\nWhat would you like to do?\n" +
                "Enter \"hire\" to hire a new faculty member.\n" +
                "Enter \"admit\" to admit a new student.\n" +
                "Enter \"find student\" to list information about a student.\n" +
                "Enter \"find faculty\" to list information about a faculty member.\n" +
                "Enter \"list students\" to list the names of all students.\n" +
                "Enter \"list faculty\" to list the names of faculty members.\n" +
                "Enter \"quit\" to end this program and save data.\n");



        //The following commands can be entered:
        switch (com) {
            case "hire" :          // to hire a new faculty member
                // hire here
                break;
            case "admit :" :       // to admit a new student

                break;
            case "find student" :  // to display information about a specific student: name, date of birth, and major

                break;
            case "find faculty" :  // display information about a specific faculty: name, date of birth, and courses

                break;
            case "list students" : // list the first and last names of all students

                break;
            case "list faculty" :  // list the first and last names of all faculty

                break;
            case "quit" :          // terminates the program and saves all Person data in a “UniversityPersons.per”
                quit();            // file, including the ones hired and admitted by the user
                break;
            default:               // unrecognized input

                break;
        }
    }

    public static void main(String[] args) {
        // write your code here
    }
}
