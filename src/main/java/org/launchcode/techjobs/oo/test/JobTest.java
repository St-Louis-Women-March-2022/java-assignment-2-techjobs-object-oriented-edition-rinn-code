package org.launchcode.techjobs.oo.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.*;

import static org.junit.Assert.*;

/**
 * Created by LaunchCode
 */
@RunWith(JUnit4.class)
public class JobTest {
/**/
    @Test
    public void testSettingJobId(){
        Job job1 = new Job();
        Job job2 = new Job();
        assertNotEquals(job1.getId(), job2.getId());


    }

    @Test
    public void testJobConstructorSetsAllFields() {
        Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertEquals(job1.getName(), "Product tester");
        assertEquals(job1.getEmployer().getValue(), "ACME");
        assertEquals(job1.getLocation().getValue(), "Desert");
        assertEquals(job1.getPositionType().getValue(), "Quality control");
        assertEquals(job1.getCoreCompetency().getValue(), "Persistence");/**/
        assertTrue(job1.getName() instanceof String);
        assertTrue(job1.getEmployer() instanceof Employer);
        assertTrue(job1.getLocation() instanceof Location);
        assertTrue(job1.getPositionType() instanceof PositionType);
        assertTrue(job1.getCoreCompetency() instanceof CoreCompetency);
    }

    @Test
    public void testJobsForEquality(){
        Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job job2 = new Job("Web Developer", new Employer("LaunchCode"), new Location("StL"), new PositionType("Back-end developer"), new CoreCompetency("Java"));
        assertFalse(job1.equals(job2));
    }

    @Test
    public void testToStringStartsAndEndsWithNewLine(){
        Job job = new Job("Web Developer", new Employer("LaunchCode"), new Location("StL"), new PositionType("Back-end developer"), new CoreCompetency("Java"));
        char firstChar = job.toString().charAt(0);
        char lastChar = job.toString().charAt(job.toString().length()-1);
        assertEquals(firstChar, '\n');
        assertEquals(lastChar, '\n');
    }

    @Test
    public void testToStringContainsCorrectLabelsAndData(){
        Job job = new Job("Web Developer", new Employer("LaunchCode"), new Location("StL"), new PositionType("Back-end developer"), new CoreCompetency("Java"));
        String toString = "\nID: "+ job.getId()+
                "\nName: "+ job.getName()+
                "\nEmployer: "+ job.getEmployer().getValue()+
                "\nLocation: "+ job.getLocation().getValue()+
                "\nPosition Type: "+ job.getPositionType().getValue()+
                "\nCore Competency: "+ job.getCoreCompetency().getValue()+
                "\n";
        assertEquals(job.toString(), toString);

    }

    @Test
    public void testToStringHandlesEmptyField(){
        Job job = new Job("Web Developer", new Employer(""), new Location("StL"), new PositionType(""), new CoreCompetency("Java"));
        String jobString ="\nID: "+ job.getId()+
                "\nName: Web Developer"+
                "\nEmployer: Data not available"+
                "\nLocation: StL"+
                "\nPosition Type: Data not available"+
                "\nCore Competency: Java"+
                "\n";
        assertEquals(job.toString(), jobString);

    }

}


