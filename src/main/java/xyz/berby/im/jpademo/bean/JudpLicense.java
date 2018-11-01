package xyz.berby.im.jpademo.bean;

import javax.persistence.*;
import java.sql.Time;
import java.util.Objects;

@Entity
@Table(name = "JUDP_LICENSE", schema = "TICKET", catalog = "")
public class JudpLicense {
    private String licenseId;
    private String licenseName;
    private String projectNo;
    private String projectName;
    private String commonName;
    private String orgnization;
    private Time startDate;
    private Integer validDays;
    private String licneseType;
    private String authIps;
    private String authMacs;
    private String authComps;
    private String content;
    private String createPerson;
    private Time createTime;
    private String modifyPerson;
    private Time modifyTime;

    @Id
    @Column(name = "LICENSE_ID", nullable = false, length = 32)
    public String getLicenseId() {
        return licenseId;
    }

    public void setLicenseId(String licenseId) {
        this.licenseId = licenseId;
    }

    @Basic
    @Column(name = "LICENSE_NAME", nullable = true, length = 50)
    public String getLicenseName() {
        return licenseName;
    }

    public void setLicenseName(String licenseName) {
        this.licenseName = licenseName;
    }

    @Basic
    @Column(name = "PROJECT_NO", nullable = false, length = 50)
    public String getProjectNo() {
        return projectNo;
    }

    public void setProjectNo(String projectNo) {
        this.projectNo = projectNo;
    }

    @Basic
    @Column(name = "PROJECT_NAME", nullable = false, length = 150)
    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    @Basic
    @Column(name = "COMMON_NAME", nullable = false, length = 150)
    public String getCommonName() {
        return commonName;
    }

    public void setCommonName(String commonName) {
        this.commonName = commonName;
    }

    @Basic
    @Column(name = "ORGNIZATION", nullable = false, length = 150)
    public String getOrgnization() {
        return orgnization;
    }

    public void setOrgnization(String orgnization) {
        this.orgnization = orgnization;
    }

    @Basic
    @Column(name = "START_DATE", nullable = true)
    public Time getStartDate() {
        return startDate;
    }

    public void setStartDate(Time startDate) {
        this.startDate = startDate;
    }

    @Basic
    @Column(name = "VALID_DAYS", nullable = true, precision = 0)
    public Integer getValidDays() {
        return validDays;
    }

    public void setValidDays(Integer validDays) {
        this.validDays = validDays;
    }

    @Basic
    @Column(name = "LICNESE_TYPE", nullable = true, length = 50)
    public String getLicneseType() {
        return licneseType;
    }

    public void setLicneseType(String licneseType) {
        this.licneseType = licneseType;
    }

    @Basic
    @Column(name = "AUTH_IPS", nullable = true, length = 500)
    public String getAuthIps() {
        return authIps;
    }

    public void setAuthIps(String authIps) {
        this.authIps = authIps;
    }

    @Basic
    @Column(name = "AUTH_MACS", nullable = true, length = 500)
    public String getAuthMacs() {
        return authMacs;
    }

    public void setAuthMacs(String authMacs) {
        this.authMacs = authMacs;
    }

    @Basic
    @Column(name = "AUTH_COMPS", nullable = true, length = 500)
    public String getAuthComps() {
        return authComps;
    }

    public void setAuthComps(String authComps) {
        this.authComps = authComps;
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
        JudpLicense that = (JudpLicense) o;
        return Objects.equals(licenseId, that.licenseId) &&
                Objects.equals(licenseName, that.licenseName) &&
                Objects.equals(projectNo, that.projectNo) &&
                Objects.equals(projectName, that.projectName) &&
                Objects.equals(commonName, that.commonName) &&
                Objects.equals(orgnization, that.orgnization) &&
                Objects.equals(startDate, that.startDate) &&
                Objects.equals(validDays, that.validDays) &&
                Objects.equals(licneseType, that.licneseType) &&
                Objects.equals(authIps, that.authIps) &&
                Objects.equals(authMacs, that.authMacs) &&
                Objects.equals(authComps, that.authComps) &&
                Objects.equals(content, that.content) &&
                Objects.equals(createPerson, that.createPerson) &&
                Objects.equals(createTime, that.createTime) &&
                Objects.equals(modifyPerson, that.modifyPerson) &&
                Objects.equals(modifyTime, that.modifyTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(licenseId, licenseName, projectNo, projectName, commonName, orgnization, startDate, validDays, licneseType, authIps, authMacs, authComps, content, createPerson, createTime, modifyPerson, modifyTime);
    }
}
