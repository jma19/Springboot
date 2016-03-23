package com.im.server.api;

import com.im.server.common.Constants;
import com.im.server.common.ExceptionConstants;
import com.im.server.common.ServiceException;
import com.im.server.mode.RegisterEntity;
import com.im.server.mode.Response;
import com.im.server.service.*;
import com.im.server.utils.ParamerChecker;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import static com.im.server.common.Constants.ERROR_CODE.SYSTEM_ERROR;
import static com.im.server.common.Constants.Status.ERROR;
import static com.im.server.common.Constants.Status.SUCCESS;
import static com.im.server.utils.ParamerChecker.isNull;

/**
 * modified by JSexy on 2016/2/1
 */
@RestController
@RequestMapping("/register/service")
public class RegisterCenterService {

    private Log logger = LogFactory.getLog(RegisterCenterService.class);

    @Autowired
    private RegisterService registerSevice;

    @RequestMapping(path = "/isRegistered", method = RequestMethod.POST)
    public Response isRegistered(Long pid) {

        logger.info(String.format("isRegistered方法收到请求数据, pid=%s", pid));
        Response response = new Response();
        try {
            Integer registed = registerSevice.isRegistered(pid);
            response.setStatus(registed != null && registed > 0 ? SUCCESS : ERROR);
        } catch (Exception exp) {
            logger.error("数据库异常, 调用isRegistered接口失败", exp);
            response.setStatus(ERROR).setData("数据库异常!!").setCode(SYSTEM_ERROR);
        }

        return response;
    }

    @RequestMapping(path = "/register", method = RequestMethod.POST)
    public Response register(RegisterEntity register) {

        if (isNull(register) || isNull(register.getPid()) || isNull(register.getActStartTime()) || isNull(register.getActArriveTime())) {
            return Response.fail(ExceptionConstants.ILLEGAL_PARAMETER_EXCEPTION.getMessage());
        }

        logger.info(String.format("register方法收到请求数据, register=%s", register));
        try {
            registerSevice.register(register);
        } catch (Exception exp) {
            logger.error("数据库异常, 调用register接口失败", exp);
            return Response.fail("操作失败, 请重试, ERROR_CODE = ACCESS_DB_ERROR");
        }
        return Response.success("数据保存成功");
    }


    @RequestMapping(path = "/getRegisterInfo", method = RequestMethod.POST)
    public Response getRegisterInfo(Long pid) {
        logger.info(String.format("getRegisterInfo方法收到请求数据, pid=%s", pid));
        Response response = new Response();
        try {
            RegisterEntity entity = registerSevice.queryRegisterInfo(pid);
            response.setStatus(SUCCESS).setData(entity.setRemark(Constants.registerStatusMap.get(entity.getStatus())));
        } catch (ServiceException exp) {
            logger.error("数据库异常, 调用register接口失败", exp);
        }
        return response;
    }

    @RequestMapping(path = "/updateRegisterInfo", method = RequestMethod.POST)
    public Response updateRegisterInfo(RegisterEntity register) {
        logger.info(String.format("updateRegisterInfo方法收到请求数据, register=%s", register));
        try {
            registerSevice.updateRegisterInfo(register);
            return Response.success("操作成功");
        } catch (ServiceException exp) {
            logger.error("数据库异常, 调用updateRegisterInfo接口失败", exp);
            return Response.fail("操作失败, 请重试, ERROR_CODE = ACCESS_DB_ERROR");
        }
    }


}