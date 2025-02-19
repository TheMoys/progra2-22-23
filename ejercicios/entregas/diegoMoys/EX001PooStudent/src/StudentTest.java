import org.junit.Test;

public class StudentTest {
    //Parameters
    private String name;
    private String surname;
    private String id;
    private float grade;

    //Constructor
    public StudentTest(String name, String surname, String id, float grade) {
        this.name = name;
        this.surname = surname;
        this.id = id;
        this.grade = grade;
    }

    //Methods set and get

    public void setGrade(float grade) {

        this.grade = grade;
    }
    @Test
    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;

    }

    @Test
    public String getSurname() {
        return surname;

    }

    public void setSurname(String surname) {
        this.surname = surname;

    }
    @Test
    public String getId() {
        return id;

    }

    public void setId(String id) {
        this.id = id;

    }

    @Test
    public float getGrade() {

        return grade;
    }
}