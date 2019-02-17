package com.ktds.service;

import java.util.List;

import com.ktds.model.AdminModel;

public interface AdminService {

    public List<AdminModel> selectListAdmin(AdminModel adminModel);
    
}
