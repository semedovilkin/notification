package az.com.cybernet.notification.web.rest;

import az.com.cybernet.notification.domain.dto.AccountHistoryResponseDTO;
import az.com.cybernet.notification.domain.dto.AccountPostDTO;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequiredArgsConstructor
@RequestMapping("v1/account")
public class AccountController {
    @ApiOperation(value = "Create account", nickname = "createAccount",response = Object.class, tags = {"notification",})
    public ResponseEntity<Object> createAccount(@ApiParam(value = "Created account object", required = true) @Valid @RequestBody AccountPostDTO body ) {
        return null;
    }

    @ApiOperation(value = "Get account history", nickname = "getAccountHistory",response = AccountHistoryResponseDTO.class, tags = {"notification",})
    @GetMapping("/{accountId}")
    public ResponseEntity<AccountHistoryResponseDTO> getAccountHistory(@ApiParam(value = "", required = true) @PathVariable("accountId") String accountId) {
        return null;
    }

}
