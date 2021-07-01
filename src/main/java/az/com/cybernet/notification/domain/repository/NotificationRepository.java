package az.com.cybernet.notification.domain.repository;

import az.com.cybernet.notification.domain.entity.Account;
import az.com.cybernet.notification.domain.entity.Notification;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotificationRepository extends JpaRepository<Notification,Long> {
}
