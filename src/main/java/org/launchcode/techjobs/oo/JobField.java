package org.launchcode.techjobs.oo;

public abstract class JobField {
    public int id;
    public static int nextId = 1;
    public String value;
    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;
    @Override
    public String toString() {
        return value;
    }

    public int getId() {
        return id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }


    public static int getNextId() {
        return nextId;
    }

    public JobField(int id, String value) {
        this.id = id;
        this.value = value;
    }
    public void Job() {
        this.id = nextId;
        nextId++;
    }

    public void Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        //this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }
}
