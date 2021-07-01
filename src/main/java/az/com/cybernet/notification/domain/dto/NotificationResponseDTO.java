package az.com.cybernet.notification.domain.dto;

import az.com.cybernet.notification.domain.enumeration.NotificationTypeEnum;
import az.com.cybernet.notification.domain.enumeration.NotificationTemplateEnum;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class NotificationResponseDTO {
    @JsonProperty("notification_id")
    private Long notificationId;

    @JsonProperty("notification_types")
    private NotificationTypeEnum notificationTypes;

    @JsonProperty("notification_template")
    private NotificationTemplateEnum notificationTemplate;

    @JsonProperty("notification_text")
    private String notificationText;

    @JsonProperty("notification_status")
    private String notificationStatus;

    @JsonProperty("actions")
    private List<NotificationActionResponseDTO> actions;
}

