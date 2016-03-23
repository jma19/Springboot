package com.im.server.mode;

/**
 * Created by majun on 16/3/2.
 */
public class LoginResponse {
    private Long pid;
    private Integer identity;
    private String uniqueId; //
    private String name;
    private String univName;
    private String collegeName;
    private String gradeName;
    private String majorName;
    private String className;
    private String imgUrl;

    public String getClassName() {
        return className;
    }

    public LoginResponse setClassName(String className) {
        this.className = className;
        return this;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public LoginResponse setCollegeName(String collegeName) {
        this.collegeName = collegeName;
        return this;
    }

    public String getGradeName() {
        return gradeName;
    }

    public LoginResponse setGradeName(String gradeName) {
        this.gradeName = gradeName;
        return this;
    }

    public Integer getIdentity() {
        return identity;
    }

    public LoginResponse setIdentity(Integer identity) {
        this.identity = identity;
        return this;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public LoginResponse setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
        return this;
    }

    public String getMajorName() {
        return majorName;
    }

    public LoginResponse setMajorName(String majorName) {
        this.majorName = majorName;
        return this;
    }

    public String getName() {
        return name;
    }

    public LoginResponse setName(String name) {
        this.name = name;
        return this;
    }

    public Long getPid() {
        return pid;
    }

    public LoginResponse setPid(Long pid) {
        this.pid = pid;
        return this;
    }

    public String getUniqueId() {
        return uniqueId;
    }

    public LoginResponse setUniqueId(String uniqueId) {
        this.uniqueId = uniqueId;
        return this;
    }

    public String getUnivName() {
        return univName;
    }

    public LoginResponse setUnivName(String univName) {
        this.univName = univName;
        return this;
    }

    @Override
    public String toString() {
        return "LoginResponse{" +
                "className='" + className + '\'' +
                ", pid=" + pid +
                ", identity=" + identity +
                ", uniqueId='" + uniqueId + '\'' +
                ", name='" + name + '\'' +
                ", univName='" + univName + '\'' +
                ", collegeName='" + collegeName + '\'' +
                ", gradeName='" + gradeName + '\'' +
                ", majorName='" + majorName + '\'' +
                ", imgUrl='" + imgUrl + '\'' +
                '}';
    }
}
