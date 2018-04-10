package com.lyb.product.auth.feign;

import com.lyb.product.auth.feign.fallback.UserServiceFallbackImpl;
import com.lyb.product.common.vo.UserVo;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "user-service",fallback = UserServiceFallbackImpl.class)
public interface UserService {


    /**
     * 用户名查询
     * @param userNamed
     * @return
     */
    @GetMapping("/account/findByName/{userName}")
    UserVo findUserByName(@PathVariable("userName") String userNamed);

}
