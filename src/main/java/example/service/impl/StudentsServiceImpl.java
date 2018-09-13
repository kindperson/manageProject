package example.service.impl;

import example.dao.StudentMapper;
import example.pojo.Student;
import example.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: wb-tjh438466
 * @date: 2018/8/10
 * @since: 1
 * description:
 */
@Service
public class StudentsServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;
    @Override
    public List<Student> getAll() {
        return studentMapper.getAll();
    }
}
