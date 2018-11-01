package xyz.berby.im.jpademo.bean;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "JUDP_FORM_STATUS", schema = "TICKET", catalog = "")
@IdClass(JudpFormStatusPK.class)
public class JudpFormStatus {
    private String formId;
    private String formStatus;
    private String formStatusTitle;

    @Id
    @Column(name = "FORM_ID", nullable = false, length = 32)
    public String getFormId() {
        return formId;
    }

    public void setFormId(String formId) {
        this.formId = formId;
    }

    @Id
    @Column(name = "FORM_STATUS", nullable = false, length = 60)
    public String getFormStatus() {
        return formStatus;
    }

    public void setFormStatus(String formStatus) {
        this.formStatus = formStatus;
    }

    @Basic
    @Column(name = "FORM_STATUS_TITLE", nullable = true, length = 100)
    public String getFormStatusTitle() {
        return formStatusTitle;
    }

    public void setFormStatusTitle(String formStatusTitle) {
        this.formStatusTitle = formStatusTitle;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JudpFormStatus that = (JudpFormStatus) o;
        return Objects.equals(formId, that.formId) &&
                Objects.equals(formStatus, that.formStatus) &&
                Objects.equals(formStatusTitle, that.formStatusTitle);
    }

    @Override
    public int hashCode() {
        return Objects.hash(formId, formStatus, formStatusTitle);
    }
}
