package com.itheima.service;

import com.itheima.entity.Result;
import com.itheima.pojo.CheckItem;
import org.springframework.stereotype.Service;

/**
 * 检查项管理服务接口
 * @author wang
 * @create 2021-02-04 21:55
 */


public interface checkItemService {
    public void add(CheckItem checkitem);
}
