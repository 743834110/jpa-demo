package xyz.berby.im.jpademo.bean;

import javax.persistence.*;
import java.sql.Time;
import java.util.Objects;

@Entity
@Table(name = "JUDP_ORG_PARAMTYPE", schema = "TICKET", catalog = "")
public class JudpOrgParamtype {
    private String paramtypeId;
    private String compId;
    private String paramCode;
    private String description;
    private String createPerson;
    private Time createTime;
    private String modifyPerson;
    private Time modifyTime;

    @Id
    @Column(name = "PARAMTYPE_ID", nullable = false, length = 32)
    public String getParamtypeId() {
        return paramtypeId;
    }

    public void setParamtypeId(String paramtypeId) {
        this.paramtypeId = paramtypeId;
    }

    @Basic
    @Column(name = "COMP_ID", nullable = true, length = 32)
    public String getCompId() {
        return compId;
    }

    public void setCompId(String compId) {
        this.compId = compId;
    }

    @Basic
    @Column(name = "PARAM_CODE", nullable = true, length = 32)
    public String getParamCode() {
        return paramCode;
    }

    public void setParamCode(String paramCode) {
        this.paramCode = paramCode;
    }

    @Basic
    @Column(name = "DESCRIPTION", nullable = true, length = 200)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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
    @Column(name = "MODIFY_PERSON", nullable = true, length = 255)
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JudpOrgParamtype that = (JudpOrgParamtype) o;
        return Objects.equals(paramtypeId, that.paramtypeId) &&
                Objects.equals(compId, that.compId) &&
                Objects.equals(paramCode, that.paramCode) &&
                Objects.equals(description, that.description) &&
                Objects.equals(createPerson, that.createPerson) &&
                Objects.equals(createTime, that.createTime) &&
                Objects.equals(modifyPerson, that.modifyPerson) &&
                Objects.equals(modifyTime, that.modifyTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(paramtypeId, compId, paramCode, description, createPerson, createTime, modifyPerson, modifyTime);
    }
}
