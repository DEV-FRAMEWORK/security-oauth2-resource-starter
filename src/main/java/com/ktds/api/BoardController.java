package com.ktds.api;

import org.springframework.beans.factory.annotation.Autowired;
//import org.apache.commons.lang.StringUtils;
//import org.apache.commons.lang.math.NumberUtils;
//import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ktds.model.AdminModel;
import com.ktds.service.AdminService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class BoardController {

	@Autowired
	AdminService adminService;
	
    @RequestMapping("/list")
   // @PreAuthorize("hasAnyRole('ADMIN')")
    public Map<String, String> list(){
        Map<String, String > map = new HashMap<>();
        map.put("row","제대로 나오고 있어용 ");
       
        return map;
    }
    @RequestMapping("/selectListAdmin")
  //  @PreAuthorize("hasAnyRole('ADMIN')")
    public String selectListAdmin(@RequestParam Map<String, String> param, AdminModel adminModel, Model model) {

        List<AdminModel> list = adminService.selectListAdmin(adminModel);  
       
        System.out.println("addate : "+list.get(0).getAdminId());
    	return "OK";
    	
    }

}
