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
 * 菜单
 */
@RequestMapping("/menu")
@Controller
public class Menucontroller extends BaseController {

    /**
     * 菜单列表
     * @return
     */
    @PreAuthorize("hasPermission('/findMenu','system:menu:view')")
    @RequestMapping(value = {"/findMenu"})
    public String findMenu(Model model){
        return "menu/menu";
    }
}
