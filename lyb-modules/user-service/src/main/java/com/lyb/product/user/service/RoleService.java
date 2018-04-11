package com.lyb.product.user.service;

import com.github.pagehelper.Page;
import com.lyb.product.user.entity.Role;

import java.util.List;

public interface RoleService {
    int addRole(Role role);

    int deleteRole(Integer id);

    int updateRole(Role role);

    Role findById(Integer id);

    List<Role> findAll();

    Page<Role> findByPage(int pageNo,int pageSize);
}
