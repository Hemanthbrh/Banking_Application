package com.bank.applicatiom.service.impl;

import com.bank.applicatiom.entity.AccountDetailsForm;
import com.bank.applicatiom.repository.AccountDetailsRepo;
import com.bank.applicatiom.service.AccountDetailsFormService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AccountDetailsFormServiceimpl implements AccountDetailsFormService {

    private final AccountDetailsRepo accountDetailsRepo;

    public AccountDetailsFormServiceimpl(AccountDetailsRepo accountDetailsRepo) {
        this.accountDetailsRepo = accountDetailsRepo;
    }

    @Override
    public void createAccount(AccountDetailsForm accountDetailsForm) {
        accountDetailsRepo.save(accountDetailsForm);
    }
}
