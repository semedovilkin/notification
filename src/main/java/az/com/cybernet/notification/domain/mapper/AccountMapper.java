package az.com.cybernet.notification.domain.mapper;

import az.com.cybernet.notification.domain.dto.AccountHistoryResponseDTO;
import az.com.cybernet.notification.domain.dto.AccountPostDTO;
import az.com.cybernet.notification.domain.entity.Account;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface AccountMapper {

    AccountMapper INSTANCE = Mappers.getMapper(AccountMapper.class);

    AccountPostDTO entityToDto(Account account);

    Account dtoToEntity(AccountPostDTO dto);

}