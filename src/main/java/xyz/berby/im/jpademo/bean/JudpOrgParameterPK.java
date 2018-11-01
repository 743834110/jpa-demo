package xyz.berby.im.jpademo.bean;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class JudpOrgParameterPK implements Serializable {
    private String compId;
    private String orgId;
    private String subOrgId;
    private String paramCode;

    @Column(name = "COMP_ID", nullable = false, length = 32)
    @Id
    public String getCompId() {
        return compId;
    }

    public void setCompId(String compId) {
        this.compId = compId;
    }

    @Column(name = "ORG_ID", nullable = false, length = 32)
    @Id
    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    @Column(name = "SUB_ORG_ID", nullable = false, length = 32)
    @Id
    public String getSubOrgId() {
        return subOrgId;
    }

    public void setSubOrgId(String subOrgId) {
        this.subOrgId = subOrgId;
    }

    @Column(name = "PARAM_CODE", nullable = false, length = 32)
    @Id
    public String getParamCode() {
        return paramCode;
    }

    public void setParamCode(String paramCode) {
        this.paramCode = paramCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JudpOrgParameterPK that = (JudpOrgParameterPK) o;
        return Objects.equals(compId, that.compId) &&
                Objects.equals(orgId, that.orgId) &&
                Objects.equals(subOrgId, that.subOrgId) &&
                Objects.equals(paramCode, that.paramCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(compId, orgId, subOrgId, paramCode);
    }
}
