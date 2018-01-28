package code.artist.core.facade.system;

import code.artist.core.model.system.Role;

import java.util.List;

/**
 * Created by 阿杜 on 2018/1/28.
 */
public interface IRoleService {

    /**
     * 查询所有的角色
     * @return
     */
    List<Role> selectRoleList();

    /**
     * 增加角色
     * @param role
     * @return
     */
    int insterRole(Role role);

    /**
     * 修改角色
     * @param role
     * @return
     */
    int updateRole(Role role);

    /**
     * 根据ID查询角色
     * @return
     */
    Role selectRoleById(String roleId);
}
