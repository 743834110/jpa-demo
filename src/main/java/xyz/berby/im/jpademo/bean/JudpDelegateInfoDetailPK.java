package xyz.berby.im.jpademo.bean;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class JudpDelegateInfoDetailPK implements Serializable {
    private String delegateInfoId;
    private String wfTypeId;

    @Column(name = "DELEGATE_INFO_ID", nullable = false, length = 32)
    @Id
    public String getDelegateInfoId() {
        return delegateInfoId;
    }

    public void setDelegateInfoId(String delegateInfoId) {
        this.delegateInfoId = delegateInfoId;
    }

    @Column(name = "WF_TYPE_ID", nullable = false, length = 32)
    @Id
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
        JudpDelegateInfoDetailPK that = (JudpDelegateInfoDetailPK) o;
        return Objects.equals(delegateInfoId, that.delegateInfoId) &&
                Objects.equals(wfTypeId, that.wfTypeId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(delegateInfoId, wfTypeId);
    }
}
