package com.example.login.pojo;

import java.util.Date;
import javax.persistence.*;

@Table(name = "SYS_ROLE")
public class Role {
    @Id
    @Column(name = "ROLE_ID")
    private String roleId;

    @Column(name = "ROLE_NAME")
    private String roleName;

    @Column(name = "ROLE_DESC")
    private String roleDesc;

    @Column(name = "ENABLE")
    private Short enable;

    @Column(name = "CRTD_DATE")
    private Date crtdDate;

    @Column(name = "UPDTD_DATE")
    private Date updtdDate;

    /**
     * @return ROLE_ID
     */
    public String getRoleId() {
        return roleId;
    }

    /**
     * @param roleId
     */
    public void setRoleId(String roleId) {
        this.roleId = roleId == null ? null : roleId.trim();
    }

    /**
     * @return ROLE_NAME
     */
    public String getRoleName() {
        return roleName;
    }

    /**
     * @param roleName
     */
    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    /**
     * @return ROLE_DESC
     */
    public String getRoleDesc() {
        return roleDesc;
    }

    /**
     * @param roleDesc
     */
    public void setRoleDesc(String roleDesc) {
        this.roleDesc = roleDesc == null ? null : roleDesc.trim();
    }

    /**
     * @return ENABLE
     */
    public Short getEnable() {
        return enable;
    }

    /**
     * @param enable
     */
    public void setEnable(Short enable) {
        this.enable = enable;
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
}