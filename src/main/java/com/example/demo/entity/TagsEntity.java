package com.example.demo.entity;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by Destiny_hao on 2017/10/3.
 */
@Entity
@Table(name = "tags", schema = "paiban", catalog = "")
public class TagsEntity {
    private int id;
    private String tagName;
    private Collection<TagsToTaskEntity> tagsToTasksById;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "tagName", nullable = false, length = 20)
    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TagsEntity that = (TagsEntity) o;

        if (id != that.id) return false;
        if (tagName != null ? !tagName.equals(that.tagName) : that.tagName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (tagName != null ? tagName.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "tagsByTagId")
    public Collection<TagsToTaskEntity> getTagsToTasksById() {
        return tagsToTasksById;
    }

    public void setTagsToTasksById(Collection<TagsToTaskEntity> tagsToTasksById) {
        this.tagsToTasksById = tagsToTasksById;
    }
}
