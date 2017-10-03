package com.example.demo.entity;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by Destiny_hao on 2017/10/3.
 */
@Entity
@Table(name = "task_info", schema = "paiban", catalog = "")
public class TaskInfoEntity {
    private int id;
    private int taskPublisherId;
    private int taskBudgetGuaranteePrice;
    private int taskBudgetUnGuaranteePrice;
    private String taskTitle;
    private String taskContent;
    private int taskCreateTime;
    private int taskDefaultMoney;
    private int taskStartDevelopmentTime;
    private int taskStartAcceptanceTime;
    private Integer taskSuccessfulBidderId;
    private Collection<FileTaskIndexEntity> fileTaskIndicesById;
    private Collection<TaskBidderEntity> taskBiddersById;
    private UserEntity userByTaskSuccessfulBidderId;
    private Collection<TaskRecordsEntity> taskRecordsById;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "taskPublisherId", nullable = false)
    public int getTaskPublisherId() {
        return taskPublisherId;
    }

    public void setTaskPublisherId(int taskPublisherId) {
        this.taskPublisherId = taskPublisherId;
    }

    @Basic
    @Column(name = "taskBudgetGuaranteePrice", nullable = false, precision = 0)
    public int getTaskBudgetGuaranteePrice() {
        return taskBudgetGuaranteePrice;
    }

    public void setTaskBudgetGuaranteePrice(int taskBudgetGuaranteePrice) {
        this.taskBudgetGuaranteePrice = taskBudgetGuaranteePrice;
    }

    @Basic
    @Column(name = "taskBudgetUnGuaranteePrice", nullable = false, precision = 0)
    public int getTaskBudgetUnGuaranteePrice() {
        return taskBudgetUnGuaranteePrice;
    }

    public void setTaskBudgetUnGuaranteePrice(int taskBudgetUnGuaranteePrice) {
        this.taskBudgetUnGuaranteePrice = taskBudgetUnGuaranteePrice;
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
    @Column(name = "taskContent", nullable = false, length = -1)
    public String getTaskContent() {
        return taskContent;
    }

    public void setTaskContent(String taskContent) {
        this.taskContent = taskContent;
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
    @Column(name = "taskDefaultMoney", nullable = false)
    public int getTaskDefaultMoney() {
        return taskDefaultMoney;
    }

    public void setTaskDefaultMoney(int taskDefaultMoney) {
        this.taskDefaultMoney = taskDefaultMoney;
    }

    @Basic
    @Column(name = "taskStartDevelopmentTime", nullable = false)
    public int getTaskStartDevelopmentTime() {
        return taskStartDevelopmentTime;
    }

    public void setTaskStartDevelopmentTime(int taskStartDevelopmentTime) {
        this.taskStartDevelopmentTime = taskStartDevelopmentTime;
    }

    @Basic
    @Column(name = "taskStartAcceptance\r\nTime", nullable = false)
    public int getTaskStartAcceptanceTime() {
        return taskStartAcceptanceTime;
    }

    public void setTaskStartAcceptanceTime(int taskStartAcceptanceTime) {
        this.taskStartAcceptanceTime = taskStartAcceptanceTime;
    }

    @Basic
    @Column(name = "taskSuccessfulBidderId", nullable = true)
    public Integer getTaskSuccessfulBidderId() {
        return taskSuccessfulBidderId;
    }

    public void setTaskSuccessfulBidderId(Integer taskSuccessfulBidderId) {
        this.taskSuccessfulBidderId = taskSuccessfulBidderId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TaskInfoEntity that = (TaskInfoEntity) o;

        if (id != that.id) return false;
        if (taskPublisherId != that.taskPublisherId) return false;
        if (taskBudgetGuaranteePrice != that.taskBudgetGuaranteePrice) return false;
        if (taskBudgetUnGuaranteePrice != that.taskBudgetUnGuaranteePrice) return false;
        if (taskCreateTime != that.taskCreateTime) return false;
        if (taskDefaultMoney != that.taskDefaultMoney) return false;
        if (taskStartDevelopmentTime != that.taskStartDevelopmentTime) return false;
        if (taskStartAcceptanceTime != that.taskStartAcceptanceTime) return false;
        if (taskTitle != null ? !taskTitle.equals(that.taskTitle) : that.taskTitle != null) return false;
        if (taskContent != null ? !taskContent.equals(that.taskContent) : that.taskContent != null) return false;
        if (taskSuccessfulBidderId != null ? !taskSuccessfulBidderId.equals(that.taskSuccessfulBidderId) : that.taskSuccessfulBidderId != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + taskPublisherId;
        result = 31 * result + taskBudgetGuaranteePrice;
        result = 31 * result + taskBudgetUnGuaranteePrice;
        result = 31 * result + (taskTitle != null ? taskTitle.hashCode() : 0);
        result = 31 * result + (taskContent != null ? taskContent.hashCode() : 0);
        result = 31 * result + taskCreateTime;
        result = 31 * result + taskDefaultMoney;
        result = 31 * result + taskStartDevelopmentTime;
        result = 31 * result + taskStartAcceptanceTime;
        result = 31 * result + (taskSuccessfulBidderId != null ? taskSuccessfulBidderId.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "taskInfoByTaskInfoId")
    public Collection<FileTaskIndexEntity> getFileTaskIndicesById() {
        return fileTaskIndicesById;
    }

    public void setFileTaskIndicesById(Collection<FileTaskIndexEntity> fileTaskIndicesById) {
        this.fileTaskIndicesById = fileTaskIndicesById;
    }

    @OneToMany(mappedBy = "taskInfoByTaskId")
    public Collection<TaskBidderEntity> getTaskBiddersById() {
        return taskBiddersById;
    }

    public void setTaskBiddersById(Collection<TaskBidderEntity> taskBiddersById) {
        this.taskBiddersById = taskBiddersById;
    }

    @ManyToOne
    @JoinColumn(name = "taskSuccessfulBidderId", referencedColumnName = "id")
    public UserEntity getUserByTaskSuccessfulBidderId() {
        return userByTaskSuccessfulBidderId;
    }

    public void setUserByTaskSuccessfulBidderId(UserEntity userByTaskSuccessfulBidderId) {
        this.userByTaskSuccessfulBidderId = userByTaskSuccessfulBidderId;
    }

    @OneToMany(mappedBy = "taskInfoByTaskInfoId")
    public Collection<TaskRecordsEntity> getTaskRecordsById() {
        return taskRecordsById;
    }

    public void setTaskRecordsById(Collection<TaskRecordsEntity> taskRecordsById) {
        this.taskRecordsById = taskRecordsById;
    }
}
