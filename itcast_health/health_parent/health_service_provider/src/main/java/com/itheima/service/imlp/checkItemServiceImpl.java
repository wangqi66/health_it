package com.itheima.service.imlp;


import com.alibaba.dubbo.config.annotation.Service;
import com.itheima.dao.checkItemDao;
import com.itheima.pojo.CheckItem;
import com.itheima.service.checkItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author wang
 * @create 2021-02-04 22:17
 */

@Service(interfaceClass = checkItemService.class)
@Transactional
public class checkItemServiceImpl implements checkItemService {

    @Autowired
    private checkItemDao checkItemDao;

    @Override
    public void add(CheckItem checkitem) {
         checkItemDao.add(checkitem);

    }
}
