package az.com.cybernet.notification.domain.entity.base;

import az.com.cybernet.notification.util.LocalDateTimeSerializer;
import az.com.cybernet.notification.util.LocalDatetimeDeserializer;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@MappedSuperclass
@Getter
@Setter
@ToString
@RequiredArgsConstructor
public abstract class AbstractEntity {
    @CreationTimestamp
    @Column(name = "created_at")
    @JsonDeserialize(using = LocalDatetimeDeserializer.class)
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    protected LocalDateTime createdAt;
    @UpdateTimestamp
    @Column(name = "updated_at")
    @JsonDeserialize(using = LocalDatetimeDeserializer.class)
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    protected LocalDateTime updatedAt;


}