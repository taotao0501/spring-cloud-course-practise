package com.imooc.course.service.Impl;

import com.imooc.course.dao.CourseMapper;
import com.imooc.course.entity.Course;
import com.imooc.course.service.CourseListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description: Course list service impl
 * @Author: Bentao She
 * @Email: harrypotterandsbt@gmail.com
 * @Date: 2021/8/29 11:36
 * @Version: V1.0
 **/

@Service
public class CourseListServiceImpl implements CourseListService {

    @Autowired
    CourseMapper courseMapper;

    @Override
    public List<Course> courseList() {
        return courseMapper.findValidCourses();
    }
}
