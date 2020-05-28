package com.sans.core.controller;

import com.sans.common.BaseController;
import com.sans.core.entity.Menu;
import com.sans.core.entity.User;
import com.sans.core.service.RmService;
import com.sans.core.service.UserService;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;


/**
 * Created with IntelliJ IDEA.
 *
 * @Auther: YaoZuoWei
 * @Date: 2020/04/26/12:12
 * @Description:
 */

/**
 * 首页
 */
@Controller
@RequestMapping("/index")
public class IndexController extends BaseController {

    @Resource(name = "RmService")
    private RmService rmService;

    @Resource(name = "UserService")
    private UserService userService;

    /**
     * 首页
     * @return
     */
    @RequestMapping(value = {"/toIndex"})
    public String toIndex(Model model){
        User user=userService.getUserByuserLabel(getLoginName());
        List<Menu> list=rmService.findAllMenuByUserNo(getLoginName());
        model.addAttribute("user",user);
        model.addAttribute("menus",list);
        return "index";
    }

    @RequestMapping(value = {"/main"})
    public String main(){
        return "main";
    }


    // 切换主题
    @GetMapping("/switchSkin")
    public String switchSkin(ModelMap mmap)
    {
        return "skin";
    }

    @RequestMapping(value = "/menu")
    @ResponseBody
    public List<Menu> menu(){
        List<Menu> list=rmService.findAllMenuByUserNo(getLoginName());
        return list;
    }


    @PreAuthorize("hasRole('SysAdmin')")
    @RequestMapping(value = {"/hello"})
    @ResponseBody
    public String hello(){
        return "hello,word"+getLoginName();
    }

    @PreAuthorize("hasRole('SysDomestic')")
    @RequestMapping(value = {"/hi"})
    @ResponseBody
    public String hi(){
        return "hi,word"+getLoginName();
    }

//    /**
//     * 管理端信息
//     * @Author Sans
//     * @CreateTime 2019/10/2 14:22
//     * @Return Map<String,Object> 返回数据MAP
//     */
//    @PreAuthorize("hasRole('ADMIN')")
//    @RequestMapping(value = "/info",method = RequestMethod.GET)
//    public Map<String,Object> userLogin(){
//        Map<String,Object> result = new HashMap<>();
//        SelfUserEntity userDetails = SecurityUtil.getUserInfo();
//        result.put("title","管理端信息");
//        result.put("data",userDetails);
//        return ResultUtil.resultSuccess(result);
//    }
//
//    /**
//     * 拥有ADMIN或者USER角色可以访问
//     * @Author Sans
//     * @CreateTime 2019/10/2 14:22
//     * @Return Map<String,Object> 返回数据MAP
//     */
//    @PreAuthorize("hasAnyRole('ADMIN','USER')")
//    @RequestMapping(value = "/list",method = RequestMethod.GET)
//    public Map<String,Object> list(){
//        Map<String,Object> result = new HashMap<>();
//        List<SysUserEntity> sysUserEntityList = sysUserService.list();
//        result.put("title","拥有用户或者管理员角色都可以查看");
//        result.put("data",sysUserEntityList);
//        return ResultUtil.resultSuccess(result);
//    }
//
//    /**
//     * 拥有ADMIN和USER角色可以访问
//     * @Author Sans
//     * @CreateTime 2019/10/2 14:22
//     * @Return Map<String,Object> 返回数据MAP
//     */
//    @PreAuthorize("hasRole('ADMIN') and hasRole('USER')")
//    @RequestMapping(value = "/menuList",method = RequestMethod.GET)
//    public Map<String,Object> menuList(){
//        Map<String,Object> result = new HashMap<>();
//        List<SysMenuEntity> sysMenuEntityList = sysMenuService.list();
//        result.put("title","拥有用户和管理员角色都可以查看");
//        result.put("data",sysMenuEntityList);
//        return ResultUtil.resultSuccess(result);
//    }
//
//
//    /**
//     * 拥有sys:user:info权限可以访问
//     * hasPermission 第一个参数是请求路径 第二个参数是权限表达式
//     * @Author Sans
//     * @CreateTime 2019/10/2 14:22
//     * @Return Map<String,Object> 返回数据MAP
//     */
//    @PreAuthorize("hasPermission('/admin/userList','sys:user:info')")
//    @RequestMapping(value = "/userList",method = RequestMethod.GET)
//    public Map<String,Object> userList(){
//        Map<String,Object> result = new HashMap<>();
//        List<SysUserEntity> sysUserEntityList = sysUserService.list();
//        result.put("title","拥有sys:user:info权限都可以查看");
//        result.put("data",sysUserEntityList);
//        return ResultUtil.resultSuccess(result);
//    }
//
//
//    /**
//     * 拥有ADMIN角色和sys:role:info权限可以访问
//     * @Author Sans
//     * @CreateTime 2019/10/2 14:22
//     * @Return Map<String,Object> 返回数据MAP
//     */
//    @PreAuthorize("hasRole('ADMIN') and hasPermission('/admin/adminRoleList','sys:role:info')")
//    @RequestMapping(value = "/adminRoleList",method = RequestMethod.GET)
//    public Map<String,Object> adminRoleList(){
//        Map<String,Object> result = new HashMap<>();
//        List<SysRoleEntity> sysRoleEntityList = sysRoleService.list();
//        result.put("title","拥有ADMIN角色和sys:role:info权限可以访问");
//        result.put("data",sysRoleEntityList);
//        return ResultUtil.resultSuccess(result);
//    }
}
