package com.example.login.pojo;

import java.util.Date;
import javax.persistence.*;

@Table(name = "SYS_USER")
public class User {
    @Id
    @Column(name = "U_ID")
    private String uId;

    @Column(name = "USERNAME")
    private String username;

    @Column(name = "PASSWORD")
    private String password;

    @Column(name = "STATE")
    private Short state;

    @Column(name = "SALT")
    private String salt;

    @Column(name = "IS_SYSTEM")
    private Short isSystem;

    @Column(name = "CRTD_DATE")
    private Date crtdDate;

    @Column(name = "UPDTD_DATE")
    private Date updtdDate;

    private String credentialsSalt;
    /**
     * @return U_ID
     */
    public String getuId() {
        return uId;
    }

    /**
     * @param uId
     */
    public void setuId(String uId) {
        this.uId = uId == null ? null : uId.trim();
    }

    /**
     * @return USERNAME
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return PASSWORD
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return STATE
     */
    public Short getState() {
        return state;
    }

    /**
     * @param state
     */
    public void setState(Short state) {
        this.state = state;
    }

    /**
     * @return SALT
     */
    public String getSalt() {
        return salt;
    }

    /**
     * @param salt
     */
    public void setSalt(String salt) {
        this.salt = salt == null ? null : salt.trim();
    }

    /**
     * @return IS_SYSTEM
     */
    public Short getIsSystem() {
        return isSystem;
    }

    /**
     * @param isSystem
     */
    public void setIsSystem(Short isSystem) {
        this.isSystem = isSystem;
    }

    /**
     * @return CRTD_DATE
     */
    public Date getCrtdDate() {
        return crtdDate;
    }

    /**
     * @param crtdDate
     */
    public void setCrtdDate(Date crtdDate) {
        this.crtdDate = crtdDate;
    }

    /**
     * @return UPDTD_DATE
     */
    public Date getUpdtdDate() {
        return updtdDate;
    }

    /**
     * @param updtdDate
     */
    public void setUpdtdDate(Date updtdDate) {
        this.updtdDate = updtdDate;
    }

    public String getCredentialsSalt() {
        return this.username+this.salt;
    }

    public void setCredentialsSalt(String credentialsSalt) {
        this.credentialsSalt = credentialsSalt;
    }
}