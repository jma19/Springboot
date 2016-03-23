package com.im.server.common;

/**
 * Created by majun on 16/1/21.
 */
public interface  ExceptionConstants {

    ServiceException ILLEGAL_PARAMETER_EXCEPTION = new ServiceException("ILLEGAL_PARAMETERS_ERROR", "系统异常，请稍后再试");
    ServiceException ALREADY_FEEDBACK_EXCEPTION = new ServiceException("ALREADY_FEEDBACK_ERROR", "参数不合法");

    ServiceException ACCEESS_DB_EXCEPTION = new ServiceException("SYSTEM_ERROR", "访问数据异常");
    ServiceException UNKNOWN_EXCEPTION = new ServiceException("UNKNOWN_ERROR", "未知异常");


    ServiceException SEND_VALIDATE_CPDE_EXCEPTION = new ServiceException("SEND_VALIDATE_CODE_ERROR", "发送验证码异常");

}
