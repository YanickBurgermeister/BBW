package ch.bbw.pr.tavern.model;

import lombok.Getter;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
@Getter
public class ReservationService {
    private final List<Reservation> reservationList = new ArrayList<>(
            Arrays.asList(new Reservation("Fabian", "Mathys", "lunch", "-"),
                    new Reservation("Julian", "Arschwanderer", "supper", "nur Salat"))
    );

}
