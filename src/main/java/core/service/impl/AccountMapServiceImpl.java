package core.service.impl;

import core.dao.AccountMapMapper;
import core.service.AccountMapService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountMapServiceImpl implements AccountMapService {
    @Autowired
    private AccountMapMapper accountMapMapper;
}