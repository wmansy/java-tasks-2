package lesson2.University;

public class Main {
    public static void main(String[] msi) {
        Student student = new Student("Sergey", "Shishkin", "bap1801", 4.5);
        Aspirant aspirant = new Aspirant("Nikita", "Belov", "isua", 4, "drone");
        Student un = new Aspirant("Andrey", "Eliseev", "bap1801", 5, "aboutSpace");
        Student[] students = { student, aspirant, un };

        for (Student s : students)
            System.out.println(s.getScholarship());
    }
}
