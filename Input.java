import java.util.Scanner;
import java.util.*;
import java.io.*;

public class Input
{
    // Taken from w3schools Scanner class example
    public static void main(String[] args) {
        //Scanner names
        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        Scanner scanner3 = new Scanner(System.in);
        Scanner scanner4 = new Scanner(System.in);

        Student[] studentID = new Student[3];
        // Main 'For Loop':
        for (int i=0; i<studentID.length; i++){
            // Allows the user to enter  in their Student ID.
            System.out.println("Enter Student ID:");
            studentID[i]=new Student();
            studentID[i].setStudentNum(scanner1.nextInt());
            // Prints out the user's Student ID.
            System.out.println(studentID[i].getStudentNum());

            // Secondary 'For Loop':
            for (int l=0; l<3; l++){
                // Allows the user to enter their class name
                System.out.println("Enter class:");
                studentID[i].setCourseID(scanner2.nextLine(), l);
                // Prints out the user's class name.
                System.out.println(studentID[i].getCourse(l).getCourseID());
                // Allows the user to enter their credit hours.
                System.out.println("Enter credit hours:");
                studentID[i].setCreditHours(scanner3.nextInt(), l);
                // Prints out the user's credit hours.
                System.out.println(studentID[i].getCredit(l).getCreditHours());
                // Allows the user to enter their grades.
                System.out.println("Enter grades:");
                studentID[i].setGrades(scanner4.next().charAt(0), l);
                // Prints out the user's grades.
                System.out.println(studentID[i].getGrades(l).getGrades());

            }
        }
        // Tertiary 'For Loop':
        
        // Creates report of Grades, Courses, and Credit hours.
        for (int i=0; i<studentID.length; i++){
            // Prints  out labels for Course Names, Credit Hours, Grades
            System.out.println("Student #" + studentID[i].getStudentNum());
            System.out.println("Course Names: \tCredit Hours: \tGrades:");
        for (int y = 1; y<3; y++){
            
            System.out.println(i + " -- " + "\t" +
            // Prints out Course ID
            studentID[i].getCourse(y).getCourseID() + "\t         "+
            // Prints out Credit Hours
            studentID[i].getCourse(y).getCreditHours() + "\t      "+
            //Prints out Grades
            studentID[i].getCourse(y).getGrades() + "\t"          );
        }
        }
        
    }
}