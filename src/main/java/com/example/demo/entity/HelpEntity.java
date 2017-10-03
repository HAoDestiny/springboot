package com.example.demo.entity;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by Destiny_hao on 2017/10/3.
 */
@Entity
@Table(name = "help", schema = "paiban", catalog = "")
public class HelpEntity {
    private int id;
    private int helpCreateTime;
    private Integer helpFinishTime;
    private int helpUserId;
    private int helpTaskId;
    private String helpContent;
    private int helpStatus;
    private String helpBackContent;
    private int dealUserId;
    private int deleteTag;
    private Collection<FileHelpIndexEntity> fileHelpIndicesById;
    private UserEntity userByHelpUserId;
    private TaskRecordsEntity taskRecordsByHelpTaskId;
    private UserEntity userByDealUserId;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "helpCreateTime", nullable = false)
    public int getHelpCreateTime() {
        return helpCreateTime;
    }

    public void setHelpCreateTime(int helpCreateTime) {
        this.helpCreateTime = helpCreateTime;
    }

    @Basic
    @Column(name = "helpFinishTime", nullable = true)
    public Integer getHelpFinishTime() {
        return helpFinishTime;
    }

    public void setHelpFinishTime(Integer helpFinishTime) {
        this.helpFinishTime = helpFinishTime;
    }

    @Basic
    @Column(name = "helpUserId", nullable = false)
    public int getHelpUserId() {
        return helpUserId;
    }

    public void setHelpUserId(int helpUserId) {
        this.helpUserId = helpUserId;
    }

    @Basic
    @Column(name = "helpTaskId", nullable = false)
    public int getHelpTaskId() {
        return helpTaskId;
    }

    public void setHelpTaskId(int helpTaskId) {
        this.helpTaskId = helpTaskId;
    }

    @Basic
    @Column(name = "helpContent", nullable = true, length = -1)
    public String getHelpContent() {
        return helpContent;
    }

    public void setHelpContent(String helpContent) {
        this.helpContent = helpContent;
    }

    @Basic
    @Column(name = "helpStatus", nullable = false)
    public int getHelpStatus() {
        return helpStatus;
    }

    public void setHelpStatus(int helpStatus) {
        this.helpStatus = helpStatus;
    }

    @Basic
    @Column(name = "helpBackContent", nullable = true, length = -1)
    public String getHelpBackContent() {
        return helpBackContent;
    }

    public void setHelpBackContent(String helpBackContent) {
        this.helpBackContent = helpBackContent;
    }

    @Basic
    @Column(name = "dealUserId", nullable = false)
    public int getDealUserId() {
        return dealUserId;
    }

    public void setDealUserId(int dealUserId) {
        this.dealUserId = dealUserId;
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

        HelpEntity that = (HelpEntity) o;

        if (id != that.id) return false;
        if (helpCreateTime != that.helpCreateTime) return false;
        if (helpUserId != that.helpUserId) return false;
        if (helpTaskId != that.helpTaskId) return false;
        if (helpStatus != that.helpStatus) return false;
        if (dealUserId != that.dealUserId) return false;
        if (deleteTag != that.deleteTag) return false;
        if (helpFinishTime != null ? !helpFinishTime.equals(that.helpFinishTime) : that.helpFinishTime != null)
            return false;
        if (helpContent != null ? !helpContent.equals(that.helpContent) : that.helpContent != null) return false;
        if (helpBackContent != null ? !helpBackContent.equals(that.helpBackContent) : that.helpBackContent != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + helpCreateTime;
        result = 31 * result + (helpFinishTime != null ? helpFinishTime.hashCode() : 0);
        result = 31 * result + helpUserId;
        result = 31 * result + helpTaskId;
        result = 31 * result + (helpContent != null ? helpContent.hashCode() : 0);
        result = 31 * result + helpStatus;
        result = 31 * result + (helpBackContent != null ? helpBackContent.hashCode() : 0);
        result = 31 * result + dealUserId;
        result = 31 * result + deleteTag;
        return result;
    }

    @OneToMany(mappedBy = "helpByHelpId")
    public Collection<FileHelpIndexEntity> getFileHelpIndicesById() {
        return fileHelpIndicesById;
    }

    public void setFileHelpIndicesById(Collection<FileHelpIndexEntity> fileHelpIndicesById) {
        this.fileHelpIndicesById = fileHelpIndicesById;
    }

    @ManyToOne
    @JoinColumn(name = "helpUserId", referencedColumnName = "id", nullable = false)
    public UserEntity getUserByHelpUserId() {
        return userByHelpUserId;
    }

    public void setUserByHelpUserId(UserEntity userByHelpUserId) {
        this.userByHelpUserId = userByHelpUserId;
    }

    @ManyToOne
    @JoinColumn(name = "helpTaskId", referencedColumnName = "id", nullable = false)
    public TaskRecordsEntity getTaskRecordsByHelpTaskId() {
        return taskRecordsByHelpTaskId;
    }

    public void setTaskRecordsByHelpTaskId(TaskRecordsEntity taskRecordsByHelpTaskId) {
        this.taskRecordsByHelpTaskId = taskRecordsByHelpTaskId;
    }

    @ManyToOne
    @JoinColumn(name = "dealUserId", referencedColumnName = "id", nullable = false)
    public UserEntity getUserByDealUserId() {
        return userByDealUserId;
    }

    public void setUserByDealUserId(UserEntity userByDealUserId) {
        this.userByDealUserId = userByDealUserId;
    }
}
