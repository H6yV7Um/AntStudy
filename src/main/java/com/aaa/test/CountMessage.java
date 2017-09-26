package com.aaa.test;

/**
 * Created by aaa on 2017/7/24.
 */
public class CountMessage {
    private String onlyone;
    private String dbname;
    private String token;
    private String host;
    private Integer type;
    private Long successful;// 成功数量
    private Long failed;// 失败数量
    private Integer total;

    public CountMessage() {
    }

    public CountMessage(String onlyone, String dbname, String token, String host, Integer type, Long successful, Long failed, Integer total) {
        this.onlyone = onlyone;
        this.dbname = dbname;
        this.token = token;
        this.host = host;
        this.type = type;
        this.successful = successful;
        this.failed = failed;
        this.total = total;
    }

    public String getOnlyone() {
        return onlyone;
    }

    public void setOnlyone(String onlyone) {
        this.onlyone = onlyone;
    }

    public String getDbname() {
        return dbname;
    }

    public void setDbname(String dbname) {
        this.dbname = dbname;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Long getSuccessful() {
        return successful;
    }

    public void setSuccessful(Long successful) {
        this.successful = successful;
    }

    public Long getFailed() {
        return failed;
    }

    public void setFailed(Long failed) {
        this.failed = failed;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }
}
