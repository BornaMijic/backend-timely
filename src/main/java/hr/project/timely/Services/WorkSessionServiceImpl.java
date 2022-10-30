package hr.project.timely.Services;

import hr.project.timely.Models.WorkSession;
import hr.project.timely.Repositories.WorkSessionRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Service
public class WorkSessionServiceImpl implements WorkSessionService {

    private final WorkSessionRepository workSessionRepository;

    public WorkSessionServiceImpl(WorkSessionRepository workSessionRepository) {
        this.workSessionRepository = workSessionRepository;
    }

    @Override
    public List<WorkSession> getAllWorkSessions() {
        return this.workSessionRepository.findAll();
    }
}
