package org.launchcode.techjobs.oo;

import javax.sound.midi.Soundbank;
import java.util.Objects;

public class Job{

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;



    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.

    public Job() {
        this.id = nextId;
        nextId++;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }
// TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
//  match.

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return id == job.id;
    }

    @Override
    public int hashCode() {
        return id;
    }

    public String toString() {
        Job job = new Job("Web Developer", new Employer("LaunchCode"), new Location("StL"), new PositionType("Back-end developer"), new CoreCompetency("Java"));
        String jobString = "\nID: "+ job.getId()+/**//**/
                    "\nName: "+ job.getName()+
                    "\nEmployer: "+ job.getEmployer().getValue()+
                    "\nLocation: "+ job.getLocation().getValue()+
                    "\nPosition Type: " + job.getPositionType().getValue()+
                    "\nCore Competency: " + job.getCoreCompetency().getValue()+
                    "\n";
        String noData = "Data not available";
        //This If/Else loop needs work on structure; as of now, the program is giving noDate instead of filling blanks with verbiage

        if(job.getName() == ""){
            return  noData;
        }
        if(job.getEmployer().getValue() == ""){
            return noData;
        }
        if(job.getLocation().getValue() == ""){
            return noData;
        }
        if(job.getPositionType().getValue() == ""){
            return noData;
        }
        if(job.getCoreCompetency().getValue() == ""){
            return noData;
        } else{
            return jobString;
        }

    }

    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public Location getLocation() {
        return location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }
}
