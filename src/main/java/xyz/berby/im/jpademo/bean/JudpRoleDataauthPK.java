package xyz.berby.im.jpademo.bean;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class JudpRoleDataauthPK implements Serializable {
    private String roleId;
    private String compId;
    private String serviceName;
    private String queryName;

    @Column(name = "ROLE_ID", nullable = false, length = 32)
    @Id
    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    @Column(name = "COMP_ID", nullable = false, length = 100)
    @Id
    public String getCompId() {
        return compId;
    }

    public void setCompId(String compId) {
        this.compId = compId;
    }

    @Column(name = "SERVICE_NAME", nullable = false, length = 100)
    @Id
    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    @Column(name = "QUERY_NAME", nullable = false, length = 100)
    @Id
    public String getQueryName() {
        return queryName;
    }

    public void setQueryName(String queryName) {
        this.queryName = queryName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JudpRoleDataauthPK that = (JudpRoleDataauthPK) o;
        return Objects.equals(roleId, that.roleId) &&
                Objects.equals(compId, that.compId) &&
                Objects.equals(serviceName, that.serviceName) &&
                Objects.equals(queryName, that.queryName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(roleId, compId, serviceName, queryName);
    }
}
