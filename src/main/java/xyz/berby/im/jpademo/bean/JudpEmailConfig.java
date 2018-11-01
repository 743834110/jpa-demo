package xyz.berby.im.jpademo.bean;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "JUDP_EMAIL_CONFIG", schema = "TICKET", catalog = "")
public class JudpEmailConfig {
    private String emailConfigId;
    private String serverName;
    private String pop3Name;
    private String pop3Port;
    private String pop3Ssl;
    private String pop3Tls;
    private String pop3EntireAddress;
    private String smtpName;
    private String smtpPort;
    private String smtpSsl;
    private String smtpTls;
    private String smtpEntireAddress;
    private String imapName;
    private String imapPort;
    private String imapSsl;
    private String imapTls;
    private String imapMovetoSentbox;
    private String defaultSend;
    private String history;
    private String userName;
    private String password;
    private String signer;
    private String sendTimes;
    private String memo;
    private String orgId;

    @Id
    @Column(name = "EMAIL_CONFIG_ID", nullable = false, length = 32)
    public String getEmailConfigId() {
        return emailConfigId;
    }

    public void setEmailConfigId(String emailConfigId) {
        this.emailConfigId = emailConfigId;
    }

    @Basic
    @Column(name = "SERVER_NAME", nullable = true, length = 50)
    public String getServerName() {
        return serverName;
    }

    public void setServerName(String serverName) {
        this.serverName = serverName;
    }

    @Basic
    @Column(name = "POP3_NAME", nullable = true, length = 50)
    public String getPop3Name() {
        return pop3Name;
    }

    public void setPop3Name(String pop3Name) {
        this.pop3Name = pop3Name;
    }

    @Basic
    @Column(name = "POP3_PORT", nullable = true, length = 12)
    public String getPop3Port() {
        return pop3Port;
    }

    public void setPop3Port(String pop3Port) {
        this.pop3Port = pop3Port;
    }

    @Basic
    @Column(name = "POP3_SSL", nullable = true, length = 1)
    public String getPop3Ssl() {
        return pop3Ssl;
    }

    public void setPop3Ssl(String pop3Ssl) {
        this.pop3Ssl = pop3Ssl;
    }

    @Basic
    @Column(name = "POP3_TLS", nullable = true, length = 1)
    public String getPop3Tls() {
        return pop3Tls;
    }

    public void setPop3Tls(String pop3Tls) {
        this.pop3Tls = pop3Tls;
    }

    @Basic
    @Column(name = "POP3_ENTIRE_ADDRESS", nullable = true, length = 1)
    public String getPop3EntireAddress() {
        return pop3EntireAddress;
    }

    public void setPop3EntireAddress(String pop3EntireAddress) {
        this.pop3EntireAddress = pop3EntireAddress;
    }

    @Basic
    @Column(name = "SMTP_NAME", nullable = true, length = 50)
    public String getSmtpName() {
        return smtpName;
    }

    public void setSmtpName(String smtpName) {
        this.smtpName = smtpName;
    }

    @Basic
    @Column(name = "SMTP_PORT", nullable = true, length = 12)
    public String getSmtpPort() {
        return smtpPort;
    }

    public void setSmtpPort(String smtpPort) {
        this.smtpPort = smtpPort;
    }

    @Basic
    @Column(name = "SMTP_SSL", nullable = true, length = 1)
    public String getSmtpSsl() {
        return smtpSsl;
    }

    public void setSmtpSsl(String smtpSsl) {
        this.smtpSsl = smtpSsl;
    }

    @Basic
    @Column(name = "SMTP_TLS", nullable = true, length = 1)
    public String getSmtpTls() {
        return smtpTls;
    }

    public void setSmtpTls(String smtpTls) {
        this.smtpTls = smtpTls;
    }

    @Basic
    @Column(name = "SMTP_ENTIRE_ADDRESS", nullable = true, length = 1)
    public String getSmtpEntireAddress() {
        return smtpEntireAddress;
    }

    public void setSmtpEntireAddress(String smtpEntireAddress) {
        this.smtpEntireAddress = smtpEntireAddress;
    }

    @Basic
    @Column(name = "IMAP_NAME", nullable = true, length = 50)
    public String getImapName() {
        return imapName;
    }

