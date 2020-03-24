package xyz.codedog.chapter5.mapper;

import xyz.codedog.chapter5.pojo.Task;

/**
 * @InterfaceName TaskMapper
 * @Description TODO
 * @Author panda
 * @Date 2020/3/23 下午7:38
 * @Version 1.0
 **/
public interface TaskMapper {

    public Task getTask(Long id);
}
