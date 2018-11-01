package xyz.berby.im.jpademo.bean;

import javax.persistence.*;
import java.sql.Time;
import java.util.Objects;

@Entity
@Table(name = "JUDP_NODES", schema = "TICKET", catalog = "")
public class JudpNodes {
    private String uuid;
    private String jointName;
    private String simpleDesc;
    private String parentNodeid;
    private String isContent;
    private String content;
    private String createPerson;
    private Time createTime;
    private String modifyPersion;
    private Time modifyTime;
    private String orgId;
    private String subOrgId;
    private String deptId;
    private String cmstype;
    private String status;
    private Integer nodessort;
    private String author;
    private String imgId;

    @Id
    @Column(name = "UUID", nullable = false, length = 32)
    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    @Basic
    @Column(name = "JOINT_NAME", nullable = true, length = 200)
    public String getJointName() {
        return jointName;
    }

    public void setJointName(String jointName) {
        this.jointName = jointName;
    }

    @Basic
    @Column(name = "SIMPLE_DESC", nullable = true, length = 1000)
    public String getSimpleDesc() {
        return simpleDesc;
    }

    public void setSimpleDesc(String simpleDesc) {
        this.simpleDesc = simpleDesc;
    }

    @Basic
    @Column(name = "PARENT_NODEID", nullable = true, length = 32)
    public String getParentNodeid() {
        return parentNodeid;
    }

    public void setParentNodeid(String parentNodeid) {
        this.parentNodeid = parentNodeid;
    }

    @Basic
    @Column(name = "IS_CONTENT", nullable = true, length = 2)
    public String getIsContent() {
        return isContent;
    }

    public void setIsContent(String isContent) {
        this.isContent = isContent;
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
    @Column(name = "CREATE_PERSON", nullable = true, length = 50)
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
    @Column(name = "MODIFY_PERSION", nullable = true, length = 50)
    public String getModifyPersion() {
        return modifyPersion;
    }

    public void setModifyPersion(String modifyPersion) {
        this.modifyPersion = modifyPersion;
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
    @Column(name = "ORG_ID", nullable = true, length = 50)
    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    @Basic
    @Column(name = "SUB_ORG_ID", nullable = true, length = 50)
    public String getSubOrgId() {
        return subOrgId;
    }

    public void setSubOrgId(String subOrgId) {
        this.subOrgId = subOrgId;
    }

    @Basic
    @Column(name = "DEPT_ID", nullable = true, length = 50)
    public String getDeptId() {
        return deptId;
    }

    public void setDeptId(String deptId) {
        this.deptId = deptId;
    }

    @Basic
    @Column(name = "CMSTYPE", nullable = true, length = 30)
    public String getCmstype() {
        return cmstype;
    }

    public void setCmstype(String cmstype) {
        this.cmstype = cmstype;
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
    @Column(name = "NODESSORT", nullable = true, precision = 0)
    public Integer getNodessort() {
        return nodessort;
    }

    public void setNodessort(Integer nodessort) {
        this.nodessort = nodessort;
    }

    @Basic
    @Column(name = "AUTHOR", nullable = true, length = 30)
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Basic
    @Column(name = "IMG_ID", nullable = true, length = 32)
    public String getImgId() {
        return imgId;
    }

    public void setImgId(String imgId) {
        this.imgId = imgId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JudpNodes judpNodes = (JudpNodes) o;
        return Objects.equals(uuid, judpNodes.uuid) &&
                Objects.equals(jointName, judpNodes.jointName) &&
                Objects.equals(simpleDesc, judpNodes.simpleDesc) &&
                Objects.equals(parentNodeid, judpNodes.parentNodeid) &&
                Objects.equals(isContent, judpNodes.isContent) &&
                Objects.equals(content, judpNodes.content) &&
                Objects.equals(createPerson, judpNodes.createPerson) &&
                Objects.equals(createTime, judpNodes.createTime) &&
                Objects.equals(modifyPersion, judpNodes.modifyPersion) &&
                Objects.equals(modifyTime, judpNodes.modifyTime) &&
                Objects.equals(orgId, judpNodes.orgId) &&
                Objects.equals(subOrgId, judpNodes.subOrgId) &&
                Objects.equals(deptId, judpNodes.deptId) &&
                Objects.equals(cmstype, judpNodes.cmstype) &&
                Objects.equals(status, judpNodes.status) &&
                Objects.equals(nodessort, judpNodes.nodessort) &&
                Objects.equals(author, judpNodes.author) &&
                Objects.equals(imgId, judpNodes.imgId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uuid, jointName, simpleDesc, parentNodeid, isContent, content, createPerson, createTime, modifyPersion, modifyTime, orgId, subOrgId, deptId, cmstype, status, nodessort, author, imgId);
    }
}
