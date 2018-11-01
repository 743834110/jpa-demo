package xyz.berby.im.jpademo.bean;

import javax.persistence.*;
import java.sql.Time;
import java.util.Objects;

@Entity
@Table(name = "JUDP_ROLE", schema = "TICKET", catalog = "")
public class JudpRole {
    private String roleId;
    private String roleName;
    private String roleDescription;
    private Integer userNumbers;
    private String orgId;
    private String subOrgId;
    private String common;
    private String roleFilterType;
    private String roleType;
    private String adminRange;
    private String createPerson;
    private Time createTime;
    private String modifyPerson;
    private Time modifyTime;
    private String updatable;
    private String appId;

    @Id
    @Column(name = "ROLE_ID", nullable = false, length = 32)
    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    @Basic
    @Column(name = "ROLE_NAME", nullable = false, length = 100)
    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    @Basic
    @Column(name = "ROLE_DESCRIPTION", nullable = true, length = 255)
    public String getRoleDescription() {
        return roleDescription;
    }

    public void setRoleDescription(String roleDescription) {
        this.roleDescription = roleDescription;
    }

    @Basic
    @Column(name = "USER_NUMBERS", nullable = true, precision = 0)
    public Integer getUserNumbers() {
        return userNumbers;
    }

    public void setUserNumbers(Integer userNumbers) {
        this.userNumbers = userNumbers;
    }

    @Basic
    @Column(name = "ORG_ID", nullable = false, length = 32)
    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    @Basic
    @Column(name = "SUB_ORG_ID", nullable = false, length = 32)
    public String getSubOrgId() {
        return subOrgId;
    }

    public void setSubOrgId(String subOrgId) {
        this.subOrgId = subOrgId;
    }

    @Basic
    @Column(name = "COMMON", nullable = false, length = 3)
    public String getCommon() {
        return common;
    }

    public void setCommon(String common) {
        this.common = common;
    }

    @Basic
    @Column(name = "ROLE_FILTER_TYPE", nullable = true, length = 3)
    public String getRoleFilterType() {
        return roleFilterType;
    }

    public void setRoleFilterType(String roleFilterType) {
        this.roleFilterType = roleFilterType;
    }

    @Basic
    @Column(name = "ROLE_TYPE", nullable = true, length = 3)
    public String getRoleType() {
        return roleType;
    }

    public void setRoleType(String roleType) {
        this.roleType = roleType;
    }

    @Basic
    @Column(name = "ADMIN_RANGE", nullable = true, length = 3)
    public String getAdminRange() {
        return adminRange;
    }

    public void setAdminRange(String adminRange) {
        this.adminRange = adminRange;
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
    @Column(name = "UPDATABLE", nullable = true, length = 3)
    public String getUpdatable() {
        return updatable;
    }

    public void setUpdatable(String updatable) {
        this.updatable = updatable;
    }

    @Basic
    @Column(name = "APP_ID", nullable = false, length = 32)
    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JudpRole judpRole = (JudpRole) o;
        return Objects.equals(roleId, judpRole.roleId) &&
                Objects.equals(roleName, judpRole.roleName) &&
                Objects.equals(roleDescription, judpRole.roleDescription) &&
                Objects.equals(userNumbers, judpRole.userNumbers) &&
                Objects.equals(orgId, judpRole.orgId) &&
                Objects.equals(subOrgId, judpRole.subOrgId) &&
                Objects.equals(common, judpRole.common) &&
                Objects.equals(roleFilterType, judpRole.roleFilterType) &&
                Objects.equals(roleType, judpRole.roleType) &&
                Objects.equals(adminRange, judpRole.adminRange) &&
                Objects.equals(createPerson, judpRole.createPerson) &&
                Objects.equals(createTime, judpRole.createTime) &&
                Objects.equals(modifyPerson, judpRole.modifyPerson) &&
                Objects.equals(modifyTime, judpRole.modifyTime) &&
                Objects.equals(updatable, judpRole.updatable) &&
                Objects.equals(appId, judpRole.appId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(roleId, roleName, roleDescription, userNumbers, orgId, subOrgId, common, roleFilterType, roleType, adminRange, createPerson, createTime, modifyPerson, modifyTime, updatable, appId);
    }
}
