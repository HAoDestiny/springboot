package com.example.demo.entity;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by Destiny_hao on 2017/10/3.
 */
@Entity
@Table(name = "user_credit", schema = "paiban", catalog = "")
public class UserCreditEntity {
    private int id;
    private Integer zhiMaPoint;
    private int commentId;
    private CreditCommentEntity creditCommentByCommentId;
    private Collection<UserSecurityEntity> userSecuritiesById;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "zhiMaPoint", nullable = true)
    public Integer getZhiMaPoint() {
        return zhiMaPoint;
    }

    public void setZhiMaPoint(Integer zhiMaPoint) {
        this.zhiMaPoint = zhiMaPoint;
    }

    @Basic
    @Column(name = "commentId", nullable = false)
    public int getCommentId() {
        return commentId;
    }

    public void setCommentId(int commentId) {
        this.commentId = commentId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserCreditEntity that = (UserCreditEntity) o;

        if (id != that.id) return false;
        if (commentId != that.commentId) return false;
        if (zhiMaPoint != null ? !zhiMaPoint.equals(that.zhiMaPoint) : that.zhiMaPoint != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (zhiMaPoint != null ? zhiMaPoint.hashCode() : 0);
        result = 31 * result + commentId;
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "commentId", referencedColumnName = "id", nullable = false)
    public CreditCommentEntity getCreditCommentByCommentId() {
        return creditCommentByCommentId;
    }

    public void setCreditCommentByCommentId(CreditCommentEntity creditCommentByCommentId) {
        this.creditCommentByCommentId = creditCommentByCommentId;
    }

    @OneToMany(mappedBy = "userCreditByCreditId")
    public Collection<UserSecurityEntity> getUserSecuritiesById() {
        return userSecuritiesById;
    }

    public void setUserSecuritiesById(Collection<UserSecurityEntity> userSecuritiesById) {
        this.userSecuritiesById = userSecuritiesById;
    }
}
