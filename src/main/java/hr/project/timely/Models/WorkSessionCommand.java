package hr.project.timely.Models;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.Date;

public class WorkSessionCommand {

    @NotBlank
    @Size(max=50)
    private String name;

    @JsonFormat(pattern="yyyy-MM-dd'T'HH:mm:ss")
    private Date startDate;

    @JsonFormat(pattern="yyyy-MM-dd'T'HH:mm:ss")
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
