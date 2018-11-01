package xyz.berby.im.jpademo.bean;

import javax.persistence.*;
import java.sql.Time;
import java.util.Objects;

@Entity
@Table(name = "SJ_WT_RA_RECORD", schema = "TICKET", catalog = "")
public class SjWtRaRecord {
    private String raRecordId;
    private String raCode;
    private String wonum;
    private String description;
    private String worksite;
    private String projectname;
    private String department;
    private String pm;
    private String phone;
    private Time pmDate;
    private String proUnit;
    private String proPm;
    private String proPhone;
    private Time proDate;
    private Long gczl;
    private Long jxsr;
    private Long yryb;
    private Long rgby;
    private Long cljs;
    private Long zxkj;
    private Long gwgy;
    private Long cjqw;
    private Long qz;
    private Long hxfs;
    private Long ls;
    private Long cd;
    private Long zs;
    private Long wxp;
    private Long sbsh;
    private Long qt;
    private Long zaos;
    private Long fc;
    private Long qdcc;
    private Long qg;
    private Long zd;
    private Long ydyh;
    private Long sxfs;
    private Long qt1;
    private Long yc;
    private Long zs1;
    private Long wxfqw;
    private Long dbwr;
    private Long dqwr;
    private Long swr;
    private Long zyxh;
    private Long qt2;
    private String other;
    private String step;
    private String implementation;
    private String dcPm;
    private Time dcDate;
    private String orgId;
    private String subOrgId;
    private String deptId;
    private String createPerson;
    private Time createTime;
    private String modifyPerson;
    private Time modifyTime;
    private String projectid;

    @Id
    @Column(name = "RA_RECORD_ID", nullable = false, length = 32)
    public String getRaRecordId() {
        return raRecordId;
    }

    public void setRaRecordId(String raRecordId) {
        this.raRecordId = raRecordId;
    }

    @Basic
    @Column(name = "RA_CODE", nullable = true, length = 32)
    public String getRaCode() {
        return raCode;
    }

    public void setRaCode(String raCode) {
        this.raCode = raCode;
    }

    @Basic
    @Column(name = "WONUM", nullable = true, length = 30)
    public String getWonum() {
        return wonum;
    }

    public void setWonum(String wonum) {
        this.wonum = wonum;
    }

