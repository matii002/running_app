package com.mateuszproszowski.runners.run;
import java.time.LocalDateTime;
public record Run(//record tworzy konstruktor, gettery automatycznie
        Integer id,
        String title,
        LocalDateTime startedOn,
        LocalDateTime completedOn,
        Integer kilometers,
        Location location
){}