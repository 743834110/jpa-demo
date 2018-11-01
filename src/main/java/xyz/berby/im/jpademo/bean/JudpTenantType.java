package xyz.berby.im.jpademo.bean;

import javax.persistence.*;
import java.sql.Time;
import java.util.Objects;

@Entity
@Table(name = "JUDP_TENANT_TYPE", schema = "TICKET", catalog = "")
public class JudpTenantType {
    private String tenantTypeId;
    private String tenantTypeName;
    private String classify;
    private String createPerson;
    private Time createTime;
    private String modifyPerson;
    private Time modifyTime;
    private String rebackname;
    private String beanclass;
    private String updatable;
    private String initTemplateId;
    private String defaultTemplateId;

    @Id
    @Column(name = "TENANT_TYPE_ID", nullable = false, length = 32)
    public String getTenantTypeId() {
        return tenantTypeId;
    }

    public void setTenantTypeId(String tenantTypeId) {
        this.tenantTypeId = tenantTypeId;
    }

    @Basic
    @Column(name = "TENANT_TYPE_NAME", nullable = false, length = 100)
    public String getTenantTypeName() {
        return tenantTypeName;
    }

    public void setTenantTypeName(String tenantTypeName) {
        this.tenantTypeName = tenantTypeName;
    }

    @Basic
    @Column(name = "CLASSIFY", nullable = true, length = 32)
    public String getClassify() {
        return classify;
    }

    public void setClassify(String classify) {
        this.classify = classify;
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
    @Column(name = "REBACKNAME", nullable = true, length = 100)
    public String getRebackname() {
        return rebackname;
    }

    public void setRebackname(String rebackname) {
        this.rebackname = rebackname;
    }

    @Basic
    @Column(name = "BEANCLASS", nullable = true, length = 100)
    public String getBeanclass() {
        return beanclass;
    }

    public void setBeanclass(String beanclass) {
        this.beanclass = beanclass;
    }

    @Basic
    @Column(name = "UPDATABLE", nullable = true, length = 100)
    public String getUpdatable() {
        return updatable;
    }

    public void setUpdatable(String updatable) {
        this.updatable = updatable;
    }

    @Basic
    @Column(name = "INIT_TEMPLATE_ID", nullable = true, length = 32)
    public String getInitTemplateId() {
        return initTemplateId;
    }

    public void setInitTemplateId(String initTemplateId) {
        this.initTemplateId = initTemplateId;
    }

    @Basic
    @Column(name = "DEFAULT_TEMPLATE_ID", nullable = true, length = 32)
    public String getDefaultTemplateId() {
        return defaultTemplateId;
    }

    public void setDefaultTemplateId(String defaultTemplateId) {
        this.defaultTemplateId = defaultTemplateId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JudpTenantType that = (JudpTenantType) o;
        return Objects.equals(tenantTypeId, that.tenantTypeId) &&
                Objects.equals(tenantTypeName, that.tenantTypeName) &&
                Objects.equals(classify, that.classify) &&
                Objects.equals(createPerson, that.createPerson) &&
                Objects.equals(createTime, that.createTime) &&
                Objects.equals(modifyPerson, that.modifyPerson) &&
                Objects.equals(modifyTime, that.modifyTime) &&
                Objects.equals(rebackname, that.rebackname) &&
                Objects.equals(beanclass, that.beanclass) &&
                Objects.equals(updatable, that.updatable) &&
                Objects.equals(initTemplateId, that.initTemplateId) &&
                Objects.equals(defaultTemplateId, that.defaultTemplateId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tenantTypeId, tenantTypeName, classify, createPerson, createTime, modifyPerson, modifyTime, rebackname, beanclass, updatable, initTemplateId, defaultTemplateId);
    }
}
