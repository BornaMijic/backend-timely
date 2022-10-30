package hr.project.timely.Services;

import hr.project.timely.Models.WorkSession;
import org.springframework.stereotype.Service;

import java.util.List;

public interface WorkSessionService {
    List<WorkSession> getAllWorkSessions();
}
