package az.com.cybernet.notification.service;

import az.com.cybernet.notification.domain.dto.AccountHistoryResponseDTO;
import az.com.cybernet.notification.domain.dto.AccountPostDTO;

public interface AccountService {
    void createAccount(AccountPostDTO accountDto);

    AccountHistoryResponseDTO getAccountHistory(long  id);
}
