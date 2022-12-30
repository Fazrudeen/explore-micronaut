package explore.micronaut.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.micronaut.core.annotation.Introspected;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Introspected
@JsonIgnoreProperties(ignoreUnknown = true)
public class UserRequest {

    @JsonProperty("user_id")
    private Integer id;

    @JsonProperty("first_name")
    private String firstName;

}