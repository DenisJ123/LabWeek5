package ie.atu.week5;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class TodoResponse {
    @JsonProperty("userId")
    private int userId;

    @JsonProperty("Id")
    private int Id;

    @JsonProperty("Title")
    private int title;

    @JsonProperty("completed")
    private int completed;
}
