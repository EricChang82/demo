package com.demo.rest;

import com.demo.models.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.List;

/**
 * @author changle 
 * Create Time: 2019年4月9日 
 * Purpose:
 */
@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;
    /**
     * @author changle
     * Create Time: 2019年4月9日
     * Purpose:查询多条数据
     */
    @GetMapping(value="/student")
    public String listStudents(@ModelAttribute Student student) {
        List<Student> students =  studentService.queryStudents(student);
        StringBuffer retBuff= new StringBuffer();
        for (Student record : students) {
            retBuff.append("ID : " + record.getId());
            retBuff.append(",Name : " + record.getName());
            retBuff.append(",Age : " + record.getAge());
            retBuff.append("<br>");
        }
        return retBuff.toString();
    }
    /**
     *@author changle
     *Create Time: 2019年4月9日 
     *Purpose:写入数据
     */
    @PostMapping(value="/student/")
    public String insertStudent(@ModelAttribute Student student) throws SQLException {
        List<Student> retList= studentService.queryStudents(student);
        if (retList!=null&&retList.size()>0){
            return "id"+student.getId() +"已存在:"+retList.toString();
        }
        studentService.insertStudent(student);
        return "新增成功:"+studentService.queryStudents(student).toString();
    }

    /**
     *@author changle
     *Create Time: 2019年4月9日
     *Purpose:更新数据
     */
    @PutMapping(value="/student/")
    public String updateStudent(@ModelAttribute Student student) throws SQLException {
        studentService.updateStudent(student);
        return  "更新结果："+studentService.queryStudents(student).toString();
    }
    @DeleteMapping(value="/student/")
    public String deleteStudent(@ModelAttribute Student student) throws SQLException {
        List<Student> list =studentService.delelteStudent(student);
        return "删除成功!"+list.toString();
    }
}
