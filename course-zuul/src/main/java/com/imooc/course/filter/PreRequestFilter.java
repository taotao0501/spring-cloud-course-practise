package com.imooc.course.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Component;

/**
 * @Description: 网关前置过滤器 记录请求时间
 * @Author: Bentao She
 * @Email: harrypotterandsbt@gmail.com
 * @Date: 2022/2/22 14:01
 * @Version: V1.0
 **/
@Component
public class PreRequestFilter extends ZuulFilter {
    @Override
    public String filterType() {
        //过滤器类型 四种
        return FilterConstants.PRE_TYPE;
    }

    @Override
    public int filterOrder() {
        //确定顺序，只有1个，所以为0
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        //是否启动过滤器
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        //业务逻辑编写
        RequestContext currentContext = RequestContext.getCurrentContext();
        currentContext.set("startTime", System.currentTimeMillis());
        System.out.println("过滤器已经记录时间");
        return null;
    }
}
