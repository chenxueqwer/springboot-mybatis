package com.cx.controller;

import com.cx.entity.User;
import com.cx.service.UserService;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.WebRequest;
import javax.annotation.Resource;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

//@RestController
//@RequestMapping("/user")
@Controller
public class UserController {
    @Resource
    private UserService userService;

    @RequestMapping("/")
    public String getAll(Model model){
        List<User> list = userService.getAll();
        model.addAttribute("userList",list);
        System.out.println(list.get(1).getRegtime());
        return "user/user_view";
    }

    @RequestMapping("/getOne")
    public User getOne(Long id){
        return userService.getOne(id);
    }

    @RequestMapping("/toAdd")
    public String toAdd(){
        return "user/user_add";
    }

    @RequestMapping("/insert")
    public String insert(User user){
        System.out.println(user.getRegtime());
        userService.insert(user);
        return "redirect:/";//重定向的是后台方法路径
    }

    @RequestMapping("/toEdit")
    public String toEdit(Model model,Long id){
        User user = getOne(id);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        user.setMark(sdf.format(user.getRegtime()));
        model.addAttribute("user",user);
        return "user/user_edit";
    }

    @RequestMapping("/update")
    public String update(User user){
        userService.update(user);
        return "redirect:/";
    }

    @RequestMapping("/delete")
    public String delete(Long id){
        userService.delete(id);
        return "redirect:/";
    }

    /**
     * 处理前台传入时间
     * @param binder
     * @param request
     */
    //WebDataBinder是用来绑定请求参数到指定的属性编辑器.由于前台传到controller里的值是String类型的，当往Model里Set这个值的时候，
    // 如果set的这个属性是个对象，Spring就会去找到对应的editor进行转换，然后再SET进去。
    @InitBinder
    public void initBinder(WebDataBinder binder, WebRequest request) {
        //转换日期
        DateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");
        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));// CustomDateEditor为自定义日期编辑器
    }
}