    @Basic
    @Column(name = "DESCRIPTION", nullable = true, length = 250)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "WORKSITE", nullable = true, length = 100)
    public String getWorksite() {
        return worksite;
    }

    public void setWorksite(String worksite) {
        this.worksite = worksite;
    }

    @Basic
    @Column(name = "PROJECTNAME", nullable = true, length = 250)
    public String getProjectname() {
        return projectname;
    }

    public void setProjectname(String projectname) {
        this.projectname = projectname;
    }

    @Basic
    @Column(name = "DEPARTMENT", nullable = true, length = 32)
    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Basic
    @Column(name = "PM", nullable = true, length = 32)
    public String getPm() {
        return pm;
    }

    public void setPm(String pm) {
        this.pm = pm;
    }

    @Basic
    @Column(name = "PHONE", nullable = true, length = 32)
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Basic
    @Column(name = "PM_DATE", nullable = true)
    public Time getPmDate() {
        return pmDate;
    }

    public void setPmDate(Time pmDate) {
        this.pmDate = pmDate;
    }

    @Basic
    @Column(name = "PRO_UNIT", nullable = true, length = 32)
    public String getProUnit() {
        return proUnit;
    }

    public void setProUnit(String proUnit) {
        this.proUnit = proUnit;
    }

    @Basic
    @Column(name = "PRO_PM", nullable = true, length = 32)
    public String getProPm() {
        return proPm;
    }

    public void setProPm(String proPm) {
        this.proPm = proPm;
    }

    @Basic
    @Column(name = "PRO_PHONE", nullable = true, length = 32)
    public String getProPhone() {
        return proPhone;
    }

    public void setProPhone(String proPhone) {
        this.proPhone = proPhone;
    }

    @Basic
    @Column(name = "PRO_DATE", nullable = true)
    public Time getProDate() {
        return proDate;
    }

    public void setProDate(Time proDate) {
        this.proDate = proDate;
    }

    @Basic
    @Column(name = "GCZL", nullable = true, precision = 0)
    public Long getGczl() {
        return gczl;
    }

    public void setGczl(Long gczl) {
        this.gczl = gczl;
    }

    @Basic
    @Column(name = "JXSR", nullable = true, precision = 0)
    public Long getJxsr() {
        return jxsr;
    }

    public void setJxsr(Long jxsr) {
        this.jxsr = jxsr;
    }

    @Basic
    @Column(name = "YRYB", nullable = true, precision = 0)
    public Long getYryb() {
        return yryb;
    }

    public void setYryb(Long yryb) {
        this.yryb = yryb;
    }

    @Basic
    @Column(name = "RGBY", nullable = true, precision = 0)
    public Long getRgby() {
        return rgby;
    }

    public void setRgby(Long rgby) {
        this.rgby = rgby;
    }

    @Basic
    @Column(name = "CLJS", nullable = true, precision = 0)
    public Long getCljs() {
        return cljs;
    }

    public void setCljs(Long cljs) {
        this.cljs = cljs;
    }

    @Basic
    @Column(name = "ZXKJ", nullable = true, precision = 0)
    public Long getZxkj() {
        return zxkj;
    }

    public void setZxkj(Long zxkj) {
        this.zxkj = zxkj;
    }

    @Basic
    @Column(name = "GWGY", nullable = true, precision = 0)
    public Long getGwgy() {
        return gwgy;
    }

    public void setGwgy(Long gwgy) {
        this.gwgy = gwgy;
    }

    @Basic
    @Column(name = "CJQW", nullable = true, precision = 0)
    public Long getCjqw() {
        return cjqw;
    }

    public void setCjqw(Long cjqw) {
        this.cjqw = cjqw;
    }

    @Basic
    @Column(name = "QZ", nullable = true, precision = 0)
    public Long getQz() {
        return qz;
    }

    public void setQz(Long qz) {
        this.qz = qz;
    }

    @Basic
    @Column(name = "HXFS", nullable = true, precision = 0)
    public Long getHxfs() {
        return hxfs;
    }

    public void setHxfs(Long hxfs) {
        this.hxfs = hxfs;
    }

    @Basic
    @Column(name = "LS", nullable = true, precision = 0)
    public Long getLs() {
        return ls;
    }

    public void setLs(Long ls) {
        this.ls = ls;
    }

    @Basic
    @Column(name = "CD", nullable = true, precision = 0)
    public Long getCd() {
        return cd;
    }

    public void setCd(Long cd) {
        this.cd = cd;
    }

    @Basic
    @Column(name = "ZS", nullable = true, precision = 0)
    public Long getZs() {
        return zs;
    }

    public void setZs(Long zs) {
        this.zs = zs;
    }

    @Basic
    @Column(name = "WXP", nullable = true, precision = 0)
    public Long getWxp() {
        return wxp;
    }

    public void setWxp(Long wxp) {
        this.wxp = wxp;
    }

    @Basic
    @Column(name = "SBSH", nullable = true, precision = 0)
    public Long getSbsh() {
        return sbsh;
    }

    public void setSbsh(Long sbsh) {
        this.sbsh = sbsh;
    }

    @Basic
    @Column(name = "QT", nullable = true, precision = 0)
    public Long getQt() {
        return qt;
    }

    public void setQt(Long qt) {
        this.qt = qt;
    }

    @Basic
    @Column(name = "ZAOS", nullable = true, precision = 0)
    public Long getZaos() {
        return zaos;
    }

    public void setZaos(Long zaos) {
        this.zaos = zaos;
    }

    @Basic
    @Column(name = "FC", nullable = true, precision = 0)
    public Long getFc() {
        return fc;
    }

    public void setFc(Long fc) {
        this.fc = fc;
    }

    @Basic
    @Column(name = "QDCC", nullable = true, precision = 0)
    public Long getQdcc() {
        return qdcc;
    }

    public void setQdcc(Long qdcc) {
        this.qdcc = qdcc;
    }

    @Basic
    @Column(name = "QG", nullable = true, precision = 0)
    public Long getQg() {
        return qg;
    }

    public void setQg(Long qg) {
        this.qg = qg;
    }

    @Basic
    @Column(name = "ZD", nullable = true, precision = 0)
    public Long getZd() {
        return zd;
    }

    public void setZd(Long zd) {
        this.zd = zd;
    }

    @Basic
    @Column(name = "YDYH", nullable = true, precision = 0)
    public Long getYdyh() {
        return ydyh;
    }

    public void setYdyh(Long ydyh) {
        this.ydyh = ydyh;
    }

    @Basic
    @Column(name = "SXFS", nullable = true, precision = 0)
    public Long getSxfs() {
        return sxfs;
    }

    public void setSxfs(Long sxfs) {
        this.sxfs = sxfs;
    }

    @Basic
    @Column(name = "QT1", nullable = true, precision = 0)
    public Long getQt1() {
        return qt1;
    }

    public void setQt1(Long qt1) {
        this.qt1 = qt1;
    }

    @Basic
    @Column(name = "YC", nullable = true, precision = 0)
    public Long getYc() {
        return yc;
    }

    public void setYc(Long yc) {
        this.yc = yc;
    }

    @Basic
    @Column(name = "ZS1", nullable = true, precision = 0)
    public Long getZs1() {
        return zs1;
    }

    public void setZs1(Long zs1) {
        this.zs1 = zs1;
    }

    @Basic
    @Column(name = "WXFQW", nullable = true, precision = 0)
    public Long getWxfqw() {
        return wxfqw;
    }

    public void setWxfqw(Long wxfqw) {
        this.wxfqw = wxfqw;
    }

    @Basic
    @Column(name = "DBWR", nullable = true, precision = 0)
    public Long getDbwr() {
        return dbwr;
    }

    public void setDbwr(Long dbwr) {
        this.dbwr = dbwr;
    }

    @Basic
    @Column(name = "DQWR", nullable = true, precision = 0)
    public Long getDqwr() {
        return dqwr;
    }

    public void setDqwr(Long dqwr) {
        this.dqwr = dqwr;
    }

    @Basic
    @Column(name = "SWR", nullable = true, precision = 0)
    public Long getSwr() {
        return swr;
    }

    public void setSwr(Long swr) {
        this.swr = swr;
    }

    @Basic
    @Column(name = "ZYXH", nullable = true, precision = 0)
    public Long getZyxh() {
        return zyxh;
    }

    public void setZyxh(Long zyxh) {
        this.zyxh = zyxh;
    }

    @Basic
    @Column(name = "QT2", nullable = true, precision = 0)
    public Long getQt2() {
        return qt2;
    }

    public void setQt2(Long qt2) {
        this.qt2 = qt2;
    }

    @Basic
    @Column(name = "OTHER", nullable = true, length = 500)
    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other;
    }

    @Basic
    @Column(name = "STEP", nullable = true, length = 500)
    public String getStep() {
        return step;
    }

    public void setStep(String step) {
        this.step = step;
    }

    @Basic
    @Column(name = "IMPLEMENTATION", nullable = true, length = 500)
    public String getImplementation() {
        return implementation;
    }

    public void setImplementation(String implementation) {
        this.implementation = implementation;
    }

    @Basic
    @Column(name = "DC_PM", nullable = true, length = 32)
    public String getDcPm() {
        return dcPm;
    }

    public void setDcPm(String dcPm) {
        this.dcPm = dcPm;
    }

    @Basic
    @Column(name = "DC_DATE", nullable = true)
    public Time getDcDate() {
        return dcDate;
    }

    public void setDcDate(Time dcDate) {
        this.dcDate = dcDate;
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
    @Column(name = "SUB_ORG_ID", nullable = true, length = 32)
    public String getSubOrgId() {
        return subOrgId;
    }

    public void setSubOrgId(String subOrgId) {
        this.subOrgId = subOrgId;
    }

    @Basic
    @Column(name = "DEPT_ID", nullable = true, length = 32)
    public String getDeptId() {
        return deptId;
    }

    public void setDeptId(String deptId) {
        this.deptId = deptId;
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
    @Column(name = "PROJECTID", nullable = true, length = 32)
    public String getProjectid() {
        return projectid;
    }

    public void setProjectid(String projectid) {
        this.projectid = projectid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SjWtRaRecord that = (SjWtRaRecord) o;
        return Objects.equals(raRecordId, that.raRecordId) &&
                Objects.equals(raCode, that.raCode) &&
                Objects.equals(wonum, that.wonum) &&
                Objects.equals(description, that.description) &&
                Objects.equals(worksite, that.worksite) &&
                Objects.equals(projectname, that.projectname) &&
                Objects.equals(department, that.department) &&
                Objects.equals(pm, that.pm) &&
                Objects.equals(phone, that.phone) &&
                Objects.equals(pmDate, that.pmDate) &&
                Objects.equals(proUnit, that.proUnit) &&
                Objects.equals(proPm, that.proPm) &&
                Objects.equals(proPhone, that.proPhone) &&
                Objects.equals(proDate, that.proDate) &&
                Objects.equals(gczl, that.gczl) &&
                Objects.equals(jxsr, that.jxsr) &&
                Objects.equals(yryb, that.yryb) &&
                Objects.equals(rgby, that.rgby) &&
                Objects.equals(cljs, that.cljs) &&
                Objects.equals(zxkj, that.zxkj) &&
                Objects.equals(gwgy, that.gwgy) &&
                Objects.equals(cjqw, that.cjqw) &&
                Objects.equals(qz, that.qz) &&
                Objects.equals(hxfs, that.hxfs) &&
                Objects.equals(ls, that.ls) &&
                Objects.equals(cd, that.cd) &&
                Objects.equals(zs, that.zs) &&
                Objects.equals(wxp, that.wxp) &&
                Objects.equals(sbsh, that.sbsh) &&
                Objects.equals(qt, that.qt) &&
                Objects.equals(zaos, that.zaos) &&
                Objects.equals(fc, that.fc) &&
                Objects.equals(qdcc, that.qdcc) &&
                Objects.equals(qg, that.qg) &&
                Objects.equals(zd, that.zd) &&
                Objects.equals(ydyh, that.ydyh) &&
                Objects.equals(sxfs, that.sxfs) &&
                Objects.equals(qt1, that.qt1) &&
                Objects.equals(yc, that.yc) &&
                Objects.equals(zs1, that.zs1) &&
                Objects.equals(wxfqw, that.wxfqw) &&
                Objects.equals(dbwr, that.dbwr) &&
                Objects.equals(dqwr, that.dqwr) &&
                Objects.equals(swr, that.swr) &&
                Objects.equals(zyxh, that.zyxh) &&
                Objects.equals(qt2, that.qt2) &&
                Objects.equals(other, that.other) &&
                Objects.equals(step, that.step) &&
                Objects.equals(implementation, that.implementation) &&
                Objects.equals(dcPm, that.dcPm) &&
                Objects.equals(dcDate, that.dcDate) &&
                Objects.equals(orgId, that.orgId) &&
                Objects.equals(subOrgId, that.subOrgId) &&
                Objects.equals(deptId, that.deptId) &&
                Objects.equals(createPerson, that.createPerson) &&
                Objects.equals(createTime, that.createTime) &&
                Objects.equals(modifyPerson, that.modifyPerson) &&
                Objects.equals(modifyTime, that.modifyTime) &&
                Objects.equals(projectid, that.projectid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(raRecordId, raCode, wonum, description, worksite, projectname, department, pm, phone, pmDate, proUnit, proPm, proPhone, proDate, gczl, jxsr, yryb, rgby, cljs, zxkj, gwgy, cjqw, qz, hxfs, ls, cd, zs, wxp, sbsh, qt, zaos, fc, qdcc, qg, zd, ydyh, sxfs, qt1, yc, zs1, wxfqw, dbwr, dqwr, swr, zyxh, qt2, other, step, implementation, dcPm, dcDate, orgId, subOrgId, deptId, createPerson, createTime, modifyPerson, modifyTime, projectid);
    }
}
