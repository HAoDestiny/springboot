package com.example.demo.entity;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by Destiny_hao on 2017/10/3.
 */
@Entity
@Table(name = "detail_charge", schema = "paiban", catalog = "")
public class DetailChargeEntity {
    private int id;
    private int chargeMoney;
    private int chargeCreateTime;
    private Integer chargeArriveTime;
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
    @Column(name = "chargeMoney", nullable = false, precision = 0)
    public int getChargeMoney() {
        return chargeMoney;
    }

    public void setChargeMoney(int chargeMoney) {
        this.chargeMoney = chargeMoney;
    }

    @Basic
    @Column(name = "chargeCreateTime", nullable = false)
    public int getChargeCreateTime() {
        return chargeCreateTime;
    }

    public void setChargeCreateTime(int chargeCreateTime) {
        this.chargeCreateTime = chargeCreateTime;
    }

    @Basic
    @Column(name = "chargeArriveTime", nullable = true)
    public Integer getChargeArriveTime() {
        return chargeArriveTime;
    }

    public void setChargeArriveTime(Integer chargeArriveTime) {
        this.chargeArriveTime = chargeArriveTime;
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
    @Column(name = "note", nullable = true, length = 255)
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

        DetailChargeEntity that = (DetailChargeEntity) o;

        if (id != that.id) return false;
        if (chargeMoney != that.chargeMoney) return false;
        if (chargeCreateTime != that.chargeCreateTime) return false;
        if (type != that.type) return false;
        if (chargeArriveTime != null ? !chargeArriveTime.equals(that.chargeArriveTime) : that.chargeArriveTime != null)
            return false;
        if (note != null ? !note.equals(that.note) : that.note != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + chargeMoney;
        result = 31 * result + chargeCreateTime;
        result = 31 * result + (chargeArriveTime != null ? chargeArriveTime.hashCode() : 0);
        result = 31 * result + type;
        result = 31 * result + (note != null ? note.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "detailChargeByDetailId")
    public Collection<DetailMoneyEntity> getDetailMoniesById() {
        return detailMoniesById;
    }

    public void setDetailMoniesById(Collection<DetailMoneyEntity> detailMoniesById) {
        this.detailMoniesById = detailMoniesById;
    }
}
