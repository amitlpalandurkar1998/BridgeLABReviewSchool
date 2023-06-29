package com.pratice29jun;

import java.util.AbstractList;
import java.util.Scanner;

//Write a Java program to create a class called "School" with
// attributes for students, teachers, and classes, and methods
// to add and remove students and teachers, and to create classe
class SchoolRecord{
    private String CLASS_NAME;
    private String STUDENT_NAME;
    private String TEACHER_NAME;

    public SchoolRecord(String className,String studentName,String teacherName) {
        this.CLASS_NAME = className;
        this.STUDENT_NAME = studentName;
        this.TEACHER_NAME = teacherName;
    }

    public String getCLASS_NAME() {
        return CLASS_NAME;
    }

    public void setCLASS_NAME(String className) {
        this.CLASS_NAME = className;
    }

    public String getSTUDENT_NAME() {
        return STUDENT_NAME;
    }

    public void setSTUDENT_NAME(String student_name) {
        this.STUDENT_NAME = student_name;
    }

    public String getTEACHER_NAME() {
        return TEACHER_NAME;
    }

    public void setTEACHER_NAME(String teacherName) {
        this.TEACHER_NAME = teacherName;
    }

    @Override
    public String toString() {
        return "Class Name : "+CLASS_NAME+
                "Teacher Name : "+ TEACHER_NAME+
                "Student : "+ STUDENT_NAME;

    }
}

class  SchoolRecordList{

    Scanner scanner = new Scanner(System.in);
    private AbstractList<String> schoolRecords;
    public void setSchoolRecords(AbstractList<String> schoolRecords) {
        this.schoolRecords = schoolRecords;
    }


    public void addClass(){
        System.out.println("Enter The Class Name : ");
        String className = scanner.next();
        SchoolRecord schoolRecord = new SchoolRecord(className);

        schoolRecords.add(String.valueOf(schoolRecord));

        System.out.println(schoolRecords);

    }

    public void addStudent() {
        System.out.println("Enter The Student Name : ");
        String studentName = scanner.next();
        SchoolRecord schoolRecord = SchoolRecord(studentName);
    }
    public void addTeacher() {
        System.out.println("Enter The Teacher Name : ");
        String teacherName = scanner.next();
        SchoolRecord schoolRecord = new SchoolRecord(teacherName);
    }
    public void removeStudent() {
        System.out.println("Enter The Student Name : ");
        String removeStudentName = scanner.next();
    }
    public void removeTeacher() {
        System.out.println("Enter The Teacher Name : ");
        String removeTeacherName = scanner.next();
    }

}

public class School {
    public static void main(String[] args) {
        SchoolRecordList schoolRecordList = new SchoolRecordList();
        Scanner scanner = new Scanner(System.in);

        boolean isExit = true;

        System.out.println("Welcome to School.  ");

        while (isExit) {
            System.out.println("Enter '1' To create Class.");
            System.out.println("Enter '2' To Add Student.");
            System.out.println("Enter '3' To Add Teacher.");
            System.out.println("Enter '4' To Remove Student.");
            System.out.println("Enter '5' To Remove Teacher.");
            System.out.println("Enter '0' To Exit.");

            int input = scanner.nextInt();

            switch (input){
                case 0 :
                        isExit=false;
                    break;
                case 1 :
                        schoolRecordList.addClass();
                    break;
                case 2 :
                        schoolRecordList.addStudent();
                    break;
                case 3 :
                        schoolRecordList.addTeacher();
                    break;
                case 4 :
                        schoolRecordList.removeStudent();
                    break;
                case 5 :
                        schoolRecordList.removeTeacher();
                    break;
                default:
                    break;
            }

        }

    }
}
