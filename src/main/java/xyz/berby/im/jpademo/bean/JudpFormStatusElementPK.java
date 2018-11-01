package xyz.berby.im.jpademo.bean;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class JudpFormStatusElementPK implements Serializable {
    private String formId;
    private String elementName;
    private String formStatus;

    @Column(name = "FORM_ID", nullable = false, length = 32)
    @Id
    public String getFormId() {
        return formId;
    }

    public void setFormId(String formId) {
        this.formId = formId;
    }

    @Column(name = "ELEMENT_NAME", nullable = false, length = 60)
    @Id
    public String getElementName() {
        return elementName;
    }

    public void setElementName(String elementName) {
        this.elementName = elementName;
    }

    @Column(name = "FORM_STATUS", nullable = false, length = 60)
    @Id
    public String getFormStatus() {
        return formStatus;
    }

    public void setFormStatus(String formStatus) {
        this.formStatus = formStatus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JudpFormStatusElementPK that = (JudpFormStatusElementPK) o;
        return Objects.equals(formId, that.formId) &&
                Objects.equals(elementName, that.elementName) &&
                Objects.equals(formStatus, that.formStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(formId, elementName, formStatus);
    }
}
