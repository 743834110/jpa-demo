package xyz.berby.im.jpademo.bean;

import javax.persistence.*;
import java.sql.Time;
import java.util.Objects;

@Entity
@Table(name = "JUDP_MESSAGE_RECEIVER", schema = "TICKET", catalog = "")
@IdClass(JudpMessageReceiverPK.class)
public class JudpMessageReceiver {
    private String messageId;
    private String userId;
    private String email;
    private String web;
    private String mobile;
    private String phone;
    private Time webReadTime;

    @Id
    @Column(name = "MESSAGE_ID", nullable = false, length = 40)
    public String getMessageId() {
        return messageId;
    }

    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    @Id
    @Column(name = "USER_ID", nullable = false, length = 32)
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "EMAIL", nullable = true, length = 3)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "WEB", nullable = true, length = 3)
    public String getWeb() {
        return web;
    }

    public void setWeb(String web) {
        this.web = web;
    }

    @Basic
    @Column(name = "MOBILE", nullable = true, length = 3)
    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    @Basic
    @Column(name = "PHONE", nullable = true, length = 3)
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Basic
    @Column(name = "WEB_READ_TIME", nullable = true)
    public Time getWebReadTime() {
        return webReadTime;
    }

    public void setWebReadTime(Time webReadTime) {
        this.webReadTime = webReadTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JudpMessageReceiver that = (JudpMessageReceiver) o;
        return Objects.equals(messageId, that.messageId) &&
                Objects.equals(userId, that.userId) &&
                Objects.equals(email, that.email) &&
                Objects.equals(web, that.web) &&
                Objects.equals(mobile, that.mobile) &&
                Objects.equals(phone, that.phone) &&
                Objects.equals(webReadTime, that.webReadTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(messageId, userId, email, web, mobile, phone, webReadTime);
    }
}
