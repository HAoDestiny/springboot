package com.example.demo.entity;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by Destiny_hao on 2017/10/3.
 */
@Entity
@Table(name = "user_token", schema = "paiban", catalog = "")
public class UserTokenEntity {
    private int id;
    private int userSecurityId;
    private String tokenCode;
    private int expirationTime;
    private String refreshCode;
    private int refreshCodeExpirationTime;
    private int userType;
    private Collection<UserSecurityEntity> userSecuritiesById;
    private UserSecurityEntity userSecurityByUserSecurityId;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "userSecurityId", nullable = false)
    public int getUserSecurityId() {
        return userSecurityId;
    }

    public void setUserSecurityId(int userSecurityId) {
        this.userSecurityId = userSecurityId;
    }

    @Basic
    @Column(name = "tokenCode", nullable = false, length = 32)
    public String getTokenCode() {
        return tokenCode;
    }

    public void setTokenCode(String tokenCode) {
        this.tokenCode = tokenCode;
    }

    @Basic
    @Column(name = "expirationTime", nullable = false)
    public int getExpirationTime() {
        return expirationTime;
    }

    public void setExpirationTime(int expirationTime) {
        this.expirationTime = expirationTime;
    }

    @Basic
    @Column(name = "refreshCode", nullable = false, length = 32)
    public String getRefreshCode() {
        return refreshCode;
    }

    public void setRefreshCode(String refreshCode) {
        this.refreshCode = refreshCode;
    }

    @Basic
    @Column(name = "refreshCodeExpirationTime", nullable = false)
    public int getRefreshCodeExpirationTime() {
        return refreshCodeExpirationTime;
    }

    public void setRefreshCodeExpirationTime(int refreshCodeExpirationTime) {
        this.refreshCodeExpirationTime = refreshCodeExpirationTime;
    }

    @Basic
    @Column(name = "userType", nullable = false)
    public int getUserType() {
        return userType;
    }

    public void setUserType(int userType) {
        this.userType = userType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserTokenEntity that = (UserTokenEntity) o;

        if (id != that.id) return false;
        if (userSecurityId != that.userSecurityId) return false;
        if (expirationTime != that.expirationTime) return false;
        if (refreshCodeExpirationTime != that.refreshCodeExpirationTime) return false;
        if (userType != that.userType) return false;
        if (tokenCode != null ? !tokenCode.equals(that.tokenCode) : that.tokenCode != null) return false;
        if (refreshCode != null ? !refreshCode.equals(that.refreshCode) : that.refreshCode != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + userSecurityId;
        result = 31 * result + (tokenCode != null ? tokenCode.hashCode() : 0);
        result = 31 * result + expirationTime;
        result = 31 * result + (refreshCode != null ? refreshCode.hashCode() : 0);
        result = 31 * result + refreshCodeExpirationTime;
        result = 31 * result + userType;
        return result;
    }

    @OneToMany(mappedBy = "userTokenByTokenId")
    public Collection<UserSecurityEntity> getUserSecuritiesById() {
        return userSecuritiesById;
    }

    public void setUserSecuritiesById(Collection<UserSecurityEntity> userSecuritiesById) {
        this.userSecuritiesById = userSecuritiesById;
    }

    @ManyToOne
    @JoinColumn(name = "userSecurityId", referencedColumnName = "id", nullable = false)
    public UserSecurityEntity getUserSecurityByUserSecurityId() {
        return userSecurityByUserSecurityId;
    }

    public void setUserSecurityByUserSecurityId(UserSecurityEntity userSecurityByUserSecurityId) {
        this.userSecurityByUserSecurityId = userSecurityByUserSecurityId;
    }
}
