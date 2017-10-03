package com.example.demo.entity;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by Destiny_hao on 2017/10/3.
 */
@Entity
@Table(name = "detail_kiting", schema = "paiban", catalog = "")
public class DetailKitingEntity {
    private int id;
    private int kitingMoney;
    private int kitingCreateTime;
    private Integer arriveTime;
    private int type;
    private String note;
    private Collection<DetailMoneyEntity> detailMoniesById;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "kitingMoney", nullable = false, precision = 0)
    public int getKitingMoney() {
        return kitingMoney;
    }

    public void setKitingMoney(int kitingMoney) {
        this.kitingMoney = kitingMoney;
    }

    @Basic
    @Column(name = "kitingCreateTime", nullable = false)
    public int getKitingCreateTime() {
        return kitingCreateTime;
    }

    public void setKitingCreateTime(int kitingCreateTime) {
        this.kitingCreateTime = kitingCreateTime;
    }

    @Basic
    @Column(name = "arriveTime", nullable = true)
    public Integer getArriveTime() {
        return arriveTime;
    }

    public void setArriveTime(Integer arriveTime) {
        this.arriveTime = arriveTime;
    }

    @Basic
    @Column(name = "type", nullable = false)
    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    @Basic
    @Column(name = "note", nullable = false, length = 255)
    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DetailKitingEntity that = (DetailKitingEntity) o;

        if (id != that.id) return false;
        if (kitingMoney != that.kitingMoney) return false;
        if (kitingCreateTime != that.kitingCreateTime) return false;
        if (type != that.type) return false;
        if (arriveTime != null ? !arriveTime.equals(that.arriveTime) : that.arriveTime != null) return false;
        if (note != null ? !note.equals(that.note) : that.note != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + kitingMoney;
        result = 31 * result + kitingCreateTime;
        result = 31 * result + (arriveTime != null ? arriveTime.hashCode() : 0);
        result = 31 * result + type;
        result = 31 * result + (note != null ? note.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "detailKitingByDetailId")
    public Collection<DetailMoneyEntity> getDetailMoniesById() {
        return detailMoniesById;
    }

    public void setDetailMoniesById(Collection<DetailMoneyEntity> detailMoniesById) {
        this.detailMoniesById = detailMoniesById;
    }
}
