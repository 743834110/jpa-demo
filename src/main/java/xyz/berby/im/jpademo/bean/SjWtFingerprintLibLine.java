package xyz.berby.im.jpademo.bean;

import javax.persistence.*;
import java.sql.Time;
import java.util.Objects;

@Entity
@Table(name = "SJ_WT_FINGERPRINT_LIB_LINE", schema = "TICKET", catalog = "")
public class SjWtFingerprintLibLine {
    private String fingerprintLibLineId;
    private String fingerprintLibId;
    private String userId;
    private String fingerName;
    private String fingerValue;
    private String template;
    private String templatePath;
    private Long isMake;
    private String orgId;
    private String subOrgId;
    private String deptId;
    private String createPerson;
    private Time createTime;
    private String modifyPerson;
    private Time modifyTime;

    @Id
    @Column(name = "FINGERPRINT_LIB_LINE_ID", nullable = false, length = 32)
    public String getFingerprintLibLineId() {
        return fingerprintLibLineId;
    }

    public void setFingerprintLibLineId(String fingerprintLibLineId) {
        this.fingerprintLibLineId = fingerprintLibLineId;
    }

    @Basic
    @Column(name = "FINGERPRINT_LIB_ID", nullable = true, length = 32)
    public String getFingerprintLibId() {
        return fingerprintLibId;
    }

    public void setFingerprintLibId(String fingerprintLibId) {
        this.fingerprintLibId = fingerprintLibId;
    }

    @Basic
    @Column(name = "USER_ID", nullable = true, length = 32)
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "FINGER_NAME", nullable = true, length = 50)
    public String getFingerName() {
        return fingerName;
    }

    public void setFingerName(String fingerName) {
        this.fingerName = fingerName;
    }

    @Basic
    @Column(name = "FINGER_VALUE", nullable = true, length = 100)
    public String getFingerValue() {
        return fingerValue;
    }

    public void setFingerValue(String fingerValue) {
        this.fingerValue = fingerValue;
    }

    @Basic
    @Column(name = "TEMPLATE", nullable = true, length = 3000)
    public String getTemplate() {
        return template;
    }

    public void setTemplate(String template) {
        this.template = template;
    }

    @Basic
    @Column(name = "TEMPLATE_PATH", nullable = true, length = 200)
    public String getTemplatePath() {
        return templatePath;
    }

    public void setTemplatePath(String templatePath) {
        this.templatePath = templatePath;
    }

    @Basic
    @Column(name = "IS_MAKE", nullable = true, precision = 0)
    public Long getIsMake() {
        return isMake;
    }

    public void setIsMake(Long isMake) {
        this.isMake = isMake;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SjWtFingerprintLibLine that = (SjWtFingerprintLibLine) o;
        return Objects.equals(fingerprintLibLineId, that.fingerprintLibLineId) &&
                Objects.equals(fingerprintLibId, that.fingerprintLibId) &&
                Objects.equals(userId, that.userId) &&
                Objects.equals(fingerName, that.fingerName) &&
                Objects.equals(fingerValue, that.fingerValue) &&
                Objects.equals(template, that.template) &&
                Objects.equals(templatePath, that.templatePath) &&
                Objects.equals(isMake, that.isMake) &&
                Objects.equals(orgId, that.orgId) &&
                Objects.equals(subOrgId, that.subOrgId) &&
                Objects.equals(deptId, that.deptId) &&
                Objects.equals(createPerson, that.createPerson) &&
                Objects.equals(createTime, that.createTime) &&
                Objects.equals(modifyPerson, that.modifyPerson) &&
                Objects.equals(modifyTime, that.modifyTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fingerprintLibLineId, fingerprintLibId, userId, fingerName, fingerValue, template, templatePath, isMake, orgId, subOrgId, deptId, createPerson, createTime, modifyPerson, modifyTime);
    }
}
