
package com.cheung.base.greendao.table;


import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.NotNull;

import java.io.Serializable;
import java.util.Date;

/**
 * @project: mietp
 * @version: V1.0
 * @createdate: 2019/1/10 thursday
 * @author: xph
 * @description: 用户表
 */
@Entity(nameInDb = "user")
public class User implements Serializable {

    private static final long serialVersionUID = -9131310034107679644L;

    @Id(autoincrement = true)
    private Long id;

    private long  majorId;

    @NotNull
    private String loginame;// 登录名称

    @NotNull
    private String password;// 账号密码

    private String username;// 用户姓名

    private String nickname;// 用户昵称

    @NotNull
    private String usertype;// 用户类型（管理员、普通用户）

    @NotNull
    private String status;// 状态:0启用1禁用

    @NotNull
    private Date createtime;// 创建时间

    @NotNull
    private Date updatetime;// 更新时间

    @Generated(hash = 1500312918)
    public User(Long id, long majorId, @NotNull String loginame, @NotNull String password, String username, String nickname, @NotNull String usertype, @NotNull String status,
            @NotNull Date createtime, @NotNull Date updatetime) {
        this.id = id;
        this.majorId = majorId;
        this.loginame = loginame;
        this.password = password;
        this.username = username;
        this.nickname = nickname;
        this.usertype = usertype;
        this.status = status;
        this.createtime = createtime;
        this.updatetime = updatetime;
    }

    @Generated(hash = 586692638)
    public User() {
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public long getMajorId() {
        return this.majorId;
    }

    public void setMajorId(long majorId) {
        this.majorId = majorId;
    }

    public String getLoginame() {
        return this.loginame;
    }

    public void setLoginame(String loginame) {
        this.loginame = loginame;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getNickname() {
        return this.nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getUsertype() {
        return this.usertype;
    }

    public void setUsertype(String usertype) {
        this.usertype = usertype;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getCreatetime() {
        return this.createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getUpdatetime() {
        return this.updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }



}
