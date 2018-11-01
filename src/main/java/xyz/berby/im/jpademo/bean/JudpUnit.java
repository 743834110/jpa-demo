package xyz.berby.im.jpademo.bean;

import javax.persistence.*;
import java.sql.Time;
import java.util.Objects;

@Entity
@Table(name = "JUDP_UNIT", schema = "TICKET", catalog = "")
public class JudpUnit {
    private String unitId;
    private String unitCode;
    private String unitName;
    private String unitDescription;
    private String parentUnitId;
    private String unitType;
    private short orderNum;
    private String valid;
    private Time enabledDate;
    private String orgId;
    private String subOrgId;
    private String createPerson;
    private Time createTime;
    private String modifyPerson;
    private Time modifyTime;
    private String privLevel;
    private String adminAccount;
    private String treePath;

    @Id
    @Column(name = "UNIT_ID", nullable = false, length = 32)
    public String getUnitId() {
        return unitId;
    }

    public void setUnitId(String unitId) {
        this.unitId = unitId;
    }

    @Basic
    @Column(name = "UNIT_CODE", nullable = true, length = 100)
    public String getUnitCode() {
        return unitCode;
    }

    public void setUnitCode(String unitCode) {
        this.unitCode = unitCode;
    }

    @Basic
    @Column(name = "UNIT_NAME", nullable = false, length = 100)
    public String getUnitName() {
        return unitName;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }

    @Basic
    @Column(name = "UNIT_DESCRIPTION", nullable = true, length = 255)
    public String getUnitDescription() {
        return unitDescription;
    }

    public void setUnitDescription(String unitDescription) {
        this.unitDescription = unitDescription;
    }

    @Basic
    @Column(name = "PARENT_UNIT_ID", nullable = true, length = 32)
    public String getParentUnitId() {
        return parentUnitId;
    }

    public void setParentUnitId(String parentUnitId) {
        this.parentUnitId = parentUnitId;
    }

    @Basic
    @Column(name = "UNIT_TYPE", nullable = true, length = 3)
    public String getUnitType() {
        return unitType;
    }

    public void setUnitType(String unitType) {
        this.unitType = unitType;
    }

    @Basic
    @Column(name = "ORDER_NUM", nullable = false, precision = 0)
    public short getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(short orderNum) {
        this.orderNum = orderNum;
    }

    @Basic
    @Column(name = "VALID", nullable = true, length = 3)
    public String getValid() {
        return valid;
    }

    public void setValid(String valid) {
        this.valid = valid;
    }

    @Basic
    @Column(name = "ENABLED_DATE", nullable = true)
    public Time getEnabledDate() {
        return enabledDate;
    }

    public void setEnabledDate(Time enabledDate) {
        this.enabledDate = enabledDate;
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
    @Column(name = "PRIV_LEVEL", nullable = true, length = 32)
    public String getPrivLevel() {
        return privLevel;
    }

    public void setPrivLevel(String privLevel) {
        this.privLevel = privLevel;
    }

    @Basic
    @Column(name = "ADMIN_ACCOUNT", nullable = true, length = 32)
    public String getAdminAccount() {
        return adminAccount;
    }

    public void setAdminAccount(String adminAccount) {
        this.adminAccount = adminAccount;
    }

    @Basic
    @Column(name = "TREE_PATH", nullable = true, length = 100)
    public String getTreePath() {
        return treePath;
    }

    public void setTreePath(String treePath) {
        this.treePath = treePath;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JudpUnit judpUnit = (JudpUnit) o;
        return orderNum == judpUnit.orderNum &&
                Objects.equals(unitId, judpUnit.unitId) &&
                Objects.equals(unitCode, judpUnit.unitCode) &&
                Objects.equals(unitName, judpUnit.unitName) &&
                Objects.equals(unitDescription, judpUnit.unitDescription) &&
                Objects.equals(parentUnitId, judpUnit.parentUnitId) &&
                Objects.equals(unitType, judpUnit.unitType) &&
                Objects.equals(valid, judpUnit.valid) &&
                Objects.equals(enabledDate, judpUnit.enabledDate) &&
                Objects.equals(orgId, judpUnit.orgId) &&
                Objects.equals(subOrgId, judpUnit.subOrgId) &&
                Objects.equals(createPerson, judpUnit.createPerson) &&
                Objects.equals(createTime, judpUnit.createTime) &&
                Objects.equals(modifyPerson, judpUnit.modifyPerson) &&
                Objects.equals(modifyTime, judpUnit.modifyTime) &&
                Objects.equals(privLevel, judpUnit.privLevel) &&
                Objects.equals(adminAccount, judpUnit.adminAccount) &&
                Objects.equals(treePath, judpUnit.treePath);
    }

    @Override
    public int hashCode() {
        return Objects.hash(unitId, unitCode, unitName, unitDescription, parentUnitId, unitType, orderNum, valid, enabledDate, orgId, subOrgId, createPerson, createTime, modifyPerson, modifyTime, privLevel, adminAccount, treePath);
    }
}
