package xyz.berby.im.jpademo.bean;

import javax.persistence.*;
import java.sql.Time;
import java.util.Objects;

@Entity
@Table(name = "JUDP_DELEGATE_INFO", schema = "TICKET", catalog = "")
public class JudpDelegateInfo {
    private String delegateInfoId;
    private String userId;
    private String attorneyId;
    private Time startTime;
    private Time endTime;
    private String delegateType;
    private String includeself;
    private String valid;
    private String delegateDesc;

    @Id
    @Column(name = "DELEGATE_INFO_ID", nullable = false, length = 32)
    public String getDelegateInfoId() {
        return delegateInfoId;
    }

    public void setDelegateInfoId(String delegateInfoId) {
        this.delegateInfoId = delegateInfoId;
    }

    @Basic
    @Column(name = "USER_ID", nullable = false, length = 32)
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "ATTORNEY_ID", nullable = false, length = 32)
    public String getAttorneyId() {
        return attorneyId;
    }

    public void setAttorneyId(String attorneyId) {
        this.attorneyId = attorneyId;
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
    @Column(name = "END_TIME", nullable = false)
    public Time getEndTime() {
        return endTime;
    }

    public void setEndTime(Time endTime) {
        this.endTime = endTime;
    }

    @Basic
    @Column(name = "DELEGATE_TYPE", nullable = true, length = 32)
    public String getDelegateType() {
        return delegateType;
    }

    public void setDelegateType(String delegateType) {
        this.delegateType = delegateType;
    }

    @Basic
    @Column(name = "INCLUDESELF", nullable = true, length = 3)
    public String getIncludeself() {
        return includeself;
    }

    public void setIncludeself(String includeself) {
        this.includeself = includeself;
    }

    @Basic
    @Column(name = "VALID", nullable = true, length = 3)
    public String getValid() {
        return valid;
    }

    public void setValid(String valid) {
        this.valid = valid;
    }

    @Basic
    @Column(name = "DELEGATE_DESC", nullable = true, length = 300)
    public String getDelegateDesc() {
        return delegateDesc;
    }

    public void setDelegateDesc(String delegateDesc) {
        this.delegateDesc = delegateDesc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JudpDelegateInfo that = (JudpDelegateInfo) o;
        return Objects.equals(delegateInfoId, that.delegateInfoId) &&
                Objects.equals(userId, that.userId) &&
                Objects.equals(attorneyId, that.attorneyId) &&
                Objects.equals(startTime, that.startTime) &&
                Objects.equals(endTime, that.endTime) &&
                Objects.equals(delegateType, that.delegateType) &&
                Objects.equals(includeself, that.includeself) &&
                Objects.equals(valid, that.valid) &&
                Objects.equals(delegateDesc, that.delegateDesc);
    }

    @Override
    public int hashCode() {
        return Objects.hash(delegateInfoId, userId, attorneyId, startTime, endTime, delegateType, includeself, valid, delegateDesc);
    }
}
