package xyz.berby.im.jpademo.bean;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "JUDP_FORM", schema = "TICKET", catalog = "")
public class JudpForm {
    private String formId;
    private String formClassName;
    private String formTitle;
    private String orgId;

    @Id
    @Column(name = "FORM_ID", nullable = false, length = 32)
    public String getFormId() {
        return formId;
    }

    public void setFormId(String formId) {
        this.formId = formId;
    }

    @Basic
    @Column(name = "FORM_CLASS_NAME", nullable = true, length = 200)
    public String getFormClassName() {
        return formClassName;
    }

    public void setFormClassName(String formClassName) {
        this.formClassName = formClassName;
    }

    @Basic
    @Column(name = "FORM_TITLE", nullable = true, length = 200)
    public String getFormTitle() {
        return formTitle;
    }

    public void setFormTitle(String formTitle) {
        this.formTitle = formTitle;
    }

    @Basic
    @Column(name = "ORG_ID", nullable = true, length = 32)
    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JudpForm judpForm = (JudpForm) o;
        return Objects.equals(formId, judpForm.formId) &&
                Objects.equals(formClassName, judpForm.formClassName) &&
                Objects.equals(formTitle, judpForm.formTitle) &&
                Objects.equals(orgId, judpForm.orgId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(formId, formClassName, formTitle, orgId);
    }
}
