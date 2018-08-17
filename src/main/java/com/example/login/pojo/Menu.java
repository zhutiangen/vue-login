package com.example.login.pojo;

import java.util.Date;
import javax.persistence.*;

@Table(name = "SYS_MENU")
public class Menu {
    @Id
    @Column(name = "MENU_ID")
    private String menuId;

    @Column(name = "MENU_NAME")
    private String menuName;

    @Column(name = "MENU_TYPE")
    private String menuType;

    @Column(name = "MENU_URL")
    private String menuUrl;

    @Column(name = "MENU_CODE")
    private String menuCode;

    @Column(name = "PARENT_ID")
    private String parentId;

    @Column(name = "PARENT_IDS")
    private String parentIds;

    @Column(name = "CHILD_NUM")
    private Short childNum;

    @Column(name = "LISTORDER")
    private Short listorder;

    @Column(name = "CRTD_DATE")
    private Date crtdDate;

    @Column(name = "UPDTD_DATE")
    private Date updtdDate;

    /**
     * @return MENU_ID
     */
    public String getMenuId() {
        return menuId;
    }

    /**
     * @param menuId
     */
    public void setMenuId(String menuId) {
        this.menuId = menuId == null ? null : menuId.trim();
    }

    /**
     * @return MENU_NAME
     */
    public String getMenuName() {
        return menuName;
    }

    /**
     * @param menuName
     */
    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    /**
     * @return MENU_TYPE
     */
    public String getMenuType() {
        return menuType;
    }

    /**
     * @param menuType
     */
    public void setMenuType(String menuType) {
        this.menuType = menuType == null ? null : menuType.trim();
    }

    /**
     * @return MENU_URL
     */
    public String getMenuUrl() {
        return menuUrl;
    }

    /**
     * @param menuUrl
     */
    public void setMenuUrl(String menuUrl) {
        this.menuUrl = menuUrl == null ? null : menuUrl.trim();
    }

    /**
     * @return MENU_CODE
     */
    public String getMenuCode() {
        return menuCode;
    }

    /**
     * @param menuCode
     */
    public void setMenuCode(String menuCode) {
        this.menuCode = menuCode == null ? null : menuCode.trim();
    }

    /**
     * @return PARENT_ID
     */
    public String getParentId() {
        return parentId;
    }

    /**
     * @param parentId
     */
    public void setParentId(String parentId) {
        this.parentId = parentId == null ? null : parentId.trim();
    }

    /**
     * @return PARENT_IDS
     */
    public String getParentIds() {
        return parentIds;
    }

    /**
     * @param parentIds
     */
    public void setParentIds(String parentIds) {
        this.parentIds = parentIds == null ? null : parentIds.trim();
    }

    /**
     * @return CHILD_NUM
     */
    public Short getChildNum() {
        return childNum;
    }

    /**
     * @param childNum
     */
    public void setChildNum(Short childNum) {
        this.childNum = childNum;
    }

    /**
     * @return LISTORDER
     */
    public Short getListorder() {
        return listorder;
    }

    /**
     * @param listorder
     */
    public void setListorder(Short listorder) {
        this.listorder = listorder;
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