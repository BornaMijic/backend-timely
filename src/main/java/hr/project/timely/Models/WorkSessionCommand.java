package hr.project.timely.Models;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.Date;

public class WorkSessionCommand {

    @NotBlank
    @Size(max = 50)
    private String name;

    private Date startDate;

    private Date endDate;

    public String getName() {
        return name;
    }

    public Date getStartDate() {
        return startDate;
    }

    public Date getEndDate() {
        return endDate;
    }


}
