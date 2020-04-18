package xyz.codedog.chapter4.dao.impl;

import org.springframework.jdbc.core.JdbcTemplate;
import xyz.codedog.chapter4.dao.RoleDao;
import xyz.codedog.chapter4.pojo.Role;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;

/**
 * @ClassName RoleDaoImpl
 * @Description TODO
 * @Author Administrator
 * @Date 2020/4/16 19:58
 * @Version 1.0
 **/
public class RoleDaoImpl implements RoleDao {
    /**
     * 插入角色
     * @param jdbcTemplate
     * @return
     */
    @Override
    public int insertRole(JdbcTemplate jdbcTemplate) {
        String roleName = "role_name_1";
        String note = "note_1";
        String sql = "insert into t_role(role_name,note) values(?,?)";
        return jdbcTemplate.update(sql,roleName,note);
    }

    /**
     * 珊瑚角色
     * @param jdbcTemplate
     * @param id
     * @return
     */
    @Override
    public int deleteRole(JdbcTemplate jdbcTemplate, Long id) {
        String sql = "delete from t_role where id = ?";
        return jdbcTemplate.update(sql,id);
    }

    /**
     * 更新角色信息
     * @param jdbcTemplate
     * @param role
     * @return
     */
    @Override
    public int updateRole(JdbcTemplate jdbcTemplate, Role role) {
        String sql = "update t_role set role_name = ?,note = ? where id = ?";
        return jdbcTemplate.update(sql,role.getRoleName(),role.getNote(),role.getId());
    }

    /**
     * 查询角色列表
     * @param jdbcTemplate
     * @param roleName
     * @return
     */
    @Override
    public List<Role> findRole(JdbcTemplate jdbcTemplate, String roleName) {
        String sql = "select id,role_name,note from t_role where role_name like concat('%',?,'%')";
        Object[] params = {roleName};//组织参数
        //使用RowMapper接口组织返回（Lambda表达式）
        List<Role> list = jdbcTemplate.query(sql,params,(ResultSet rs,int rowNum) ->{
            Role result = new Role();
            result.setId(rs.getLong("id"));
            result.setRoleName(rs.getString("role_name"));
            result.setNote(rs.getString("note"));
            return result ;
        });
        return list;
    }

    /**
     * 使用ConnectionCallback接口进行回调
     * @param jdbcTemplate 模板
     * @param id 角色编号
     * @return 返回角色
     */
    @Override
    public Role getRoleByConnectionCallback(JdbcTemplate jdbcTemplate, Long id) {
        Role role = null;
        role = jdbcTemplate.execute((Connection con) ->{
            Role result = null;
            String sql = "select id,role_name,note from t_role where id = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setLong(1,id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                result = new Role();
                result.setId(rs.getLong("id"));
                result.setNote(rs.getString("note"));
                result.setRoleName(rs.getString("role_name"));
            }
            return result;
        });
        return role;
    }

    /**
     * 使用StatementCallback接口进行回调
     * @param jdbcTemplate
     * @param id
     * @return
     */
    @Override
    public Role getRoleStatementCallback(JdbcTemplate jdbcTemplate, Long id) {
        Role role = null;
        role = jdbcTemplate.execute((Statement stmt) -> {
            Role result = null;
            String sql = "select id,role_name,note from t_role where id = " + id;
            ResultSet resultSet = stmt.executeQuery(sql);
            while (resultSet.next()) {
                result = new Role();
                result.setId(resultSet.getLong("id"));
                result.setNote(resultSet.getString("note"));
                result.setRoleName(resultSet.getString("role_name"));
            }
            return result;
        });
        return role;
    }
}
