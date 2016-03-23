package com.im.server.mode.paramter;

import java.sql.Timestamp;

/**
 * Created by majun on 16/3/5.
 */
public class RegTimeEntity {
    private Long id;
    private Long pid;
    private Long startAt;
    private Long endAt;
    private Integer isValid;

    public Long getEndAt() {
        return endAt;
    }

    public RegTimeEntity setEndAt(Long endAt) {
        this.endAt = endAt;
        return this;
    }

    public Long getId() {
        return id;
    }

    public RegTimeEntity setId(Long id) {
        this.id = id;
        return this;
    }

    public Integer getIsValid() {
        return isValid;
    }

    public RegTimeEntity setIsValid(Integer isValid) {
        this.isValid = isValid;
        return this;
    }

    public Long getPid() {
        return pid;
    }

    public RegTimeEntity setPid(Long pid) {
        this.pid = pid;
        return this;
    }

    public Long getStartAt() {
        return startAt;
    }

    public RegTimeEntity setStartAt(Long startAt) {
        this.startAt = startAt;
        return this;
    }

    @Override
    public String toString() {
        return "RegTimeEntity{" +
                "endAt=" + endAt +
                ", id=" + id +
                ", pid=" + pid +
                ", startAt=" + startAt +
                ", isValid=" + isValid +
                '}';
    }
}
