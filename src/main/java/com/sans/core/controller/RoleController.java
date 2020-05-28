package com.sans.core.controller;

import com.sans.common.BaseController;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created with IntelliJ IDEA.
 *
 * @Auther: YaoZuoWei
 * @Date: 2020/04/29/15:58
 * @Description:
 */

/**
 * 角色
 */
@RequestMapping("/role")
@Controller
public class RoleController extends BaseController {
    /**
     * 角色列表
     * @return
     */
    @PreAuthorize("hasPermission('/findRole','system:role:view')")
    @RequestMapping(value = {"/findRole"})
    public String findRole(Model model){
        return "role/role";
    }
}
