package xyz.berby.im.jpademo.bean;

import javax.persistence.*;
import java.sql.Time;
import java.util.Objects;

@Entity
@Table(name = "JUDP_WORKFLOW_ROLE", schema = "TICKET", catalog = "")
public class JudpWorkflowRole {
    private String wfRoleId;
    private String wfRoleCode;
    private String wfRoleName;
    private String orgId;
    private String filterRange;
    private String valid;
    private String createPerson;
    private Time createTime;
    private String modifyPerson;
    private Time modifyTime;

    @Id
    @Column(name = "WF_ROLE_ID", nullable = false, length = 32)
    public String getWfRoleId() {
        return wfRoleId;
    }

    public void setWfRoleId(String wfRoleId) {
        this.wfRoleId = wfRoleId;
    }

    @Basic
    @Column(name = "WF_ROLE_CODE", nullable = false, length = 32)
    public String getWfRoleCode() {
        return wfRoleCode;
    }

    public void setWfRoleCode(String wfRoleCode) {
        this.wfRoleCode = wfRoleCode;
    }

    @Basic
    @Column(name = "WF_ROLE_NAME", nullable = false, length = 100)
    public String getWfRoleName() {
        return wfRoleName;
    }

    public void setWfRoleName(String wfRoleName) {
        this.wfRoleName = wfRoleName;
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
    @Column(name = "FILTER_RANGE", nullable = false, length = 3)
    public String getFilterRange() {
        return filterRange;
    }

    public void setFilterRange(String filterRange) {
        this.filterRange = filterRange;
    }

    @Basic
    @Column(name = "VALID", nullable = false, length = 3)
    public String getValid() {
        return valid;
    }

    public void setValid(String valid) {
        this.valid = valid;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JudpWorkflowRole that = (JudpWorkflowRole) o;
        return Objects.equals(wfRoleId, that.wfRoleId) &&
                Objects.equals(wfRoleCode, that.wfRoleCode) &&
                Objects.equals(wfRoleName, that.wfRoleName) &&
                Objects.equals(orgId, that.orgId) &&
                Objects.equals(filterRange, that.filterRange) &&
                Objects.equals(valid, that.valid) &&
                Objects.equals(createPerson, that.createPerson) &&
                Objects.equals(createTime, that.createTime) &&
                Objects.equals(modifyPerson, that.modifyPerson) &&
                Objects.equals(modifyTime, that.modifyTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(wfRoleId, wfRoleCode, wfRoleName, orgId, filterRange, valid, createPerson, createTime, modifyPerson, modifyTime);
    }
}
