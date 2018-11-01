package xyz.berby.im.jpademo.bean;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "JUDP_COMP_RESOURCE_TEMPLATE", schema = "TICKET", catalog = "")
@IdClass(JudpCompResourceTemplatePK.class)
public class JudpCompResourceTemplate {
    private String resourceId;
    private String templateId;

    @Id
    @Column(name = "RESOURCE_ID", nullable = false, length = 100)
    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    @Id
    @Column(name = "TEMPLATE_ID", nullable = false, length = 100)
    public String getTemplateId() {
        return templateId;
    }

    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JudpCompResourceTemplate that = (JudpCompResourceTemplate) o;
        return Objects.equals(resourceId, that.resourceId) &&
                Objects.equals(templateId, that.templateId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resourceId, templateId);
    }
}
