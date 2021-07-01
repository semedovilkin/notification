package az.com.cybernet.notification.domain.repository;

import az.com.cybernet.notification.domain.entity.Subscription;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubscriptionRepository extends JpaRepository<Subscription,Long> {
}
