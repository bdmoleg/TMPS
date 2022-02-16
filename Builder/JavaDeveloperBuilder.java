public class JavaDeveloperBuilder {

    public JavaDeveloperBuilder setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
        return this;
    }

    public JavaDeveloperBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public JavaDeveloperBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public JavaDeveloperBuilder setSurename(String surename) {
        this.surename = surename;
        return this;
    }

    public JavaDeveloperBuilder setUniversity(String university) {
        this.university = university;
        return this;
    }

    public JavaDeveloperBuilder setDrivingLicense(char drivingLicense) {
        this.drivingLicense = drivingLicense;
        return this;
    }

    public JavaDeveloper getDeveloper() {
        return new JavaDeveloper(yearsOfExperience, age, name, surename, university, drivingLicense);
    }

    private int yearsOfExperience;
    private int age;
    private String name;
    private String surename;
    private String university;
    private char drivingLicense;



}
