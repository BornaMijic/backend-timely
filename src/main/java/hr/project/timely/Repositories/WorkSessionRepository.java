package hr.project.timely.Repositories;

import hr.project.timely.Models.WorkSession;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface WorkSessionRepository extends JpaRepository<WorkSession, Long> {

    @Override
    List<WorkSession> findAll();

    @Override
    void deleteById(Long aLong);
}
