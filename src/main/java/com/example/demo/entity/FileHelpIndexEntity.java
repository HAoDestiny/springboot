package com.example.demo.entity;

import javax.persistence.*;

/**
 * Created by Destiny_hao on 2017/10/3.
 */
@Entity
@Table(name = "file_help_index", schema = "paiban", catalog = "")
public class FileHelpIndexEntity {
    private int id;
    private int helpId;
    private int fileId;
    private HelpEntity helpByHelpId;
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
    @Column(name = "helpId", nullable = false)
    public int getHelpId() {
        return helpId;
    }

    public void setHelpId(int helpId) {
        this.helpId = helpId;
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

        FileHelpIndexEntity that = (FileHelpIndexEntity) o;

        if (id != that.id) return false;
        if (helpId != that.helpId) return false;
        if (fileId != that.fileId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + helpId;
        result = 31 * result + fileId;
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "helpId", referencedColumnName = "id", nullable = false)
    public HelpEntity getHelpByHelpId() {
        return helpByHelpId;
    }

    public void setHelpByHelpId(HelpEntity helpByHelpId) {
        this.helpByHelpId = helpByHelpId;
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
