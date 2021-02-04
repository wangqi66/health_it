package com.itheima.dao;

import com.alibaba.dubbo.config.annotation.Service;
import com.itheima.entity.Result;
import com.itheima.pojo.CheckItem;
import com.itheima.service.checkItemService;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author wang
 * @create 2021-02-04 22:20
 */


public interface checkItemDao {
    public Result add(CheckItem checkitem);
}
