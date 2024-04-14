package com.mateuszproszowski.runners.run;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController//oznaczamy kontroler bez tego klasa nie była by w stanie odpowiadać na żadania
@RequestMapping("/api/runs")
public class MVController {
    private final RunRepository runRepository;

    public MVController(RunRepository runRepository){
        this.runRepository = runRepository;
    }
    @GetMapping("")
    List<Run> finAll(){
        return runRepository.findAll();
    }
    @GetMapping("/{id}")
    //@PathVariable można użyć do obsługi zmiennych szablonu w mapowaniu URI żądania i ustawienia ich jako parametrów metody
    Run findById(@PathVariable Integer id){
        return runRepository.findById(id);
    }
//    private List<Run> runs = new ArrayList<>();
   /* @GetMapping("/hello") //rodzaj mapowania rządanie = GET mapowanie na /helllo
    String home(){
        return "Cześć, biegaczu!";
    }*/
}
