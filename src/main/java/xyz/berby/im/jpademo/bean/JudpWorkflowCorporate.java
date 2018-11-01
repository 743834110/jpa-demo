package xyz.berby.im.jpademo.bean;

import javax.persistence.*;
import java.sql.Time;
import java.util.Objects;

@Entity
@Table(name = "JUDP_WORKFLOW_CORPORATE", schema = "TICKET", catalog = "")
public class JudpWorkflowCorporate {
    private String corporateId;
    private String busiKey;
    private String formStatus;
    private String corporateType;
    private String busiClassName;
    private String processInstanceId;
    private String taskId;
    private String applyUserId;
    private Time applyDate;
    private String applyDesc;
    private String corporateOrgId;
    private String corporateUserDeptId;
    private String corporateUrl;
    private Time replyDate;
    private String replyDesc;
    private String todoTitle;
    private String wfid;
    private String wfStatus;
    private String parentCorporateId;

    @Id
    @Column(name = "CORPORATE_ID", nullable = false, length = 64)
    public String getCorporateId() {
        return corporateId;
    }

    public void setCorporateId(String corporateId) {
        this.corporateId = corporateId;
    }

    @Basic
    @Column(name = "BUSI_KEY", nullable = true, length = 64)
    public String getBusiKey() {
        return busiKey;
    }

    public void setBusiKey(String busiKey) {
        this.busiKey = busiKey;
    }

    @Basic
    @Column(name = "FORM_STATUS", nullable = true, length = 64)
    public String getFormStatus() {
        return formStatus;
    }

    public void setFormStatus(String formStatus) {
        this.formStatus = formStatus;
    }

    @Basic
    @Column(name = "CORPORATE_TYPE", nullable = true, length = 64)
    public String getCorporateType() {
        return corporateType;
    }

    public void setCorporateType(String corporateType) {
        this.corporateType = corporateType;
    }

    @Basic
    @Column(name = "BUSI_CLASS_NAME", nullable = true, length = 150)
    public String getBusiClassName() {
        return busiClassName;
    }

    public void setBusiClassName(String busiClassName) {
        this.busiClassName = busiClassName;
    }

    @Basic
    @Column(name = "PROCESS_INSTANCE_ID", nullable = true, length = 64)
    public String getProcessInstanceId() {
        return processInstanceId;
    }

    public void setProcessInstanceId(String processInstanceId) {
        this.processInstanceId = processInstanceId;
    }

    @Basic
    @Column(name = "TASK_ID", nullable = true, length = 64)
    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    @Basic
    @Column(name = "APPLY_USER_ID", nullable = true, length = 64)
    public String getApplyUserId() {
        return applyUserId;
    }

    public void setApplyUserId(String applyUserId) {
        this.applyUserId = applyUserId;
    }

    @Basic
    @Column(name = "APPLY_DATE", nullable = true)
    public Time getApplyDate() {
        return applyDate;
    }

    public void setApplyDate(Time applyDate) {
        this.applyDate = applyDate;
    }

    @Basic
    @Column(name = "APPLY_DESC", nullable = true, length = 200)
    public String getApplyDesc() {
        return applyDesc;
    }

    public void setApplyDesc(String applyDesc) {
        this.applyDesc = applyDesc;
    }

    @Basic
    @Column(name = "CORPORATE_ORG_ID", nullable = true, length = 32)
    public String getCorporateOrgId() {
        return corporateOrgId;
    }

    public void setCorporateOrgId(String corporateOrgId) {
        this.corporateOrgId = corporateOrgId;
    }

    @Basic
    @Column(name = "CORPORATE_USER_DEPT_ID", nullable = true, length = 1000)
    public String getCorporateUserDeptId() {
        return corporateUserDeptId;
    }

    public void setCorporateUserDeptId(String corporateUserDeptId) {
        this.corporateUserDeptId = corporateUserDeptId;
    }

    @Basic
    @Column(name = "CORPORATE_URL", nullable = true, length = 300)
    public String getCorporateUrl() {
        return corporateUrl;
    }

    public void setCorporateUrl(String corporateUrl) {
        this.corporateUrl = corporateUrl;
    }

    @Basic
    @Column(name = "REPLY_DATE", nullable = true)
    public Time getReplyDate() {
        return replyDate;
    }

    public void setReplyDate(Time replyDate) {
        this.replyDate = replyDate;
    }

    @Basic
    @Column(name = "REPLY_DESC", nullable = true, length = 200)
    public String getReplyDesc() {
        return replyDesc;
    }

    public void setReplyDesc(String replyDesc) {
        this.replyDesc = replyDesc;
    }

    @Basic
    @Column(name = "TODO_TITLE", nullable = true, length = 200)
    public String getTodoTitle() {
        return todoTitle;
    }

    public void setTodoTitle(String todoTitle) {
        this.todoTitle = todoTitle;
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

    @Basic
    @Column(name = "PARENT_CORPORATE_ID", nullable = true, length = 64)
    public String getParentCorporateId() {
        return parentCorporateId;
    }

    public void setParentCorporateId(String parentCorporateId) {
        this.parentCorporateId = parentCorporateId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JudpWorkflowCorporate that = (JudpWorkflowCorporate) o;
        return Objects.equals(corporateId, that.corporateId) &&
                Objects.equals(busiKey, that.busiKey) &&
                Objects.equals(formStatus, that.formStatus) &&
                Objects.equals(corporateType, that.corporateType) &&
                Objects.equals(busiClassName, that.busiClassName) &&
                Objects.equals(processInstanceId, that.processInstanceId) &&
                Objects.equals(taskId, that.taskId) &&
                Objects.equals(applyUserId, that.applyUserId) &&
                Objects.equals(applyDate, that.applyDate) &&
                Objects.equals(applyDesc, that.applyDesc) &&
                Objects.equals(corporateOrgId, that.corporateOrgId) &&
                Objects.equals(corporateUserDeptId, that.corporateUserDeptId) &&
                Objects.equals(corporateUrl, that.corporateUrl) &&
                Objects.equals(replyDate, that.replyDate) &&
                Objects.equals(replyDesc, that.replyDesc) &&
                Objects.equals(todoTitle, that.todoTitle) &&
                Objects.equals(wfid, that.wfid) &&
                Objects.equals(wfStatus, that.wfStatus) &&
                Objects.equals(parentCorporateId, that.parentCorporateId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(corporateId, busiKey, formStatus, corporateType, busiClassName, processInstanceId, taskId, applyUserId, applyDate, applyDesc, corporateOrgId, corporateUserDeptId, corporateUrl, replyDate, replyDesc, todoTitle, wfid, wfStatus, parentCorporateId);
    }
}
