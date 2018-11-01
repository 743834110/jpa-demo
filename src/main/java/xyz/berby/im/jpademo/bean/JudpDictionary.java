package xyz.berby.im.jpademo.bean;

import javax.persistence.*;
import java.sql.Time;
import java.util.Objects;

@Entity
@Table(name = "JUDP_DICTIONARY", schema = "TICKET", catalog = "")
public class JudpDictionary {
    private String dictionaryId;
    private String codeItemId;
    private String codeId;
    private String codeName;
    private Short orderNum;
    private String orgId;
    private String createPerson;
    private Time createTime;
    private String modifyPerson;
    private Time modifyTime;
    private String codeEname;
    private String parentCodeId;
    private String updatable;

    @Id
    @Column(name = "DICTIONARY_ID", nullable = false, length = 32)
    public String getDictionaryId() {
        return dictionaryId;
    }

    public void setDictionaryId(String dictionaryId) {
        this.dictionaryId = dictionaryId;
    }

    @Basic
    @Column(name = "CODE_ITEM_ID", nullable = false, length = 50)
    public String getCodeItemId() {
        return codeItemId;
    }

    public void setCodeItemId(String codeItemId) {
        this.codeItemId = codeItemId;
    }

    @Basic
    @Column(name = "CODE_ID", nullable = false, length = 50)
    public String getCodeId() {
        return codeId;
    }

    public void setCodeId(String codeId) {
        this.codeId = codeId;
    }

    @Basic
    @Column(name = "CODE_NAME", nullable = false, length = 100)
    public String getCodeName() {
        return codeName;
    }

    public void setCodeName(String codeName) {
        this.codeName = codeName;
    }

    @Basic
    @Column(name = "ORDER_NUM", nullable = true, precision = 0)
    public Short getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(Short orderNum) {
        this.orderNum = orderNum;
    }

    @Basic
    @Column(name = "ORG_ID", nullable = true, length = 32)
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

    @Basic
    @Column(name = "CODE_ENAME", nullable = true, length = 100)
    public String getCodeEname() {
        return codeEname;
    }

    public void setCodeEname(String codeEname) {
        this.codeEname = codeEname;
    }

    @Basic
    @Column(name = "PARENT_CODE_ID", nullable = true, length = 50)
    public String getParentCodeId() {
        return parentCodeId;
    }

    public void setParentCodeId(String parentCodeId) {
        this.parentCodeId = parentCodeId;
    }

    @Basic
    @Column(name = "UPDATABLE", nullable = true, length = 3)
    public String getUpdatable() {
        return updatable;
    }

    public void setUpdatable(String updatable) {
        this.updatable = updatable;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JudpDictionary that = (JudpDictionary) o;
        return Objects.equals(dictionaryId, that.dictionaryId) &&
                Objects.equals(codeItemId, that.codeItemId) &&
                Objects.equals(codeId, that.codeId) &&
                Objects.equals(codeName, that.codeName) &&
                Objects.equals(orderNum, that.orderNum) &&
                Objects.equals(orgId, that.orgId) &&
                Objects.equals(createPerson, that.createPerson) &&
                Objects.equals(createTime, that.createTime) &&
                Objects.equals(modifyPerson, that.modifyPerson) &&
                Objects.equals(modifyTime, that.modifyTime) &&
                Objects.equals(codeEname, that.codeEname) &&
                Objects.equals(parentCodeId, that.parentCodeId) &&
                Objects.equals(updatable, that.updatable);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dictionaryId, codeItemId, codeId, codeName, orderNum, orgId, createPerson, createTime, modifyPerson, modifyTime, codeEname, parentCodeId, updatable);
    }
}
