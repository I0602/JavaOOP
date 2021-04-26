public class Student extends Person{
    private double score;


    public Student() {
    }

    public Student(String id, String name, int yearOfBirth, double score) {
        super(id, name, yearOfBirth);
        this.score = score;
    }

    public double getScore() {
        return this.score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student {" +
            super.toString() + 
            " score='" + getScore() + "'" +
            "}";
    }

}