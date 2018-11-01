package xyz.berby.im.jpademo.bean;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "JUDP_ORG_PARAMETER", schema = "TICKET", catalog = "")
@IdClass(JudpOrgParameterPK.class)
public class JudpOrgParameter {
    private String compId;
    private String orgId;
    private String subOrgId;
    private String paramCode;
    private String paramValue;
    private String paramDesc;

    @Id
    @Column(name = "COMP_ID", nullable = false, length = 32)
    public String getCompId() {
        return compId;
    }

    public void setCompId(String compId) {
        this.compId = compId;
    }

    @Id
    @Column(name = "ORG_ID", nullable = false, length = 32)
    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    @Id
    @Column(name = "SUB_ORG_ID", nullable = false, length = 32)
    public String getSubOrgId() {
        return subOrgId;
    }

    public void setSubOrgId(String subOrgId) {
        this.subOrgId = subOrgId;
    }

    @Id
    @Column(name = "PARAM_CODE", nullable = false, length = 32)
    public String getParamCode() {
        return paramCode;
    }

    public void setParamCode(String paramCode) {
        this.paramCode = paramCode;
    }

    @Basic
    @Column(name = "PARAM_VALUE", nullable = true, length = 100)
    public String getParamValue() {
        return paramValue;
    }

    public void setParamValue(String paramValue) {
        this.paramValue = paramValue;
    }

    @Basic
    @Column(name = "PARAM_DESC", nullable = true, length = 200)
    public String getParamDesc() {
        return paramDesc;
    }

    public void setParamDesc(String paramDesc) {
        this.paramDesc = paramDesc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JudpOrgParameter that = (JudpOrgParameter) o;
        return Objects.equals(compId, that.compId) &&
                Objects.equals(orgId, that.orgId) &&
                Objects.equals(subOrgId, that.subOrgId) &&
                Objects.equals(paramCode, that.paramCode) &&
                Objects.equals(paramValue, that.paramValue) &&
                Objects.equals(paramDesc, that.paramDesc);
    }

    @Override
    public int hashCode() {
        return Objects.hash(compId, orgId, subOrgId, paramCode, paramValue, paramDesc);
    }
}
