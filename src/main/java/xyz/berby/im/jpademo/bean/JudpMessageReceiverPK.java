package xyz.berby.im.jpademo.bean;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class JudpMessageReceiverPK implements Serializable {
    private String messageId;
    private String userId;

    @Column(name = "MESSAGE_ID", nullable = false, length = 40)
    @Id
    public String getMessageId() {
        return messageId;
    }

    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    @Column(name = "USER_ID", nullable = false, length = 32)
    @Id
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
        JudpMessageReceiverPK that = (JudpMessageReceiverPK) o;
        return Objects.equals(messageId, that.messageId) &&
                Objects.equals(userId, that.userId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(messageId, userId);
    }
}
