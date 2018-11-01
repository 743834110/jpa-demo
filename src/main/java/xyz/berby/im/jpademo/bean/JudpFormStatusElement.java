package xyz.berby.im.jpademo.bean;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "JUDP_FORM_STATUS_ELEMENT", schema = "TICKET", catalog = "")
@IdClass(JudpFormStatusElementPK.class)
public class JudpFormStatusElement {
    private String formId;
    private String elementName;
    private String formStatus;
    private Long edit;
    private Long required;
    private Long hidden;

    @Id
    @Column(name = "FORM_ID", nullable = false, length = 32)
    public String getFormId() {
        return formId;
    }

    public void setFormId(String formId) {
        this.formId = formId;
    }

    @Id
    @Column(name = "ELEMENT_NAME", nullable = false, length = 60)
    public String getElementName() {
        return elementName;
    }

    public void setElementName(String elementName) {
        this.elementName = elementName;
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
    @Column(name = "EDIT", nullable = true, precision = 0)
    public Long getEdit() {
        return edit;
    }

    public void setEdit(Long edit) {
        this.edit = edit;
    }

    @Basic
    @Column(name = "REQUIRED", nullable = true, precision = 0)
    public Long getRequired() {
        return required;
    }

    public void setRequired(Long required) {
        this.required = required;
    }

    @Basic
    @Column(name = "HIDDEN", nullable = true, precision = 0)
    public Long getHidden() {
        return hidden;
    }

    public void setHidden(Long hidden) {
        this.hidden = hidden;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JudpFormStatusElement that = (JudpFormStatusElement) o;
        return Objects.equals(formId, that.formId) &&
                Objects.equals(elementName, that.elementName) &&
                Objects.equals(formStatus, that.formStatus) &&
                Objects.equals(edit, that.edit) &&
                Objects.equals(required, that.required) &&
                Objects.equals(hidden, that.hidden);
    }

    @Override
    public int hashCode() {
        return Objects.hash(formId, elementName, formStatus, edit, required, hidden);
    }
}
