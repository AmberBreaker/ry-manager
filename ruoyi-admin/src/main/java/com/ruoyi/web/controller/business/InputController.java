package com.ruoyi.web.controller.business;

import com.ruoyi.common.core.controller.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/business/input")
public class InputController extends BaseController {

    private static final String PREFIX = "business/input";

    @GetMapping()
    public String input() {
        return PREFIX + "/input";
    }


}
