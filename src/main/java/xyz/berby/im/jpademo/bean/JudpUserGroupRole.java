package xyz.berby.im.jpademo.bean;

import javax.persistence.*;
import java.sql.Time;
import java.util.Objects;

@Entity
@Table(name = "JUDP_USER_GROUP_ROLE", schema = "TICKET", catalog = "")
public class JudpUserGroupRole {
    private String userGroupRoleId;
    private String roleId;
    private String userGroupId;
    private String userGroupType;
    private String orgId;
    private String createPerson;
    private Time createTime;
    private String modifyPerson;
    private Time modifyTime;

    @Id
    @Column(name = "USER_GROUP_ROLE_ID", nullable = false, length = 32)
    public String getUserGroupRoleId() {
        return userGroupRoleId;
    }

    public void setUserGroupRoleId(String userGroupRoleId) {
        this.userGroupRoleId = userGroupRoleId;
    }

    @Basic
    @Column(name = "ROLE_ID", nullable = false, length = 32)
    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    @Basic
    @Column(name = "USER_GROUP_ID", nullable = false, length = 32)
    public String getUserGroupId() {
        return userGroupId;
    }

    public void setUserGroupId(String userGroupId) {
        this.userGroupId = userGroupId;
    }

    @Basic
    @Column(name = "USER_GROUP_TYPE", nullable = true, length = 3)
    public String getUserGroupType() {
        return userGroupType;
    }

    public void setUserGroupType(String userGroupType) {
        this.userGroupType = userGroupType;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JudpUserGroupRole that = (JudpUserGroupRole) o;
        return Objects.equals(userGroupRoleId, that.userGroupRoleId) &&
                Objects.equals(roleId, that.roleId) &&
                Objects.equals(userGroupId, that.userGroupId) &&
                Objects.equals(userGroupType, that.userGroupType) &&
                Objects.equals(orgId, that.orgId) &&
                Objects.equals(createPerson, that.createPerson) &&
                Objects.equals(createTime, that.createTime) &&
                Objects.equals(modifyPerson, that.modifyPerson) &&
                Objects.equals(modifyTime, that.modifyTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userGroupRoleId, roleId, userGroupId, userGroupType, orgId, createPerson, createTime, modifyPerson, modifyTime);
    }
}
