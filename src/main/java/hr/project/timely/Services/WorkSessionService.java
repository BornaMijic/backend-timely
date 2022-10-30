package hr.project.timely.Services;

import hr.project.timely.Models.WorkSession;
import hr.project.timely.Models.WorkSessionCommand;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

public interface WorkSessionService {
    List<WorkSession> getAllWorkSessions();
    Optional<WorkSession> addWorkSession(WorkSessionCommand workSessionCommand);
}
