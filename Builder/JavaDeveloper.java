public class JavaDeveloper extends AbstractDev{

    // Изменяемый и Неизменяемый объект

    private int yearsOfExperience = 4;
    private int age              = 25;
    private String name;
    private String surename;
    private String university;
    private char drivingLicense;

    public JavaDeveloper() {
        this(0);
    }

    public JavaDeveloper(int yearsOfExperience) {
        this(yearsOfExperience, 0);
    }


    public JavaDeveloper(int yearsOfExperience, int age) {
        this(yearsOfExperience, age, null);
    }

    public JavaDeveloper(int yearsOfExperience, int age, String name) {
        this(yearsOfExperience, age, name, null);
    }

    public JavaDeveloper(int yearsOfExperience, int age, String name, String surename) {
        this(yearsOfExperience, age, name, surename, null);
    }

    public JavaDeveloper(int yearsOfExperience, int age, String name, String surename, String university) {
        this(yearsOfExperience, age, name, surename, university, '0');
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurename(String surename) {
        this.surename = surename;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public void setDrivingLicense(char drivingLicense) {
        this.drivingLicense = drivingLicense;
    }

    public JavaDeveloper(int yearsOfExperience, int age, String name, String surename, String university, char drivingLicense) {
        this.yearsOfExperience = yearsOfExperience;
        this.age = age;
        this.name = name;
        this.surename = surename;
        this.university = university;
        this.drivingLicense = drivingLicense;
    }


    @Override
    public void doWellCoding() {
        System.out.println("Some Java code is right here here...");
    }

    public void notification() {
        System.out.println("This is notification");
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "JavaDeveloper {" +
                "yearsOfExperience=" + yearsOfExperience +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", surename='" + surename + '\'' +
                ", university='" + university + '\'' +
                ", drivingLicense=" + drivingLicense +
                '}';
    }
}

// abstract class -> extends
// interface      -> implements
// Java, Multiple Inheritance