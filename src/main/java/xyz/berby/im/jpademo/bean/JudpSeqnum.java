package xyz.berby.im.jpademo.bean;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "JUDP_SEQNUM", schema = "TICKET", catalog = "")
public class JudpSeqnum {
    private String seqnumid;
    private String tableName;
    private String colName;
    private String seqDateFormat;
    private String seqDate;
    private int seqnum;
    private String orgId;
    private String projectId;

    @Id
    @Column(name = "SEQNUMID", nullable = false, length = 32)
    public String getSeqnumid() {
        return seqnumid;
    }

    public void setSeqnumid(String seqnumid) {
        this.seqnumid = seqnumid;
    }

    @Basic
    @Column(name = "TABLE_NAME", nullable = false, length = 50)
    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    @Basic
    @Column(name = "COL_NAME", nullable = false, length = 50)
    public String getColName() {
        return colName;
    }

    public void setColName(String colName) {
        this.colName = colName;
    }

    @Basic
    @Column(name = "SEQ_DATE_FORMAT", nullable = true, length = 30)
    public String getSeqDateFormat() {
        return seqDateFormat;
    }

    public void setSeqDateFormat(String seqDateFormat) {
        this.seqDateFormat = seqDateFormat;
    }

    @Basic
    @Column(name = "SEQ_DATE", nullable = true, length = 30)
    public String getSeqDate() {
        return seqDate;
    }

    public void setSeqDate(String seqDate) {
        this.seqDate = seqDate;
    }

    @Basic
    @Column(name = "SEQNUM", nullable = false, precision = 0)
    public int getSeqnum() {
        return seqnum;
    }

    public void setSeqnum(int seqnum) {
        this.seqnum = seqnum;
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
    @Column(name = "PROJECT_ID", nullable = true, length = 32)
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JudpSeqnum that = (JudpSeqnum) o;
        return seqnum == that.seqnum &&
                Objects.equals(seqnumid, that.seqnumid) &&
                Objects.equals(tableName, that.tableName) &&
                Objects.equals(colName, that.colName) &&
                Objects.equals(seqDateFormat, that.seqDateFormat) &&
                Objects.equals(seqDate, that.seqDate) &&
                Objects.equals(orgId, that.orgId) &&
                Objects.equals(projectId, that.projectId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(seqnumid, tableName, colName, seqDateFormat, seqDate, seqnum, orgId, projectId);
    }
}
