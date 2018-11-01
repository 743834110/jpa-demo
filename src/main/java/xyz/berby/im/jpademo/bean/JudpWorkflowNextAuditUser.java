package xyz.berby.im.jpademo.bean;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "JUDP_WORKFLOW_NEXT_AUDIT_USER", schema = "TICKET", catalog = "")
@IdClass(JudpWorkflowNextAuditUserPK.class)
public class JudpWorkflowNextAuditUser {
    private String processInstanceId;
    private String actId;
    private String auditUserDeptId;

    @Id
    @Column(name = "PROCESS_INSTANCE_ID", nullable = false, length = 64)
    public String getProcessInstanceId() {
        return processInstanceId;
    }

    public void setProcessInstanceId(String processInstanceId) {
        this.processInstanceId = processInstanceId;
    }

    @Id
    @Column(name = "ACT_ID", nullable = false, length = 64)
    public String getActId() {
        return actId;
    }

    public void setActId(String actId) {
        this.actId = actId;
    }

    @Basic
    @Column(name = "AUDIT_USER_DEPT_ID", nullable = true, length = 1000)
    public String getAuditUserDeptId() {
        return auditUserDeptId;
    }

    public void setAuditUserDeptId(String auditUserDeptId) {
        this.auditUserDeptId = auditUserDeptId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JudpWorkflowNextAuditUser that = (JudpWorkflowNextAuditUser) o;
        return Objects.equals(processInstanceId, that.processInstanceId) &&
                Objects.equals(actId, that.actId) &&
                Objects.equals(auditUserDeptId, that.auditUserDeptId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(processInstanceId, actId, auditUserDeptId);
    }
}
