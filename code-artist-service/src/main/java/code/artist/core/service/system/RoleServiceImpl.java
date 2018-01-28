package code.artist.core.service.system;

import code.artist.core.dao.system.RoleMapper;
import code.artist.core.facade.system.IRoleService;
import code.artist.core.model.system.Role;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by 阿杜 on 2018/1/28.
 */
public class RoleServiceImpl implements IRoleService {

    @Autowired
    private RoleMapper roleMapper;

    @Override
    public List<Role> selectRoleList() {
        return roleMapper.selEntityList();
    }

    @Override
    public int insterRole(Role role) {
        return roleMapper.insEntity(role);
    }

    @Override
    public int updateRole(Role role) {
        return roleMapper.updEntityById(role);
    }

    @Override
    public Role selectRoleById(String roleId) {
        return roleMapper.selEntityById(roleId);
    }
}
