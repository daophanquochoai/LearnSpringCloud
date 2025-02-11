package com.learnmicro.limitsservice;

import com.learnmicro.limitsservice.bean.LimitsConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsConfigurationController {

    @Autowired
    private Configuration configuration;

    @GetMapping("/limits")
    public LimitsConfiguration retrievelimitsFromConfiguration(){
        return new LimitsConfiguration(configuration.getMaximun(), configuration.getMinimun());
    }
}
