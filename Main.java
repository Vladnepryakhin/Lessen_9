import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Set<Student> students = new HashSet<>();
        students.add(new Student("Владислав Непряхин", "Группа 1", 1, Arrays.asList(4,5,5)));
        students.add(new Student("Анастасия Карноухова", "Группа 3", 2, Arrays.asList(5,5,5)));
        students.add(new Student("Максим Ушаков", "Группа 2", 3, Arrays.asList(3,3,4)));
        students.add(new Student("Очкошник заморский", "Группа 2", 2, Arrays.asList(3,2,2)));
        System.out.println("Студенты 1-го курса:");
        printStudents(students,1);
        System.out.println("Студенты 2-го курса:");
        printStudents(students,2);
        System.out.println("Студенты 3-го курса:");
        printStudents(students,3);
        removeUnderperformingStudents(students);
        promoteStudents(students);
        System.out.println("\nСтуденты после отчисления:");
        printStudents(students,2);
        printStudents(students,3);
        printStudents(students,4);
    }
    public static void removeUnderperformingStudents(Set<Student> students) {
        students.removeIf(student -> student.getAverageGrade()< 3.0);
    }
    public static void promoteStudents(Set<Student> students) {
        for (Student student : students) {
            student.promoteToNextCourse();
        }
    }
    public static void printStudents(Set<Student> students, int course) {
        for (Student student : students) {
            if (student.getCourse() == course) {
                System.out.println(student.getName());
            }
        }
    }
}
