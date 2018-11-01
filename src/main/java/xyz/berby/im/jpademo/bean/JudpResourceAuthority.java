package xyz.berby.im.jpademo.bean;

import javax.persistence.*;
import java.sql.Time;
import java.util.Objects;

@Entity
@Table(name = "JUDP_RESOURCE_AUTHORITY", schema = "TICKET", catalog = "")
public class JudpResourceAuthority {
    private String resourceAuthorityId;
    private String authorityDesc;
    private String roleId;
    private String resourceId;
    private String resourceType;
    private String resourceOpt;
    private String orgId;
    private String createPerson;
    private Time createTime;
    private String modifyPerson;
    private Time modifyTime;

    @Id
    @Column(name = "RESOURCE_AUTHORITY_ID", nullable = false, length = 32)
    public String getResourceAuthorityId() {
        return resourceAuthorityId;
    }

    public void setResourceAuthorityId(String resourceAuthorityId) {
        this.resourceAuthorityId = resourceAuthorityId;
    }

    @Basic
    @Column(name = "AUTHORITY_DESC", nullable = true, length = 255)
    public String getAuthorityDesc() {
        return authorityDesc;
    }

    public void setAuthorityDesc(String authorityDesc) {
        this.authorityDesc = authorityDesc;
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
    @Column(name = "RESOURCE_ID", nullable = false, length = 128)
    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    @Basic
    @Column(name = "RESOURCE_TYPE", nullable = false, length = 32)
    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    @Basic
    @Column(name = "RESOURCE_OPT", nullable = false, length = 32)
    public String getResourceOpt() {
        return resourceOpt;
    }

    public void setResourceOpt(String resourceOpt) {
        this.resourceOpt = resourceOpt;
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
        JudpResourceAuthority that = (JudpResourceAuthority) o;
        return Objects.equals(resourceAuthorityId, that.resourceAuthorityId) &&
                Objects.equals(authorityDesc, that.authorityDesc) &&
                Objects.equals(roleId, that.roleId) &&
                Objects.equals(resourceId, that.resourceId) &&
                Objects.equals(resourceType, that.resourceType) &&
                Objects.equals(resourceOpt, that.resourceOpt) &&
                Objects.equals(orgId, that.orgId) &&
                Objects.equals(createPerson, that.createPerson) &&
                Objects.equals(createTime, that.createTime) &&
                Objects.equals(modifyPerson, that.modifyPerson) &&
                Objects.equals(modifyTime, that.modifyTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resourceAuthorityId, authorityDesc, roleId, resourceId, resourceType, resourceOpt, orgId, createPerson, createTime, modifyPerson, modifyTime);
    }
}
