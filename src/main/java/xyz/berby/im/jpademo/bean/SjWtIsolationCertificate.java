package xyz.berby.im.jpademo.bean;

import javax.persistence.*;
import java.sql.Time;
import java.util.Objects;

@Entity
@Table(name = "SJ_WT_ISOLATION_CERTIFICATE", schema = "TICKET", catalog = "")
public class SjWtIsolationCertificate {
    private String certificateId;
    private String certificateNum;
    private String keynum;
    private String keyname;
    private String assetnum;
    private String assetname;
    private String description;
    private String workTicketId;
    private String orgId;
    private String subOrgId;
    private String deptId;
    private String createPerson;
    private Time createTime;
    private String modifyPerson;
    private Time modifyTime;
    private String projectid;

    @Id
    @Column(name = "CERTIFICATE_ID", nullable = false, length = 32)
    public String getCertificateId() {
        return certificateId;
    }

    public void setCertificateId(String certificateId) {
        this.certificateId = certificateId;
    }

    @Basic
    @Column(name = "CERTIFICATE_NUM", nullable = true, length = 32)
    public String getCertificateNum() {
        return certificateNum;
    }

    public void setCertificateNum(String certificateNum) {
        this.certificateNum = certificateNum;
    }

    @Basic
    @Column(name = "KEYNUM", nullable = true, length = 32)
    public String getKeynum() {
        return keynum;
    }

    public void setKeynum(String keynum) {
        this.keynum = keynum;
    }

    @Basic
    @Column(name = "KEYNAME", nullable = true, length = 40)
    public String getKeyname() {
        return keyname;
    }

    public void setKeyname(String keyname) {
        this.keyname = keyname;
    }

    @Basic
    @Column(name = "ASSETNUM", nullable = true, length = 32)
    public String getAssetnum() {
        return assetnum;
    }

    public void setAssetnum(String assetnum) {
        this.assetnum = assetnum;
    }

    @Basic
    @Column(name = "ASSETNAME", nullable = true, length = 40)
    public String getAssetname() {
        return assetname;
    }

    public void setAssetname(String assetname) {
        this.assetname = assetname;
    }

    @Basic
    @Column(name = "DESCRIPTION", nullable = true, length = 200)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "WORK_TICKET_ID", nullable = true, length = 32)
    public String getWorkTicketId() {
        return workTicketId;
    }

    public void setWorkTicketId(String workTicketId) {
        this.workTicketId = workTicketId;
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
        SjWtIsolationCertificate that = (SjWtIsolationCertificate) o;
        return Objects.equals(certificateId, that.certificateId) &&
                Objects.equals(certificateNum, that.certificateNum) &&
                Objects.equals(keynum, that.keynum) &&
                Objects.equals(keyname, that.keyname) &&
                Objects.equals(assetnum, that.assetnum) &&
                Objects.equals(assetname, that.assetname) &&
                Objects.equals(description, that.description) &&
                Objects.equals(workTicketId, that.workTicketId) &&
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
        return Objects.hash(certificateId, certificateNum, keynum, keyname, assetnum, assetname, description, workTicketId, orgId, subOrgId, deptId, createPerson, createTime, modifyPerson, modifyTime, projectid);
    }
}
