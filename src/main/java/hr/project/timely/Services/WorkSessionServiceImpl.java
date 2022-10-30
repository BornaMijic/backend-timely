package hr.project.timely.Services;


import hr.project.timely.Repositories.WorkSessionRepository;
import org.springframework.stereotype.Service;
import hr.project.timely.Models.WorkSession;

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
