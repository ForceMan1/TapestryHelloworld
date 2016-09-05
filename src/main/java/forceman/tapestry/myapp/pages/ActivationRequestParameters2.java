package forceman.tapestry.myapp.pages;

import org.apache.tapestry5.annotations.ActivationRequestParameter;
import org.apache.tapestry5.annotations.Property;

/**
 * Created by Igor on 05.09.2016.
 */
public class ActivationRequestParameters2 {
    @Property
    @ActivationRequestParameter(value = "personId")
    private Long personId;
}
