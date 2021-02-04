package com.itheima.controller;


import com.alibaba.dubbo.config.annotation.Reference;
import com.itheima.constant.MessageConstant;
import com.itheima.entity.Result;
import com.itheima.pojo.CheckItem;
import com.itheima.service.checkItemService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 检查项管理
 * @author wang
 * @create 2021-02-04 21:47
 */
@RestController
@RequestMapping("/checkitem")
public class checkItemController {

    @Reference  //通过dobbo 查找服务
    private checkItemService checkItemService;

    @RequestMapping("/add")
    public Result add(@RequestBody CheckItem checkItem){

        try {
            checkItemService.add(checkItem);
        } catch (Exception e) {
            //添加失败
            e.printStackTrace();
            return new Result(false, MessageConstant.ADD_CHECKITEM_FAIL);
        }
        //添加成功
        return new Result(true,MessageConstant.ADD_CHECKITEM_SUCCESS);
    }


}
