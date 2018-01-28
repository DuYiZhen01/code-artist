package code.artist.cms.core.controller.systam;

import code.artist.common.constants.Constants;
import code.artist.common.result.RestResponse;
import code.artist.core.facade.system.IRoleService;
import code.artist.core.model.system.Role;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 后台角色控制接口
 * Created by 阿杜 on 2018/1/28.
 */
@RestController
@RequestMapping("role")
public class RoleController {

    private Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private IRoleService roleService;


}
