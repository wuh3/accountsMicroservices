package com.eazybytes.accounts.service;

import com.eazybytes.accounts.dto.CustomerDto;
import org.springframework.stereotype.Service;

public interface IAccountsService {
    void createAccount(CustomerDto customerDto);

}
