package xyz.berby.im.jpademo.bean;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class JudpWorkflowNextAuditUserPK implements Serializable {
    private String processInstanceId;
    private String actId;

    @Column(name = "PROCESS_INSTANCE_ID", nullable = false, length = 64)
    @Id
    public String getProcessInstanceId() {
        return processInstanceId;
    }

    public void setProcessInstanceId(String processInstanceId) {
        this.processInstanceId = processInstanceId;
    }

    @Column(name = "ACT_ID", nullable = false, length = 64)
    @Id
    public String getActId() {
        return actId;
    }

    public void setActId(String actId) {
        this.actId = actId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JudpWorkflowNextAuditUserPK that = (JudpWorkflowNextAuditUserPK) o;
        return Objects.equals(processInstanceId, that.processInstanceId) &&
                Objects.equals(actId, that.actId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(processInstanceId, actId);
    }
}
