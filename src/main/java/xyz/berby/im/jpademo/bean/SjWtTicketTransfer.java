package xyz.berby.im.jpademo.bean;

import javax.persistence.*;
import java.sql.Time;
import java.util.Objects;

@Entity
@Table(name = "SJ_WT_TICKET_TRANSFER", schema = "TICKET", catalog = "")
public class SjWtTicketTransfer {
    private String ticketTransferId;
    private String workTicketId;
    private Time takeTime;
    private String takeJobPerson;
    private String takePermitPerson;
    private Time backTime;
    private String backHobPerson;
    private String backPermitPerson;
    private String orgId;
    private String subOrgId;
    private String projectid;
    private String deptId;
    private String createPerson;
    private Time createTime;
    private String modifyPerson;
    private Time modifyTime;

    @Id
    @Column(name = "TICKET_TRANSFER_ID", nullable = false, length = 32)
    public String getTicketTransferId() {
        return ticketTransferId;
    }

    public void setTicketTransferId(String ticketTransferId) {
        this.ticketTransferId = ticketTransferId;
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
    @Column(name = "TAKE_TIME", nullable = true)
    public Time getTakeTime() {
        return takeTime;
    }

    public void setTakeTime(Time takeTime) {
        this.takeTime = takeTime;
    }

    @Basic
    @Column(name = "TAKE_JOB_PERSON", nullable = true, length = 32)
    public String getTakeJobPerson() {
        return takeJobPerson;
    }

    public void setTakeJobPerson(String takeJobPerson) {
        this.takeJobPerson = takeJobPerson;
    }

    @Basic
    @Column(name = "TAKE_PERMIT_PERSON", nullable = true, length = 32)
    public String getTakePermitPerson() {
        return takePermitPerson;
    }

    public void setTakePermitPerson(String takePermitPerson) {
        this.takePermitPerson = takePermitPerson;
    }

    @Basic
    @Column(name = "BACK_TIME", nullable = true)
    public Time getBackTime() {
        return backTime;
    }

    public void setBackTime(Time backTime) {
        this.backTime = backTime;
    }

    @Basic
    @Column(name = "BACK_HOB_PERSON", nullable = true, length = 32)
    public String getBackHobPerson() {
        return backHobPerson;
    }

    public void setBackHobPerson(String backHobPerson) {
        this.backHobPerson = backHobPerson;
    }

    @Basic
    @Column(name = "BACK_PERMIT_PERSON", nullable = true, length = 32)
    public String getBackPermitPerson() {
        return backPermitPerson;
    }

    public void setBackPermitPerson(String backPermitPerson) {
        this.backPermitPerson = backPermitPerson;
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
    @Column(name = "PROJECTID", nullable = true, length = 32)
    public String getProjectid() {
        return projectid;
    }

    public void setProjectid(String projectid) {
        this.projectid = projectid;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SjWtTicketTransfer that = (SjWtTicketTransfer) o;
        return Objects.equals(ticketTransferId, that.ticketTransferId) &&
                Objects.equals(workTicketId, that.workTicketId) &&
                Objects.equals(takeTime, that.takeTime) &&
                Objects.equals(takeJobPerson, that.takeJobPerson) &&
                Objects.equals(takePermitPerson, that.takePermitPerson) &&
                Objects.equals(backTime, that.backTime) &&
                Objects.equals(backHobPerson, that.backHobPerson) &&
                Objects.equals(backPermitPerson, that.backPermitPerson) &&
                Objects.equals(orgId, that.orgId) &&
                Objects.equals(subOrgId, that.subOrgId) &&
                Objects.equals(projectid, that.projectid) &&
                Objects.equals(deptId, that.deptId) &&
                Objects.equals(createPerson, that.createPerson) &&
                Objects.equals(createTime, that.createTime) &&
                Objects.equals(modifyPerson, that.modifyPerson) &&
                Objects.equals(modifyTime, that.modifyTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ticketTransferId, workTicketId, takeTime, takeJobPerson, takePermitPerson, backTime, backHobPerson, backPermitPerson, orgId, subOrgId, projectid, deptId, createPerson, createTime, modifyPerson, modifyTime);
    }
}
