import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ClientMain {

    public static void main(String[] args) {

        String s1 = "Moldova UTM FCIM";
        String s2 = "Moldova UTM FCIM";
        String s3 = new String("Moldova UTM FCIM"); // новый объект в куче

        // String pool, Immutable

        //  1         2         3
        System.out.println(s1 == s3);       //   false   по ссылке
        System.out.println(s1.equals(s3));  //  true  , по значению


        Prototype p1 = new Prototype();
        System.out.println(p1.toString());
        System.out.println(p1.hashCode()); // base 10
        System.out.println(p1.getClass().getName());
        System.out.println(String.format("%08x", p1.hashCode())); // Hex, base 16

        System.out.println("\n\n\n\n");

        Student student1 = new Student(22, 2, 'B',
                new String("Gheorghe"), "Vasilescu",
                new Faculty("FCIM", 3, "Ciorba Dumitru", "Studentilor 9/7"));


        Student student3 = (Student) student1.cloneMeRightNow(); // Casting ??? Downcasting or Upcasting ?

        // Shallow copy, Deep copy

        System.out.println("По значению: " + student1.equals(student3));
        System.out.println("По ссылке: " + (student1 == student3));
        System.out.println(student1);
        System.out.println(student3);

        System.out.println("\n\n\n\n\n\n\n\n\n");

/*       student3.setName(new String("Iurie"));
        student1.setAge(25);
        student3.setAutoCategory('F');
        student3.setSurename("Moldoveanu");*/

        //student3.getFaculty().setName("Facultatea Calculatoare, Informatica si Microelectronica");
        student3.getFaculty().setName("CIM");

        // Student student2 = new Student(student1.getAge(), student1.getYearOfStudy(), student1.getAutoCategory(), student1.getName(), student1.getSurename());
        // System.out.println(student2);

        // Для прототипа нам нужно что-бы было False(по ссылке) True(по значени)
/*        System.out.println("По ссылке: " + (student1 == student3));
        System.out.println("По значению: " + student1.equals(student3));*/
/*        System.out.println(student1);
        System.out.println(student3);*/

        // System.out.println(student3 == student3); // еслии по ссылке равны означает что и по значению они тоже равны, в обратную стороны не обязательно

/*        Student student4 = new Student(22, 2, 'B', "Gheorghe",
                "Vasilescu", new Faculty("FCIM",
                3, "Ciorba Dumitru", "Studentilor 9/7"));

        System.out.println("По ссылке: " + (student3 == student4));
        System.out.println("По значению: " + student3.equals(student4));
        System.out.println(student3);
        System.out.println(student4);*/

/*        Faculty f1 = new Faculty("FCIM", 3, "Ciorba Dumitru", "Studentilor 9/7");
        Faculty f2 = (Faculty) f1.cloneMeRightNow();

        System.out.println(f1 == f2);
        System.out.println(f1.equals(f2));
        f1.setName("CIM");
        System.out.println(f1);
        System.out.println(f2);
        System.out.println(f1 == f2);
        System.out.println(f1.equals(f2));*/

        List<Student> students = new ArrayList<>();
        List<Student> copiedStudents = new ArrayList<>();

        Student forListStudent = new Student(22,  1, 'B',
                new String("Gheorghe"), "Vasilescu",
                new Faculty("FCIM", 3, "Ciorba Dumitru", "Studentilor 9/7"));

        for(int i = 0; i < 10; i++) {
            students.add(forListStudent);
        }

        for(Student s : students) {
            System.out.println(s);
        }

        for(Student s : students) {
            copiedStudents.add((Student) s.cloneMeRightNow());
        }

        copiedStudents.get(3).getFaculty().setStreet("Miron Costin 15");
        copiedStudents.get(3).setSurename("Vladimirescu");
        copiedStudents.get(3).setAge(26);
        System.out.println(copiedStudents.get(3).hashCode());
        System.out.println(copiedStudents.get(4).hashCode());

        for(Student s : copiedStudents) {
            System.out.println(s);
        }

/*        for(int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i) == copiedStudents.get(i));
            //System.out.println(students.get(i).equals(copiedStudents.get(i)));
        }*/



    }

}
