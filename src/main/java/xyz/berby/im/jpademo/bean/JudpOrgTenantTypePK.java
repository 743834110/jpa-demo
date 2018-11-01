package xyz.berby.im.jpademo.bean;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class JudpOrgTenantTypePK implements Serializable {
    private String tenantTypeId;
    private String applyOrgId;

    @Column(name = "TENANT_TYPE_ID", nullable = false, length = 32)
    @Id
    public String getTenantTypeId() {
        return tenantTypeId;
    }

    public void setTenantTypeId(String tenantTypeId) {
        this.tenantTypeId = tenantTypeId;
    }

    @Column(name = "APPLY_ORG_ID", nullable = false, length = 32)
    @Id
    public String getApplyOrgId() {
        return applyOrgId;
    }

    public void setApplyOrgId(String applyOrgId) {
        this.applyOrgId = applyOrgId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JudpOrgTenantTypePK that = (JudpOrgTenantTypePK) o;
        return Objects.equals(tenantTypeId, that.tenantTypeId) &&
                Objects.equals(applyOrgId, that.applyOrgId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tenantTypeId, applyOrgId);
    }
}
