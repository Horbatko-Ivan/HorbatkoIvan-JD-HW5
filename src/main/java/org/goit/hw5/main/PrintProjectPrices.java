package org.goit.hw5.main;

public class PrintProjectPrices {

    private final int name;
    private final int projectCost;

    public PrintProjectPrices(int name, int projectCost) {
        this.name = name;
        this.projectCost = projectCost;
    }

    @Override
    public String toString() {
        return "\nname = " + name + ", project_cost = " + projectCost;
    }
}
