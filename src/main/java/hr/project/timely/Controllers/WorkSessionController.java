package hr.project.timely.Controllers;

import hr.project.timely.Models.WorkSession;
import hr.project.timely.Models.WorkSessionCommand;
import hr.project.timely.Services.WorkSessionService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("work-sessions")
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

    @PostMapping
    public ResponseEntity<WorkSession> addWorkSession(@RequestBody @Valid WorkSessionCommand workSessionCommand) {
        Optional<WorkSession> workSessionOptional = this.workSessionService.addWorkSession(workSessionCommand);
        if(workSessionOptional.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.CONFLICT);
        } else {
            return  new ResponseEntity<>(workSessionOptional.get(), HttpStatus.OK);
        }

    }

    @DeleteMapping("/{id}")
    @ResponseStatus(code = HttpStatus.OK, reason = "OK")
    public void deleteWorkSessionById(@PathVariable Long id) {
        this.workSessionService.deleteWorkSessionById(id);
    }

}
