package com.imooc.course.client;

import com.imooc.course.entity.Course;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Primary;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;

/**
 * @Description: 课程列表的Feign客户端
 * @Author: Bentao She
 * @Email: harrypotterandsbt@gmail.com
 * @Date: 2022/2/20 11:52
 * @Version: V1.0
 **/
//明确是这个接口属于哪个模块
@FeignClient(value = "course-list", fallback = CourseListClientHystrix.class)
@Primary
public interface CourseListClient {

    //和 course-list模块的 的 service接口保持一致。
    @GetMapping("/courses")
    List<Course> courseList();
}
