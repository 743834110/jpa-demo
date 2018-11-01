package xyz.berby.im.jpademo.bean;

import javax.persistence.*;
import java.sql.Time;
import java.util.Objects;

@Entity
@Table(name = "SJ_WT_RH_KEYBOX", schema = "TICKET", catalog = "")
public class SjWtRhKeybox {
    private String rhKeyboxId;
    private String rhKeyboxnum;
    private String beRhKeyboxnum;
    private String orgId;
    private String subOrgId;
    private String deptId;
    private String createPerson;
    private Time createTime;
    private String modifyPerson;
    private Time modifyTime;
    private String projectid;

    @Id
    @Column(name = "RH_KEYBOX_ID", nullable = false, length = 32)
    public String getRhKeyboxId() {
        return rhKeyboxId;
    }

    public void setRhKeyboxId(String rhKeyboxId) {
        this.rhKeyboxId = rhKeyboxId;
    }

    @Basic
    @Column(name = "RH_KEYBOXNUM", nullable = true, length = 32)
    public String getRhKeyboxnum() {
        return rhKeyboxnum;
    }

    public void setRhKeyboxnum(String rhKeyboxnum) {
        this.rhKeyboxnum = rhKeyboxnum;
    }

    @Basic
    @Column(name = "BE_RH_KEYBOXNUM", nullable = true, length = 32)
    public String getBeRhKeyboxnum() {
        return beRhKeyboxnum;
    }

    public void setBeRhKeyboxnum(String beRhKeyboxnum) {
        this.beRhKeyboxnum = beRhKeyboxnum;
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
        SjWtRhKeybox that = (SjWtRhKeybox) o;
        return Objects.equals(rhKeyboxId, that.rhKeyboxId) &&
                Objects.equals(rhKeyboxnum, that.rhKeyboxnum) &&
                Objects.equals(beRhKeyboxnum, that.beRhKeyboxnum) &&
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
        return Objects.hash(rhKeyboxId, rhKeyboxnum, beRhKeyboxnum, orgId, subOrgId, deptId, createPerson, createTime, modifyPerson, modifyTime, projectid);
    }
}
