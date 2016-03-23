package com.im.server.service;

import com.im.server.common.Constants;
import com.im.server.common.ExceptionConstants;
import com.im.server.common.ServiceException;
import com.im.server.dao.PersonMgtServiceDao;
import com.im.server.mode.LoginResponse;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by majun on 16/3/1.
 */
@Service
public class PersonMgtService {

    private final static Log logger = LogFactory.getLog(PersonMgtService.class);

    @Autowired
    private PersonMgtServiceDao personMgtServiceDao;

    public Long getPid(String phone, Integer identify) throws ServiceException {

        logger.info(String.format("获取pid, phone=%s, identify=%s", phone, identify));

        try {
            if (identify == Constants.Identify.student) {
                return personMgtServiceDao.queryStudentPid(phone);
            }
            return personMgtServiceDao.queryAssistantPid(phone);
        } catch (Exception exp) {
            logger.error(String.format("访问数据库获取pid失败, phone=%s,identify=%s", phone, identify), exp);
            throw ExceptionConstants.ACCEESS_DB_EXCEPTION;
        }
    }

    public LoginResponse queryPerInfo(Long pid, Integer identify) throws ServiceException {

        try {
            if (identify == Constants.Identify.student) {
                return personMgtServiceDao.queryStuInfo(pid);
            }
            return personMgtServiceDao.queryAssInfo(pid);
        } catch (Exception exp) {
            logger.error(String.format("访问数据库获取信息失败, pid=%s, identify=%s", pid, identify), exp);
            throw ExceptionConstants.ACCEESS_DB_EXCEPTION;
        }
    }


}


