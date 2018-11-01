package xyz.berby.im.jpademo.bean;

import javax.persistence.*;
import java.sql.Time;
import java.util.Objects;

@Entity
@Table(name = "JUDP_USER_WORKFLOW_ROLE", schema = "TICKET", catalog = "")
public class JudpUserWorkflowRole {
    private String userWorkflowRoleId;
    private String wfRoleId;
    private String userDeptId;
    private String createPerson;
    private Time createTime;
    private String modifyPerson;
    private Time modifyTime;
    private String valid;

    @Id
    @Column(name = "USER_WORKFLOW_ROLE_ID", nullable = false, length = 32)
    public String getUserWorkflowRoleId() {
        return userWorkflowRoleId;
    }

    public void setUserWorkflowRoleId(String userWorkflowRoleId) {
        this.userWorkflowRoleId = userWorkflowRoleId;
    }

    @Basic
    @Column(name = "WF_ROLE_ID", nullable = true, length = 32)
    public String getWfRoleId() {
        return wfRoleId;
    }

    public void setWfRoleId(String wfRoleId) {
        this.wfRoleId = wfRoleId;
    }

    @Basic
    @Column(name = "USER_DEPT_ID", nullable = true, length = 32)
    public String getUserDeptId() {
        return userDeptId;
    }

    public void setUserDeptId(String userDeptId) {
        this.userDeptId = userDeptId;
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
    @Column(name = "VALID", nullable = false, length = 3)
    public String getValid() {
        return valid;
    }

    public void setValid(String valid) {
        this.valid = valid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JudpUserWorkflowRole that = (JudpUserWorkflowRole) o;
        return Objects.equals(userWorkflowRoleId, that.userWorkflowRoleId) &&
                Objects.equals(wfRoleId, that.wfRoleId) &&
                Objects.equals(userDeptId, that.userDeptId) &&
                Objects.equals(createPerson, that.createPerson) &&
                Objects.equals(createTime, that.createTime) &&
                Objects.equals(modifyPerson, that.modifyPerson) &&
                Objects.equals(modifyTime, that.modifyTime) &&
                Objects.equals(valid, that.valid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userWorkflowRoleId, wfRoleId, userDeptId, createPerson, createTime, modifyPerson, modifyTime, valid);
    }
}
