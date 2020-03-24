package xyz.codedog.chapter5.mapper;

import xyz.codedog.chapter5.pojo.WorkCard;

/**
 * @InterfaceName WoekCardMapper
 * @Description TODO
 * @Author panda
 * @Date 2020/3/23 下午7:38
 * @Version 1.0
 **/
public interface WorkCardMapper {

    public WorkCard getWorkCardByEmpId(Long empId);
}
