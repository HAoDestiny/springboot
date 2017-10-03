package com.example.demo.entity;

import javax.persistence.*;

/**
 * Created by Destiny_hao on 2017/10/3.
 */
@Entity
@Table(name = "detail_money", schema = "paiban", catalog = "")
public class DetailMoneyEntity {
    private int id;
    private int moneyId;
    private int detailType;
    private int detailId;
    private int money;
    private int createTime;
    private int deleteTag;
    private int status;
    private String statusNote;
    private UserMoneyEntity userMoneyByMoneyId;
    private DetailChargeEntity detailChargeByDetailId;
    private DetailFreezeEntity detailFreezeByDetailId;
    private DetailKitingEntity detailKitingByDetailId;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "moneyId", nullable = false)
    public int getMoneyId() {
        return moneyId;
    }

    public void setMoneyId(int moneyId) {
        this.moneyId = moneyId;
    }

    @Basic
    @Column(name = "detailType", nullable = false)
    public int getDetailType() {
        return detailType;
    }

    public void setDetailType(int detailType) {
        this.detailType = detailType;
    }

    @Basic
    @Column(name = "detailId", nullable = false)
    public int getDetailId() {
        return detailId;
    }

    public void setDetailId(int detailId) {
        this.detailId = detailId;
    }

    @Basic
    @Column(name = "money", nullable = false, precision = 0)
    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    @Basic
    @Column(name = "createTime", nullable = false)
    public int getCreateTime() {
        return createTime;
    }

    public void setCreateTime(int createTime) {
        this.createTime = createTime;
    }

    @Basic
    @Column(name = "deleteTag", nullable = false)
    public int getDeleteTag() {
        return deleteTag;
    }

    public void setDeleteTag(int deleteTag) {
        this.deleteTag = deleteTag;
    }

    @Basic
    @Column(name = "status", nullable = false)
    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Basic
    @Column(name = "statusNote", nullable = true, length = 255)
    public String getStatusNote() {
        return statusNote;
    }

    public void setStatusNote(String statusNote) {
        this.statusNote = statusNote;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DetailMoneyEntity that = (DetailMoneyEntity) o;

        if (id != that.id) return false;
        if (moneyId != that.moneyId) return false;
        if (detailType != that.detailType) return false;
        if (detailId != that.detailId) return false;
        if (money != that.money) return false;
        if (createTime != that.createTime) return false;
        if (deleteTag != that.deleteTag) return false;
        if (status != that.status) return false;
        if (statusNote != null ? !statusNote.equals(that.statusNote) : that.statusNote != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + moneyId;
        result = 31 * result + detailType;
        result = 31 * result + detailId;
        result = 31 * result + money;
        result = 31 * result + createTime;
        result = 31 * result + deleteTag;
        result = 31 * result + status;
        result = 31 * result + (statusNote != null ? statusNote.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "moneyId", referencedColumnName = "id", nullable = false)
    public UserMoneyEntity getUserMoneyByMoneyId() {
        return userMoneyByMoneyId;
    }

    public void setUserMoneyByMoneyId(UserMoneyEntity userMoneyByMoneyId) {
        this.userMoneyByMoneyId = userMoneyByMoneyId;
    }

    @ManyToOne
    @JoinColumn(name = "detailId", referencedColumnName = "id", nullable = false)
    public DetailChargeEntity getDetailChargeByDetailId() {
        return detailChargeByDetailId;
    }

    public void setDetailChargeByDetailId(DetailChargeEntity detailChargeByDetailId) {
        this.detailChargeByDetailId = detailChargeByDetailId;
    }

    @ManyToOne
    @JoinColumn(name = "detailId", referencedColumnName = "id", nullable = false)
    public DetailFreezeEntity getDetailFreezeByDetailId() {
        return detailFreezeByDetailId;
    }

    public void setDetailFreezeByDetailId(DetailFreezeEntity detailFreezeByDetailId) {
        this.detailFreezeByDetailId = detailFreezeByDetailId;
    }

    @ManyToOne
    @JoinColumn(name = "detailId", referencedColumnName = "id", nullable = false)
    public DetailKitingEntity getDetailKitingByDetailId() {
        return detailKitingByDetailId;
    }

    public void setDetailKitingByDetailId(DetailKitingEntity detailKitingByDetailId) {
        this.detailKitingByDetailId = detailKitingByDetailId;
    }
}
