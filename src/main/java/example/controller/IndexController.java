package example.controller;

import example.pojo.Student;
import example.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/home")
public class IndexController {

    @Resource
    private StudentService studentService;

    @RequestMapping(value = "/index",method ={RequestMethod.POST,RequestMethod.GET})
    public String index(@RequestBody  StudentParam param, ModelMap modelMap) {
        return "index";
    }

    @RequestMapping(value = "/selectList",method ={RequestMethod.POST,RequestMethod.GET})
    @ResponseBody
    public List<Student> selectList(@RequestBody  StudentParam param, ModelMap modelMap) {
        List<Student> list = studentService.getAll();
        Student student=new Student();
        student.setAge(param.getAge());
        student.setGrade(param.getGrade());
        student.setName(param.getName());
        list.add(student);
      return list;
    }

}