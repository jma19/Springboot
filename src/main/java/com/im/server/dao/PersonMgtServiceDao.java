package com.im.server.dao;


import com.im.server.mode.LoginResponse;

/**
 * Created by majun on 16/3/1.
 */
public interface PersonMgtServiceDao {
    Long queryStudentPid(String phone);

    Long queryAssistantPid(String phone);

    LoginResponse queryStuInfo(Long pid);

    LoginResponse queryAssInfo(Long pid);
}