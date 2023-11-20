package thanhnguyen.assignment.appointmentmanager.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import thanhnguyen.assignment.appointmentmanager.models.Playground;
import thanhnguyen.assignment.appointmentmanager.repo.PlaygroundRepo;

import java.util.List;

@Service
public class PlaygroundService {
    private final PlaygroundRepo playgroundRepo;

    @Autowired
    public PlaygroundService(PlaygroundRepo playgroundRepo) {
        this.playgroundRepo = playgroundRepo;
    }
    public Playground addPlayground(Playground playground){
        return playgroundRepo.save(playground);
    }
    public List<Playground> findAllPlaygrounds(){
        return playgroundRepo.findAll();
    }
}
