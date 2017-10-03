package com.example.demo.entity;

import javax.persistence.*;

/**
 * Created by Destiny_hao on 2017/10/3.
 */
@Entity
@Table(name = "tags_to_task", schema = "paiban", catalog = "")
public class TagsToTaskEntity {
    private int tagId;
    private int taskId;
    private TagsEntity tagsByTagId;
    private TaskRecordsEntity taskRecordsByTaskId;

    @Basic
    @Column(name = "tagId", nullable = false)
    public int getTagId() {
        return tagId;
    }

    public void setTagId(int tagId) {
        this.tagId = tagId;
    }

    @Basic
    @Column(name = "taskId", nullable = false)
    public int getTaskId() {
        return taskId;
    }

    public void setTaskId(int taskId) {
        this.taskId = taskId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TagsToTaskEntity that = (TagsToTaskEntity) o;

        if (tagId != that.tagId) return false;
        if (taskId != that.taskId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = tagId;
        result = 31 * result + taskId;
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "tagId", referencedColumnName = "id", nullable = false)
    public TagsEntity getTagsByTagId() {
        return tagsByTagId;
    }

    public void setTagsByTagId(TagsEntity tagsByTagId) {
        this.tagsByTagId = tagsByTagId;
    }

    @ManyToOne
    @JoinColumn(name = "taskId", referencedColumnName = "id", nullable = false)
    public TaskRecordsEntity getTaskRecordsByTaskId() {
        return taskRecordsByTaskId;
    }

    public void setTaskRecordsByTaskId(TaskRecordsEntity taskRecordsByTaskId) {
        this.taskRecordsByTaskId = taskRecordsByTaskId;
    }
}
