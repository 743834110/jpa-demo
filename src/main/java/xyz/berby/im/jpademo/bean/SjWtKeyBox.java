package xyz.berby.im.jpademo.bean;

import javax.persistence.*;
import java.sql.Time;
import java.util.Objects;

@Entity
@Table(name = "SJ_WT_KEY_BOX", schema = "TICKET", catalog = "")
public class SjWtKeyBox {
    private String keyBoxId;
    private String keyboxnum;
    private String keyboxname;
    private String boxtype;
    private String status;
    private Time statusdate;
    private String orgId;
    private String subOrgId;
    private String deptId;
    private String createPerson;
    private Time createTime;
    private String modifyPerson;
    private Time modifyTime;
    private String projectid;
    private Long isLocked;

    @Id
    @Column(name = "KEY_BOX_ID", nullable = false, length = 32)
    public String getKeyBoxId() {
        return keyBoxId;
    }

    public void setKeyBoxId(String keyBoxId) {
        this.keyBoxId = keyBoxId;
    }

    @Basic
    @Column(name = "KEYBOXNUM", nullable = true, length = 30)
    public String getKeyboxnum() {
        return keyboxnum;
    }

    public void setKeyboxnum(String keyboxnum) {
        this.keyboxnum = keyboxnum;
    }

    @Basic
    @Column(name = "KEYBOXNAME", nullable = true, length = 100)
    public String getKeyboxname() {
        return keyboxname;
    }

    public void setKeyboxname(String keyboxname) {
        this.keyboxname = keyboxname;
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
    @Column(name = "STATUS", nullable = true, length = 32)
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Basic
    @Column(name = "STATUSDATE", nullable = true)
    public Time getStatusdate() {
        return statusdate;
    }

    public void setStatusdate(Time statusdate) {
        this.statusdate = statusdate;
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
    @Column(name = "IS_LOCKED", nullable = true, precision = 0)
    public Long getIsLocked() {
        return isLocked;
    }

    public void setIsLocked(Long isLocked) {
        this.isLocked = isLocked;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SjWtKeyBox that = (SjWtKeyBox) o;
        return Objects.equals(keyBoxId, that.keyBoxId) &&
                Objects.equals(keyboxnum, that.keyboxnum) &&
                Objects.equals(keyboxname, that.keyboxname) &&
                Objects.equals(boxtype, that.boxtype) &&
                Objects.equals(status, that.status) &&
                Objects.equals(statusdate, that.statusdate) &&
                Objects.equals(orgId, that.orgId) &&
                Objects.equals(subOrgId, that.subOrgId) &&
                Objects.equals(deptId, that.deptId) &&
                Objects.equals(createPerson, that.createPerson) &&
                Objects.equals(createTime, that.createTime) &&
                Objects.equals(modifyPerson, that.modifyPerson) &&
                Objects.equals(modifyTime, that.modifyTime) &&
                Objects.equals(projectid, that.projectid) &&
                Objects.equals(isLocked, that.isLocked);
    }

    @Override
    public int hashCode() {
        return Objects.hash(keyBoxId, keyboxnum, keyboxname, boxtype, status, statusdate, orgId, subOrgId, deptId, createPerson, createTime, modifyPerson, modifyTime, projectid, isLocked);
    }
}
