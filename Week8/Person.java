public abstract class Person {
    private String id;
    private String name;
    private int yearOfBirth;


    public Person() {
    }

    public Person(String id, String name, int yearOfBirth) {
        this.id = id;
        this.name = name;
        this.yearOfBirth = yearOfBirth;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearOfBirth() {
        return this.yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    @Override
    public String toString() {
        return 
            " id='" + getId() + "'" +
            ", name='" + getName() + "'" +
            ", yearOfBirth='" + getYearOfBirth() + "'" ;
    }

}