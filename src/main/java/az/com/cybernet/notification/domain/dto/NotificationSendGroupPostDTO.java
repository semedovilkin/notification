package az.com.cybernet.notification.domain.dto;

import az.com.cybernet.notification.domain.enumeration.AccountGroupEnum;
import az.com.cybernet.notification.domain.enumeration.NotificationTypeEnum;
import az.com.cybernet.notification.domain.enumeration.NotificationTemplateEnum;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class NotificationSendGroupPostDTO {

    @JsonProperty("notification_types")
    private NotificationTypeEnum notificationTypes;

    @JsonProperty("notification_template")
    private NotificationTemplateEnum notificationTemplate;

    @JsonProperty("account_group")
    private AccountGroupEnum accountGroup;

    @JsonProperty("message")
    private String message;
}

