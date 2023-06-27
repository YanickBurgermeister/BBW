package ch.bbw.yb.punchlist.model;

import lombok.Getter;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Getter
@Service
public class PunchListService {
    private List<PunchListItem> list = new ArrayList<>() {
        {
            try {
                add(new PunchListItem(false, "Start", "Jules nöd", "-", new SimpleDateFormat("yyyy-MM-dd").parse("2023-06-13")));
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
    };


}
