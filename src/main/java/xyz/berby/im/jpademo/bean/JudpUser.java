package xyz.berby.im.jpademo.bean;

import javax.persistence.*;
import java.sql.Time;
import java.util.Objects;

@Entity
@Table(name = "JUDP_USER", schema = "TICKET", catalog = "")
public class JudpUser {
    private String userId;
    private String userAccount;
    private String userFullname;
    private String userPassword;
    private String userDescription;
    private String userSex;
    private String userNo;
    private String userMobile;
    private String userEmail;
    private String userPhoto;
    private String userQq;
    private String userPhone;
    private String userMsno;
    private String userPsno;
    private Time userPasswordChanged;
    private String valid;
    private Time userEnabledDate;
    private Time userDisabledDate;
    private String userAccountLocked;
    private String userImageUrl;
    private String userTags;
    private Time lastLoginDate;
    private String orgId;
    private String createPerson;
    private Time createTime;
    private String modifyPerson;
    private Time modifyTime;
    private Short loginFails;

    @Id
    @Column(name = "USER_ID", nullable = false, length = 32)
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "USER_ACCOUNT", nullable = true, length = 32)
    public String getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(String userAccount) {
        this.userAccount = userAccount;
    }

    @Basic
    @Column(name = "USER_FULLNAME", nullable = false, length = 32)
    public String getUserFullname() {
        return userFullname;
    }

    public void setUserFullname(String userFullname) {
        this.userFullname = userFullname;
    }

    @Basic
    @Column(name = "USER_PASSWORD", nullable = true, length = 32)
    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    @Basic
    @Column(name = "USER_DESCRIPTION", nullable = true, length = 255)
    public String getUserDescription() {
        return userDescription;
    }

    public void setUserDescription(String userDescription) {
        this.userDescription = userDescription;
    }

    @Basic
    @Column(name = "USER_SEX", nullable = true, length = 3)
    public String getUserSex() {
        return userSex;
    }

    public void setUserSex(String userSex) {
        this.userSex = userSex;
    }

    @Basic
    @Column(name = "USER_NO", nullable = true, length = 50)
    public String getUserNo() {
        return userNo;
    }

    public void setUserNo(String userNo) {
        this.userNo = userNo;
    }

    @Basic
    @Column(name = "USER_MOBILE", nullable = true, length = 20)
    public String getUserMobile() {
        return userMobile;
    }

    public void setUserMobile(String userMobile) {
        this.userMobile = userMobile;
    }

    @Basic
    @Column(name = "USER_EMAIL", nullable = true, length = 128)
    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    @Basic
    @Column(name = "USER_PHOTO", nullable = true, length = 1)
    public String getUserPhoto() {
        return userPhoto;
    }

    public void setUserPhoto(String userPhoto) {
        this.userPhoto = userPhoto;
    }

    @Basic
    @Column(name = "USER_QQ", nullable = true, length = 64)
    public String getUserQq() {
        return userQq;
    }

    public void setUserQq(String userQq) {
        this.userQq = userQq;
    }

    @Basic
    @Column(name = "USER_PHONE", nullable = true, length = 20)
    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    @Basic
    @Column(name = "USER_MSNO", nullable = true, length = 10)
    public String getUserMsno() {
        return userMsno;
    }

    public void setUserMsno(String userMsno) {
        this.userMsno = userMsno;
    }

    @Basic
    @Column(name = "USER_PSNO", nullable = true, length = 10)
    public String getUserPsno() {
        return userPsno;
    }

    public void setUserPsno(String userPsno) {
        this.userPsno = userPsno;
    }

    @Basic
    @Column(name = "USER_PASSWORD_CHANGED", nullable = true)
    public Time getUserPasswordChanged() {
        return userPasswordChanged;
    }

    public void setUserPasswordChanged(Time userPasswordChanged) {
        this.userPasswordChanged = userPasswordChanged;
    }

    @Basic
    @Column(name = "VALID", nullable = false, length = 3)
    public String getValid() {
        return valid;
    }

    public void setValid(String valid) {
        this.valid = valid;
    }

    @Basic
    @Column(name = "USER_ENABLED_DATE", nullable = true)
    public Time getUserEnabledDate() {
        return userEnabledDate;
    }

    public void setUserEnabledDate(Time userEnabledDate) {
        this.userEnabledDate = userEnabledDate;
    }

    @Basic
    @Column(name = "USER_DISABLED_DATE", nullable = true)
    public Time getUserDisabledDate() {
        return userDisabledDate;
    }

    public void setUserDisabledDate(Time userDisabledDate) {
        this.userDisabledDate = userDisabledDate;
    }

    @Basic
    @Column(name = "USER_ACCOUNT_LOCKED", nullable = true, length = 2)
    public String getUserAccountLocked() {
        return userAccountLocked;
    }

    public void setUserAccountLocked(String userAccountLocked) {
        this.userAccountLocked = userAccountLocked;
    }

    @Basic
    @Column(name = "USER_IMAGE_URL", nullable = true, length = 255)
    public String getUserImageUrl() {
        return userImageUrl;
    }

    public void setUserImageUrl(String userImageUrl) {
        this.userImageUrl = userImageUrl;
    }

    @Basic
    @Column(name = "USER_TAGS", nullable = true, length = 255)
    public String getUserTags() {
        return userTags;
    }

    public void setUserTags(String userTags) {
        this.userTags = userTags;
    }

    @Basic
    @Column(name = "LAST_LOGIN_DATE", nullable = true)
    public Time getLastLoginDate() {
        return lastLoginDate;
    }

    public void setLastLoginDate(Time lastLoginDate) {
        this.lastLoginDate = lastLoginDate;
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
    @Column(name = "LOGIN_FAILS", nullable = true, precision = 0)
    public Short getLoginFails() {
        return loginFails;
    }

    public void setLoginFails(Short loginFails) {
        this.loginFails = loginFails;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JudpUser judpUser = (JudpUser) o;
        return Objects.equals(userId, judpUser.userId) &&
                Objects.equals(userAccount, judpUser.userAccount) &&
                Objects.equals(userFullname, judpUser.userFullname) &&
                Objects.equals(userPassword, judpUser.userPassword) &&
                Objects.equals(userDescription, judpUser.userDescription) &&
                Objects.equals(userSex, judpUser.userSex) &&
                Objects.equals(userNo, judpUser.userNo) &&
                Objects.equals(userMobile, judpUser.userMobile) &&
                Objects.equals(userEmail, judpUser.userEmail) &&
                Objects.equals(userPhoto, judpUser.userPhoto) &&
                Objects.equals(userQq, judpUser.userQq) &&
                Objects.equals(userPhone, judpUser.userPhone) &&
                Objects.equals(userMsno, judpUser.userMsno) &&
                Objects.equals(userPsno, judpUser.userPsno) &&
                Objects.equals(userPasswordChanged, judpUser.userPasswordChanged) &&
                Objects.equals(valid, judpUser.valid) &&
                Objects.equals(userEnabledDate, judpUser.userEnabledDate) &&
                Objects.equals(userDisabledDate, judpUser.userDisabledDate) &&
                Objects.equals(userAccountLocked, judpUser.userAccountLocked) &&
                Objects.equals(userImageUrl, judpUser.userImageUrl) &&
                Objects.equals(userTags, judpUser.userTags) &&
                Objects.equals(lastLoginDate, judpUser.lastLoginDate) &&
                Objects.equals(orgId, judpUser.orgId) &&
                Objects.equals(createPerson, judpUser.createPerson) &&
                Objects.equals(createTime, judpUser.createTime) &&
                Objects.equals(modifyPerson, judpUser.modifyPerson) &&
                Objects.equals(modifyTime, judpUser.modifyTime) &&
                Objects.equals(loginFails, judpUser.loginFails);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, userAccount, userFullname, userPassword, userDescription, userSex, userNo, userMobile, userEmail, userPhoto, userQq, userPhone, userMsno, userPsno, userPasswordChanged, valid, userEnabledDate, userDisabledDate, userAccountLocked, userImageUrl, userTags, lastLoginDate, orgId, createPerson, createTime, modifyPerson, modifyTime, loginFails);
    }
}
