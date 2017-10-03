package com.example.demo.entity;

import javax.persistence.*;

/**
 * Created by Destiny_hao on 2017/10/3.
 */
@Entity
@Table(name = "task_comment", schema = "paiban", catalog = "")
public class TaskCommentEntity {
    private int id;
    private int taskId;
    private int userId;
    private int commentScore;
    private int commentType;
    private int createTime;
    private String commentContext;
    private int deleteTag;
    private TaskRecordsEntity taskRecordsByTaskId;
    private UserEntity userByUserId;

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
    @Column(name = "userId", nullable = false)
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "commentScore", nullable = false)
    public int getCommentScore() {
        return commentScore;
    }

    public void setCommentScore(int commentScore) {
        this.commentScore = commentScore;
    }

    @Basic
    @Column(name = "commentType", nullable = false)
    public int getCommentType() {
        return commentType;
    }

    public void setCommentType(int commentType) {
        this.commentType = commentType;
    }

    @Basic
    @Column(name = "createTime", nullable = false)
    public int getCreateTime() {
        return createTime;
    }

    public void setCreateTime(int createTime) {
        this.createTime = createTime;
    }

    @Basic
    @Column(name = "commentContext", nullable = true, length = -1)
    public String getCommentContext() {
        return commentContext;
    }

    public void setCommentContext(String commentContext) {
        this.commentContext = commentContext;
    }

    @Basic
    @Column(name = "deleteTag", nullable = false)
    public int getDeleteTag() {
        return deleteTag;
    }

    public void setDeleteTag(int deleteTag) {
        this.deleteTag = deleteTag;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TaskCommentEntity that = (TaskCommentEntity) o;

        if (id != that.id) return false;
        if (taskId != that.taskId) return false;
        if (userId != that.userId) return false;
        if (commentScore != that.commentScore) return false;
        if (commentType != that.commentType) return false;
        if (createTime != that.createTime) return false;
        if (deleteTag != that.deleteTag) return false;
        if (commentContext != null ? !commentContext.equals(that.commentContext) : that.commentContext != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + taskId;
        result = 31 * result + userId;
        result = 31 * result + commentScore;
        result = 31 * result + commentType;
        result = 31 * result + createTime;
        result = 31 * result + (commentContext != null ? commentContext.hashCode() : 0);
        result = 31 * result + deleteTag;
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "taskId", referencedColumnName = "id", nullable = false)
    public TaskRecordsEntity getTaskRecordsByTaskId() {
        return taskRecordsByTaskId;
    }

    public void setTaskRecordsByTaskId(TaskRecordsEntity taskRecordsByTaskId) {
        this.taskRecordsByTaskId = taskRecordsByTaskId;
    }

    @ManyToOne
    @JoinColumn(name = "userId", referencedColumnName = "id", nullable = false)
    public UserEntity getUserByUserId() {
        return userByUserId;
    }

    public void setUserByUserId(UserEntity userByUserId) {
        this.userByUserId = userByUserId;
    }
}
