package com.example.demo.entity;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by Destiny_hao on 2017/10/3.
 */
@Entity
@Table(name = "detail_freeze", schema = "paiban", catalog = "")
public class DetailFreezeEntity {
    private int id;
    private int frozenFunds;
    private int frozenFundsTime;
    private Integer thawingTime;
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
    @Column(name = "frozenFunds", nullable = false, precision = 0)
    public int getFrozenFunds() {
        return frozenFunds;
    }

    public void setFrozenFunds(int frozenFunds) {
        this.frozenFunds = frozenFunds;
    }

    @Basic
    @Column(name = "frozenFundsTime", nullable = false)
    public int getFrozenFundsTime() {
        return frozenFundsTime;
    }

    public void setFrozenFundsTime(int frozenFundsTime) {
        this.frozenFundsTime = frozenFundsTime;
    }

    @Basic
    @Column(name = "ThawingTime", nullable = true)
    public Integer getThawingTime() {
        return thawingTime;
    }

    public void setThawingTime(Integer thawingTime) {
        this.thawingTime = thawingTime;
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

        DetailFreezeEntity that = (DetailFreezeEntity) o;

        if (id != that.id) return false;
        if (frozenFunds != that.frozenFunds) return false;
        if (frozenFundsTime != that.frozenFundsTime) return false;
        if (thawingTime != null ? !thawingTime.equals(that.thawingTime) : that.thawingTime != null) return false;
        if (note != null ? !note.equals(that.note) : that.note != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + frozenFunds;
        result = 31 * result + frozenFundsTime;
        result = 31 * result + (thawingTime != null ? thawingTime.hashCode() : 0);
        result = 31 * result + (note != null ? note.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "detailFreezeByDetailId")
    public Collection<DetailMoneyEntity> getDetailMoniesById() {
        return detailMoniesById;
    }

    public void setDetailMoniesById(Collection<DetailMoneyEntity> detailMoniesById) {
        this.detailMoniesById = detailMoniesById;
    }
}
