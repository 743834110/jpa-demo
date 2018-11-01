package xyz.berby.im.jpademo.bean;

import javax.persistence.*;
import java.sql.Time;
import java.util.Objects;

@Entity
@Table(name = "JUDP_APP_MENU", schema = "TICKET", catalog = "")
@IdClass(JudpAppMenuPK.class)
public class JudpAppMenu {
    private String menuId;
    private String templateId;
    private String menuName;
    private String parentMenuId;
    private String pagePoint;
    private String menuUrl;
    private String menuOpenMode;
    private String menuImageUrl;
    private Long orderNum;
    private String menuChief;
    private String createPerson;
    private Time createTime;
    private String modifyPerson;
    private Time modifyTime;
    private String compId;

    @Id
    @Column(name = "MENU_ID", nullable = false, length = 32)
    public String getMenuId() {
        return menuId;
    }

    public void setMenuId(String menuId) {
        this.menuId = menuId;
    }

    @Id
    @Column(name = "TEMPLATE_ID", nullable = false, length = 32)
    public String getTemplateId() {
        return templateId;
    }

    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }

    @Basic
    @Column(name = "MENU_NAME", nullable = true, length = 200)
    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    @Basic
    @Column(name = "PARENT_MENU_ID", nullable = true, length = 32)
    public String getParentMenuId() {
        return parentMenuId;
    }

    public void setParentMenuId(String parentMenuId) {
        this.parentMenuId = parentMenuId;
    }

    @Basic
    @Column(name = "PAGE_POINT", nullable = false, length = 3)
    public String getPagePoint() {
        return pagePoint;
    }

    public void setPagePoint(String pagePoint) {
        this.pagePoint = pagePoint;
    }

    @Basic
    @Column(name = "MENU_URL", nullable = true, length = 200)
    public String getMenuUrl() {
        return menuUrl;
    }

    public void setMenuUrl(String menuUrl) {
        this.menuUrl = menuUrl;
    }

    @Basic
    @Column(name = "MENU_OPEN_MODE", nullable = true, length = 3)
    public String getMenuOpenMode() {
        return menuOpenMode;
    }

    public void setMenuOpenMode(String menuOpenMode) {
        this.menuOpenMode = menuOpenMode;
    }

    @Basic
    @Column(name = "MENU_IMAGE_URL", nullable = true, length = 200)
    public String getMenuImageUrl() {
        return menuImageUrl;
    }

    public void setMenuImageUrl(String menuImageUrl) {
        this.menuImageUrl = menuImageUrl;
    }

    @Basic
    @Column(name = "ORDER_NUM", nullable = true, precision = 0)
    public Long getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(Long orderNum) {
        this.orderNum = orderNum;
    }

    @Basic
    @Column(name = "MENU_CHIEF", nullable = true, length = 3)
    public String getMenuChief() {
        return menuChief;
    }

    public void setMenuChief(String menuChief) {
        this.menuChief = menuChief;
    }

    @Basic
    @Column(name = "CREATE_PERSON", nullable = true, length = 32)
    public String getCreatePerson() {
        return createPerson;
    }

    public void setCreatePerson(String createPerson) {
        this.createPerson = createPerson;
    }

    @Basic
    @Column(name = "CREATE_TIME", nullable = true)
    public Time getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Time createTime) {
        this.createTime = createTime;
    }

    @Basic
    @Column(name = "MODIFY_PERSON", nullable = true, length = 32)
    public String getModifyPerson() {
        return modifyPerson;
    }

    public void setModifyPerson(String modifyPerson) {
        this.modifyPerson = modifyPerson;
    }

    @Basic
    @Column(name = "MODIFY_TIME", nullable = true)
    public Time getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Time modifyTime) {
        this.modifyTime = modifyTime;
    }

    @Basic
    @Column(name = "COMP_ID", nullable = true, length = 32)
    public String getCompId() {
        return compId;
    }

    public void setCompId(String compId) {
        this.compId = compId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JudpAppMenu that = (JudpAppMenu) o;
        return Objects.equals(menuId, that.menuId) &&
                Objects.equals(templateId, that.templateId) &&
                Objects.equals(menuName, that.menuName) &&
                Objects.equals(parentMenuId, that.parentMenuId) &&
                Objects.equals(pagePoint, that.pagePoint) &&
                Objects.equals(menuUrl, that.menuUrl) &&
                Objects.equals(menuOpenMode, that.menuOpenMode) &&
                Objects.equals(menuImageUrl, that.menuImageUrl) &&
                Objects.equals(orderNum, that.orderNum) &&
                Objects.equals(menuChief, that.menuChief) &&
                Objects.equals(createPerson, that.createPerson) &&
                Objects.equals(createTime, that.createTime) &&
                Objects.equals(modifyPerson, that.modifyPerson) &&
                Objects.equals(modifyTime, that.modifyTime) &&
                Objects.equals(compId, that.compId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(menuId, templateId, menuName, parentMenuId, pagePoint, menuUrl, menuOpenMode, menuImageUrl, orderNum, menuChief, createPerson, createTime, modifyPerson, modifyTime, compId);
    }
}
