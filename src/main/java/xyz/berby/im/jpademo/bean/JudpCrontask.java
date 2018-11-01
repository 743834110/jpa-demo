package xyz.berby.im.jpademo.bean;

import javax.persistence.*;
import java.sql.Time;
import java.util.Objects;

@Entity
@Table(name = "JUDP_CRONTASK", schema = "TICKET", catalog = "")
public class JudpCrontask {
    private String uuid;
    private String crontasknum;
    private String description;
    private String crontaskname;
    private String classname;
    private String taskplan;
    private String active;
    private String createPerson;
    private Time createTime;
    private String modifyPerson;
    private Time modifyTime;
    private String orgId;
    private String subUnitId;

    @Id
    @Column(name = "UUID", nullable = false, length = 32)
    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    @Basic
    @Column(name = "CRONTASKNUM", nullable = true, length = 20)
    public String getCrontasknum() {
        return crontasknum;
    }

    public void setCrontasknum(String crontasknum) {
        this.crontasknum = crontasknum;
    }

    @Basic
    @Column(name = "DESCRIPTION", nullable = true, length = 100)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "CRONTASKNAME", nullable = true, length = 100)
    public String getCrontaskname() {
        return crontaskname;
    }

    public void setCrontaskname(String crontaskname) {
        this.crontaskname = crontaskname;
    }

    @Basic
    @Column(name = "CLASSNAME", nullable = true, length = 100)
    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname;
    }

    @Basic
    @Column(name = "TASKPLAN", nullable = true, length = 200)
    public String getTaskplan() {
        return taskplan;
    }

    public void setTaskplan(String taskplan) {
        this.taskplan = taskplan;
    }

    @Basic
    @Column(name = "ACTIVE", nullable = true, length = 2)
    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
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
    @Column(name = "ORG_ID", nullable = true, length = 32)
    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    @Basic
    @Column(name = "SUB_UNIT_ID", nullable = true, length = 32)
    public String getSubUnitId() {
        return subUnitId;
    }

    public void setSubUnitId(String subUnitId) {
        this.subUnitId = subUnitId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JudpCrontask that = (JudpCrontask) o;
        return Objects.equals(uuid, that.uuid) &&
                Objects.equals(crontasknum, that.crontasknum) &&
                Objects.equals(description, that.description) &&
                Objects.equals(crontaskname, that.crontaskname) &&
                Objects.equals(classname, that.classname) &&
                Objects.equals(taskplan, that.taskplan) &&
                Objects.equals(active, that.active) &&
                Objects.equals(createPerson, that.createPerson) &&
                Objects.equals(createTime, that.createTime) &&
                Objects.equals(modifyPerson, that.modifyPerson) &&
                Objects.equals(modifyTime, that.modifyTime) &&
                Objects.equals(orgId, that.orgId) &&
                Objects.equals(subUnitId, that.subUnitId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uuid, crontasknum, description, crontaskname, classname, taskplan, active, createPerson, createTime, modifyPerson, modifyTime, orgId, subUnitId);
    }
}
