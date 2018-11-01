package xyz.berby.im.jpademo.bean;

import javax.persistence.*;
import java.sql.Time;
import java.util.Objects;

@Entity
@Table(name = "JUDP_ORG_TENANT_TYPE", schema = "TICKET", catalog = "")
@IdClass(JudpOrgTenantTypePK.class)
public class JudpOrgTenantType {
    private String tenantTypeId;
    private String createPerson;
    private Time createTime;
    private String modifyPerson;
    private Time modifyTime;
    private String applyOrgId;
    private String orgId;
    private String wfid;
    private String wfStatus;

    @Id
    @Column(name = "TENANT_TYPE_ID", nullable = false, length = 32)
    public String getTenantTypeId() {
        return tenantTypeId;
    }

    public void setTenantTypeId(String tenantTypeId) {
        this.tenantTypeId = tenantTypeId;
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

    @Id
    @Column(name = "APPLY_ORG_ID", nullable = false, length = 32)
    public String getApplyOrgId() {
        return applyOrgId;
    }

    public void setApplyOrgId(String applyOrgId) {
        this.applyOrgId = applyOrgId;
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
    @Column(name = "WFID", nullable = true, length = 64)
    public String getWfid() {
        return wfid;
    }

    public void setWfid(String wfid) {
        this.wfid = wfid;
    }

    @Basic
    @Column(name = "WF_STATUS", nullable = true, length = 150)
    public String getWfStatus() {
        return wfStatus;
    }

    public void setWfStatus(String wfStatus) {
        this.wfStatus = wfStatus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JudpOrgTenantType that = (JudpOrgTenantType) o;
        return Objects.equals(tenantTypeId, that.tenantTypeId) &&
                Objects.equals(createPerson, that.createPerson) &&
                Objects.equals(createTime, that.createTime) &&
                Objects.equals(modifyPerson, that.modifyPerson) &&
                Objects.equals(modifyTime, that.modifyTime) &&
                Objects.equals(applyOrgId, that.applyOrgId) &&
                Objects.equals(orgId, that.orgId) &&
                Objects.equals(wfid, that.wfid) &&
                Objects.equals(wfStatus, that.wfStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tenantTypeId, createPerson, createTime, modifyPerson, modifyTime, applyOrgId, orgId, wfid, wfStatus);
    }
}
