package controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;
import service.SportsService;

@RestController
public class SportsController {

    private final SportsService sportsService;

    public SportsController(SportsService sportsService) {
        this.sportsService = sportsService;
    }

    @GetMapping("/matches/live")
    public ResponseEntity<Object> getLiveMatches() {
        Object data = sportsService.fetchSportsData();
        return ResponseEntity.ok(data); // Always returns JSON
    }
}
