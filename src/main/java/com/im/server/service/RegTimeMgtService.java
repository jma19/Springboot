package com.im.server.service;

import com.im.server.common.ExceptionConstants;
import com.im.server.common.ServiceException;
import com.im.server.dao.RegTimeMgtServiceDao;
import com.im.server.mode.db.RegTime;
import com.im.server.mode.paramter.RegTimeEntity;
import com.im.server.utils.TimeUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by majun on 16/3/5.
 */
@Service
public class RegTimeMgtService {

    private final static Log logger = LogFactory.getLog(RegTimeMgtService.class);

    @Autowired
    private RegTimeMgtServiceDao regTimeMgtServiceDao;

    public void createRegTimeEntity(RegTimeEntity regTimeEntity) throws ServiceException {

        try {
            RegTime regTime = getRegTime(regTimeEntity);
            regTimeMgtServiceDao.createRegTimeEntity(regTime);
        } catch (Exception exp) {
            logger.error("数据库异常,插入报名时间失败", exp);
            throw ExceptionConstants.ACCEESS_DB_EXCEPTION;
        }
    }

    private RegTime getRegTime(RegTimeEntity regTimeEntity) {
        return new RegTime().setEndAt(TimeUtils.getTimestamp(regTimeEntity.getEndAt()))
                .setStartAt(TimeUtils.getTimestamp(regTimeEntity.getStartAt()))
                .setPid(regTimeEntity.getPid())
                .setId(regTimeEntity.getId())
                .setIsValid(regTimeEntity.getIsValid());
    }

    private RegTimeEntity getRegTimeEntity(RegTime regTime) {
        return new RegTimeEntity().setEndAt(regTime.getEndAt().getTime())
                .setStartAt(regTime.getStartAt().getTime())
                .setId(regTime.getId())
                .setIsValid(regTime.getIsValid())
                .setPid(regTime.getPid());
    }


    public RegTimeEntity getRegTimeEntity(Long pid, Integer identify) throws ServiceException {
        //根据pid获取
        //学生的pid
        //学生
        if (identify == 0) {
        //根据学生的id 获取assistantId

        }

        try {
            RegTime regTime = regTimeMgtServiceDao.queryTimeEntity(pid);
            return getRegTimeEntity(regTime);
        } catch (Exception exp) {
            logger.error("数据库异常,插入报名时间失败", exp);
            throw ExceptionConstants.ACCEESS_DB_EXCEPTION;
        }
    }
}
