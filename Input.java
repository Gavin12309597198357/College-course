import java.util.Scanner;
import java.util.*;
import java.io.*;

public class Input
{
    // Taken from w3schools Scanner class example
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        Scanner scanner3 = new Scanner(System.in);
        Scanner scanner4 = new Scanner(System.in);

        Student[] studentID = new Student[3];
        // Main 'For Loop':
        for (int i=0; i<studentID.length; i++){
            System.out.println("Enter Student ID:");
            studentID[i]=new Student();
            studentID[i].setStudentNum(scanner1.nextInt());
            System.out.println(studentID[i].getStudentNum());

            // Secondary 'For Loop':
            for (int l=0; l<3; l++){
                System.out.println("Enter class:");
                studentID[i].setCourseID(scanner2.nextLine(), l);
                System.out.println(studentID[i].getCourse(l).getCourseID());
                System.out.println("Enter credit hours:");
                studentID[i].setCreditHours(scanner3.nextInt(), l);
                System.out.println(studentID[i].getCredit(l).getCreditHours());
                System.out.println("Enter grades:");
                studentID[i].setGrades(scanner4.next().charAt(0), l);
                System.out.println(studentID[i].getGrades(l).getGrades());

            }
        }
        // Tertiary 'For Loop':
        for (int i=0; i<studentID.length; i++){
            System.out.println("Student #" + studentID[i].getStudentNum());
            System.out.println("Course Name \tCredithour \tGrade");
        for (int y = 1; y<3; y++){
            System.out.println(i + " __ " + "\t" +
            studentID[i].getCourse(y).getCourseID() + "\t"+
            studentID[i].getCourse(y).getCreditHours() + "\t"+
            studentID[i].getCourse(y).getGrades() + "\t");
        }
        }
        
    }
}