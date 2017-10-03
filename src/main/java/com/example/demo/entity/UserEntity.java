package com.example.demo.entity;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by Destiny_hao on 2017/10/3.
 */
@Entity
@Table(name = "user", schema = "paiban", catalog = "")
public class UserEntity {
    private int id;
    private String username;
    private int lastLoginTime;
    private String lastLoginIp;
    private int lock;
    private int userType;
    private int deleteTag;
    private int registerTime;
    private String registerIp;
    private Collection<HelpEntity> helpsById;
    private Collection<HelpEntity> helpsById_0;
    private Collection<TaskBidderEntity> taskBiddersById;
    private Collection<TaskCommentEntity> taskCommentsById;
    private Collection<TaskInfoEntity> taskInfosById;
    private Collection<TaskRecordsEntity> taskRecordsById;
    private Collection<TaskRecordsEntity> taskRecordsById_0;
    private Collection<UserInfoEntity> userInfosById;
    private Collection<UserSecurityEntity> userSecuritiesById;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "username", nullable = false, length = 20)
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Basic
    @Column(name = "lastLoginTime", nullable = false)
    public int getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(int lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    @Basic
    @Column(name = "lastLoginIP", nullable = false, length = 20)
    public String getLastLoginIp() {
        return lastLoginIp;
    }

    public void setLastLoginIp(String lastLoginIp) {
        this.lastLoginIp = lastLoginIp;
    }

    @Basic
    @Column(name = "lock", nullable = false)
    public int getLock() {
        return lock;
    }

    public void setLock(int lock) {
        this.lock = lock;
    }

    @Basic
    @Column(name = "userType", nullable = false)
    public int getUserType() {
        return userType;
    }

    public void setUserType(int userType) {
        this.userType = userType;
    }

    @Basic
    @Column(name = "deleteTag", nullable = false)
    public int getDeleteTag() {
        return deleteTag;
    }

    public void setDeleteTag(int deleteTag) {
        this.deleteTag = deleteTag;
    }

    @Basic
    @Column(name = "registerTime", nullable = false)
    public int getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(int registerTime) {
        this.registerTime = registerTime;
    }

    @Basic
    @Column(name = "registerIP", nullable = false, length = 20)
    public String getRegisterIp() {
        return registerIp;
    }

    public void setRegisterIp(String registerIp) {
        this.registerIp = registerIp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserEntity that = (UserEntity) o;

        if (id != that.id) return false;
        if (lastLoginTime != that.lastLoginTime) return false;
        if (lock != that.lock) return false;
        if (userType != that.userType) return false;
        if (deleteTag != that.deleteTag) return false;
        if (registerTime != that.registerTime) return false;
        if (username != null ? !username.equals(that.username) : that.username != null) return false;
        if (lastLoginIp != null ? !lastLoginIp.equals(that.lastLoginIp) : that.lastLoginIp != null) return false;
        if (registerIp != null ? !registerIp.equals(that.registerIp) : that.registerIp != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (username != null ? username.hashCode() : 0);
        result = 31 * result + lastLoginTime;
        result = 31 * result + (lastLoginIp != null ? lastLoginIp.hashCode() : 0);
        result = 31 * result + lock;
        result = 31 * result + userType;
        result = 31 * result + deleteTag;
        result = 31 * result + registerTime;
        result = 31 * result + (registerIp != null ? registerIp.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "userByHelpUserId")
    public Collection<HelpEntity> getHelpsById() {
        return helpsById;
    }

    public void setHelpsById(Collection<HelpEntity> helpsById) {
        this.helpsById = helpsById;
    }

    @OneToMany(mappedBy = "userByDealUserId")
    public Collection<HelpEntity> getHelpsById_0() {
        return helpsById_0;
    }

    public void setHelpsById_0(Collection<HelpEntity> helpsById_0) {
        this.helpsById_0 = helpsById_0;
    }

    @OneToMany(mappedBy = "userByBidderId")
    public Collection<TaskBidderEntity> getTaskBiddersById() {
        return taskBiddersById;
    }

    public void setTaskBiddersById(Collection<TaskBidderEntity> taskBiddersById) {
        this.taskBiddersById = taskBiddersById;
    }

    @OneToMany(mappedBy = "userByUserId")
    public Collection<TaskCommentEntity> getTaskCommentsById() {
        return taskCommentsById;
    }

    public void setTaskCommentsById(Collection<TaskCommentEntity> taskCommentsById) {
        this.taskCommentsById = taskCommentsById;
    }

    @OneToMany(mappedBy = "userByTaskSuccessfulBidderId")
    public Collection<TaskInfoEntity> getTaskInfosById() {
        return taskInfosById;
    }

    public void setTaskInfosById(Collection<TaskInfoEntity> taskInfosById) {
        this.taskInfosById = taskInfosById;
    }

    @OneToMany(mappedBy = "userByUserId")
    public Collection<TaskRecordsEntity> getTaskRecordsById() {
        return taskRecordsById;
    }

    public void setTaskRecordsById(Collection<TaskRecordsEntity> taskRecordsById) {
        this.taskRecordsById = taskRecordsById;
    }

    @OneToMany(mappedBy = "userByTaskSuccessBidderId")
    public Collection<TaskRecordsEntity> getTaskRecordsById_0() {
        return taskRecordsById_0;
    }

    public void setTaskRecordsById_0(Collection<TaskRecordsEntity> taskRecordsById_0) {
        this.taskRecordsById_0 = taskRecordsById_0;
    }

    @OneToMany(mappedBy = "userByUserId")
    public Collection<UserInfoEntity> getUserInfosById() {
        return userInfosById;
    }

    public void setUserInfosById(Collection<UserInfoEntity> userInfosById) {
        this.userInfosById = userInfosById;
    }

    @OneToMany(mappedBy = "userByUserId")
    public Collection<UserSecurityEntity> getUserSecuritiesById() {
        return userSecuritiesById;
    }

    public void setUserSecuritiesById(Collection<UserSecurityEntity> userSecuritiesById) {
        this.userSecuritiesById = userSecuritiesById;
    }
}
