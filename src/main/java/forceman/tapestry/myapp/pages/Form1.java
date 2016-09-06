package forceman.tapestry.myapp.pages;

import org.apache.tapestry5.annotations.InjectComponent;
import org.apache.tapestry5.annotations.InjectPage;
import org.apache.tapestry5.annotations.Property;
import org.apache.tapestry5.corelib.components.Form;
import org.apache.tapestry5.corelib.components.TextField;

/**
 * Created by Igor on 06.09.2016.
 */
public class Form1 {
    // Screen fields

    @Property
    private String firstName;

    @Property
    private String lastName;

    // Other pages

    @InjectPage
    private Form page2;

    // Generally useful bits and pieces

    @InjectComponent("names")
    private Form form;

    @InjectComponent("firstName")
    private TextField firstNameField;

    @InjectComponent("lastName")
    private TextField lastNameField;

    // The code

    void onValidateFromNames() {
        if (firstName == null || firstName.trim().equals("")) {
            form.recordError(firstNameField, "First Name is required.");
        }
        if (lastName == null || lastName.trim().equals("")) {
            form.recordError(lastNameField, "Last Name is required.");
        }
    }

    Object onSuccess() {
        //page2.set(firstName, lastName);
        return page2;
    }
}
