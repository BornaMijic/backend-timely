package hr.project.timely.Models;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.Date;

public class WorkSessionCommand {

    @NotBlank
    @Size(max=50)
    private String name;

    @NotBlank
    private Date startDate;

    @NotBlank
    private Date endDate;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
}
