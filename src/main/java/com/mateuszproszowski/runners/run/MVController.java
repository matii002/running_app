package com.mateuszproszowski.runners.run;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/runs")
public class MVController {
    private final RunRepository runRepository;
    public MVController(RunRepository runRepository){
        this.runRepository = runRepository;
    }
    @GetMapping("")
    List<Run> findAll(){
        return runRepository.findAll();
    }
    @GetMapping("/{id}")
    Run findById(@PathVariable Integer id){
        return runRepository.findById(id);
    }
}
