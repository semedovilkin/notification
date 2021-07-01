package az.com.cybernet.notification.domain.dto;

import az.com.cybernet.notification.domain.enumeration.NotificationTypeEnum;
import az.com.cybernet.notification.domain.enumeration.NotificationTemplateEnum;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class AccountHistoryListResponseDTO {
    @JsonProperty("notification_id")
    private int notificationId;

    @JsonProperty("notification_types")
    private NotificationTypeEnum notificationTypes;

    @JsonProperty("notification_template")
    private NotificationTemplateEnum notificationTemplate;

    @JsonProperty("notification_text")
    private String notificationText;

    @JsonProperty("notification_status")
    private String notificationStatus;

    @JsonProperty("create_date")
    private LocalDateTime createAt;

    @JsonProperty("send_date")
    private LocalDateTime sendDate;
}

