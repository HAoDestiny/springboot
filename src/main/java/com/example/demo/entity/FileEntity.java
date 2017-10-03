package com.example.demo.entity;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by Destiny_hao on 2017/10/3.
 */
@Entity
@Table(name = "file", schema = "paiban", catalog = "")
public class FileEntity {
    private int id;
    private String filePath;
    private int fileCreateTime;
    private String fileType;
    private int deleteTag;
    private Collection<FileHelpIndexEntity> fileHelpIndicesById;
    private Collection<FileTaskIndexEntity> fileTaskIndicesById;
    private Collection<UserInfoEntity> userInfosById;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "filePath", nullable = false, length = 256)
    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    @Basic
    @Column(name = "fileCreateTime", nullable = false)
    public int getFileCreateTime() {
        return fileCreateTime;
    }

    public void setFileCreateTime(int fileCreateTime) {
        this.fileCreateTime = fileCreateTime;
    }

    @Basic
    @Column(name = "fileType", nullable = false, length = 10)
    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
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

        FileEntity that = (FileEntity) o;

        if (id != that.id) return false;
        if (fileCreateTime != that.fileCreateTime) return false;
        if (deleteTag != that.deleteTag) return false;
        if (filePath != null ? !filePath.equals(that.filePath) : that.filePath != null) return false;
        if (fileType != null ? !fileType.equals(that.fileType) : that.fileType != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (filePath != null ? filePath.hashCode() : 0);
        result = 31 * result + fileCreateTime;
        result = 31 * result + (fileType != null ? fileType.hashCode() : 0);
        result = 31 * result + deleteTag;
        return result;
    }

    @OneToMany(mappedBy = "fileByFileId")
    public Collection<FileHelpIndexEntity> getFileHelpIndicesById() {
        return fileHelpIndicesById;
    }

    public void setFileHelpIndicesById(Collection<FileHelpIndexEntity> fileHelpIndicesById) {
        this.fileHelpIndicesById = fileHelpIndicesById;
    }

    @OneToMany(mappedBy = "fileByFileId")
    public Collection<FileTaskIndexEntity> getFileTaskIndicesById() {
        return fileTaskIndicesById;
    }

    public void setFileTaskIndicesById(Collection<FileTaskIndexEntity> fileTaskIndicesById) {
        this.fileTaskIndicesById = fileTaskIndicesById;
    }

    @OneToMany(mappedBy = "fileByAvatar")
    public Collection<UserInfoEntity> getUserInfosById() {
        return userInfosById;
    }

    public void setUserInfosById(Collection<UserInfoEntity> userInfosById) {
        this.userInfosById = userInfosById;
    }
}
