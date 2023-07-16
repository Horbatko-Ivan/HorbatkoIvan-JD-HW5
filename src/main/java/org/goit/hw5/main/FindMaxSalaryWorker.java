package org.goit.hw5.main;

public class FindMaxSalaryWorker {

    private final String name;
    private final int salary;

    public FindMaxSalaryWorker(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "\nname=" + name +
                ", salary=" + salary;
    }
}
