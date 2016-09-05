package forceman.tapestry.myapp.pages;

import org.apache.tapestry5.ComponentResources;
import org.apache.tapestry5.annotations.Persist;
import org.apache.tapestry5.annotations.Property;
import org.apache.tapestry5.ioc.annotations.Inject;

/**
 * Created by Igor on 24.08.2016.
 */
public class PersistExample {
    @Property
    @Persist
    private Integer count;

    // Generally useful bits and pieces

    @Inject
    private ComponentResources componentResources;

    // The code

    void setupRender() {
        if( count == null )
            count = 10;
        count++;
    }

    Object onClear() {
        componentResources.discardPersistentFieldChanges();
        return PersistExample.class;
    }

}