    public void setImapName(String imapName) {
        this.imapName = imapName;
    }

    @Basic
    @Column(name = "IMAP_PORT", nullable = true, length = 12)
    public String getImapPort() {
        return imapPort;
    }

    public void setImapPort(String imapPort) {
        this.imapPort = imapPort;
    }

    @Basic
    @Column(name = "IMAP_SSL", nullable = true, length = 1)
    public String getImapSsl() {
        return imapSsl;
    }

    public void setImapSsl(String imapSsl) {
        this.imapSsl = imapSsl;
    }

    @Basic
    @Column(name = "IMAP_TLS", nullable = true, length = 1)
    public String getImapTls() {
        return imapTls;
    }

    public void setImapTls(String imapTls) {
        this.imapTls = imapTls;
    }

    @Basic
    @Column(name = "IMAP_MOVETO_SENTBOX", nullable = true, length = 1)
    public String getImapMovetoSentbox() {
        return imapMovetoSentbox;
    }

    public void setImapMovetoSentbox(String imapMovetoSentbox) {
        this.imapMovetoSentbox = imapMovetoSentbox;
    }

    @Basic
    @Column(name = "DEFAULT_SEND", nullable = true, length = 1)
    public String getDefaultSend() {
        return defaultSend;
    }

    public void setDefaultSend(String defaultSend) {
        this.defaultSend = defaultSend;
    }

    @Basic
    @Column(name = "HISTORY", nullable = true, length = 1)
    public String getHistory() {
        return history;
    }

    public void setHistory(String history) {
        this.history = history;
    }

    @Basic
    @Column(name = "USER_NAME", nullable = true, length = 100)
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Basic
    @Column(name = "PASSWORD", nullable = true, length = 100)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "SIGNER", nullable = true, length = 200)
    public String getSigner() {
        return signer;
    }

    public void setSigner(String signer) {
        this.signer = signer;
    }

    @Basic
    @Column(name = "SEND_TIMES", nullable = true, length = 5)
    public String getSendTimes() {
        return sendTimes;
    }

    public void setSendTimes(String sendTimes) {
        this.sendTimes = sendTimes;
    }

    @Basic
    @Column(name = "MEMO", nullable = true, length = 100)
    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    @Basic
    @Column(name = "ORG_ID", nullable = true, length = 32)
    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JudpEmailConfig that = (JudpEmailConfig) o;
        return Objects.equals(emailConfigId, that.emailConfigId) &&
                Objects.equals(serverName, that.serverName) &&
                Objects.equals(pop3Name, that.pop3Name) &&
                Objects.equals(pop3Port, that.pop3Port) &&
                Objects.equals(pop3Ssl, that.pop3Ssl) &&
                Objects.equals(pop3Tls, that.pop3Tls) &&
                Objects.equals(pop3EntireAddress, that.pop3EntireAddress) &&
                Objects.equals(smtpName, that.smtpName) &&
                Objects.equals(smtpPort, that.smtpPort) &&
                Objects.equals(smtpSsl, that.smtpSsl) &&
                Objects.equals(smtpTls, that.smtpTls) &&
                Objects.equals(smtpEntireAddress, that.smtpEntireAddress) &&
                Objects.equals(imapName, that.imapName) &&
                Objects.equals(imapPort, that.imapPort) &&
                Objects.equals(imapSsl, that.imapSsl) &&
                Objects.equals(imapTls, that.imapTls) &&
                Objects.equals(imapMovetoSentbox, that.imapMovetoSentbox) &&
                Objects.equals(defaultSend, that.defaultSend) &&
                Objects.equals(history, that.history) &&
                Objects.equals(userName, that.userName) &&
                Objects.equals(password, that.password) &&
                Objects.equals(signer, that.signer) &&
                Objects.equals(sendTimes, that.sendTimes) &&
                Objects.equals(memo, that.memo) &&
                Objects.equals(orgId, that.orgId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(emailConfigId, serverName, pop3Name, pop3Port, pop3Ssl, pop3Tls, pop3EntireAddress, smtpName, smtpPort, smtpSsl, smtpTls, smtpEntireAddress, imapName, imapPort, imapSsl, imapTls, imapMovetoSentbox, defaultSend, history, userName, password, signer, sendTimes, memo, orgId);
    }
}
