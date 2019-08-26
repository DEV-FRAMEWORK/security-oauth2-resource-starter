package com.ktds.api;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class BoardController {

    @RequestMapping("/list")
    @PreAuthorize("hasAnyRole('ADMIN')")
    public Map<String, String> list(){
        Map<String, String > map = new HashMap<>();
        map.put("row","Description");
        map.put("1","Access Success to Resource Server");
        map.put("2","리소스 서버에 접근 성공하셨니다.");
        return map;
    }
}
