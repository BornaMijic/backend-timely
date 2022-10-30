package hr.project.timely.Controllers;

import hr.project.timely.Models.WorkSession;
import hr.project.timely.Services.WorkSessionService;
import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("workSession")
@CrossOrigin(origins = "http://localhost:4200")
public class WorkSessionController {

    private final WorkSessionService workSessionService;

    public WorkSessionController(WorkSessionService workSessionService) {
        this.workSessionService = workSessionService;
    }

    @GetMapping
    public List<WorkSession> getAllWorkSessions() {
        return this.workSessionService.getAllWorkSessions();
    }

}
