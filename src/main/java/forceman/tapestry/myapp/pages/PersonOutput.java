package forceman.tapestry.myapp.pages;

import forceman.pojo.Person;
import forceman.pojo.Regions;
import org.apache.tapestry5.annotations.Property;

import java.util.Date;

/**
 * Created by Igor on 24.08.2016.
 */
public class PersonOutput {
    @Property
    Person person = new Person("Igor", "Zhernovkov", Regions.EAST_COAST, new Date());

    void sertupRender(){
        person = new Person("Igor", "Zhernovkov", Regions.EAST_COAST, new Date());
    }
}
