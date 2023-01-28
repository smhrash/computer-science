package practice;

import java.util.LinkedList;

public class LinkListDetails {

        public static void main(String[] args) {
            LinkedList<Student3> studentList = new LinkedList<Student3>();

            Student3 s1 = new Student3("Sujit", 1);
            Student3 s2 = new Student3("Siddharth", 2);
            Student3 s3 = new Student3("Karanpreet", 3);
            Student3 s4 = new Student3("Hari", 5);
            Student3 s5 = new Student3("Tricha", 4);


            studentList.add(s1);
            studentList.add(s2);
            studentList.add(s3);
            studentList.add(s4);
            //printStudentList(studentList);

            Student3 s = studentList.get(1);
            System.out.println(s.getDetails());


        }

        public static void printStudentList(LinkedList<Student3> students) {
            for(Student3 s : students) {
                System.out.println(s.getDetails());
            }
        }
    }



