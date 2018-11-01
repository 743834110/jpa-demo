package xyz.berby.im.jpademo.bean;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "JUDP_BUSICOMP_INFO", schema = "TICKET", catalog = "")
public class JudpBusicompInfo {
    private String compId;
    private String compName;
    private String versionId;
    private String dbVersionId;
    private String demo;
    private String metaInfo;

    @Id
    @Column(name = "COMP_ID", nullable = false, length = 32)
    public String getCompId() {
        return compId;
    }

    public void setCompId(String compId) {
        this.compId = compId;
    }

    @Basic
    @Column(name = "COMP_NAME", nullable = false, length = 100)
    public String getCompName() {
        return compName;
    }

    public void setCompName(String compName) {
        this.compName = compName;
    }

    @Basic
    @Column(name = "VERSION_ID", nullable = true, length = 32)
    public String getVersionId() {
        return versionId;
    }

    public void setVersionId(String versionId) {
        this.versionId = versionId;
    }

    @Basic
    @Column(name = "DB_VERSION_ID", nullable = true, length = 32)
    public String getDbVersionId() {
        return dbVersionId;
    }

    public void setDbVersionId(String dbVersionId) {
        this.dbVersionId = dbVersionId;
    }

    @Basic
    @Column(name = "DEMO", nullable = true, length = 3)
    public String getDemo() {
        return demo;
    }

    public void setDemo(String demo) {
        this.demo = demo;
    }

    @Basic
    @Column(name = "META_INFO", nullable = true, length = 4000)
    public String getMetaInfo() {
        return metaInfo;
    }

    public void setMetaInfo(String metaInfo) {
        this.metaInfo = metaInfo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JudpBusicompInfo that = (JudpBusicompInfo) o;
        return Objects.equals(compId, that.compId) &&
                Objects.equals(compName, that.compName) &&
                Objects.equals(versionId, that.versionId) &&
                Objects.equals(dbVersionId, that.dbVersionId) &&
                Objects.equals(demo, that.demo) &&
                Objects.equals(metaInfo, that.metaInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(compId, compName, versionId, dbVersionId, demo, metaInfo);
    }
}
