package ua.opnu;

import java.util.ArrayList;

public class Student {
    String name;
    int year;
    ArrayList<String> courses = new ArrayList<>();

    Student(String name, int year) {
        if (name == null || name.isBlank()) throw new IllegalArgumentException();
        if (year < 1 || year > 4) throw new IllegalArgumentException();
        this.name = name;
        this.year = year;
    }

    void addCourse(String courseName) {
        if (courseName == null || courseName.isBlank()) throw new IllegalArgumentException();
        courses.add(courseName);
    }

    void dropAll() {
        courses.clear();
    }

    int getCourseCount() {
        return courses.size();
    }

    String getName() {
        return name;
    }

    int getTuition() {
        return year * 20000;
    }

    int getYear() {
        return year;
    }
}
