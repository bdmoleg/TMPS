import java.util.Objects;

public class Faculty implements ICloneableForSureSure{

    private String name;
    private int facultyNumber;
    private String dean;  // декан
    private String street;

    public Faculty(Faculty f) {
        this.name = f.name;
        this.facultyNumber = f.facultyNumber;
        this.dean = f.dean;
        this.street = f.street;
    }

    public Faculty(String name, int facultyNumber, String dean, String street) {
        this.name = name;
        this.facultyNumber = facultyNumber;
        this.dean = dean;
        this.street = street;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFacultyNumber() {
        return facultyNumber;
    }

    public void setFacultyNumber(int facultyNumber) {
        this.facultyNumber = facultyNumber;
    }

    public String getDean() {
        return dean;
    }

    public void setDean(String dean) {
        this.dean = dean;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }



    @Override
    public boolean equals(Object ob) {
        if(this == ob) return true;
        if(ob == null || this.getClass() != ob.getClass()) return false;

        Faculty temp = (Faculty) ob;

        return Objects.equals(this.name, temp.name) && this.facultyNumber == temp.facultyNumber &&
                Objects.equals(this.dean, temp.dean) && Objects.equals(this.street, temp.street);
    }

    @Override
    public String toString() {
        return "Faculty{" +
                "name='" + name + '\'' +
                ", facultyNumber=" + facultyNumber +
                ", dean='" + dean + '\'' +
                ", street='" + street + '\'' +
                '}';
    }

    @Override
    public Object cloneMeRightNow() {
        return new Faculty(this);
    }



}
