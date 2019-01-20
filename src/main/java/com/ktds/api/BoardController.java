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
        map.put("row","제대로 나오고 있어용 ");
        return map;
    }
}
