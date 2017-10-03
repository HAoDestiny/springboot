package com.example.demo.entity;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by Destiny_hao on 2017/10/3.
 */
@Entity
@Table(name = "credit_comment", schema = "paiban", catalog = "")
public class CreditCommentEntity {
    private int id;
    private int goodComment;
    private int badComment;
    private int publishCount;
    private int gainCount;
    private int revokeCount;
    private int updateTime;
    private int middleComment;
    private Collection<UserCreditEntity> userCreditsById;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "goodComment", nullable = false)
    public int getGoodComment() {
        return goodComment;
    }

    public void setGoodComment(int goodComment) {
        this.goodComment = goodComment;
    }

    @Basic
    @Column(name = "badComment", nullable = false)
    public int getBadComment() {
        return badComment;
    }

    public void setBadComment(int badComment) {
        this.badComment = badComment;
    }

    @Basic
    @Column(name = "publishCount", nullable = false)
    public int getPublishCount() {
        return publishCount;
    }

    public void setPublishCount(int publishCount) {
        this.publishCount = publishCount;
    }

    @Basic
    @Column(name = "gainCount", nullable = false)
    public int getGainCount() {
        return gainCount;
    }

    public void setGainCount(int gainCount) {
        this.gainCount = gainCount;
    }

    @Basic
    @Column(name = "revokeCount", nullable = false)
    public int getRevokeCount() {
        return revokeCount;
    }

    public void setRevokeCount(int revokeCount) {
        this.revokeCount = revokeCount;
    }

    @Basic
    @Column(name = "updateTime", nullable = false)
    public int getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(int updateTime) {
        this.updateTime = updateTime;
    }

    @Basic
    @Column(name = "middleComment", nullable = false)
    public int getMiddleComment() {
        return middleComment;
    }

    public void setMiddleComment(int middleComment) {
        this.middleComment = middleComment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CreditCommentEntity that = (CreditCommentEntity) o;

        if (id != that.id) return false;
        if (goodComment != that.goodComment) return false;
        if (badComment != that.badComment) return false;
        if (publishCount != that.publishCount) return false;
        if (gainCount != that.gainCount) return false;
        if (revokeCount != that.revokeCount) return false;
        if (updateTime != that.updateTime) return false;
        if (middleComment != that.middleComment) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + goodComment;
        result = 31 * result + badComment;
        result = 31 * result + publishCount;
        result = 31 * result + gainCount;
        result = 31 * result + revokeCount;
        result = 31 * result + updateTime;
        result = 31 * result + middleComment;
        return result;
    }

    @OneToMany(mappedBy = "creditCommentByCommentId")
    public Collection<UserCreditEntity> getUserCreditsById() {
        return userCreditsById;
    }

    public void setUserCreditsById(Collection<UserCreditEntity> userCreditsById) {
        this.userCreditsById = userCreditsById;
    }
}
