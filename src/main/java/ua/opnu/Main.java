package ua.opnu;

public class Main {
    public static void main(String[] args) {
        Student s = new Student("Паламарчук Богдан Олександрович", 2);

        s.addCourse("Організація баз даних та знань");
        s.addCourse("Об’єктно-орієнтоване програмування");
        s.addCourse("Теорія ймовірностей");

        System.out.println(s.getName() + ": кількість вивчаємих дисциплін - " + s.getCourseCount());
        System.out.println(s.getName() + ": рік навчання - " + s.getYear());
        System.out.println(s.getName() + ": заплатив за навчання - " + s.getTuition());
    }
}
