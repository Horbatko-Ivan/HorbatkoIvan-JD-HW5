package org.goit.hw5.main;

public class FindLongestProject {

    private final int id;
    private final int monthCount;

    public FindLongestProject(int id, int mountCount) {
        this.id = id;
        this.monthCount = mountCount;
    }

    @Override
    public String toString() {
        return "\nproject_id=" + id +
                ", month_count=" + monthCount;
    }
}
