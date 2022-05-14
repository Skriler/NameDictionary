package edu.itstep.namedictionary.entities;

import java.io.Serializable;

public class Name implements Serializable {
    private String name;
    private String nameDayDate;
    private String definition;

    public Name(String name, String nameDayDate, String definition) {
        this.name = name;
        this.nameDayDate = nameDayDate;
        this.definition = definition;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNameDayDate() {
        return nameDayDate;
    }

    public void setNameDayDate(String nameDayDate) {
        this.nameDayDate = nameDayDate;
    }

    public String getDefinition() {
        return definition;
    }

    public void setDefinition(String definition) {
        this.definition = definition;
    }
}
