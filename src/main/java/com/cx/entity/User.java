package com.cx.entity;

import com.cx.enums.SexEnum;
import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
public class User implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
//    @GeneratedValue
    private Long id;
    @Column(nullable = false, unique = true)
    private String username;
    private String password;
    private SexEnum sex;
    private String nickname;
    private String email;
    private Date regtime;
    //Entity中不映射成列的字段得加@Transient 注解，不加注解也会映射成列
    @Transient
    private String mark;

    public User() {
    }

    public User(String username, String password, SexEnum sex, String nickname, String email, Date regtime, String mark) {
        this.username = username;
        this.password = password;
        this.sex = sex;
        this.nickname = nickname;
        this.email = email;
        this.regtime = regtime;
        this.mark = mark;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public SexEnum getSex() {
        return sex;
    }

    public void setSex(SexEnum sex) {
        this.sex = sex;
    }

    public Date getRegtime() {
        return regtime;
    }

    public void setRegtime(Date regtime) {
        this.regtime = regtime;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", sex=" + sex.name() +
                ", nickname='" + nickname + '\'' +
                ", email='" + email + '\'' +
                ", regtime=" + regtime +
                ", mark='" + mark + '\'' +
                '}';
    }
}
