package com.demo.rest;

import com.demo.models.Student;
import com.demo.models.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentDao {
    @Autowired  //自动根据配置文件中的属性设置 JdbcTemplate
    private JdbcTemplate jdbcTemplateObject;

    public List<Student> queryStudents(Student student) {
        try {
            StringBuffer sqlBuffer = new StringBuffer();
            sqlBuffer.append("select * from Student where 1=1");
            if (student.getId()!=null){
                sqlBuffer.append(" and ").append("id=").append(student.getId()).append("");
            }
            if (student.getName()!=null){
                sqlBuffer.append(" and ").append("name='").append(student.getName()).append("'");
            }
            List<Student> students = jdbcTemplateObject.query(sqlBuffer.toString(), new StudentMapper());
            return students;
        } catch (DataAccessException e) {
            e.printStackTrace();
        }
        return new ArrayList<Student>();
    }

    public void insertStudent(Student student)  {
        try {
            Object[] paraArray = new Object[3];
            paraArray[0] = student.getId();
            paraArray[1] = student.getName();
            paraArray[2] = student.getAge();
            String SQL = "insert into Student (id,name, age) values (?,?, ?)";
            jdbcTemplateObject.update(SQL, paraArray);
        } catch (DataAccessException e) {
            e.printStackTrace();
        }
    }

    /**
     * @author changle
     * Create Time: 2019年4月9日
     * Purpose:更新数据
     */
    public void updateStudent(Student student) {
        try {
            Object[] paraArray = new Object[3];
            paraArray[0] = student.getAge();
            paraArray[1] = student.getName();
            paraArray[2] = student.getId();
            String SQL = "update Student set age=?,name=? where id=?";
            jdbcTemplateObject.update(SQL, paraArray);
        }catch (Exception e){
            e.printStackTrace();
        }

    }
    public List<Student> delelteStudent(Student student) {
        try {
            String SQL = "delete from Student where id =?";
            jdbcTemplateObject.update(SQL, student.getId());
            return this.queryStudents(student);
        }catch (Exception e){
            e.printStackTrace();
        }
        return new ArrayList<Student>();
    }
}
