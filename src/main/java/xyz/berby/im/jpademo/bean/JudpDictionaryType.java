package xyz.berby.im.jpademo.bean;

import javax.persistence.*;
import java.sql.Time;
import java.util.Objects;

@Entity
@Table(name = "JUDP_DICTIONARY_TYPE", schema = "TICKET", catalog = "")
public class JudpDictionaryType {
    private String codeItemId;
    private String codeItemName;
    private String updatable;
    private String createPerson;
    private String parentId;
    private Time createTime;
    private String modifyPerson;
    private Time modifyTime;
    private String itemScope;

    @Id
    @Column(name = "CODE_ITEM_ID", nullable = false, length = 50)
    public String getCodeItemId() {
        return codeItemId;
    }

    public void setCodeItemId(String codeItemId) {
        this.codeItemId = codeItemId;
    }

    @Basic
    @Column(name = "CODE_ITEM_NAME", nullable = false, length = 100)
    public String getCodeItemName() {
        return codeItemName;
    }

    public void setCodeItemName(String codeItemName) {
        this.codeItemName = codeItemName;
    }

    @Basic
    @Column(name = "UPDATABLE", nullable = true, length = 3)
    public String getUpdatable() {
        return updatable;
    }

    public void setUpdatable(String updatable) {
        this.updatable = updatable;
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
    @Column(name = "PARENT_ID", nullable = true, length = 50)
    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
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
    @Column(name = "ITEM_SCOPE", nullable = true, length = 50)
    public String getItemScope() {
        return itemScope;
    }

    public void setItemScope(String itemScope) {
        this.itemScope = itemScope;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JudpDictionaryType that = (JudpDictionaryType) o;
        return Objects.equals(codeItemId, that.codeItemId) &&
                Objects.equals(codeItemName, that.codeItemName) &&
                Objects.equals(updatable, that.updatable) &&
                Objects.equals(createPerson, that.createPerson) &&
                Objects.equals(parentId, that.parentId) &&
                Objects.equals(createTime, that.createTime) &&
                Objects.equals(modifyPerson, that.modifyPerson) &&
                Objects.equals(modifyTime, that.modifyTime) &&
                Objects.equals(itemScope, that.itemScope);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codeItemId, codeItemName, updatable, createPerson, parentId, createTime, modifyPerson, modifyTime, itemScope);
    }
}
