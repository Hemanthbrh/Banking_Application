package com.bank.applicatiom.controller;

import com.bank.applicatiom.constants.ApiEndPoints;
import com.bank.applicatiom.constants.OpenAPITags;
import com.bank.applicatiom.entity.AccountDetailsForm;
import com.bank.applicatiom.service.AccountDetailsFormService;
import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(ApiEndPoints.API_V1_ACCOUNT)
public class AccountDetailsFormController {

    private final AccountDetailsFormService accountDetailsFormServicent;

    public AccountDetailsFormController(AccountDetailsFormService accountDetailsFormServicent) {
        this.accountDetailsFormServicent = accountDetailsFormServicent;
    }

    @PostMapping(ApiEndPoints.ACCOUNT_CREATION)
    @Operation(summary = "Account creating Api",tags = OpenAPITags.ACCOUNT_CREATION)
    public ResponseEntity<AccountDetailsForm> createAccount(@RequestBody AccountDetailsForm accountDetailsForm){
        accountDetailsFormServicent.createAccount(accountDetailsForm);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
