package com.imooc.course.dao;

import com.imooc.course.entity.Course;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Description: Course Mapper类
 * @Author: Bentao She
 * @Email: harrypotterandsbt@gmail.com
 * @Date: 2021/8/29 11:38
 * @Version: V1.0
 **/

@Mapper
@Repository
public interface CourseMapper {

    @Select("SELECT * FROM course WHERE valid = 1")
    List<Course> findValidCourses();
}
