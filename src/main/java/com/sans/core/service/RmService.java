package com.sans.core.service;

import com.sans.common.BaseService;
import com.sans.core.entity.Menu;
import com.sans.core.entity.MenuExample;
import com.sans.core.mapper.MenuMapper;
import com.sans.core.mapper.RmMapMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Auther: YaoZuoWei
 * @Date: 2020/04/29/14:51
 * @Description:
 */
@Service("RmService")
public class RmService extends BaseService {
    @Resource
    private RmMapMapper rmMapMapper;

    @Resource
    private MenuMapper menuMapper;

    /**
     * 根据用户获取菜单(含有子菜单)
     * @param userNo
     * @return
     */
    public List<Menu> findAllMenuByUserNo(String userNo){
        //获取用户拥有的菜单(包括子菜单和父级菜单)
        List<Menu> menusAll;
        if (userNo.equals("admin")){
            //管理员查看所有
            menusAll=menuMapper.selectByExample(new MenuExample());
        }else {
            menusAll=rmMapMapper.findAllMenuByUserNo(userNo);
        }

        //创建一个集合用于保存所有的主菜单
        List<Menu> rootMeun=new ArrayList<>();

        //遍历所有菜单集合,如果是主菜单的话直接放入rootMeun集合
        for (Menu menu : menusAll) {
            if (menu.getParentId().equals("00000000")){
                rootMeun.add(menu);
            }
        }
        //这个是遍历所有主菜单,分别获取所有主菜单的所有子菜单
        for (Menu menu : rootMeun) {
            List<Menu> childrenList=getchildrenMeun(menu.getMenuGuid(),menusAll);
            menu.setChildren(childrenList);
        }

        return rootMeun;
    }

    private List<Menu> getchildrenMeun(String menuGuid, List<Menu> menusAll) {
        //用于保存子菜单
        List<Menu> childrenList=new ArrayList<>();

        //遍历所有菜单
        for (Menu menu : menusAll) {
            //判断当前的菜单父id是否匹配
            if (menu.getParentId().equals(menuGuid)){
                childrenList.add(menu);
            }
        }

        //这里就是递归了，遍历所有的子菜单
        for (Menu menu:childrenList){
            menu.setChildren(getchildrenMeun(menu.getMenuGuid(),menusAll));
        }

        return childrenList;
    }

    /**
     * 根据用户获取菜单(不含子菜单)
     * @param userNo
     * @return
     */
    public List<Menu> findMenuByuser(String userNo){
        return rmMapMapper.findAllMenuByUserNo(userNo);
    }


}
