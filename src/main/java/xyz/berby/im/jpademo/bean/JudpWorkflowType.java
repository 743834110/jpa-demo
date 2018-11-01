package xyz.berby.im.jpademo.bean;

import javax.persistence.*;
import java.sql.Time;
import java.util.Objects;

@Entity
@Table(name = "JUDP_WORKFLOW_TYPE", schema = "TICKET", catalog = "")
public class JudpWorkflowType {
    private String wfTypeId;
    private String wfTypeName;
    private String beanClassName;
    private String valid;
    private String createPerson;
    private Time createTime;
    private String modifyPerson;
    private Time modifyTime;
    private String computeCol;
    private String formUrl;
    private String updateService;

    @Id
    @Column(name = "WF_TYPE_ID", nullable = false, length = 32)
    public String getWfTypeId() {
        return wfTypeId;
    }

    public void setWfTypeId(String wfTypeId) {
        this.wfTypeId = wfTypeId;
    }

    @Basic
    @Column(name = "WF_TYPE_NAME", nullable = false, length = 100)
    public String getWfTypeName() {
        return wfTypeName;
    }

    public void setWfTypeName(String wfTypeName) {
        this.wfTypeName = wfTypeName;
    }

    @Basic
    @Column(name = "BEAN_CLASS_NAME", nullable = true, length = 80)
    public String getBeanClassName() {
        return beanClassName;
    }

    public void setBeanClassName(String beanClassName) {
        this.beanClassName = beanClassName;
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
    @Column(name = "COMPUTE_COL", nullable = true, length = 500)
    public String getComputeCol() {
        return computeCol;
    }

    public void setComputeCol(String computeCol) {
        this.computeCol = computeCol;
    }

    @Basic
    @Column(name = "FORM_URL", nullable = true, length = 200)
    public String getFormUrl() {
        return formUrl;
    }

    public void setFormUrl(String formUrl) {
        this.formUrl = formUrl;
    }

    @Basic
    @Column(name = "UPDATE_SERVICE", nullable = true, length = 100)
    public String getUpdateService() {
        return updateService;
    }

    public void setUpdateService(String updateService) {
        this.updateService = updateService;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JudpWorkflowType that = (JudpWorkflowType) o;
        return Objects.equals(wfTypeId, that.wfTypeId) &&
                Objects.equals(wfTypeName, that.wfTypeName) &&
                Objects.equals(beanClassName, that.beanClassName) &&
                Objects.equals(valid, that.valid) &&
                Objects.equals(createPerson, that.createPerson) &&
                Objects.equals(createTime, that.createTime) &&
                Objects.equals(modifyPerson, that.modifyPerson) &&
                Objects.equals(modifyTime, that.modifyTime) &&
                Objects.equals(computeCol, that.computeCol) &&
                Objects.equals(formUrl, that.formUrl) &&
                Objects.equals(updateService, that.updateService);
    }

    @Override
    public int hashCode() {
        return Objects.hash(wfTypeId, wfTypeName, beanClassName, valid, createPerson, createTime, modifyPerson, modifyTime, computeCol, formUrl, updateService);
    }
}
