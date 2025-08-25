package controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import service.SportsService;

@RestController
public class SportsController {

    private final SportsService sportsService;

    public SportsController(SportsService sportsService) {
        this.sportsService = sportsService;
    }

    @GetMapping("/matches/live")
    public String getLiveMatches() {
        return sportsService.getLiveMatches();
    }
}
