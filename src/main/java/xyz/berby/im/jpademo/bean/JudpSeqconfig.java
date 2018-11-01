package xyz.berby.im.jpademo.bean;

import javax.persistence.*;
import java.sql.Time;
import java.util.Objects;

@Entity
@Table(name = "JUDP_SEQCONFIG", schema = "TICKET", catalog = "")
public class JudpSeqconfig {
    private String seqconid;
    private String description;
    private String functionPath;
    private String relateConid;
    private String tableName;
    private String colName;
    private String seqPrefix;
    private String seqDateformat;
    private String seqSuffix;
    private Integer seqLength;
    private int seqInitvalue;
    private String seqCode;
    private String type;
    private String createPerson;
    private Time createTime;
    private String modifyPerson;
    private Time modifyTime;
    private String orgId;
    private String subOrgId;
    private String projectId;

    @Id
    @Column(name = "SEQCONID", nullable = false, length = 32)
    public String getSeqconid() {
        return seqconid;
    }

    public void setSeqconid(String seqconid) {
        this.seqconid = seqconid;
    }

    @Basic
    @Column(name = "DESCRIPTION", nullable = false, length = 200)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "FUNCTION_PATH", nullable = true, length = 200)
    public String getFunctionPath() {
        return functionPath;
    }

    public void setFunctionPath(String functionPath) {
        this.functionPath = functionPath;
    }

    @Basic
    @Column(name = "RELATE_CONID", nullable = true, length = 32)
    public String getRelateConid() {
        return relateConid;
    }

    public void setRelateConid(String relateConid) {
        this.relateConid = relateConid;
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
    @Column(name = "SEQ_PREFIX", nullable = true, length = 20)
    public String getSeqPrefix() {
        return seqPrefix;
    }

    public void setSeqPrefix(String seqPrefix) {
        this.seqPrefix = seqPrefix;
    }

    @Basic
    @Column(name = "SEQ_DATEFORMAT", nullable = true, length = 30)
    public String getSeqDateformat() {
        return seqDateformat;
    }

    public void setSeqDateformat(String seqDateformat) {
        this.seqDateformat = seqDateformat;
    }

    @Basic
    @Column(name = "SEQ_SUFFIX", nullable = true, length = 20)
    public String getSeqSuffix() {
        return seqSuffix;
    }

    public void setSeqSuffix(String seqSuffix) {
        this.seqSuffix = seqSuffix;
    }

    @Basic
    @Column(name = "SEQ_LENGTH", nullable = true, precision = 0)
    public Integer getSeqLength() {
        return seqLength;
    }

    public void setSeqLength(Integer seqLength) {
        this.seqLength = seqLength;
    }

    @Basic
    @Column(name = "SEQ_INITVALUE", nullable = false, precision = 0)
    public int getSeqInitvalue() {
        return seqInitvalue;
    }

    public void setSeqInitvalue(int seqInitvalue) {
        this.seqInitvalue = seqInitvalue;
    }

    @Basic
    @Column(name = "SEQ_CODE", nullable = true, length = 50)
    public String getSeqCode() {
        return seqCode;
    }

    public void setSeqCode(String seqCode) {
        this.seqCode = seqCode;
    }

    @Basic
    @Column(name = "TYPE", nullable = true, length = 10)
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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
    @Column(name = "SUB_ORG_ID", nullable = true, length = 32)
    public String getSubOrgId() {
        return subOrgId;
    }

    public void setSubOrgId(String subOrgId) {
        this.subOrgId = subOrgId;
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
        JudpSeqconfig that = (JudpSeqconfig) o;
        return seqInitvalue == that.seqInitvalue &&
                Objects.equals(seqconid, that.seqconid) &&
                Objects.equals(description, that.description) &&
                Objects.equals(functionPath, that.functionPath) &&
                Objects.equals(relateConid, that.relateConid) &&
                Objects.equals(tableName, that.tableName) &&
                Objects.equals(colName, that.colName) &&
                Objects.equals(seqPrefix, that.seqPrefix) &&
                Objects.equals(seqDateformat, that.seqDateformat) &&
                Objects.equals(seqSuffix, that.seqSuffix) &&
                Objects.equals(seqLength, that.seqLength) &&
                Objects.equals(seqCode, that.seqCode) &&
                Objects.equals(type, that.type) &&
                Objects.equals(createPerson, that.createPerson) &&
                Objects.equals(createTime, that.createTime) &&
                Objects.equals(modifyPerson, that.modifyPerson) &&
                Objects.equals(modifyTime, that.modifyTime) &&
                Objects.equals(orgId, that.orgId) &&
                Objects.equals(subOrgId, that.subOrgId) &&
                Objects.equals(projectId, that.projectId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(seqconid, description, functionPath, relateConid, tableName, colName, seqPrefix, seqDateformat, seqSuffix, seqLength, seqInitvalue, seqCode, type, createPerson, createTime, modifyPerson, modifyTime, orgId, subOrgId, projectId);
    }
}
