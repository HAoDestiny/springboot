package com.example.demo.entity;

import javax.persistence.*;

/**
 * Created by Destiny_hao on 2017/10/3.
 */
@Entity
@Table(name = "file_task_index", schema = "paiban", catalog = "")
public class FileTaskIndexEntity {
    private int id;
    private int taskInfoId;
    private int fileId;
    private TaskInfoEntity taskInfoByTaskInfoId;
    private FileEntity fileByFileId;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
    @Column(name = "fileId", nullable = false)
    public int getFileId() {
        return fileId;
    }

    public void setFileId(int fileId) {
        this.fileId = fileId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FileTaskIndexEntity that = (FileTaskIndexEntity) o;

        if (id != that.id) return false;
        if (taskInfoId != that.taskInfoId) return false;
        if (fileId != that.fileId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + taskInfoId;
        result = 31 * result + fileId;
        return result;
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
    @JoinColumn(name = "fileId", referencedColumnName = "id", nullable = false)
    public FileEntity getFileByFileId() {
        return fileByFileId;
    }

    public void setFileByFileId(FileEntity fileByFileId) {
        this.fileByFileId = fileByFileId;
    }
}
