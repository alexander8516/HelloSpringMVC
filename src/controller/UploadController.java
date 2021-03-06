package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UploadController {

    @RequestMapping("/upload")
    public void upload(@RequestParam("picture") MultipartFile picture){
        System.out.println(picture.getOriginalFilename());
        System.out.println(picture.getName());
    }

    @RequestMapping("/testupload")
    public ModelAndView upload(){
        return new ModelAndView("upload");
    }
}
