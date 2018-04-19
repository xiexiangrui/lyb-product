package com.lyb.product.auth.service;



import com.lyb.product.auth.entity.Menu;

import java.util.List;

public interface MenuService {

    List<Menu> findByUser(Integer userId);
}
