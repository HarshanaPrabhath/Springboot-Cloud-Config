package com.info.configdemo;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@ConfigurationProperties(prefix = "build")
@Data
@RefreshScope
public class BuildInfoController {

//    @Value("${build.id}")
    private String Id;

//    @Value("${build.version}")
    private String Version;

//    @Value("${build.name}")
    private String Name;

    @GetMapping("/build-info")
    public String buildInfo(){
        return "Build ID: " + Id + " Build Version: " + Version + " Build Name: " + Name  ;
    }
}
