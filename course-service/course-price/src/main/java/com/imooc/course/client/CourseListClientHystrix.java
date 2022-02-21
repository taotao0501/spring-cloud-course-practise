package com.imooc.course.client;

import com.imooc.course.entity.Course;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @Description: Fegin调用CourseList的断路器实现类
 * @Author: Bentao She
 * @Email: harrypotterandsbt@gmail.com
 * @Date: 2022/2/21 16:42
 * @Version: V1.0
 **/
@Component
public class CourseListClientHystrix implements CourseListClient{
    @Override
    public List<Course> courseList() {
        List<Course> defaultCourses = new ArrayList<>();
        Course course = new Course();
        course.setId(1);
        course.setCourseId(1);
        course.setCourseName("默认课程");
        course.setValid(1);
        defaultCourses.add(course);
        return defaultCourses;

        //或者空列表
//        return Collections.emptyList();
    }
}
