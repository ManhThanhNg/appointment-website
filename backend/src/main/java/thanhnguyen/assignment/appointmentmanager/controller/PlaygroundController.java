package thanhnguyen.assignment.appointmentmanager.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import thanhnguyen.assignment.appointmentmanager.models.Playground;
import thanhnguyen.assignment.appointmentmanager.service.PlaygroundService;

import java.util.List;

@RestController
@RequestMapping("/api/v1/playground")
public class PlaygroundController {
    private final PlaygroundService playgroundService;
    public PlaygroundController(PlaygroundService playgroundService) {
        this.playgroundService = playgroundService;
    }
    @GetMapping("/all")
    public ResponseEntity<List<Playground>> getAllPlaygrounds(){
        List<Playground> playgrounds = playgroundService.findAllPlaygrounds();
        return ResponseEntity.ok(playgrounds);
    }
    @PostMapping("/add")
    public ResponseEntity<Playground> addPlayground(@RequestBody Playground playground){
        Playground newPlayground = playgroundService.addPlayground(playground);
        return ResponseEntity.ok(newPlayground);
    }
}
