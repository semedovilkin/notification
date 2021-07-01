package az.com.cybernet.notification.domain.dto;

import az.com.cybernet.notification.domain.enumeration.NotificationTemplateEnum;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class NotificationPostDTO {

    @JsonProperty("account_id")
    private Long accountId;

    @JsonProperty("notifcation_template")
    private NotificationTemplateEnum notificationTemplate;

    @JsonProperty("message")
    private String message;
}

