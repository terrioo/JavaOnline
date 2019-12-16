package epam_intro_online.module_4.ClassesAndObject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Student {
    private String surname;
    private String initials;
    private int group;
    private int[] mark = new int[5];

    public Student(String surname, String initials, int group, int[] mark) {
        this.surname = surname;
        this.initials = initials;
        this.group = group;
        this.mark = mark;
    }

    public static void main(String[] args) {
        Student[] AllStudent = {
                new Student("Kirov", "B.A.", 1, new int[]{9, 2, 8, 4, 8}),
                new Student("Sidorov", "A.D.", 2, new int[]{9, 9, 10, 9, 9}),
                new Student("Vilnov", "V.D", 3, new int[]{10, 4, 10, 9, 9}),
                new Student("Kirov2", "B.A.", 4, new int[]{5, 9, 10, 3, 9}),
                new Student("Sidorov2", "K.L.", 5, new int[]{5, 9, 6, 7, 9}),
                new Student("Vilnov2", "L.N.", 6, new int[]{9, 9, 10, 9, 9}),
                new Student("Kirov3", "R.T.", 7, new int[]{8, 4, 9, 10, 6}),
                new Student("Sidorov3", "T.S.", 8, new int[]{9, 10, 10, 9, 9}),
                new Student("Vilnov3", "B.K.", 9, new int[]{7, 7, 7, 9, 6}),
                new Student("Ostry", "L.N.", 10, new int[]{9, 3, 9, 9, 10}),
        };
        List<Student> listOfGoodStudents = findGoodStudent(AllStudent);
        print(listOfGoodStudents);
    }

    public static List<Student> findGoodStudent(Student[] student) {
        List<Student> listOfStudents = new ArrayList<>();
        for (Student bestStudent : student) {
            int totalMark = 0;
            for (int i : bestStudent.mark) {
                totalMark += i;
            }
            if (totalMark / 5 >= 9) {
                listOfStudents.add(bestStudent);
            }
        }
        return listOfStudents;
    }


    public static void print(List<Student> student) {
        System.out.println(student.toString());
    }


    @Override
    public String toString() {
        return "{Student: " +
                "surname='" + surname + '\'' +
                ", initials='" + initials + '\'' +
                ", group=" + group +
                ", mark=" + Arrays.toString(mark) +
                '}';
    }
}
