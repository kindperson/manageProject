package example.controller;

import example.pojo.Student;
import example.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/home")
public class IndexController {

    @Resource
    private StudentService studentService;
    @RequestMapping("/index")
    public String index() {
        List<Student> list = studentService.getAll();
        System.out.printf(list.size()+"");
        return "index";
    }
}