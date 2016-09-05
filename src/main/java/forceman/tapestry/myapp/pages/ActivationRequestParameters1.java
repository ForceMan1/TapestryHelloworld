package forceman.tapestry.myapp.pages;

import org.apache.tapestry5.annotations.Property;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Igor on 05.09.2016.
 */
public class ActivationRequestParameters1 {
    @Property
    private Long personId;

    void setupRender() {
        personId = new Long(1L);
    }

    public Map<String, Object> getQueryParams(){
        Map<String, Object> queryParams = new HashMap<>();
        queryParams.put("personId", personId);
        return queryParams;
    }
}
