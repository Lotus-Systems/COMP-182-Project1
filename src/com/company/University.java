package com.company;

import java.io.File;
import java.util.Arrays;
import java.util.Objects;

public class University implements School {
    String universityName;      //displayed at the start of the program
    String motto;               //displayed at the start of the program
    Person[] people;            //contains all Student objects and Faculty objects for the university.
    String[] majors;            //contains all majors offered at this university
    String[] courses;           //contains all courses offered at this university

    University(String name_, String motto_) {
        universityName = name_;
        motto = motto_;

        String fileName = "UniversityPersons.par";
        File f = new File(fileName);

        // if the file exists already
        if(f.isFile())
        {
            // load file
        }
        else // default values
        {

        }

        majors = new String[]{"Hardware Architecture", "Information Analytics", "Quantum Computing", "Undecided" };
        courses = new String[]{ "Computers", "Advance Physics", "Quantum Entanglement", "Parallel Programming",
                                "Advance Algorithms", "FPGA Programming", "Hardware Design", "Embedded Systems",
                                "Signal Processing", "Artificial Intelligence", "Bayesian Logic", "Probability" };
    }

    University(String name_, String motto_, Person[] people_, String[] majors_, String[] courses_) {
        universityName = name_;
        motto = motto_;
        people = people_;
        majors = majors_;
        courses = courses_;
    }

    public void setPeople(Person[] people_) {people = people_;}
    public void setMajors(String[] majors_) {majors = majors_;}
    public void setCourses(String[] courses_) {courses = courses_;}

    // add an item to the array if it isn't full, double the size of the array and add item if it is
    public Object[] addArrObject(Object[] arr, Object item)
    {
        if(arr.length == (Arrays.stream(arr).count()+1))
        {
            Object[] n_arr = new Object[arr.length*2];
            System.arraycopy(arr, 0, n_arr, 0, arr.length);
            n_arr[(int)Arrays.stream(n_arr).count() + 1] = item;
            return n_arr;
        }
        else
        {
            arr[(int)Arrays.stream(arr).count() + 1] = item;
            return arr;
        }
    }

    public void addMajor(String n_Major) {addArrObject(majors, n_Major);}
    public void addCourse(String n_Course) {addArrObject(courses, n_Course);}

    //returns the Student specified by fn(firstName) and ln (lastName)
    public Student findStudent(String fn, String ln) {
        for (Person person : people) {
            if ((person instanceof Student) && (Objects.equals(person.firstName, fn)) && (Objects.equals(person.lastName, ln)))
                return (Student) person;
        }
        return new Student("none", "none", 0, 0, 0, "none");
    }

    //returns the Student specified by fn(firstName) and ln (lastName)
    public Faculty findFaculty(String fn, String ln) {
        for (Person person : people) {
            if ((person instanceof Faculty) && (Objects.equals(person.firstName, fn)) && (Objects.equals(person.lastName, ln)))
                return (Faculty) person;
        }
        String[] placeHolder = {"none"};
        return new Faculty("none", "none", 0, 0, 0, placeHolder);
    }

    //adds a Faculty object to the Person []
    public Faculty hire(Person p)
    {
        addArrObject(people, p);
        return (Faculty) p;
    }
    //adds a Student object to the Person []
    public Student admit(Person p)
    {
        addArrObject(people, p);
        return (Student) p;
    }

    //returns the people variable for the university
    public Person[] getAllPersons() {return people;}
    //returns the majors variable for the university
    public String[] getAllMajors() {return majors;}
    //returns the courses variable for the university
    public String[] getAllCourses() {return courses;}

    //returns a Person [] of all Students only
    public Person[] getStudents() {
        Person[] students = new Person[people.length];
        int index = 0;

        for (Person person : people) {
            if (person instanceof Student) {
                students[index] = person;
                index++;
            }
        }
        return students;
    }

    //returns a Person [] of all Faculty only
    public Person[] getFaculty()
    {
        Person[] faculty = new Person[people.length];
        int index = 0;

        for (Person person : people) {
            if (person instanceof Faculty) {
                faculty[index] = person;
                index++;
            }
        }
        return faculty;
    }
}
