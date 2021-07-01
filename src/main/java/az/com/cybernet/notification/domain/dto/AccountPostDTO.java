package az.com.cybernet.notification.domain.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AccountPostDTO {
    @JsonProperty("phone")
    private String phone;

    @JsonProperty("email")
    private String email ;
}

