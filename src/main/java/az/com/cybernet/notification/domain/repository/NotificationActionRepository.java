package az.com.cybernet.notification.domain.repository;

import az.com.cybernet.notification.domain.entity.Notification;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotificationActionRepository extends JpaRepository<Notification,Long> {
}
