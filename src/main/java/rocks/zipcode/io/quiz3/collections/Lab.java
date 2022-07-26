package rocks.zipcode.io.quiz3.collections;

/**
 * @author leon on 10/12/2018.
 */
public class Lab {
    private LabStatus labStatus;
    public Lab() {
        for (Enum e: labStatus) {
            this(null);

        }
    }

    public Lab(String labName) {
    }

    public String getName() {
        return null;
    }

    public void setStatus(LabStatus labStatus) {
        this.labStatus = labStatus;
        labStatus == L
    }

    public LabStatus getStatus() {
        return this.labStatus;
    }
}
