package xyz.berby.im.jpademo.bean;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "JUDP_WORKFLOW_AUDIT_MESSAGE", schema = "TICKET", catalog = "")
public class JudpWorkflowAuditMessage {
    private String auditMessageId;
    private String messageDesc;
    private String messageType;
    private Short orderNum;
    private String userId;

    @Id
    @Column(name = "AUDIT_MESSAGE_ID", nullable = false, length = 64)
    public String getAuditMessageId() {
        return auditMessageId;
    }

    public void setAuditMessageId(String auditMessageId) {
        this.auditMessageId = auditMessageId;
    }

    @Basic
    @Column(name = "MESSAGE_DESC", nullable = true, length = 500)
    public String getMessageDesc() {
        return messageDesc;
    }

    public void setMessageDesc(String messageDesc) {
        this.messageDesc = messageDesc;
    }

    @Basic
    @Column(name = "MESSAGE_TYPE", nullable = true, length = 3)
    public String getMessageType() {
        return messageType;
    }

    public void setMessageType(String messageType) {
        this.messageType = messageType;
    }

    @Basic
    @Column(name = "ORDER_NUM", nullable = true, precision = 0)
    public Short getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(Short orderNum) {
        this.orderNum = orderNum;
    }

    @Basic
    @Column(name = "USER_ID", nullable = true, length = 64)
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JudpWorkflowAuditMessage that = (JudpWorkflowAuditMessage) o;
        return Objects.equals(auditMessageId, that.auditMessageId) &&
                Objects.equals(messageDesc, that.messageDesc) &&
                Objects.equals(messageType, that.messageType) &&
                Objects.equals(orderNum, that.orderNum) &&
                Objects.equals(userId, that.userId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(auditMessageId, messageDesc, messageType, orderNum, userId);
    }
}
