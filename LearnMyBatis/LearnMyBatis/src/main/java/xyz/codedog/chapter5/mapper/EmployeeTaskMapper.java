package xyz.codedog.chapter5.mapper;

import xyz.codedog.chapter5.pojo.Employee;
import xyz.codedog.chapter5.pojo.EmployeeTask;

/**
 * @InterfaceName EmployeeTaskMapper
 * @Description TODO
 * @Author panda
 * @Date 2020/3/23 下午7:53
 * @Version 1.0
 **/
public interface EmployeeTaskMapper {
    public EmployeeTask getEmployeeTaskByEmpId(Long id);
}
