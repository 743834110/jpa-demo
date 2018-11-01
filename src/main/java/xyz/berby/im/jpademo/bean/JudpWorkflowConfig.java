package xyz.berby.im.jpademo.bean;

import javax.persistence.*;
import java.sql.Time;
import java.util.Objects;

@Entity
@Table(name = "JUDP_WORKFLOW_CONFIG", schema = "TICKET", catalog = "")
public class JudpWorkflowConfig {
    private String defineId;
    private String wfTypeId;
    private String orgId;
    private String defineName;
    private String modelId;
    private String deployId;
    private String activitiWfId;
    private String subOrgId;
    private String valid;
    private String createPerson;
    private Time createTime;
    private String modifyPerson;
    private Time modifyTime;
    private String status;
    private Long versionId;

    @Id
    @Column(name = "DEFINE_ID", nullable = false, length = 32)
    public String getDefineId() {
        return defineId;
    }

    public void setDefineId(String defineId) {
        this.defineId = defineId;
    }

    @Basic
    @Column(name = "WF_TYPE_ID", nullable = true, length = 32)
    public String getWfTypeId() {
        return wfTypeId;
    }

    public void setWfTypeId(String wfTypeId) {
        this.wfTypeId = wfTypeId;
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
    @Column(name = "DEFINE_NAME", nullable = true, length = 200)
    public String getDefineName() {
        return defineName;
    }

    public void setDefineName(String defineName) {
        this.defineName = defineName;
    }

    @Basic
    @Column(name = "MODEL_ID", nullable = true, length = 64)
    public String getModelId() {
        return modelId;
    }

    public void setModelId(String modelId) {
        this.modelId = modelId;
    }

    @Basic
    @Column(name = "DEPLOY_ID", nullable = true, length = 64)
    public String getDeployId() {
        return deployId;
    }

    public void setDeployId(String deployId) {
        this.deployId = deployId;
    }

    @Basic
    @Column(name = "ACTIVITI_WF_ID", nullable = true, length = 64)
    public String getActivitiWfId() {
        return activitiWfId;
    }

    public void setActivitiWfId(String activitiWfId) {
        this.activitiWfId = activitiWfId;
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
    @Column(name = "VALID", nullable = true, length = 3)
    public String getValid() {
        return valid;
    }

    public void setValid(String valid) {
        this.valid = valid;
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
    @Column(name = "STATUS", nullable = true, length = 3)
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Basic
    @Column(name = "VERSION_ID", nullable = true, precision = 0)
    public Long getVersionId() {
        return versionId;
    }

    public void setVersionId(Long versionId) {
        this.versionId = versionId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JudpWorkflowConfig that = (JudpWorkflowConfig) o;
        return Objects.equals(defineId, that.defineId) &&
                Objects.equals(wfTypeId, that.wfTypeId) &&
                Objects.equals(orgId, that.orgId) &&
                Objects.equals(defineName, that.defineName) &&
                Objects.equals(modelId, that.modelId) &&
                Objects.equals(deployId, that.deployId) &&
                Objects.equals(activitiWfId, that.activitiWfId) &&
                Objects.equals(subOrgId, that.subOrgId) &&
                Objects.equals(valid, that.valid) &&
                Objects.equals(createPerson, that.createPerson) &&
                Objects.equals(createTime, that.createTime) &&
                Objects.equals(modifyPerson, that.modifyPerson) &&
                Objects.equals(modifyTime, that.modifyTime) &&
                Objects.equals(status, that.status) &&
                Objects.equals(versionId, that.versionId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(defineId, wfTypeId, orgId, defineName, modelId, deployId, activitiWfId, subOrgId, valid, createPerson, createTime, modifyPerson, modifyTime, status, versionId);
    }
}
