package forceman.tapestry.myapp.pages;

/**
 * Created by Igor on 23.08.2016.
 */

import org.apache.tapestry5.annotations.OnEvent;

/** A page class (automatically associated with the template file of the same name). */

public class HelloWorld {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @OnEvent(value = "submit", component = "userInputForm")
    Object onFormSubmit() {
        System.out.println("Your Name is " + name);

        return "HelloWorld";
    }
}
