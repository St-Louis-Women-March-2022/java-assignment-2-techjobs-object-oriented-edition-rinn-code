package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Employer extends JobField{
    public Employer(int id, String value) {
        super(id, value);
    }


// This first constructor accepts no arguments and assigns the value of nextId to the id field.
// It then increments nextId.
// Thus, every new Employer object will get a different ID number.
//    public Employer() {
//        id = nextId;
//        nextId++;
//    }
////The second constructor assigns aValue to the value field.
//// However, it ALSO initializes id for the object by calling the first constructor with the this(); statement.
//// Including this(); in any Employer constructor makes initializing id a default behavior.
//    public Employer(String value) {
//        this();
//        this.value = value;
 //   }

    // Custom toString, equals, and hashCode methods:



    @Override
    public boolean equals(Object o) {  // Two objects are equal if they have the same id.
        if (this == o) return true;
        if (!(o instanceof Employer)) return false;
        Employer employer = (Employer) o;
        return getId() == employer.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    // Getters and Setters:

}
