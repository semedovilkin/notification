package az.com.cybernet.notification.domain.entity;

import az.com.cybernet.notification.domain.entity.base.AbstractEntity;
import az.com.cybernet.notification.domain.enumeration.NotificationTemplateEnum;
import az.com.cybernet.notification.domain.enumeration.NotificationTypeEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

import static az.com.cybernet.notification.domain.entity.Notification.TABLE_NAME;
import static az.com.cybernet.notification.domain.entity.constant.DatabaseConstant.DEFAULT_SCHEMA;
import static az.com.cybernet.notification.domain.entity.constant.DatabaseConstant.JOIN_NOTIFICATION_ACTION;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = TABLE_NAME, schema = DEFAULT_SCHEMA)
public class Notification extends AbstractEntity {

    public static final String TABLE_NAME = "notification";

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private NotificationTypeEnum type;

    @Enumerated(EnumType.STRING)
    private NotificationTemplateEnum template;

    private String text;

    private String status;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = JOIN_NOTIFICATION_ACTION)
    private Set<NotificationAction> topics;

}
