package xyz.codedog.chapter4.dao;

import org.springframework.jdbc.core.JdbcTemplate;
import xyz.codedog.chapter4.pojo.Role;

import java.util.List;

/**
 * @ClassName RoleDao
 * @Description TODO
 * @Author Administrator
 * @Date 2020/4/16 19:55
 * @Version 1.0
 **/
public interface RoleDao {
    /**
     * 插入角色
     * @param jdbcTemplate
     * @return
     */
    public int insertRole(JdbcTemplate jdbcTemplate);

    /**
     * 删除角色
     * @param jdbcTemplate
     * @param id
     * @return
     */
    public int deleteRole(JdbcTemplate jdbcTemplate, Long id);

    /**
     * 更新角色信息
     * @param jdbcTemplate
     * @param role
     * @return
     */
    public int updateRole(JdbcTemplate jdbcTemplate, Role role);

    /**
     * 查询角色列表
     * @param jdbcTemplate
     * @param roleName
     * @return
     */
    public List<Role> findRole(JdbcTemplate jdbcTemplate, String roleName);

    /**
     * 执行多条SQL
     *
     * 使用ConnectionCallback接口进行回调
     * @param jdbcTemplate
     * @param id
     * @return
     */
    public Role getRoleByConnectionCallback(JdbcTemplate jdbcTemplate, Long id);

    /**
     * 使用StatementCallback接口进行回调
     * @param jdbcTemplate
     * @param id
     * @return
     */
    public Role getRoleStatementCallback(JdbcTemplate jdbcTemplate, Long id);
}
