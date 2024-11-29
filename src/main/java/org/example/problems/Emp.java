package org.example.problems;

public class Emp {
    String firstName;
    String lastName;
    String fatherName;
    int age;
    int sal;
    String department;
    String gender;

    public Emp(String firstName, String lastName, String fatherName, String gender, int age, int sal, String department) {
        this.firstName = firstName;
        this.gender=gender;
        this.lastName = lastName;
        this.fatherName = fatherName;
        this.age = age;
        this.sal = sal;
        this.department = department;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSal() {
        return sal;
    }

    public void setSal(int sal) {
        this.sal = sal;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", fatherName='" + fatherName + '\'' +
                ", age=" + age +
                ", sal=" + sal +
                ", department='" + department + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }

    public Emp() {
    }
}
