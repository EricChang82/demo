package com.demo.transaction;

import com.demo.models.Student;
import com.demo.rest.StudentService;
import com.demo.utils.Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TransactionController {
    @Autowired
    private StudentService studentService;

    /**
     * @author changle
     * Create Time: 2019年4月9日
     * Purpose:写入数据
     */
    @Transactional   //事务控制，异常报错，退出不更新
    @PostMapping("/updateStudent_withT")
    public void updateStudent_withT(@ModelAttribute Student student) {
        modifyStudentInfo(student);
    }

    //非事务控制，异常报错，只更新第一次
    @PostMapping("/updateStudentTrans_WOT")
    public void updateStudentTrans_WOT(@ModelAttribute Student student) {
        modifyStudentInfo(student);
    }

    public void modifyStudentInfo(Student student) {
        studentService.updateStudent(student);
        Util.print(1 / 0);
        student.setAge(33);
        studentService.updateStudent(student);

    }
}
