package org.goit.hw5.main;

import java.util.Date;

public class FindYoungestEldestWorkers {

    private final String type;
    private final String name;

    private final Date birthday;

    public FindYoungestEldestWorkers(String type, String name, Date birthday) {
        this.type = type;
        this.name = name;
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "\ntype=" + type +
                ", name=" + name +
                ", birthday=" + birthday;
    }
}
