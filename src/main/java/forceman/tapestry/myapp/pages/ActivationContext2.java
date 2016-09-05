package forceman.tapestry.myapp.pages;

import forceman.pojo.Person;
import forceman.pojo.Regions;

import java.util.Calendar;

/**
 * Created by Igor on 05.09.2016.
 */
public class ActivationContext2 {
    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    //@Property
    private Person person = new Person("Igor", "Zhernovkov", Regions.WEST_COAST, Calendar.getInstance().getTime());;


    void onActivate(Long personId) {
        person.setId( personId );
    }
    /*
    public void setupRender() {
        person = new Person("Igor", "Zhernovkov", Regions.WEST_COAST, Calendar.getInstance().getTime());
    }
    */
}
