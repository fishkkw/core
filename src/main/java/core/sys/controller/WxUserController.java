package core.sys.controller;

import core.sys.service.WxUserService;
import core.util.Msg;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/wxLogin")
public class WxUserController {
    private static final Logger logger = LoggerFactory.getLogger(WxUserController.class);

    @Autowired
    private WxUserService wxUserService;
    /**
     *
     * @param code
     * @return
     */
    @RequestMapping(value = "/WxUserLogin", method = RequestMethod.GET)
    public Msg login(String code, String encryptedData, String iv) {
        return wxUserService.wxUserLogin(code, encryptedData, iv);

    }
}
