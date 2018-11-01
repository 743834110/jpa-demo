package xyz.berby.im.jpademo.bean;

import javax.persistence.*;
import java.sql.Time;
import java.util.Objects;

@Entity
@Table(name = "JUDP_REPORT_CONFIG_DETAIL", schema = "TICKET", catalog = "")
public class JudpReportConfigDetail {
    private String reportDetailId;
    private String reportId;
    private String reportFileName;
    private String valid;
    private Long version;
    private String createPerson;
    private Time createTime;
    private String modifyPerson;
    private Time modifyTime;

    @Id
    @Column(name = "REPORT_DETAIL_ID", nullable = false, length = 32)
    public String getReportDetailId() {
        return reportDetailId;
    }

    public void setReportDetailId(String reportDetailId) {
        this.reportDetailId = reportDetailId;
    }

    @Basic
    @Column(name = "REPORT_ID", nullable = false, length = 32)
    public String getReportId() {
        return reportId;
    }

    public void setReportId(String reportId) {
        this.reportId = reportId;
    }

    @Basic
    @Column(name = "REPORT_FILE_NAME", nullable = true, length = 100)
    public String getReportFileName() {
        return reportFileName;
    }

    public void setReportFileName(String reportFileName) {
        this.reportFileName = reportFileName;
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
    @Column(name = "VERSION", nullable = true, precision = 0)
    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
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
        JudpReportConfigDetail that = (JudpReportConfigDetail) o;
        return Objects.equals(reportDetailId, that.reportDetailId) &&
                Objects.equals(reportId, that.reportId) &&
                Objects.equals(reportFileName, that.reportFileName) &&
                Objects.equals(valid, that.valid) &&
                Objects.equals(version, that.version) &&
                Objects.equals(createPerson, that.createPerson) &&
                Objects.equals(createTime, that.createTime) &&
                Objects.equals(modifyPerson, that.modifyPerson) &&
                Objects.equals(modifyTime, that.modifyTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(reportDetailId, reportId, reportFileName, valid, version, createPerson, createTime, modifyPerson, modifyTime);
    }
}
