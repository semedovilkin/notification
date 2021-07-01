package az.com.cybernet.notification.web.rest;

import az.com.cybernet.notification.domain.dto.NotificationPostDTO;
import az.com.cybernet.notification.domain.dto.NotificationResponseDTO;
import az.com.cybernet.notification.domain.dto.NotificationResponsePostDTO;
import az.com.cybernet.notification.domain.dto.NotificationSendGroupPostDTO;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequiredArgsConstructor
@RequestMapping("v1/notification")
public class NotificationController {

    @ApiOperation(value = "Get notification", nickname = "getNotification", response = NotificationResponseDTO.class, tags = {"notification",})
    @GetMapping("/{notificationId}")
    public ResponseEntity<NotificationResponseDTO> getNotification(@ApiParam(value = "", required = true) @PathVariable("notificationId") String notificationId) {
        return null;
    }

    @ApiOperation(value = "Notification response", nickname = "response",tags = {"notification",})
    @PostMapping("/response")
    public ResponseEntity<Void> response(@ApiParam(value = "Send notification object", required = true) @Valid @RequestBody NotificationResponsePostDTO body) {
        return null;
    }

    @ApiOperation(value = "Send Group notification", nickname = "sendGroupNotification", response = Object.class, tags = {"notification",})
    @PostMapping("/group/send")
    public ResponseEntity<Object> sendGroupNotification(@ApiParam(value = "Send group notification object", required = true) @Valid @RequestBody NotificationSendGroupPostDTO body) {
        return null;
    }

    @ApiOperation(value = "Send notification", nickname = "sendNotification",  response = Object.class, tags = {"notification",})
    @PostMapping("/send")
    public ResponseEntity<Object> sendNotification(@ApiParam(value = "Send notification object", required = true) @Valid @RequestBody NotificationPostDTO body) {
        return null;
    }

}
