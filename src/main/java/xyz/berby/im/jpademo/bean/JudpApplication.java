package xyz.berby.im.jpademo.bean;

import javax.persistence.*;
import java.sql.Time;
import java.util.Objects;

@Entity
@Table(name = "JUDP_APPLICATION", schema = "TICKET", catalog = "")
public class JudpApplication {
    private String appId;
    private String appName;
    private String appImage;
    private String appDesc;
    private String createPerson;
    private Time createTime;
    private String modifyPerson;
    private Time modifyTime;
    private String busicomps;
    private String appType;
    private String appUrl;
    private Short orderNum;
    private String appAuthority;

    @Id
    @Column(name = "APP_ID", nullable = false, length = 32)
    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    @Basic
    @Column(name = "APP_NAME", nullable = false, length = 100)
    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    @Basic
    @Column(name = "APP_IMAGE", nullable = true, length = 200)
    public String getAppImage() {
        return appImage;
    }

    public void setAppImage(String appImage) {
        this.appImage = appImage;
    }

    @Basic
    @Column(name = "APP_DESC", nullable = true, length = 200)
    public String getAppDesc() {
        return appDesc;
    }

    public void setAppDesc(String appDesc) {
        this.appDesc = appDesc;
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
    @Column(name = "BUSICOMPS", nullable = true, length = 500)
    public String getBusicomps() {
        return busicomps;
    }

    public void setBusicomps(String busicomps) {
        this.busicomps = busicomps;
    }

    @Basic
    @Column(name = "APP_TYPE", nullable = true, length = 20)
    public String getAppType() {
        return appType;
    }

    public void setAppType(String appType) {
        this.appType = appType;
    }

    @Basic
    @Column(name = "APP_URL", nullable = true, length = 200)
    public String getAppUrl() {
        return appUrl;
    }

    public void setAppUrl(String appUrl) {
        this.appUrl = appUrl;
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
    @Column(name = "APP_AUTHORITY", nullable = true, length = 40)
    public String getAppAuthority() {
        return appAuthority;
    }

    public void setAppAuthority(String appAuthority) {
        this.appAuthority = appAuthority;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JudpApplication that = (JudpApplication) o;
        return Objects.equals(appId, that.appId) &&
                Objects.equals(appName, that.appName) &&
                Objects.equals(appImage, that.appImage) &&
                Objects.equals(appDesc, that.appDesc) &&
                Objects.equals(createPerson, that.createPerson) &&
                Objects.equals(createTime, that.createTime) &&
                Objects.equals(modifyPerson, that.modifyPerson) &&
                Objects.equals(modifyTime, that.modifyTime) &&
                Objects.equals(busicomps, that.busicomps) &&
                Objects.equals(appType, that.appType) &&
                Objects.equals(appUrl, that.appUrl) &&
                Objects.equals(orderNum, that.orderNum) &&
                Objects.equals(appAuthority, that.appAuthority);
    }

    @Override
    public int hashCode() {
        return Objects.hash(appId, appName, appImage, appDesc, createPerson, createTime, modifyPerson, modifyTime, busicomps, appType, appUrl, orderNum, appAuthority);
    }
}
