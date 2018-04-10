package com.lyb.product.auth.feign.fallback;

import com.lyb.product.auth.feign.UserService;
import com.lyb.product.common.vo.UserVo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * @program: lyb-product
 * @description:
 * @author: xiexiangrui
 * @create: 2018-04-10 17:20
 **/
@Service
public class UserServiceFallbackImpl implements UserService {
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    @Override
    public UserVo findUserByName(String userNamed) {
        logger.error("调用{}异常:{}", "findUserByUsername", userNamed);
        return null;
    }
}
