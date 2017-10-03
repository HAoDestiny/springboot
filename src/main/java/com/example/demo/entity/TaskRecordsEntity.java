package com.example.demo.entity;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by Destiny_hao on 2017/10/3.
 */
@Entity
@Table(name = "task_records", schema = "paiban", catalog = "")
public class TaskRecordsEntity {
    private int id;
    private int userId;
    private int taskInfoId;
    private int taskType;
    private int taskSuccessBidderId;
    private int taskStatus;
    private String taskTitle;
    private int taskCreateTime;
    private int taskCashAmount;
    private int payGuaranteePrice;
    private int deleteTag;
    private Collection<HelpEntity> helpsById;
    private Collection<TagsToTaskEntity> tagsToTasksById;
    private Collection<TaskCommentEntity> taskCommentsById;
    private UserEntity userByUserId;
    private TaskInfoEntity taskInfoByTaskInfoId;
    private UserEntity userByTaskSuccessBidderId;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
    @Column(name = "taskInfoId", nullable = false)
    public int getTaskInfoId() {
        return taskInfoId;
    }

    public void setTaskInfoId(int taskInfoId) {
        this.taskInfoId = taskInfoId;
    }

    @Basic
    @Column(name = "taskType", nullable = false)
    public int getTaskType() {
        return taskType;
    }

    public void setTaskType(int taskType) {
        this.taskType = taskType;
    }

    @Basic
    @Column(name = "taskSuccessBidderId", nullable = false)
    public int getTaskSuccessBidderId() {
        return taskSuccessBidderId;
    }

    public void setTaskSuccessBidderId(int taskSuccessBidderId) {
        this.taskSuccessBidderId = taskSuccessBidderId;
    }

    @Basic
    @Column(name = "taskStatus", nullable = false)
    public int getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(int taskStatus) {
        this.taskStatus = taskStatus;
    }

    @Basic
    @Column(name = "taskTitle", nullable = false, length = 64)
    public String getTaskTitle() {
        return taskTitle;
    }

    public void setTaskTitle(String taskTitle) {
        this.taskTitle = taskTitle;
    }

    @Basic
    @Column(name = "taskCreateTime", nullable = false)
    public int getTaskCreateTime() {
        return taskCreateTime;
    }

    public void setTaskCreateTime(int taskCreateTime) {
        this.taskCreateTime = taskCreateTime;
    }

    @Basic
    @Column(name = "taskCashAmount", nullable = false, precision = 0)
    public int getTaskCashAmount() {
        return taskCashAmount;
    }

    public void setTaskCashAmount(int taskCashAmount) {
        this.taskCashAmount = taskCashAmount;
    }

    @Basic
    @Column(name = "payGuaranteePrice", nullable = false)
    public int getPayGuaranteePrice() {
        return payGuaranteePrice;
    }

    public void setPayGuaranteePrice(int payGuaranteePrice) {
        this.payGuaranteePrice = payGuaranteePrice;
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

        TaskRecordsEntity that = (TaskRecordsEntity) o;

        if (id != that.id) return false;
        if (userId != that.userId) return false;
        if (taskInfoId != that.taskInfoId) return false;
        if (taskType != that.taskType) return false;
        if (taskSuccessBidderId != that.taskSuccessBidderId) return false;
        if (taskStatus != that.taskStatus) return false;
        if (taskCreateTime != that.taskCreateTime) return false;
        if (taskCashAmount != that.taskCashAmount) return false;
        if (payGuaranteePrice != that.payGuaranteePrice) return false;
        if (deleteTag != that.deleteTag) return false;
        if (taskTitle != null ? !taskTitle.equals(that.taskTitle) : that.taskTitle != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + userId;
        result = 31 * result + taskInfoId;
        result = 31 * result + taskType;
        result = 31 * result + taskSuccessBidderId;
        result = 31 * result + taskStatus;
        result = 31 * result + (taskTitle != null ? taskTitle.hashCode() : 0);
        result = 31 * result + taskCreateTime;
        result = 31 * result + taskCashAmount;
        result = 31 * result + payGuaranteePrice;
        result = 31 * result + deleteTag;
        return result;
    }

    @OneToMany(mappedBy = "taskRecordsByHelpTaskId")
    public Collection<HelpEntity> getHelpsById() {
        return helpsById;
    }

    public void setHelpsById(Collection<HelpEntity> helpsById) {
        this.helpsById = helpsById;
    }

    @OneToMany(mappedBy = "taskRecordsByTaskId")
    public Collection<TagsToTaskEntity> getTagsToTasksById() {
        return tagsToTasksById;
    }

    public void setTagsToTasksById(Collection<TagsToTaskEntity> tagsToTasksById) {
        this.tagsToTasksById = tagsToTasksById;
    }

    @OneToMany(mappedBy = "taskRecordsByTaskId")
    public Collection<TaskCommentEntity> getTaskCommentsById() {
        return taskCommentsById;
    }

    public void setTaskCommentsById(Collection<TaskCommentEntity> taskCommentsById) {
        this.taskCommentsById = taskCommentsById;
    }

    @ManyToOne
    @JoinColumn(name = "userId", referencedColumnName = "id", nullable = false)
    public UserEntity getUserByUserId() {
        return userByUserId;
    }

    public void setUserByUserId(UserEntity userByUserId) {
        this.userByUserId = userByUserId;
    }

    @ManyToOne
    @JoinColumn(name = "taskInfoId", referencedColumnName = "id", nullable = false)
    public TaskInfoEntity getTaskInfoByTaskInfoId() {
        return taskInfoByTaskInfoId;
    }

    public void setTaskInfoByTaskInfoId(TaskInfoEntity taskInfoByTaskInfoId) {
        this.taskInfoByTaskInfoId = taskInfoByTaskInfoId;
    }

    @ManyToOne
    @JoinColumn(name = "taskSuccessBidderId", referencedColumnName = "id", nullable = false)
    public UserEntity getUserByTaskSuccessBidderId() {
        return userByTaskSuccessBidderId;
    }

    public void setUserByTaskSuccessBidderId(UserEntity userByTaskSuccessBidderId) {
        this.userByTaskSuccessBidderId = userByTaskSuccessBidderId;
    }
}
