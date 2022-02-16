import java.util.Objects;

public class Student implements ICloneableForSureSure{

    private int age;
    private int yearOfStudy;
    private char autoCategory;
    private String name;
    private String surename;
    private Faculty faculty;

    public Student() {

    }

    public Student(Student s) {
        this.age = s.age;
        this.yearOfStudy = s.yearOfStudy;
        this.autoCategory = s.autoCategory;
        this.name = s.name;
        this.surename = s.surename;
        this.faculty = s.faculty;
    }

    public Student(int age, int yearOfStudy, char autoCategory, String name, String surename, Faculty faculty) {
        this.age = age;
        this.yearOfStudy = yearOfStudy;
        this.autoCategory = autoCategory;
        this.name = name;
        this.surename = surename;
        this.faculty = faculty;
    }

    @Override
    public Object cloneMeRightNow() {
        Student ss = new Student(this);
        ss.setFaculty((Faculty) faculty.cloneMeRightNow());
        return ss;
/*        this.faculty = (Faculty) faculty.cloneMeRightNow();
        return new Student(this);*/
    }

    public int getAge() {
        return age;
    }

    public int getYearOfStudy() {
        return yearOfStudy;
    }

    public char getAutoCategory() {
        return autoCategory;
    }

    public String getName() {
        return name;
    }

    public String getSurename() {
        return surename;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setYearOfStudy(int yearOfStudy) {
        this.yearOfStudy = yearOfStudy;
    }

    public void setAutoCategory(char autoCategory) {
        this.autoCategory = autoCategory;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurename(String surename) {
        this.surename = surename;
    }

    public Faculty getFaculty() {
        return faculty;
    }

    public void setFaculty(Faculty faculty) {
        this.faculty = faculty;
    }

    @Override
    public boolean equals(Object ob) {
        if(this == ob) return true;
        if(ob == null || this.getClass() != ob.getClass()) return false;

        Student temp = (Student) ob;

        return this.age == temp.age && this.yearOfStudy == temp.yearOfStudy && temp.autoCategory == this.autoCategory &&
                Objects.equals(this.name, temp.name) && Objects.equals(this.surename, temp.surename) &&
                this.faculty.equals(temp.faculty);
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", yearOfStudy=" + yearOfStudy +
                ", autoCategory=" + autoCategory +
                ", name='" + name + '\'' +
                ", surename='" + surename + '\'' +
                ", faculty='" + faculty +
                '}';
    }
}
