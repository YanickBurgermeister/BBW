package ch.bbw.yb.punchlist.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class PunchListItem {
    private boolean done;
    private String category;
    private String responsible;
    private String description;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date endDate;

    public PunchListItem() {
        category = "Start";
        endDate = new Date();
    }
}
