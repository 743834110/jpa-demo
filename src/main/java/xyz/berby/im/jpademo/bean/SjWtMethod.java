package xyz.berby.im.jpademo.bean;

import javax.persistence.*;
import java.sql.Time;
import java.util.Map;
import java.util.Objects;

@Entity
@Table(name = "SJ_WT_METHOD", schema = "TICKET", catalog = "")
public class SjWtMethod {
    private String methodId;
    private String methodcode;
    private String methodname;
    private String status;
    private String orgId;
    private String subOrgId;
    private String deptId;
    private String createPerson;
    private Time createTime;
    private String modifyPerson;
    private Time modifyTime;
    private String projectid;



    @Id
    @Column(name = "METHOD_ID", nullable = false, length = 32)
    public String getMethodId() {
        return methodId;
    }

    public void setMethodId(String methodId) {
        this.methodId = methodId;
    }

    @Basic
    @Column(name = "METHODCODE", nullable = true, length = 32)
    public String getMethodcode() {
        return methodcode;
    }

    public void setMethodcode(String methodcode) {
        this.methodcode = methodcode;
    }

    @Basic
    @Column(name = "METHODNAME", nullable = true, length = 500)
    public String getMethodname() {
        return methodname;
    }

    public void setMethodname(String methodname) {
        this.methodname = methodname;
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
        SjWtMethod that = (SjWtMethod) o;
        return Objects.equals(methodId, that.methodId) &&
                Objects.equals(methodcode, that.methodcode) &&
                Objects.equals(methodname, that.methodname) &&
                Objects.equals(status, that.status) &&
                Objects.equals(orgId, that.orgId) &&
                Objects.equals(subOrgId, that.subOrgId) &&
                Objects.equals(deptId, that.deptId) &&
                Objects.equals(createPerson, that.createPerson) &&
                Objects.equals(createTime, that.createTime) &&
                Objects.equals(modifyPerson, that.modifyPerson) &&
                Objects.equals(modifyTime, that.modifyTime) &&
                Objects.equals(projectid, that.projectid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(methodId, methodcode, methodname, status, orgId, subOrgId, deptId, createPerson, createTime, modifyPerson, modifyTime, projectid);
    }

    @Override
    public String toString() {
        return "SjWtMethod{" +
                "methodId='" + methodId + '\'' +
                ", methodcode='" + methodcode + '\'' +
                ", methodname='" + methodname + '\'' +
                ", status='" + status + '\'' +
                ", orgId='" + orgId + '\'' +
                ", subOrgId='" + subOrgId + '\'' +
                ", deptId='" + deptId + '\'' +
                ", createPerson='" + createPerson + '\'' +
                ", createTime=" + createTime +
                ", modifyPerson='" + modifyPerson + '\'' +
                ", modifyTime=" + modifyTime +
                ", projectid='" + projectid + '\'' +
                '}';
    }



}
