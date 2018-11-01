package xyz.berby.im.jpademo.bean;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "JUDP_FORM_ELEMENT", schema = "TICKET", catalog = "")
@IdClass(JudpFormElementPK.class)
public class JudpFormElement {
    private String formId;
    private String elementName;
    private String elementTitle;

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

    @Basic
    @Column(name = "ELEMENT_TITLE", nullable = true, length = 200)
    public String getElementTitle() {
        return elementTitle;
    }

    public void setElementTitle(String elementTitle) {
        this.elementTitle = elementTitle;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JudpFormElement that = (JudpFormElement) o;
        return Objects.equals(formId, that.formId) &&
                Objects.equals(elementName, that.elementName) &&
                Objects.equals(elementTitle, that.elementTitle);
    }

    @Override
    public int hashCode() {
        return Objects.hash(formId, elementName, elementTitle);
    }
}
