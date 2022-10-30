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
        WorkSession workSession = new WorkSession(workSessionCommand.getName(), workSessionCommand.getStartDate(), workSessionCommand.getEndDate());
        return Optional.of(workSessionRepository.save(workSession));
    }

    @Override
    public Optional<WorkSession> updateWorkSession(Long id, WorkSessionCommand workSessionCommand) {
        WorkSession workSession = new WorkSession(id, workSessionCommand.getName(), workSessionCommand.getStartDate(), workSessionCommand.getEndDate());
        return Optional.of(workSessionRepository.save(workSession));
    }

    @Override
    public void deleteWorkSessionById(Long id) {
        this.workSessionRepository.deleteById(id);
    }
}
