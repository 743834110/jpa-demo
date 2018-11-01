package xyz.berby.im.jpademo.bean;

import javax.persistence.*;
import java.sql.Time;
import java.util.Objects;

@Entity
@Table(name = "SJ_WT_WORK_TICKET", schema = "TICKET", catalog = "")
public class SjWtWorkTicket {
    private String workTicketId;
    private String nextTicketId;
    private String wonum;
    private String tickettype;
    private String keynum;
    private String keyname;
    private String ticketcode;
    private String callticket;
    private String assetnum;
    private String assetname;
    private String description;
    private String worksite;
    private String defectmemo;
    private String status;
    private Time statusdate;
    private String issuer;
    private Time issuedate;
    private String approver;
    private Time approvedate;
    private String licensor;
    private Long issafemap;
    private Long isfire;
    private Long isgas;
    private Long isatpage;
    private Long isjobanalys;
    private Long isdiscolse;
    private Long istask;
    private Long isann;
    private String other;
    private Long isheat;
    private Long ishighvoltage;
    private Long iselectric;
    private Long isturn;
    private Long ishighfall;
    private Long isasphyxia;
    private Long ispoisoning;
    private Long isradiation;
    private Long isonfire;
    private Long isblast;
    private String othertwo;
    private String department;
    private String team;
    private String member;
    private String jobPerson;
    private String phone;
    private String projectPerson;
    private Time startTime;
    private Time endTime;
    private String dutyPerson;
    private String oldJobPerson;
    private String newJobPerson;
    private String jobPermitPerson;
    private Time jobchangeTime;
    private Time delaytoTime;
    private String dalayJobPerson;
    private String dalayPermitPerson;
    private Time delayTime;
    private String excep;
    private String endJobPerson;
    private String endPermitPerson;
    private Time endjobTime;
    private Time zjTime;
    private String zjPermitPerson;
    private String memo;
    private Long isfile;
    private String orgId;
    private String subOrgId;
    private String projectid;
    private String deptId;
    private String createPerson;
    private Time createTime;
    private String modifyPerson;
    private Time modifyTime;
    private String wfid;
    private String wfPerson;
    private String wfStatus;
    private String wfStatusExt;
    private Long wfBack;
    private Time wfStatusTime;
    private Long isHis;
    private String wtType;

    @Id
    @Column(name = "WORK_TICKET_ID", nullable = false, length = 32)
    public String getWorkTicketId() {
        return workTicketId;
    }

    public void setWorkTicketId(String workTicketId) {
        this.workTicketId = workTicketId;
    }

    @Basic
    @Column(name = "NEXT_TICKET_ID", nullable = true, length = 32)
    public String getNextTicketId() {
        return nextTicketId;
    }

    public void setNextTicketId(String nextTicketId) {
        this.nextTicketId = nextTicketId;
    }

    @Basic
    @Column(name = "WONUM", nullable = true, length = 30)
    public String getWonum() {
        return wonum;
    }

    public void setWonum(String wonum) {
        this.wonum = wonum;
    }

    @Basic
    @Column(name = "TICKETTYPE", nullable = true, length = 20)
    public String getTickettype() {
        return tickettype;
    }

    public void setTickettype(String tickettype) {
        this.tickettype = tickettype;
    }

    @Basic
    @Column(name = "KEYNUM", nullable = true, length = 10)
    public String getKeynum() {
        return keynum;
    }

    public void setKeynum(String keynum) {
        this.keynum = keynum;
    }

    @Basic
    @Column(name = "KEYNAME", nullable = true, length = 50)
    public String getKeyname() {
        return keyname;
    }

    public void setKeyname(String keyname) {
        this.keyname = keyname;
    }

    @Basic
    @Column(name = "TICKETCODE", nullable = true, length = 20)
    public String getTicketcode() {
        return ticketcode;
    }

    public void setTicketcode(String ticketcode) {
        this.ticketcode = ticketcode;
    }

    @Basic
    @Column(name = "CALLTICKET", nullable = true, length = 32)
    public String getCallticket() {
        return callticket;
    }

