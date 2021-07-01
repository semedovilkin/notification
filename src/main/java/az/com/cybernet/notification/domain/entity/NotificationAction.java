package az.com.cybernet.notification.domain.entity;

import az.com.cybernet.notification.domain.entity.base.AbstractEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

import static az.com.cybernet.notification.domain.entity.NotificationAction.TABLE_NAME;
import static az.com.cybernet.notification.domain.entity.constant.DatabaseConstant.DEFAULT_SCHEMA;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = TABLE_NAME, schema = DEFAULT_SCHEMA)
public class NotificationAction extends AbstractEntity {

    public static final String TABLE_NAME = "notification_action";

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDateTime sendDate;
    private String code;
    private String message;
}