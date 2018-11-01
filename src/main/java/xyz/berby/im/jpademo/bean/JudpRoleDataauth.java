package xyz.berby.im.jpademo.bean;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "JUDP_ROLE_DATAAUTH", schema = "TICKET", catalog = "")
@IdClass(JudpRoleDataauthPK.class)
public class JudpRoleDataauth {
    private String roleId;
    private String compId;
    private String serviceName;
    private String queryName;
    private String roleFilterType;

    @Id
    @Column(name = "ROLE_ID", nullable = false, length = 32)
    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    @Id
    @Column(name = "COMP_ID", nullable = false, length = 100)
    public String getCompId() {
        return compId;
    }

    public void setCompId(String compId) {
        this.compId = compId;
    }

    @Id
    @Column(name = "SERVICE_NAME", nullable = false, length = 100)
    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    @Id
    @Column(name = "QUERY_NAME", nullable = false, length = 100)
    public String getQueryName() {
        return queryName;
    }

    public void setQueryName(String queryName) {
        this.queryName = queryName;
    }

    @Basic
    @Column(name = "ROLE_FILTER_TYPE", nullable = true, length = 3)
    public String getRoleFilterType() {
        return roleFilterType;
    }

    public void setRoleFilterType(String roleFilterType) {
        this.roleFilterType = roleFilterType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JudpRoleDataauth that = (JudpRoleDataauth) o;
        return Objects.equals(roleId, that.roleId) &&
                Objects.equals(compId, that.compId) &&
                Objects.equals(serviceName, that.serviceName) &&
                Objects.equals(queryName, that.queryName) &&
                Objects.equals(roleFilterType, that.roleFilterType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(roleId, compId, serviceName, queryName, roleFilterType);
    }
}
