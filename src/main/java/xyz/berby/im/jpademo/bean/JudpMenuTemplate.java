package xyz.berby.im.jpademo.bean;

import javax.persistence.*;
import java.sql.Time;
import java.util.Objects;

@Entity
@Table(name = "JUDP_MENU_TEMPLATE", schema = "TICKET", catalog = "")
public class JudpMenuTemplate {
    private String templateId;
    private String templateName;
    private String templateDesc;
    private String createPerson;
    private Time createTime;
    private String modifyPerson;
    private Time modifyTime;
    private String tenantTypeId;
    private String appId;
    private String tenant;

    @Id
    @Column(name = "TEMPLATE_ID", nullable = false, length = 32)
    public String getTemplateId() {
        return templateId;
    }

    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }

    @Basic
    @Column(name = "TEMPLATE_NAME", nullable = false, length = 100)
    public String getTemplateName() {
        return templateName;
    }

    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    @Basic
    @Column(name = "TEMPLATE_DESC", nullable = true, length = 100)
    public String getTemplateDesc() {
        return templateDesc;
    }

    public void setTemplateDesc(String templateDesc) {
        this.templateDesc = templateDesc;
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
    @Column(name = "TENANT_TYPE_ID", nullable = true, length = 32)
    public String getTenantTypeId() {
        return tenantTypeId;
    }

    public void setTenantTypeId(String tenantTypeId) {
        this.tenantTypeId = tenantTypeId;
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
    @Column(name = "TENANT", nullable = true, length = 3)
    public String getTenant() {
        return tenant;
    }

    public void setTenant(String tenant) {
        this.tenant = tenant;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JudpMenuTemplate that = (JudpMenuTemplate) o;
        return Objects.equals(templateId, that.templateId) &&
                Objects.equals(templateName, that.templateName) &&
                Objects.equals(templateDesc, that.templateDesc) &&
                Objects.equals(createPerson, that.createPerson) &&
                Objects.equals(createTime, that.createTime) &&
                Objects.equals(modifyPerson, that.modifyPerson) &&
                Objects.equals(modifyTime, that.modifyTime) &&
                Objects.equals(tenantTypeId, that.tenantTypeId) &&
                Objects.equals(appId, that.appId) &&
                Objects.equals(tenant, that.tenant);
    }

    @Override
    public int hashCode() {
        return Objects.hash(templateId, templateName, templateDesc, createPerson, createTime, modifyPerson, modifyTime, tenantTypeId, appId, tenant);
    }
}
