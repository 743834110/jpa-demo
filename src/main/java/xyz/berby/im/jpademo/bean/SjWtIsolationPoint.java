package xyz.berby.im.jpademo.bean;

import javax.persistence.*;
import java.sql.Time;
import java.util.Objects;

@Entity
@Table(name = "SJ_WT_ISOLATION_POINT", schema = "TICKET", catalog = "")
public class SjWtIsolationPoint {
    private String isolationPointId;
    private String isolationcode;
    private String isolationname;
    private String isolationtype;
    private String methodId;
    private String department;
    private String status;
    private String orgId;
    private String subOrgId;
    private String deptId;
    private String q4No;
    private String q4Eq;
    private String createPerson;
    private Time createTime;
    private String modifyPerson;
    private Time modifyTime;
    private String projectid;

    @Id
    @Column(name = "ISOLATION_POINT_ID", nullable = false, length = 32)
    public String getIsolationPointId() {
        return isolationPointId;
    }

    public void setIsolationPointId(String isolationPointId) {
        this.isolationPointId = isolationPointId;
    }

    @Basic
    @Column(name = "ISOLATIONCODE", nullable = true, length = 32)
    public String getIsolationcode() {
        return isolationcode;
    }

    public void setIsolationcode(String isolationcode) {
        this.isolationcode = isolationcode;
    }

    @Basic
    @Column(name = "ISOLATIONNAME", nullable = true, length = 500)
    public String getIsolationname() {
        return isolationname;
    }

    public void setIsolationname(String isolationname) {
        this.isolationname = isolationname;
    }

    @Basic
    @Column(name = "ISOLATIONTYPE", nullable = true, length = 20)
    public String getIsolationtype() {
        return isolationtype;
    }

    public void setIsolationtype(String isolationtype) {
        this.isolationtype = isolationtype;
    }

    @Basic
    @Column(name = "METHOD_ID", nullable = true, length = 32)
    public String getMethodId() {
        return methodId;
    }

    public void setMethodId(String methodId) {
        this.methodId = methodId;
    }

    @Basic
    @Column(name = "DEPARTMENT", nullable = true, length = 20)
    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Basic
    @Column(name = "STATUS", nullable = true, length = 20)
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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
    @Column(name = "Q4_NO", nullable = true, length = 50)
    public String getQ4No() {
        return q4No;
    }

    public void setQ4No(String q4No) {
        this.q4No = q4No;
    }

    @Basic
    @Column(name = "Q4_EQ", nullable = true, length = 50)
    public String getQ4Eq() {
        return q4Eq;
    }

    public void setQ4Eq(String q4Eq) {
        this.q4Eq = q4Eq;
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
    @Column(name = "PROJECTID", nullable = true, length = 32)
    public String getProjectid() {
        return projectid;
    }

    public void setProjectid(String projectid) {
        this.projectid = projectid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SjWtIsolationPoint that = (SjWtIsolationPoint) o;
        return Objects.equals(isolationPointId, that.isolationPointId) &&
                Objects.equals(isolationcode, that.isolationcode) &&
                Objects.equals(isolationname, that.isolationname) &&
                Objects.equals(isolationtype, that.isolationtype) &&
                Objects.equals(methodId, that.methodId) &&
                Objects.equals(department, that.department) &&
                Objects.equals(status, that.status) &&
                Objects.equals(orgId, that.orgId) &&
                Objects.equals(subOrgId, that.subOrgId) &&
                Objects.equals(deptId, that.deptId) &&
                Objects.equals(q4No, that.q4No) &&
                Objects.equals(q4Eq, that.q4Eq) &&
                Objects.equals(createPerson, that.createPerson) &&
                Objects.equals(createTime, that.createTime) &&
                Objects.equals(modifyPerson, that.modifyPerson) &&
                Objects.equals(modifyTime, that.modifyTime) &&
                Objects.equals(projectid, that.projectid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isolationPointId, isolationcode, isolationname, isolationtype, methodId, department, status, orgId, subOrgId, deptId, q4No, q4Eq, createPerson, createTime, modifyPerson, modifyTime, projectid);
    }
}
