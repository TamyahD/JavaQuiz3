package rocks.zipcode.io.quiz3.collections;

/**
 * @author leon on 10/12/2018.
 */
public class Lab {
    private String name;
    private LabStatus labStatus;

    public Lab() {
    }

    public Lab(String labName, LabStatus labStatus) {
        this.name = labName;
        this.labStatus=labStatus;
    }

    public Lab(String labName) {
        this.name=labName;
    }

    public String getName() {
        return this.name;
    }

    public void setStatus(LabStatus labStatus) {
        this.labStatus = labStatus;

    }

    public LabStatus getStatus() {
        return this.labStatus;
    }
}
