package core.controller;

import core.service.AccountMapService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("accountMap")
public class AccountMapController {
    @Autowired
    private AccountMapService accountMapService;
}