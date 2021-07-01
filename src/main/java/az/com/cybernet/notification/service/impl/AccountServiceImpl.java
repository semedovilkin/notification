package az.com.cybernet.notification.service.impl;

import az.com.cybernet.notification.domain.dto.AccountHistoryResponseDTO;
import az.com.cybernet.notification.domain.dto.AccountPostDTO;
import az.com.cybernet.notification.domain.entity.Account;
import az.com.cybernet.notification.domain.mapper.AccountHistoryMapper;
import az.com.cybernet.notification.domain.mapper.AccountMapper;
import az.com.cybernet.notification.domain.repository.AccountRepository;
import az.com.cybernet.notification.exception.AccountNotFoundException;
import az.com.cybernet.notification.service.AccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class AccountServiceImpl implements AccountService {
    private final AccountRepository accountRepository;

    @Transactional
    @Override
    public void createAccount(AccountPostDTO accountDto) {
        Account account = AccountMapper.INSTANCE.dtoToEntity(accountDto);
        accountRepository.save(account);
    }

    @Transactional
    @Override
    public AccountHistoryResponseDTO getAccountHistory(long id) {
        Account account = accountRepository.findById(id).orElseThrow(() -> new AccountNotFoundException(id));
        return AccountHistoryMapper.INSTANCE.entityToDto(account);
    }
}
