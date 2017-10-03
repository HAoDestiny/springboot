package com.example.demo.entity;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by Destiny_hao on 2017/10/3.
 */
@Entity
@Table(name = "user_money", schema = "paiban", catalog = "")
public class UserMoneyEntity {
    private int id;
    private int money;
    private int freezeMoney;
    private int kittingMoney;
    private String alipay;
    private String bankCard;
    private Collection<DetailMoneyEntity> detailMoniesById;
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
    @Column(name = "money", nullable = false, precision = 0)
    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    @Basic
    @Column(name = "freezeMoney", nullable = false, precision = 0)
    public int getFreezeMoney() {
        return freezeMoney;
    }

    public void setFreezeMoney(int freezeMoney) {
        this.freezeMoney = freezeMoney;
    }

    @Basic
    @Column(name = "kittingMoney", nullable = false, precision = 0)
    public int getKittingMoney() {
        return kittingMoney;
    }

    public void setKittingMoney(int kittingMoney) {
        this.kittingMoney = kittingMoney;
    }

    @Basic
    @Column(name = "alipay", nullable = true, length = 32)
    public String getAlipay() {
        return alipay;
    }

    public void setAlipay(String alipay) {
        this.alipay = alipay;
    }

    @Basic
    @Column(name = "bankCard", nullable = true, length = 32)
    public String getBankCard() {
        return bankCard;
    }

    public void setBankCard(String bankCard) {
        this.bankCard = bankCard;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserMoneyEntity that = (UserMoneyEntity) o;

        if (id != that.id) return false;
        if (money != that.money) return false;
        if (freezeMoney != that.freezeMoney) return false;
        if (kittingMoney != that.kittingMoney) return false;
        if (alipay != null ? !alipay.equals(that.alipay) : that.alipay != null) return false;
        if (bankCard != null ? !bankCard.equals(that.bankCard) : that.bankCard != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + money;
        result = 31 * result + freezeMoney;
        result = 31 * result + kittingMoney;
        result = 31 * result + (alipay != null ? alipay.hashCode() : 0);
        result = 31 * result + (bankCard != null ? bankCard.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "userMoneyByMoneyId")
    public Collection<DetailMoneyEntity> getDetailMoniesById() {
        return detailMoniesById;
    }

    public void setDetailMoniesById(Collection<DetailMoneyEntity> detailMoniesById) {
        this.detailMoniesById = detailMoniesById;
    }

    @OneToMany(mappedBy = "userMoneyByMoneyId")
    public Collection<UserSecurityEntity> getUserSecuritiesById() {
        return userSecuritiesById;
    }

    public void setUserSecuritiesById(Collection<UserSecurityEntity> userSecuritiesById) {
        this.userSecuritiesById = userSecuritiesById;
    }
}
