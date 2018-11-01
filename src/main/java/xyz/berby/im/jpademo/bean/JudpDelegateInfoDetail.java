package xyz.berby.im.jpademo.bean;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "JUDP_DELEGATE_INFO_DETAIL", schema = "TICKET", catalog = "")
@IdClass(JudpDelegateInfoDetailPK.class)
public class JudpDelegateInfoDetail {
    private String delegateInfoId;
    private String wfTypeId;

    @Id
    @Column(name = "DELEGATE_INFO_ID", nullable = false, length = 32)
    public String getDelegateInfoId() {
        return delegateInfoId;
    }

    public void setDelegateInfoId(String delegateInfoId) {
        this.delegateInfoId = delegateInfoId;
    }

    @Id
    @Column(name = "WF_TYPE_ID", nullable = false, length = 32)
    public String getWfTypeId() {
        return wfTypeId;
    }

    public void setWfTypeId(String wfTypeId) {
        this.wfTypeId = wfTypeId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JudpDelegateInfoDetail that = (JudpDelegateInfoDetail) o;
        return Objects.equals(delegateInfoId, that.delegateInfoId) &&
                Objects.equals(wfTypeId, that.wfTypeId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(delegateInfoId, wfTypeId);
    }
}
