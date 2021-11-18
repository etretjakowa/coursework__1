package ru.skypro;

import java.util.Objects;

public class Employee {
    private final String employeeName;
    private int department;
    private int wages;
    private final int id;
    private static int idCounter;

    public Employee(String employeeName, int department, int wages, int idCounter) {
        this.employeeName = employeeName;
        this.department = department;
        this.wages = wages;
        this.id = idCounter++;
    }

    public String getEmployeeName() {
        return this.employeeName;
    }

    public int getDepartment() {
        return this.department;
    }

    public int getWages() {
        return this.wages;
    }


    public void setDepartment() {
        this.department = department;
    }

    public void setWages() {
        this.wages = wages;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "employeeName='" + employeeName + '\'' +
                ", department=" + department +
                ", wages=" + wages +
                ", id=" + id +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return department == employee.department && wages == employee.wages && id == employee.id && Objects.equals(employeeName, employee.employeeName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(employeeName, department, wages, id);
    }
}
