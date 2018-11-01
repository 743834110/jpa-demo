package xyz.berby.im.jpademo.bean;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "JUDP_DATA_AUTH_CONFIG", schema = "TICKET", catalog = "")
@IdClass(JudpDataAuthConfigPK.class)
public class JudpDataAuthConfig {
    private String compId;
    private String serviceName;
    private String queryName;
    private String dataAuthDesc;
    private String configDept;
    private String roleFilter;

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
    @Column(name = "DATA_AUTH_DESC", nullable = true, length = 100)
    public String getDataAuthDesc() {
        return dataAuthDesc;
    }

    public void setDataAuthDesc(String dataAuthDesc) {
        this.dataAuthDesc = dataAuthDesc;
    }

    @Basic
    @Column(name = "CONFIG_DEPT", nullable = true, length = 3)
    public String getConfigDept() {
        return configDept;
    }

    public void setConfigDept(String configDept) {
        this.configDept = configDept;
    }

    @Basic
    @Column(name = "ROLE_FILTER", nullable = true, length = 3)
    public String getRoleFilter() {
        return roleFilter;
    }

    public void setRoleFilter(String roleFilter) {
        this.roleFilter = roleFilter;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JudpDataAuthConfig that = (JudpDataAuthConfig) o;
        return Objects.equals(compId, that.compId) &&
                Objects.equals(serviceName, that.serviceName) &&
                Objects.equals(queryName, that.queryName) &&
                Objects.equals(dataAuthDesc, that.dataAuthDesc) &&
                Objects.equals(configDept, that.configDept) &&
                Objects.equals(roleFilter, that.roleFilter);
    }

    @Override
    public int hashCode() {
        return Objects.hash(compId, serviceName, queryName, dataAuthDesc, configDept, roleFilter);
    }
}
