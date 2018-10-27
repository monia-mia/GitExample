package com.company;

public class Student {
    private String name;
    private String surname;
    private long id;
    private int age;
    private Gender gender;

    public Student(String name, String surname, long id, int age, Gender gender) {
        this.name = name;
        this.surname = surname;
        this.id = id;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", id=" + id +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        Student otherStudent = (Student)obj;

        return this.name.equals(otherStudent.name) &&
                this.surname.equals(otherStudent.surname) &&
                this.age == otherStudent.age &&
                this.gender == otherStudent.gender;
    }


}