    public void setCallticket(String callticket) {
        this.callticket = callticket;
    }

    @Basic
    @Column(name = "ASSETNUM", nullable = true, length = 100)
    public String getAssetnum() {
        return assetnum;
    }

    public void setAssetnum(String assetnum) {
        this.assetnum = assetnum;
    }

    @Basic
    @Column(name = "ASSETNAME", nullable = true, length = 250)
    public String getAssetname() {
        return assetname;
    }

    public void setAssetname(String assetname) {
        this.assetname = assetname;
    }

    @Basic
    @Column(name = "DESCRIPTION", nullable = true, length = 250)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "WORKSITE", nullable = true, length = 100)
    public String getWorksite() {
        return worksite;
    }

    public void setWorksite(String worksite) {
        this.worksite = worksite;
    }

    @Basic
    @Column(name = "DEFECTMEMO", nullable = true, length = 250)
    public String getDefectmemo() {
        return defectmemo;
    }

    public void setDefectmemo(String defectmemo) {
        this.defectmemo = defectmemo;
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
    @Column(name = "ISSUER", nullable = true, length = 32)
    public String getIssuer() {
        return issuer;
    }

    public void setIssuer(String issuer) {
        this.issuer = issuer;
    }

    @Basic
    @Column(name = "ISSUEDATE", nullable = true)
    public Time getIssuedate() {
        return issuedate;
    }

    public void setIssuedate(Time issuedate) {
        this.issuedate = issuedate;
    }

    @Basic
    @Column(name = "APPROVER", nullable = true, length = 32)
    public String getApprover() {
        return approver;
    }

    public void setApprover(String approver) {
        this.approver = approver;
    }

    @Basic
    @Column(name = "APPROVEDATE", nullable = true)
    public Time getApprovedate() {
        return approvedate;
    }

    public void setApprovedate(Time approvedate) {
        this.approvedate = approvedate;
    }

    @Basic
    @Column(name = "LICENSOR", nullable = true, length = 32)
    public String getLicensor() {
        return licensor;
    }

    public void setLicensor(String licensor) {
        this.licensor = licensor;
    }

    @Basic
    @Column(name = "ISSAFEMAP", nullable = true, precision = 0)
    public Long getIssafemap() {
        return issafemap;
    }

    public void setIssafemap(Long issafemap) {
        this.issafemap = issafemap;
    }

    @Basic
    @Column(name = "ISFIRE", nullable = true, precision = 0)
    public Long getIsfire() {
        return isfire;
    }

    public void setIsfire(Long isfire) {
        this.isfire = isfire;
    }

    @Basic
    @Column(name = "ISGAS", nullable = true, precision = 0)
    public Long getIsgas() {
        return isgas;
    }

    public void setIsgas(Long isgas) {
        this.isgas = isgas;
    }

    @Basic
    @Column(name = "ISATPAGE", nullable = true, precision = 0)
    public Long getIsatpage() {
        return isatpage;
    }

    public void setIsatpage(Long isatpage) {
        this.isatpage = isatpage;
    }

    @Basic
    @Column(name = "ISJOBANALYS", nullable = true, precision = 0)
    public Long getIsjobanalys() {
        return isjobanalys;
    }

    public void setIsjobanalys(Long isjobanalys) {
        this.isjobanalys = isjobanalys;
    }

    @Basic
    @Column(name = "ISDISCOLSE", nullable = true, precision = 0)
    public Long getIsdiscolse() {
        return isdiscolse;
    }

    public void setIsdiscolse(Long isdiscolse) {
        this.isdiscolse = isdiscolse;
    }

    @Basic
    @Column(name = "ISTASK", nullable = true, precision = 0)
    public Long getIstask() {
        return istask;
    }

    public void setIstask(Long istask) {
        this.istask = istask;
    }

    @Basic
    @Column(name = "ISANN", nullable = true, precision = 0)
    public Long getIsann() {
        return isann;
    }

    public void setIsann(Long isann) {
        this.isann = isann;
    }

    @Basic
    @Column(name = "OTHER", nullable = true, length = 250)
    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other;
    }

    @Basic
    @Column(name = "ISHEAT", nullable = true, precision = 0)
    public Long getIsheat() {
        return isheat;
    }

    public void setIsheat(Long isheat) {
        this.isheat = isheat;
    }

    @Basic
    @Column(name = "ISHIGHVOLTAGE", nullable = true, precision = 0)
    public Long getIshighvoltage() {
        return ishighvoltage;
    }

    public void setIshighvoltage(Long ishighvoltage) {
        this.ishighvoltage = ishighvoltage;
    }

    @Basic
    @Column(name = "ISELECTRIC", nullable = true, precision = 0)
    public Long getIselectric() {
        return iselectric;
    }

    public void setIselectric(Long iselectric) {
        this.iselectric = iselectric;
    }

    @Basic
    @Column(name = "ISTURN", nullable = true, precision = 0)
    public Long getIsturn() {
        return isturn;
    }

    public void setIsturn(Long isturn) {
        this.isturn = isturn;
    }

    @Basic
    @Column(name = "ISHIGHFALL", nullable = true, precision = 0)
    public Long getIshighfall() {
        return ishighfall;
    }

    public void setIshighfall(Long ishighfall) {
        this.ishighfall = ishighfall;
    }

    @Basic
    @Column(name = "ISASPHYXIA", nullable = true, precision = 0)
    public Long getIsasphyxia() {
        return isasphyxia;
    }

    public void setIsasphyxia(Long isasphyxia) {
        this.isasphyxia = isasphyxia;
    }

    @Basic
    @Column(name = "ISPOISONING", nullable = true, precision = 0)
    public Long getIspoisoning() {
        return ispoisoning;
    }

    public void setIspoisoning(Long ispoisoning) {
        this.ispoisoning = ispoisoning;
    }

    @Basic
    @Column(name = "ISRADIATION", nullable = true, precision = 0)
    public Long getIsradiation() {
        return isradiation;
    }

    public void setIsradiation(Long isradiation) {
        this.isradiation = isradiation;
    }

    @Basic
    @Column(name = "ISONFIRE", nullable = true, precision = 0)
    public Long getIsonfire() {
        return isonfire;
    }

    public void setIsonfire(Long isonfire) {
        this.isonfire = isonfire;
    }

    @Basic
    @Column(name = "ISBLAST", nullable = true, precision = 0)
    public Long getIsblast() {
        return isblast;
    }

    public void setIsblast(Long isblast) {
        this.isblast = isblast;
    }

    @Basic
    @Column(name = "OTHERTWO", nullable = true, length = 250)
    public String getOthertwo() {
        return othertwo;
    }

    public void setOthertwo(String othertwo) {
        this.othertwo = othertwo;
    }

    @Basic
    @Column(name = "DEPARTMENT", nullable = true, length = 32)
    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Basic
    @Column(name = "TEAM", nullable = true, length = 32)
    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    @Basic
    @Column(name = "MEMBER", nullable = true, length = 200)
    public String getMember() {
        return member;
    }

    public void setMember(String member) {
        this.member = member;
    }

    @Basic
    @Column(name = "JOB_PERSON", nullable = true, length = 32)
    public String getJobPerson() {
        return jobPerson;
    }

    public void setJobPerson(String jobPerson) {
        this.jobPerson = jobPerson;
    }

    @Basic
    @Column(name = "PHONE", nullable = true, length = 30)
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Basic
    @Column(name = "PROJECT_PERSON", nullable = true, length = 32)
    public String getProjectPerson() {
        return projectPerson;
    }

    public void setProjectPerson(String projectPerson) {
        this.projectPerson = projectPerson;
    }

    @Basic
    @Column(name = "START_TIME", nullable = true)
    public Time getStartTime() {
        return startTime;
    }

    public void setStartTime(Time startTime) {
        this.startTime = startTime;
    }

    @Basic
    @Column(name = "END_TIME", nullable = true)
    public Time getEndTime() {
        return endTime;
    }

    public void setEndTime(Time endTime) {
        this.endTime = endTime;
    }

    @Basic
    @Column(name = "DUTY_PERSON", nullable = true, length = 32)
    public String getDutyPerson() {
        return dutyPerson;
    }

    public void setDutyPerson(String dutyPerson) {
        this.dutyPerson = dutyPerson;
    }

    @Basic
    @Column(name = "OLD_JOB_PERSON", nullable = true, length = 32)
    public String getOldJobPerson() {
        return oldJobPerson;
    }

    public void setOldJobPerson(String oldJobPerson) {
        this.oldJobPerson = oldJobPerson;
    }

    @Basic
    @Column(name = "NEW_JOB_PERSON", nullable = true, length = 32)
    public String getNewJobPerson() {
        return newJobPerson;
    }

    public void setNewJobPerson(String newJobPerson) {
        this.newJobPerson = newJobPerson;
    }

    @Basic
    @Column(name = "JOB_PERMIT_PERSON", nullable = true, length = 32)
    public String getJobPermitPerson() {
        return jobPermitPerson;
    }

    public void setJobPermitPerson(String jobPermitPerson) {
        this.jobPermitPerson = jobPermitPerson;
    }

    @Basic
    @Column(name = "JOBCHANGE_TIME", nullable = true)
    public Time getJobchangeTime() {
        return jobchangeTime;
    }

    public void setJobchangeTime(Time jobchangeTime) {
        this.jobchangeTime = jobchangeTime;
    }

    @Basic
    @Column(name = "DELAYTO_TIME", nullable = true)
    public Time getDelaytoTime() {
        return delaytoTime;
    }

    public void setDelaytoTime(Time delaytoTime) {
        this.delaytoTime = delaytoTime;
    }

    @Basic
    @Column(name = "DALAY_JOB_PERSON", nullable = true, length = 32)
    public String getDalayJobPerson() {
        return dalayJobPerson;
    }

    public void setDalayJobPerson(String dalayJobPerson) {
        this.dalayJobPerson = dalayJobPerson;
    }

    @Basic
    @Column(name = "DALAY_PERMIT_PERSON", nullable = true, length = 32)
    public String getDalayPermitPerson() {
        return dalayPermitPerson;
    }

    public void setDalayPermitPerson(String dalayPermitPerson) {
        this.dalayPermitPerson = dalayPermitPerson;
    }

    @Basic
    @Column(name = "DELAY_TIME", nullable = true)
    public Time getDelayTime() {
        return delayTime;
    }

    public void setDelayTime(Time delayTime) {
        this.delayTime = delayTime;
    }

    @Basic
    @Column(name = "EXCEP", nullable = true, length = 500)
    public String getExcep() {
        return excep;
    }

    public void setExcep(String excep) {
        this.excep = excep;
    }

    @Basic
    @Column(name = "END_JOB_PERSON", nullable = true, length = 32)
    public String getEndJobPerson() {
        return endJobPerson;
    }

    public void setEndJobPerson(String endJobPerson) {
        this.endJobPerson = endJobPerson;
    }

    @Basic
    @Column(name = "END_PERMIT_PERSON", nullable = true, length = 32)
    public String getEndPermitPerson() {
        return endPermitPerson;
    }

    public void setEndPermitPerson(String endPermitPerson) {
        this.endPermitPerson = endPermitPerson;
    }

    @Basic
    @Column(name = "ENDJOB_TIME", nullable = true)
    public Time getEndjobTime() {
        return endjobTime;
    }

    public void setEndjobTime(Time endjobTime) {
        this.endjobTime = endjobTime;
    }

    @Basic
    @Column(name = "ZJ_TIME", nullable = true)
    public Time getZjTime() {
        return zjTime;
    }

    public void setZjTime(Time zjTime) {
        this.zjTime = zjTime;
    }

    @Basic
    @Column(name = "ZJ_PERMIT_PERSON", nullable = true, length = 32)
    public String getZjPermitPerson() {
        return zjPermitPerson;
    }

    public void setZjPermitPerson(String zjPermitPerson) {
        this.zjPermitPerson = zjPermitPerson;
    }

    @Basic
    @Column(name = "MEMO", nullable = true, length = 500)
    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    @Basic
    @Column(name = "ISFILE", nullable = true, precision = 0)
    public Long getIsfile() {
        return isfile;
    }

    public void setIsfile(Long isfile) {
        this.isfile = isfile;
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

    @Basic
    @Column(name = "WFID", nullable = true, length = 50)
    public String getWfid() {
        return wfid;
    }

    public void setWfid(String wfid) {
        this.wfid = wfid;
    }

    @Basic
    @Column(name = "WF_PERSON", nullable = true, length = 32)
    public String getWfPerson() {
        return wfPerson;
    }

    public void setWfPerson(String wfPerson) {
        this.wfPerson = wfPerson;
    }

    @Basic
    @Column(name = "WF_STATUS", nullable = true, length = 50)
    public String getWfStatus() {
        return wfStatus;
    }

    public void setWfStatus(String wfStatus) {
        this.wfStatus = wfStatus;
    }

    @Basic
    @Column(name = "WF_STATUS_EXT", nullable = true, length = 32)
    public String getWfStatusExt() {
        return wfStatusExt;
    }

    public void setWfStatusExt(String wfStatusExt) {
        this.wfStatusExt = wfStatusExt;
    }

    @Basic
    @Column(name = "WF_BACK", nullable = true, precision = 0)
    public Long getWfBack() {
        return wfBack;
    }

    public void setWfBack(Long wfBack) {
        this.wfBack = wfBack;
    }

    @Basic
    @Column(name = "WF_STATUS_TIME", nullable = true)
    public Time getWfStatusTime() {
        return wfStatusTime;
    }

    public void setWfStatusTime(Time wfStatusTime) {
        this.wfStatusTime = wfStatusTime;
    }

    @Basic
    @Column(name = "IS_HIS", nullable = true, precision = 0)
    public Long getIsHis() {
        return isHis;
    }

    public void setIsHis(Long isHis) {
        this.isHis = isHis;
    }

    @Basic
    @Column(name = "WT_TYPE", nullable = true, length = 10)
    public String getWtType() {
        return wtType;
    }

    public void setWtType(String wtType) {
        this.wtType = wtType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SjWtWorkTicket that = (SjWtWorkTicket) o;
        return Objects.equals(workTicketId, that.workTicketId) &&
                Objects.equals(nextTicketId, that.nextTicketId) &&
                Objects.equals(wonum, that.wonum) &&
                Objects.equals(tickettype, that.tickettype) &&
                Objects.equals(keynum, that.keynum) &&
                Objects.equals(keyname, that.keyname) &&
                Objects.equals(ticketcode, that.ticketcode) &&
                Objects.equals(callticket, that.callticket) &&
                Objects.equals(assetnum, that.assetnum) &&
                Objects.equals(assetname, that.assetname) &&
                Objects.equals(description, that.description) &&
                Objects.equals(worksite, that.worksite) &&
                Objects.equals(defectmemo, that.defectmemo) &&
                Objects.equals(status, that.status) &&
                Objects.equals(statusdate, that.statusdate) &&
                Objects.equals(issuer, that.issuer) &&
                Objects.equals(issuedate, that.issuedate) &&
                Objects.equals(approver, that.approver) &&
                Objects.equals(approvedate, that.approvedate) &&
                Objects.equals(licensor, that.licensor) &&
                Objects.equals(issafemap, that.issafemap) &&
                Objects.equals(isfire, that.isfire) &&
                Objects.equals(isgas, that.isgas) &&
                Objects.equals(isatpage, that.isatpage) &&
                Objects.equals(isjobanalys, that.isjobanalys) &&
                Objects.equals(isdiscolse, that.isdiscolse) &&
                Objects.equals(istask, that.istask) &&
                Objects.equals(isann, that.isann) &&
                Objects.equals(other, that.other) &&
                Objects.equals(isheat, that.isheat) &&
                Objects.equals(ishighvoltage, that.ishighvoltage) &&
                Objects.equals(iselectric, that.iselectric) &&
                Objects.equals(isturn, that.isturn) &&
                Objects.equals(ishighfall, that.ishighfall) &&
                Objects.equals(isasphyxia, that.isasphyxia) &&
                Objects.equals(ispoisoning, that.ispoisoning) &&
                Objects.equals(isradiation, that.isradiation) &&
                Objects.equals(isonfire, that.isonfire) &&
                Objects.equals(isblast, that.isblast) &&
                Objects.equals(othertwo, that.othertwo) &&
                Objects.equals(department, that.department) &&
                Objects.equals(team, that.team) &&
                Objects.equals(member, that.member) &&
                Objects.equals(jobPerson, that.jobPerson) &&
                Objects.equals(phone, that.phone) &&
                Objects.equals(projectPerson, that.projectPerson) &&
                Objects.equals(startTime, that.startTime) &&
                Objects.equals(endTime, that.endTime) &&
                Objects.equals(dutyPerson, that.dutyPerson) &&
                Objects.equals(oldJobPerson, that.oldJobPerson) &&
                Objects.equals(newJobPerson, that.newJobPerson) &&
                Objects.equals(jobPermitPerson, that.jobPermitPerson) &&
                Objects.equals(jobchangeTime, that.jobchangeTime) &&
                Objects.equals(delaytoTime, that.delaytoTime) &&
                Objects.equals(dalayJobPerson, that.dalayJobPerson) &&
                Objects.equals(dalayPermitPerson, that.dalayPermitPerson) &&
                Objects.equals(delayTime, that.delayTime) &&
                Objects.equals(excep, that.excep) &&
                Objects.equals(endJobPerson, that.endJobPerson) &&
                Objects.equals(endPermitPerson, that.endPermitPerson) &&
                Objects.equals(endjobTime, that.endjobTime) &&
                Objects.equals(zjTime, that.zjTime) &&
                Objects.equals(zjPermitPerson, that.zjPermitPerson) &&
                Objects.equals(memo, that.memo) &&
                Objects.equals(isfile, that.isfile) &&
                Objects.equals(orgId, that.orgId) &&
                Objects.equals(subOrgId, that.subOrgId) &&
                Objects.equals(projectid, that.projectid) &&
                Objects.equals(deptId, that.deptId) &&
                Objects.equals(createPerson, that.createPerson) &&
                Objects.equals(createTime, that.createTime) &&
                Objects.equals(modifyPerson, that.modifyPerson) &&
                Objects.equals(modifyTime, that.modifyTime) &&
                Objects.equals(wfid, that.wfid) &&
                Objects.equals(wfPerson, that.wfPerson) &&
                Objects.equals(wfStatus, that.wfStatus) &&
                Objects.equals(wfStatusExt, that.wfStatusExt) &&
                Objects.equals(wfBack, that.wfBack) &&
                Objects.equals(wfStatusTime, that.wfStatusTime) &&
                Objects.equals(isHis, that.isHis) &&
                Objects.equals(wtType, that.wtType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(workTicketId, nextTicketId, wonum, tickettype, keynum, keyname, ticketcode, callticket, assetnum, assetname, description, worksite, defectmemo, status, statusdate, issuer, issuedate, approver, approvedate, licensor, issafemap, isfire, isgas, isatpage, isjobanalys, isdiscolse, istask, isann, other, isheat, ishighvoltage, iselectric, isturn, ishighfall, isasphyxia, ispoisoning, isradiation, isonfire, isblast, othertwo, department, team, member, jobPerson, phone, projectPerson, startTime, endTime, dutyPerson, oldJobPerson, newJobPerson, jobPermitPerson, jobchangeTime, delaytoTime, dalayJobPerson, dalayPermitPerson, delayTime, excep, endJobPerson, endPermitPerson, endjobTime, zjTime, zjPermitPerson, memo, isfile, orgId, subOrgId, projectid, deptId, createPerson, createTime, modifyPerson, modifyTime, wfid, wfPerson, wfStatus, wfStatusExt, wfBack, wfStatusTime, isHis, wtType);
    }
}
