package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import pojo.UserForm;
import service.UserService;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/user")
public class UserController {

    private UserService userService;
    @Autowired
    public UserService setUserService(){
        return userService;
    }

    @RequestMapping("/login")
    public String login(UserForm user, HttpSession session, Model model){
        if(userService.login(user)){
            session.setAttribute("u",user) ;
            return "redirect:main";
        }
        model.addAttribute("messageError", "用户名或密码错误");
        return "login";
    }

    @RequestMapping("/register")
    public String register(UserForm user,Model model){
        if (userService.register(user)) {
            return "redirect:/index/login"; // 注册成功，跳转到 login.jsp
        } else {
            // 在register.jsp页面上可以使用EL表达式取出model的uname值
            model.addAttribute("uname", user.getUname());
            return "register";
        }
    }

    @RequestMapping("/main")
    public String main(){
        return "main";
    }
}
