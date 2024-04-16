package com.mateuszproszowski.runners.run;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Repository;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

@Repository
public class RunRepository {

    private List<Run> runs = new ArrayList<>();
    List<Run> findAll(){
        return runs;
    }
    Run findById(Integer id){
        return runs.stream()
                .filter(run -> run.id() == id) //id() - getter
                .findFirst()//zwrca opcjonalną wersje lub pusty
                .get();
    }
    @PostConstruct
    private void init(){
        runs.add(new Run(1,"Tuesday running", LocalDateTime.now(),LocalDateTime.now().plus(30, ChronoUnit.MINUTES),5,Location.INDOOR));
        runs.add(new Run(2,"Friday running", LocalDateTime.now(),LocalDateTime.now().plus(37, ChronoUnit.MINUTES),6,Location.OUTDOOR));
    }


}
