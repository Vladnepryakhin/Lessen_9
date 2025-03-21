import java.util.*;
class Student {
    private String name;
    private String group;
    private int course;
    private List<Integer> grades;
    public Student(String name, String group, int course, List<Integer> grades) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.grades = grades;
    }
    public String getName() {
        return name;
    }
    public String getGroup() {
        return group;
    }
    public int getCourse() {
        return course;
    }
    public double getAverageGrade() {
        if (grades.isEmpty()){
            return 0.0;
        }
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return (double) sum / grades.size();
    }
    public void promoteToNextCourse() {
        if (getAverageGrade() >= 3.0) {
            course++;
        }
    }
    @Override
    public String toString() {
        return "Student [name=" + name + ", group=" + group + ", course=" + course + ", grades=" + grades + "]";
    }
}
