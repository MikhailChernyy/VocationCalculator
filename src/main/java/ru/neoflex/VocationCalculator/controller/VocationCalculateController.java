package ru.neoflex.VocationCalculator.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.neoflex.VocationCalculator.VocationCalculateServiceImpl;

@RestController
@RequiredArgsConstructor
public class VocationCalculateController {

    private final VocationCalculateServiceImpl service;

    @GetMapping("/calculate")
    public String calculateVocation(@RequestParam(value = "vocation", defaultValue = "0") Integer vocation,
                                    @RequestParam(value = "monthCount", defaultValue = "0") Integer monthCount) {
        return "<h1> Отпускные для сотрудника: " + (int) service.calculateVocation(vocation, monthCount) + "</h1>";
    }
}
