package hr.project.timely.Services;


import hr.project.timely.Models.WorkSessionCommand;
import hr.project.timely.Repositories.WorkSessionRepository;
import org.springframework.stereotype.Service;
import hr.project.timely.Models.WorkSession;

import java.util.List;
import java.util.Optional;

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

    @Override
    public Optional<WorkSession> addWorkSession(WorkSessionCommand workSessionCommand) {
        WorkSession workSession = new WorkSession(workSessionCommand.getName(),workSessionCommand.getStartDate(),workSessionCommand.getEndDate());
        Optional<WorkSession> workSessionOpt = Optional.of(workSessionRepository.save(workSession));
        return workSessionOpt;
    }
}
