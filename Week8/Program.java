public class Program {
    public static void main(String[] args) {
        Person p1 = new Student("SV01", "Duy", 1996, 7.7);
        Person p2 = new Student("SV01", "Duy", 1996, 7.7);

        Person p3 = new Employee("E001", "Hieu", 1994, 800);
        Person p4 = new Employee("E002", "Toan", 1994, 950);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
    }
}