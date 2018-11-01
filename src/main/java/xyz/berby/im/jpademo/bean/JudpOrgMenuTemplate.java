package xyz.berby.im.jpademo.bean;

import javax.persistence.*;
import java.sql.Time;
import java.util.Objects;

@Entity
@Table(name = "JUDP_ORG_MENU_TEMPLATE", schema = "TICKET", catalog = "")
public class JudpOrgMenuTemplate {
    private String orgMenuTemplateId;
    private String templateId;
    private String orgId;
    private String createPerson;
    private Time createTime;
    private String modifyPerson;
    private Time modifyTime;
    private String appId;
    private Long orderNum;
    private String custom;

    @Id
    @Column(name = "ORG_MENU_TEMPLATE_ID", nullable = false, length = 32)
    public String getOrgMenuTemplateId() {
        return orgMenuTemplateId;
    }

    public void setOrgMenuTemplateId(String orgMenuTemplateId) {
        this.orgMenuTemplateId = orgMenuTemplateId;
    }

    @Basic
    @Column(name = "TEMPLATE_ID", nullable = true, length = 32)
    public String getTemplateId() {
        return templateId;
    }

    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }

    @Basic
    @Column(name = "ORG_ID", nullable = false, length = 32)
    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId;
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
    @Column(name = "APP_ID", nullable = true, length = 32)
    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
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
    @Column(name = "CUSTOM", nullable = true, length = 3)
    public String getCustom() {
        return custom;
    }

    public void setCustom(String custom) {
        this.custom = custom;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JudpOrgMenuTemplate that = (JudpOrgMenuTemplate) o;
        return Objects.equals(orgMenuTemplateId, that.orgMenuTemplateId) &&
                Objects.equals(templateId, that.templateId) &&
                Objects.equals(orgId, that.orgId) &&
                Objects.equals(createPerson, that.createPerson) &&
                Objects.equals(createTime, that.createTime) &&
                Objects.equals(modifyPerson, that.modifyPerson) &&
                Objects.equals(modifyTime, that.modifyTime) &&
                Objects.equals(appId, that.appId) &&
                Objects.equals(orderNum, that.orderNum) &&
                Objects.equals(custom, that.custom);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orgMenuTemplateId, templateId, orgId, createPerson, createTime, modifyPerson, modifyTime, appId, orderNum, custom);
    }
}
