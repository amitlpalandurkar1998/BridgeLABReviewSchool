package com.pratice29jun;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Write a Java program to create a class called "School" with
// attributes for students, teachers, and classes, and methods
// to add and remove students and teachers, and to create classe

class SchoolRecordCLASS{
    private String CLASS_NAME;
    public SchoolRecordCLASS(String className) {
        this.CLASS_NAME = className;
    }
    public String getCLASS_NAME() {
        return CLASS_NAME;
    }
    public void setCLASS_NAME(String CLASS_NAME) {
        this.CLASS_NAME = CLASS_NAME;
    }
    @Override
    public String toString() {
        return "Class Name : "+CLASS_NAME+"\n";
    }
}
class SchoolRecordStudent{
    private String STUDENT_NAME;
    public SchoolRecordStudent(String studentName) {
        this.STUDENT_NAME = studentName;
    }
    public String getSTUDENT_NAME() {
        return STUDENT_NAME;
    }
    public void setSTUDENT_NAME(String STUDENT_NAME) {
        this.STUDENT_NAME = STUDENT_NAME;
    }
    @Override
    public String toString() {
        return "Student Name : "+STUDENT_NAME+"\n";
    }
}
class SchoolRecordTeacher{
    private String TEACHER_NAME;
    public SchoolRecordTeacher(String teacherName) {
        this.TEACHER_NAME = teacherName;
    }
    public String getTEACHER_NAME() {
        return TEACHER_NAME;
    }
    public void setTEACHER_NAME(String CLASS_NAME) {
        this.TEACHER_NAME = CLASS_NAME;
    }
    @Override
    public String toString() {
        return "Teacher Name : "+TEACHER_NAME+"\n";
    }
}
class  SchoolRecordList{
    Scanner scanner = new Scanner(System.in);
    private final List<SchoolRecordCLASS> schoolRecordsDataBaseclass;
    private final List<SchoolRecordStudent> schoolRecordsDataBaseStudent;
    private final List<SchoolRecordTeacher> schoolRecordsDataBaseTeacher;
    public SchoolRecordList(){
        schoolRecordsDataBaseclass = new ArrayList<>();
        schoolRecordsDataBaseStudent = new ArrayList<>();
        schoolRecordsDataBaseTeacher = new ArrayList<>();
    }
    public void setSchoolRecords(SchoolRecordCLASS schoolRecordCLASS,SchoolRecordStudent schoolRecordStudent,SchoolRecordTeacher schoolRecordTeacher) {
        schoolRecordsDataBaseclass.add(schoolRecordCLASS);
        schoolRecordsDataBaseStudent.add(schoolRecordStudent);
        schoolRecordsDataBaseTeacher.add(schoolRecordTeacher);
    }


    public void addClass(){
        System.out.print("\nEnter The Class Name : ");
        String className = scanner.next();
        SchoolRecordCLASS schoolRecordCLASS = new SchoolRecordCLASS(className);
        schoolRecordsDataBaseclass.add(schoolRecordCLASS);
    }

    public void addStudent() {
        System.out.print("\nEnter The Student Name : ");
        String studentName = scanner.next();
        SchoolRecordStudent schoolRecordStudent = new SchoolRecordStudent(studentName);
        schoolRecordsDataBaseStudent.add(schoolRecordStudent);
    }
    public void addTeacher() {
        System.out.print("\nEnter The Teacher Name : ");
        String teacherName = scanner.next();
        SchoolRecordTeacher schoolRecordTeacher = new SchoolRecordTeacher(teacherName);
        schoolRecordsDataBaseTeacher.add(schoolRecordTeacher);
    }
    public void removeStudent() {
        boolean isNotFound=true;
        System.out.print("\nEnter The Student Name : ");
        String removeStudentName = scanner.next();
        for (SchoolRecordStudent schoolRecordStudent : schoolRecordsDataBaseStudent){
            if (schoolRecordStudent.getSTUDENT_NAME().equals(removeStudentName)){
                schoolRecordsDataBaseStudent.remove(schoolRecordStudent);
                System.out.println("The Student "+removeStudentName+" is Remove Successfully.\n");
                removeStudentName=null;
                isNotFound=false;
                break;
            }
        }
        if (isNotFound){
            System.out.println(removeStudentName+" is not Found.\n");
            removeStudentName=null;
        }
    }
    public void removeTeacher() {
        boolean isNotFound=true;
        System.out.print("\nEnter The Teacher Name : ");
        String removeTeacherName = scanner.next();
        for (SchoolRecordTeacher schoolRecordTeacher : schoolRecordsDataBaseTeacher){
            if (schoolRecordTeacher.getTEACHER_NAME().equals(removeTeacherName)){
                schoolRecordsDataBaseTeacher.remove(schoolRecordTeacher);
                System.out.println("The Teacher "+removeTeacherName+" is Remove Successfully.\n");
                removeTeacherName=null;
                isNotFound=false;
                break;
            }
        }
        if (isNotFound){
            System.out.println(removeTeacherName+" is not Found.\n");
            removeTeacherName=null;
        }
    }

    public void displayDataBase(){
        System.out.println(schoolRecordsDataBaseclass);
        System.out.println(schoolRecordsDataBaseStudent);
        System.out.println(schoolRecordsDataBaseTeacher);
    }
}

public class School {
    public static void main(String[] args) {
        SchoolRecordList schoolRecordList = new SchoolRecordList();
        Scanner scanner = new Scanner(System.in);

        boolean isExit = true;

        System.out.println("Welcome to School.  ");

        while (isExit) {
            System.out.println("\nEnter '1' To create Class.");
            System.out.println("Enter '2' To Add Student.");
            System.out.println("Enter '3' To Add Teacher.");
            System.out.println("Enter '4' To Remove Student.");
            System.out.println("Enter '5' To Remove Teacher.");
            System.out.println("Enter '6' To Display The All Data.");
            System.out.println("Enter '0' To Exit.\n");
            System.out.print("Enter The Input : ");

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
                case 6 :
                        schoolRecordList.displayDataBase();
                    break;
                default:
                    System.out.println("\nEnter The Valid Input.");
                    break;
            }

        }

    }
}
