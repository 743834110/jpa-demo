package xyz.berby.im.jpademo.bean;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "JUDP_COMP_RESOURCE", schema = "TICKET", catalog = "")
public class JudpCompResource {
    private String resourceId;
    private String resourceName;
    private String resourceDesc;
    private String resourceType;
    private String parentResourceId;
    private Long orderNum;

    @Id
    @Column(name = "RESOURCE_ID", nullable = false, length = 100)
    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    @Basic
    @Column(name = "RESOURCE_NAME", nullable = true, length = 100)
    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    @Basic
    @Column(name = "RESOURCE_DESC", nullable = true, length = 100)
    public String getResourceDesc() {
        return resourceDesc;
    }

    public void setResourceDesc(String resourceDesc) {
        this.resourceDesc = resourceDesc;
    }

    @Basic
    @Column(name = "RESOURCE_TYPE", nullable = true, length = 3)
    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    @Basic
    @Column(name = "PARENT_RESOURCE_ID", nullable = true, length = 100)
    public String getParentResourceId() {
        return parentResourceId;
    }

    public void setParentResourceId(String parentResourceId) {
        this.parentResourceId = parentResourceId;
    }

    @Basic
    @Column(name = "ORDER_NUM", nullable = true, precision = 0)
    public Long getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(Long orderNum) {
        this.orderNum = orderNum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JudpCompResource that = (JudpCompResource) o;
        return Objects.equals(resourceId, that.resourceId) &&
                Objects.equals(resourceName, that.resourceName) &&
                Objects.equals(resourceDesc, that.resourceDesc) &&
                Objects.equals(resourceType, that.resourceType) &&
                Objects.equals(parentResourceId, that.parentResourceId) &&
                Objects.equals(orderNum, that.orderNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resourceId, resourceName, resourceDesc, resourceType, parentResourceId, orderNum);
    }
}
