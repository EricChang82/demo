package com.demo.dbOpr.jdbcTempleteDemo.update;

import com.demo.dbOpr.jdbcTempleteDemo.query.QueryController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;


/**
 * @author changle 
 * Create Time: 2019年4月9日 
 * Purpose:多种update demo
 */
@RestController
public class UpdateController {
    @Autowired 
    private JdbcTemplate jdbcTemplateObject;
    @Autowired 
    private QueryController queryController;

    /**
     *@author changle
     *Create Time: 2019年4月9日 
     *Purpose:更新数据
     */
    @GetMapping("/dbOpr/jdbcTempleteDemo/updateStudent")
    public String updateStudent() throws SQLException {
        String SQL = "update Student set age=? where name=?";
        jdbcTemplateObject.update(SQL, 101, "a");
        return queryController.getStudent("a");
    }

}
