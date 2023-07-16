package org.goit.hw5.main;

public class FindMaxProjectsClient {

    private final String name;
    private final int projectCount;

    public FindMaxProjectsClient(String name, int projectCount) {
        this.name = name;
        this.projectCount = projectCount;
    }

    @Override
    public String toString() {
        return "\nname=" + name +
                ", project_count=" + projectCount;
    }
}
