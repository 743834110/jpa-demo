package xyz.berby.im.jpademo.bean;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class JudpAppMenuPK implements Serializable {
    private String menuId;
    private String templateId;

    @Column(name = "MENU_ID", nullable = false, length = 32)
    @Id
    public String getMenuId() {
        return menuId;
    }

    public void setMenuId(String menuId) {
        this.menuId = menuId;
    }

    @Column(name = "TEMPLATE_ID", nullable = false, length = 32)
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
        JudpAppMenuPK that = (JudpAppMenuPK) o;
        return Objects.equals(menuId, that.menuId) &&
                Objects.equals(templateId, that.templateId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(menuId, templateId);
    }
}
