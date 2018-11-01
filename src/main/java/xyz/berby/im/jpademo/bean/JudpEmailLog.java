package xyz.berby.im.jpademo.bean;

import javax.persistence.*;
import java.sql.Time;
import java.util.Objects;

@Entity
@Table(name = "JUDP_EMAIL_LOG", schema = "TICKET", catalog = "")
public class JudpEmailLog {
    private String emailLogId;
    private String sendpErson;
    private String recivePerson;
    private String ccPerson;
    private String bccPerson;
    private String subject;
    private String content;
    private Time sendTime;
    private Time endTime;
    private String sendTimes;
    private String resendTimes;
    private Time createTime;
    private String status;
    private String attachments;
    private String orgId;
    private String subOrgId;

    @Id
    @Column(name = "EMAIL_LOG_ID", nullable = false, length = 32)
    public String getEmailLogId() {
        return emailLogId;
    }

    public void setEmailLogId(String emailLogId) {
        this.emailLogId = emailLogId;
    }

    @Basic
    @Column(name = "SENDP_ERSON", nullable = true, length = 100)
    public String getSendpErson() {
        return sendpErson;
    }

    public void setSendpErson(String sendpErson) {
        this.sendpErson = sendpErson;
    }

    @Basic
    @Column(name = "RECIVE_PERSON", nullable = true, length = 2000)
    public String getRecivePerson() {
        return recivePerson;
    }

    public void setRecivePerson(String recivePerson) {
        this.recivePerson = recivePerson;
    }

    @Basic
    @Column(name = "CC_PERSON", nullable = true, length = 2000)
    public String getCcPerson() {
        return ccPerson;
    }

    public void setCcPerson(String ccPerson) {
        this.ccPerson = ccPerson;
    }

    @Basic
    @Column(name = "BCC_PERSON", nullable = true, length = 2000)
    public String getBccPerson() {
        return bccPerson;
    }

    public void setBccPerson(String bccPerson) {
        this.bccPerson = bccPerson;
    }

    @Basic
    @Column(name = "SUBJECT", nullable = true, length = 200)
    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Basic
    @Column(name = "CONTENT", nullable = true)
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Basic
    @Column(name = "SEND_TIME", nullable = true)
    public Time getSendTime() {
        return sendTime;
    }

    public void setSendTime(Time sendTime) {
        this.sendTime = sendTime;
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
    @Column(name = "SEND_TIMES", nullable = true, length = 10)
    public String getSendTimes() {
        return sendTimes;
    }

    public void setSendTimes(String sendTimes) {
        this.sendTimes = sendTimes;
    }

    @Basic
    @Column(name = "RESEND_TIMES", nullable = true, length = 10)
    public String getResendTimes() {
        return resendTimes;
    }

    public void setResendTimes(String resendTimes) {
        this.resendTimes = resendTimes;
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
    @Column(name = "STATUS", nullable = true, length = 10)
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Basic
    @Column(name = "ATTACHMENTS", nullable = true)
    public String getAttachments() {
        return attachments;
    }

    public void setAttachments(String attachments) {
        this.attachments = attachments;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JudpEmailLog that = (JudpEmailLog) o;
        return Objects.equals(emailLogId, that.emailLogId) &&
                Objects.equals(sendpErson, that.sendpErson) &&
                Objects.equals(recivePerson, that.recivePerson) &&
                Objects.equals(ccPerson, that.ccPerson) &&
                Objects.equals(bccPerson, that.bccPerson) &&
                Objects.equals(subject, that.subject) &&
                Objects.equals(content, that.content) &&
                Objects.equals(sendTime, that.sendTime) &&
                Objects.equals(endTime, that.endTime) &&
                Objects.equals(sendTimes, that.sendTimes) &&
                Objects.equals(resendTimes, that.resendTimes) &&
                Objects.equals(createTime, that.createTime) &&
                Objects.equals(status, that.status) &&
                Objects.equals(attachments, that.attachments) &&
                Objects.equals(orgId, that.orgId) &&
                Objects.equals(subOrgId, that.subOrgId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(emailLogId, sendpErson, recivePerson, ccPerson, bccPerson, subject, content, sendTime, endTime, sendTimes, resendTimes, createTime, status, attachments, orgId, subOrgId);
    }
}
