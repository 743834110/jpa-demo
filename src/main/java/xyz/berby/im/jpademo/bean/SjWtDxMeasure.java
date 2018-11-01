package xyz.berby.im.jpademo.bean;

import javax.persistence.*;
import java.sql.Time;
import java.util.Objects;

@Entity
@Table(name = "SJ_WT_DX_MEASURE", schema = "TICKET", catalog = "")
public class SjWtDxMeasure {
    private String safetyMeasureId;
    private String keyboxnum;
    private String boxtype;
    private String isolationcode;
    private String isolationname;
    private String isolationtype;
    private String orgId;
    private String subOrgId;
    private String deptId;
    private String createPerson;
    private Time createTime;
    private String modifyPerson;
    private Time modifyTime;
    private String projectid;
    private Long confirmed;
    private Long executed;
    private Long deleted;
    private Long source;

    @Id
    @Column(name = "SAFETY_MEASURE_ID", nullable = false, length = 32)
    public String getSafetyMeasureId() {
        return safetyMeasureId;
    }

    public void setSafetyMeasureId(String safetyMeasureId) {
        this.safetyMeasureId = safetyMeasureId;
    }

    @Basic
    @Column(name = "KEYBOXNUM", nullable = true, length = 32)
    public String getKeyboxnum() {
        return keyboxnum;
    }

    public void setKeyboxnum(String keyboxnum) {
        this.keyboxnum = keyboxnum;
    }

    @Basic
    @Column(name = "BOXTYPE", nullable = true, length = 20)
    public String getBoxtype() {
        return boxtype;
    }

    public void setBoxtype(String boxtype) {
        this.boxtype = boxtype;
    }

    @Basic
    @Column(name = "ISOLATIONCODE", nullable = true, length = 32)
    public String getIsolationcode() {
        return isolationcode;
    }

    public void setIsolationcode(String isolationcode) {
        this.isolationcode = isolationcode;
    }

    @Basic
    @Column(name = "ISOLATIONNAME", nullable = true, length = 500)
    public String getIsolationname() {
        return isolationname;
    }

    public void setIsolationname(String isolationname) {
        this.isolationname = isolationname;
    }

    @Basic
    @Column(name = "ISOLATIONTYPE", nullable = true, length = 20)
    public String getIsolationtype() {
        return isolationtype;
    }

    public void setIsolationtype(String isolationtype) {
        this.isolationtype = isolationtype;
    }

    @Basic
    @Column(name = "ORG_ID", nullable = true, length = 32)
    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    @Basic
    @Column(name = "SUB_ORG_ID", nullable = true, length = 32)
    public String getSubOrgId() {
        return subOrgId;
    }

    public void setSubOrgId(String subOrgId) {
        this.subOrgId = subOrgId;
    }

    @Basic
    @Column(name = "DEPT_ID", nullable = true, length = 32)
    public String getDeptId() {
        return deptId;
    }

    public void setDeptId(String deptId) {
        this.deptId = deptId;
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
    @Column(name = "PROJECTID", nullable = true, length = 32)
    public String getProjectid() {
        return projectid;
    }

    public void setProjectid(String projectid) {
        this.projectid = projectid;
    }

    @Basic
    @Column(name = "CONFIRMED", nullable = true, precision = 0)
    public Long getConfirmed() {
        return confirmed;
    }

    public void setConfirmed(Long confirmed) {
        this.confirmed = confirmed;
    }

    @Basic
    @Column(name = "EXECUTED", nullable = true, precision = 0)
    public Long getExecuted() {
        return executed;
    }

    public void setExecuted(Long executed) {
        this.executed = executed;
    }

    @Basic
    @Column(name = "DELETED", nullable = true, precision = 0)
    public Long getDeleted() {
        return deleted;
    }

    public void setDeleted(Long deleted) {
        this.deleted = deleted;
    }

    @Basic
    @Column(name = "SOURCE", nullable = true, precision = 0)
    public Long getSource() {
        return source;
    }

    public void setSource(Long source) {
        this.source = source;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SjWtDxMeasure that = (SjWtDxMeasure) o;
        return Objects.equals(safetyMeasureId, that.safetyMeasureId) &&
                Objects.equals(keyboxnum, that.keyboxnum) &&
                Objects.equals(boxtype, that.boxtype) &&
                Objects.equals(isolationcode, that.isolationcode) &&
                Objects.equals(isolationname, that.isolationname) &&
                Objects.equals(isolationtype, that.isolationtype) &&
                Objects.equals(orgId, that.orgId) &&
                Objects.equals(subOrgId, that.subOrgId) &&
                Objects.equals(deptId, that.deptId) &&
                Objects.equals(createPerson, that.createPerson) &&
                Objects.equals(createTime, that.createTime) &&
                Objects.equals(modifyPerson, that.modifyPerson) &&
                Objects.equals(modifyTime, that.modifyTime) &&
                Objects.equals(projectid, that.projectid) &&
                Objects.equals(confirmed, that.confirmed) &&
                Objects.equals(executed, that.executed) &&
                Objects.equals(deleted, that.deleted) &&
                Objects.equals(source, that.source);
    }

    @Override
    public int hashCode() {
        return Objects.hash(safetyMeasureId, keyboxnum, boxtype, isolationcode, isolationname, isolationtype, orgId, subOrgId, deptId, createPerson, createTime, modifyPerson, modifyTime, projectid, confirmed, executed, deleted, source);
    }
}
