package forceman.pojo;

import java.util.Date;

/**
 * Created by Igor on 24.08.2016.
 */
public class Person {
    private Long id;
    private String firstName;
    private String lastName;
    private Regions region;
    private Date startDate;

    public String toString() {
        final String DIVIDER = ", ";

        StringBuilder buf = new StringBuilder();
        buf.append(this.getClass().getSimpleName() + ": ");
        buf.append("[");
        buf.append("id=" + id + DIVIDER);
        buf.append("firstName=" + firstName + DIVIDER);
        buf.append("lastName=" + lastName + DIVIDER);
        buf.append("region=" + region + DIVIDER);
        buf.append("startDate=" + startDate);
        buf.append("]");
        return buf.toString();
    }

    // Default constructor is required by EJB3.
    public Person() {
    }

    public Person(String firstName, String lastName, Regions region, Date startDate) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.region = region;
        this.startDate = startDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Regions getRegion() {
        return region;
    }

    public void setRegion(Regions region) {
        this.region = region;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

}