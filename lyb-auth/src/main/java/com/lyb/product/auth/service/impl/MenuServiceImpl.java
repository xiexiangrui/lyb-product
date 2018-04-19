package com.lyb.product.auth.service.impl;

import com.lyb.product.auth.entity.Menu;
import com.lyb.product.auth.mapper.MenuMapper;
import com.lyb.product.auth.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;


/**
 * @program: lyb-product
 * @description:
 * @author: xiexiangrui
 * @create: 2018-04-13 16:35
 **/
@Service
public class MenuServiceImpl implements MenuService {
    @Autowired
    private MenuMapper menuMapper;
    @Override
    public List<Menu> findByUser(Integer userId) {
        return menuMapper.findByUser(userId);
    }
}
