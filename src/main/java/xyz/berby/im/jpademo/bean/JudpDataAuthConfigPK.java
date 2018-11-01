package xyz.berby.im.jpademo.bean;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class JudpDataAuthConfigPK implements Serializable {
    private String compId;
    private String serviceName;
    private String queryName;

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
        JudpDataAuthConfigPK that = (JudpDataAuthConfigPK) o;
        return Objects.equals(compId, that.compId) &&
                Objects.equals(serviceName, that.serviceName) &&
                Objects.equals(queryName, that.queryName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(compId, serviceName, queryName);
    }
}
