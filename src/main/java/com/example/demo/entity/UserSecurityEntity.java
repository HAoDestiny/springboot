package com.example.demo.entity;

import javax.persistence.*;
import java.util.Arrays;
import java.util.Collection;

/**
 * Created by Destiny_hao on 2017/10/3.
 */
@Entity
@Table(name = "user_security", schema = "paiban", catalog = "")
public class UserSecurityEntity {
    private int id;
    private int userId;
    private int tokenId;
    private String password;
    private byte[] realName;
    private String idCardNumber;
    private int moneyId;
    private int creditId;
    private UserEntity userByUserId;
    private UserTokenEntity userTokenByTokenId;
    private UserMoneyEntity userMoneyByMoneyId;
    private UserCreditEntity userCreditByCreditId;
    private Collection<UserTokenEntity> userTokensById;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "userId", nullable = false)
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "tokenId", nullable = false)
    public int getTokenId() {
        return tokenId;
    }

    public void setTokenId(int tokenId) {
        this.tokenId = tokenId;
    }

    @Basic
    @Column(name = "password", nullable = false, length = 32)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "realName", nullable = true)
    public byte[] getRealName() {
        return realName;
    }

    public void setRealName(byte[] realName) {
        this.realName = realName;
    }

    @Basic
    @Column(name = "IDCardNumber", nullable = true, length = 18)
    public String getIdCardNumber() {
        return idCardNumber;
    }

    public void setIdCardNumber(String idCardNumber) {
        this.idCardNumber = idCardNumber;
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
    @Column(name = "creditId", nullable = false)
    public int getCreditId() {
        return creditId;
    }

    public void setCreditId(int creditId) {
        this.creditId = creditId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserSecurityEntity that = (UserSecurityEntity) o;

        if (id != that.id) return false;
        if (userId != that.userId) return false;
        if (tokenId != that.tokenId) return false;
        if (moneyId != that.moneyId) return false;
        if (creditId != that.creditId) return false;
        if (password != null ? !password.equals(that.password) : that.password != null) return false;
        if (!Arrays.equals(realName, that.realName)) return false;
        if (idCardNumber != null ? !idCardNumber.equals(that.idCardNumber) : that.idCardNumber != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + userId;
        result = 31 * result + tokenId;
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + Arrays.hashCode(realName);
        result = 31 * result + (idCardNumber != null ? idCardNumber.hashCode() : 0);
        result = 31 * result + moneyId;
        result = 31 * result + creditId;
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "userId", referencedColumnName = "id", nullable = false)
    public UserEntity getUserByUserId() {
        return userByUserId;
    }

    public void setUserByUserId(UserEntity userByUserId) {
        this.userByUserId = userByUserId;
    }

    @ManyToOne
    @JoinColumn(name = "tokenId", referencedColumnName = "id", nullable = false)
    public UserTokenEntity getUserTokenByTokenId() {
        return userTokenByTokenId;
    }

    public void setUserTokenByTokenId(UserTokenEntity userTokenByTokenId) {
        this.userTokenByTokenId = userTokenByTokenId;
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
    @JoinColumn(name = "creditId", referencedColumnName = "id", nullable = false)
    public UserCreditEntity getUserCreditByCreditId() {
        return userCreditByCreditId;
    }

    public void setUserCreditByCreditId(UserCreditEntity userCreditByCreditId) {
        this.userCreditByCreditId = userCreditByCreditId;
    }

    @OneToMany(mappedBy = "userSecurityByUserSecurityId")
    public Collection<UserTokenEntity> getUserTokensById() {
        return userTokensById;
    }

    public void setUserTokensById(Collection<UserTokenEntity> userTokensById) {
        this.userTokensById = userTokensById;
    }
}
