package xyz.codedog.chapter5.mapper;

import xyz.codedog.chapter5.pojo.Employee;

/**
 * @InterfaceName EmployeeMapper
 * @Description TODO
 * @Author panda
 * @Date 2020/3/24 下午4:12
 * @Version 1.0
 **/
public interface EmployeeMapper {
    public Employee getEmployee(long id);

    public Employee getEmployee2(long id);
}
