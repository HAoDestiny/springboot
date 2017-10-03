package com.example.demo.entity;

import javax.persistence.*;

/**
 * Created by Destiny_hao on 2017/10/3.
 */
@Entity
@Table(name = "task_bidder", schema = "paiban", catalog = "")
public class TaskBidderEntity {
    private int id;
    private int taskId;
    private int bidderId;
    private int createTime;
    private TaskInfoEntity taskInfoByTaskId;
    private UserEntity userByBidderId;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "taskId", nullable = false)
    public int getTaskId() {
        return taskId;
    }

    public void setTaskId(int taskId) {
        this.taskId = taskId;
    }

    @Basic
    @Column(name = "bidderId", nullable = false)
    public int getBidderId() {
        return bidderId;
    }

    public void setBidderId(int bidderId) {
        this.bidderId = bidderId;
    }

    @Basic
    @Column(name = "createTime", nullable = false)
    public int getCreateTime() {
        return createTime;
    }

    public void setCreateTime(int createTime) {
        this.createTime = createTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TaskBidderEntity that = (TaskBidderEntity) o;

        if (id != that.id) return false;
        if (taskId != that.taskId) return false;
        if (bidderId != that.bidderId) return false;
        if (createTime != that.createTime) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + taskId;
        result = 31 * result + bidderId;
        result = 31 * result + createTime;
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "taskId", referencedColumnName = "id", nullable = false)
    public TaskInfoEntity getTaskInfoByTaskId() {
        return taskInfoByTaskId;
    }

    public void setTaskInfoByTaskId(TaskInfoEntity taskInfoByTaskId) {
        this.taskInfoByTaskId = taskInfoByTaskId;
    }

    @ManyToOne
    @JoinColumn(name = "bidderId", referencedColumnName = "id", nullable = false)
    public UserEntity getUserByBidderId() {
        return userByBidderId;
    }

    public void setUserByBidderId(UserEntity userByBidderId) {
        this.userByBidderId = userByBidderId;
    }
}
