package com.sans.core.controller;

import com.sans.common.BaseController;
import com.sans.common.file.FileUploadUtils;
import com.sans.common.util.ResultUtil;
import com.sans.common.util.TypeUtil;
import com.sans.core.entity.User;
import com.sans.core.service.UserService;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 *
 * @Auther: YaoZuoWei
 * @Date: 2020/04/29/15:58
 * @Description:
 */

/**
 * 用户
 */
@RequestMapping("/user")
@Controller
public class UserController extends BaseController {

    @Resource(name = "UserService")
    private UserService userService;

    /**
     * 用户列表
     * @return
     */
    @PreAuthorize("hasPermission('/findUser','system:user:view')")
    @RequestMapping(value = {"/findUser"})
    public String findUser(Model model){
        return "user/user";
    }

    /**
     * 个人信息
     */
    @RequestMapping(value = {"/profile"})
    public String profile(Model model)
    {
        User user = userService.getUserByuserLabel(getLoginName());
        model.addAttribute("user",user);
        return "user/profile";
    }

    /**
     * 修改头像界面
     */
    @RequestMapping(value = {"/profile/avatar"})
    public String profileAvatar(Model model)
    {
        User user = userService.getUserByuserLabel(getLoginName());
        model.addAttribute("user",user);
        return "user/avatar";
    }


    /**
     * 修改头像
     * @param file
     * @return
     */
    @PostMapping("/profile/avatar/updateAvatar")
    @ResponseBody
    public Map<String, Object> updateAvatar(@RequestParam("avatarfile") MultipartFile file)
    {
        User user = userService.getUserByuserLabel(getLoginName());
        try
        {
            if (!file.isEmpty())
            {
                String avatar = FileUploadUtils.upload(TypeUtil.getAvatarPath(), file);
                user.setExtra1(avatar);
                userService.updateUser(user);
                return ResultUtil.resultCode(200,"修改成功");
            }
            return ResultUtil.resultCode(500,"修改失败");
        }
        catch (Exception e)
        {
            return ResultUtil.resultCode(500,e.getMessage());
        }
    }

}
