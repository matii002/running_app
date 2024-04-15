package com.mateuszproszowski.runners.run;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController//oznaczamy kontroler bez tego klasa nie była by w stanie odpowiadać na żadania
@RequestMapping("/api/runs")//to co jest pod spodem znajduje się w katalogu nadrzędnym /api/runs
public class MVController {
    private final RunRepository runRepository;
    //@Autowired - wstrzyknięcie instancji klasy do konstruktora, dla starszych wersji
    public MVController(RunRepository runRepository){
        this.runRepository = runRepository;
    }
    @GetMapping("")//mapowanie punkt końcowy
    List<Run> findAll(){
        return runRepository.findAll();
    }
    @GetMapping("/{id}")//mapowanie punkt końcowy
    //@PathVariable można użyć do obsługi zmiennych szablonu w mapowaniu URL żądania i ustawienia ich jako parametrów metody
    Run findById(@PathVariable Integer id){
        return runRepository.findById(id);
    }
}
