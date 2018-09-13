package example.dao;

import example.pojo.Student;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentMapper {
   List<Student> getAll();
}
