package com.demo.dbOpr;

import com.demo.models.Student;
import com.demo.models.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;

@Repository
public class UserDao {
    @Autowired
    private JdbcTemplate jdbcTemplateObject;

    public List<Student> queryStudents(Student student) {
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
    }

    public void insertStudent(HashMap<String, Object> paraObj) throws SQLException {
        Object id = paraObj.get("id");
        Object name = paraObj.get("name");
        Object age = paraObj.get("age");
        Object[] paraArray = new Object[paraObj.size()];
        paraArray[0] = id;
        paraArray[1] = name;
        paraArray[2] = age;
        String SQL = "insert into Student (id,name, age) values (?,?, ?)";
        jdbcTemplateObject.update(SQL, paraArray);
    }

    /**
     * @author changle
     * Create Time: 2019年4月9日
     * Purpose:更新数据
     */
    public void updateStudent(Student student) throws SQLException {
        Object[] paraArray = new Object[3];
        paraArray[0] = student.getAge();
        paraArray[1] = student.getName();
        paraArray[2] = student.getId();
        String SQL = "update Student set age=?,name=? where id=?";
        jdbcTemplateObject.update(SQL, paraArray);
    }
    public List<Student> delelteStudent(Student student) throws SQLException {
        String SQL = "delete from Student where id =?";
        jdbcTemplateObject.update(SQL, student.getId());
        return this.queryStudents(student);
    }
}
