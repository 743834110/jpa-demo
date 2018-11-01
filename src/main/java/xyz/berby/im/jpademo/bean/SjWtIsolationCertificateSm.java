package xyz.berby.im.jpademo.bean;

import javax.persistence.*;
import java.sql.Time;
import java.util.Objects;

@Entity
@Table(name = "SJ_WT_ISOLATION_CERTIFICATE_SM", schema = "TICKET", catalog = "")
public class SjWtIsolationCertificateSm {
    private String safetyMeasureId;
    private String certificateId;
    private String isolationcode;
    private String isolationname;
    private String isolationtype;
    private Long isexecute;
    private String executePerson;
    private Long isrelease;
    private String releasePerson;
    private String source;
    private Long sort;
    private String orgId;
    private String subOrgId;
    private String deptId;
    private String createPerson;
    private Time createTime;
    private String modifyPerson;
    private Time modifyTime;
    private String projectid;

    @Id
    @Column(name = "SAFETY_MEASURE_ID", nullable = false, length = 32)
    public String getSafetyMeasureId() {
        return safetyMeasureId;
    }

    public void setSafetyMeasureId(String safetyMeasureId) {
        this.safetyMeasureId = safetyMeasureId;
    }

    @Basic
    @Column(name = "CERTIFICATE_ID", nullable = true, length = 32)
    public String getCertificateId() {
        return certificateId;
    }

    public void setCertificateId(String certificateId) {
        this.certificateId = certificateId;
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
    @Column(name = "ISOLATIONNAME", nullable = true, length = 250)
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
    @Column(name = "ISEXECUTE", nullable = true, precision = 0)
    public Long getIsexecute() {
        return isexecute;
    }

    public void setIsexecute(Long isexecute) {
        this.isexecute = isexecute;
    }

    @Basic
    @Column(name = "EXECUTE_PERSON", nullable = true, length = 32)
    public String getExecutePerson() {
        return executePerson;
    }

    public void setExecutePerson(String executePerson) {
        this.executePerson = executePerson;
    }

    @Basic
    @Column(name = "ISRELEASE", nullable = true, precision = 0)
    public Long getIsrelease() {
        return isrelease;
    }

    public void setIsrelease(Long isrelease) {
        this.isrelease = isrelease;
    }

    @Basic
    @Column(name = "RELEASE_PERSON", nullable = true, length = 32)
    public String getReleasePerson() {
        return releasePerson;
    }

    public void setReleasePerson(String releasePerson) {
        this.releasePerson = releasePerson;
    }

    @Basic
    @Column(name = "SOURCE", nullable = true, length = 10)
    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    @Basic
    @Column(name = "SORT", nullable = true, precision = 0)
    public Long getSort() {
        return sort;
    }

    public void setSort(Long sort) {
        this.sort = sort;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SjWtIsolationCertificateSm that = (SjWtIsolationCertificateSm) o;
        return Objects.equals(safetyMeasureId, that.safetyMeasureId) &&
                Objects.equals(certificateId, that.certificateId) &&
                Objects.equals(isolationcode, that.isolationcode) &&
                Objects.equals(isolationname, that.isolationname) &&
                Objects.equals(isolationtype, that.isolationtype) &&
                Objects.equals(isexecute, that.isexecute) &&
                Objects.equals(executePerson, that.executePerson) &&
                Objects.equals(isrelease, that.isrelease) &&
                Objects.equals(releasePerson, that.releasePerson) &&
                Objects.equals(source, that.source) &&
                Objects.equals(sort, that.sort) &&
                Objects.equals(orgId, that.orgId) &&
                Objects.equals(subOrgId, that.subOrgId) &&
                Objects.equals(deptId, that.deptId) &&
                Objects.equals(createPerson, that.createPerson) &&
                Objects.equals(createTime, that.createTime) &&
                Objects.equals(modifyPerson, that.modifyPerson) &&
                Objects.equals(modifyTime, that.modifyTime) &&
                Objects.equals(projectid, that.projectid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(safetyMeasureId, certificateId, isolationcode, isolationname, isolationtype, isexecute, executePerson, isrelease, releasePerson, source, sort, orgId, subOrgId, deptId, createPerson, createTime, modifyPerson, modifyTime, projectid);
    }
}
