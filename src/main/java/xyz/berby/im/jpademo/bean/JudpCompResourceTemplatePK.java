package xyz.berby.im.jpademo.bean;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class JudpCompResourceTemplatePK implements Serializable {
    private String resourceId;
    private String templateId;

    @Column(name = "RESOURCE_ID", nullable = false, length = 100)
    @Id
    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    @Column(name = "TEMPLATE_ID", nullable = false, length = 100)
    @Id
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
        JudpCompResourceTemplatePK that = (JudpCompResourceTemplatePK) o;
        return Objects.equals(resourceId, that.resourceId) &&
                Objects.equals(templateId, that.templateId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resourceId, templateId);
    }
}
