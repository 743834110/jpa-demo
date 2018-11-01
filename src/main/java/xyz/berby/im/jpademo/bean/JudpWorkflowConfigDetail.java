package xyz.berby.im.jpademo.bean;

import javax.persistence.*;
import java.sql.Time;
import java.util.Objects;

@Entity
@Table(name = "JUDP_WORKFLOW_CONFIG_DETAIL", schema = "TICKET", catalog = "")
public class JudpWorkflowConfigDetail {
    private String defineDetailId;
    private String defineId;
    private String managerOrgId;
    private String createPerson;
    private Time createTime;
    private String modifyPerson;
    private Time modifyTime;

    @Id
    @Column(name = "DEFINE_DETAIL_ID", nullable = false, length = 32)
    public String getDefineDetailId() {
        return defineDetailId;
    }

    public void setDefineDetailId(String defineDetailId) {
        this.defineDetailId = defineDetailId;
    }

    @Basic
    @Column(name = "DEFINE_ID", nullable = true, length = 32)
    public String getDefineId() {
        return defineId;
    }

    public void setDefineId(String defineId) {
        this.defineId = defineId;
    }

    @Basic
    @Column(name = "MANAGER_ORG_ID", nullable = true, length = 32)
    public String getManagerOrgId() {
        return managerOrgId;
    }

    public void setManagerOrgId(String managerOrgId) {
        this.managerOrgId = managerOrgId;
    }

    @Basic
    @Column(name = "CREATE_PERSON", nullable = false, length = 32)
    public String getCreatePerson() {
        return createPerson;
    }

    public void setCreatePerson(String createPerson) {
        this.createPerson = createPerson;
    }

    @Basic
    @Column(name = "CREATE_TIME", nullable = false)
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
        JudpWorkflowConfigDetail that = (JudpWorkflowConfigDetail) o;
        return Objects.equals(defineDetailId, that.defineDetailId) &&
                Objects.equals(defineId, that.defineId) &&
                Objects.equals(managerOrgId, that.managerOrgId) &&
                Objects.equals(createPerson, that.createPerson) &&
                Objects.equals(createTime, that.createTime) &&
                Objects.equals(modifyPerson, that.modifyPerson) &&
                Objects.equals(modifyTime, that.modifyTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(defineDetailId, defineId, managerOrgId, createPerson, createTime, modifyPerson, modifyTime);
    }
}
