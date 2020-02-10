package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import pojo.User;

import java.io.UnsupportedEncodingException;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

@Controller
public class HelloController {

    @RequestMapping("/hello")
    public ModelAndView handleRequest(javax.servlet.http.HttpServletRequest httpServletRequest, javax.servlet.http.HttpServletResponse httpServletResponse)
            throws Exception {
        ModelAndView mav = new ModelAndView("index");
        mav.addObject("message", "hello spring mvc");
        return mav;
    }

    /*@RequestMapping(value ="/param",method = POST)
    public ModelAndView getParam(javax.servlet.http.HttpServletRequest httpServletRequest,
                                 javax.servlet.http.HttpServletResponse httpServletResponse) throws UnsupportedEncodingException {
        httpServletRequest.setCharacterEncoding("utf-8");
        String userName = httpServletRequest.getParameter("userName");
        String password = httpServletRequest.getParameter("password");
        System.out.println("userName=" + userName + ",password=" + password);
        return null;
    }*/

    /*@RequestMapping(value ="/param",method = POST)
    public ModelAndView getParam(String userName,String password) {
        System.out.println("userName=" + userName + ",password=" + password);
        return null;
    }*/

    /*@RequestMapping(value ="/param",method = POST)
    public ModelAndView getParam(@RequestParam("userName") String userName, @RequestParam("password") String password) {
        System.out.println("userName=" + userName + ",password=" + password);
        return null;
    }*/

    @RequestMapping(value ="/param",method = POST)
    public ModelAndView getParam(User user) {
        System.out.println("User@userName=" + user.getUserName() + ",password=" + user.getPassword());
        return null;
    }

    @RequestMapping("/test")
    public ModelAndView getTest(javax.servlet.http.HttpServletRequest httpServletRequest,
                                javax.servlet.http.HttpServletResponse httpServletResponse) {
        ModelAndView mav= new ModelAndView("test");
        System.out.println(12344);
        return mav;
    }

    @RequestMapping("/value")
    public ModelAndView getValue(javax.servlet.http.HttpServletRequest request,javax.servlet.http.HttpServletResponse response){
        ModelAndView mav=new ModelAndView("test2");
        mav.addObject("message","sucess2");
        return mav;
    }

    @RequestMapping("/value2")
    public String getValue2(Model model){
        model.addAttribute("message","sucess3");
        return "test2";
    }

    @RequestMapping("/jump")
    public ModelAndView jump(){
        ModelAndView mav=new ModelAndView("redirect:/hello");
        return mav;
    }
    @RequestMapping("/jump2")
    public String jump2(){
        return "redirect:/hello";
    }
}
