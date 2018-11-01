package xyz.berby.im.jpademo.bean;

import javax.persistence.*;
import java.sql.Time;
import java.util.Arrays;
import java.util.Objects;

@Entity
@Table(name = "JUDP_ATTACHMENT", schema = "TICKET", catalog = "")
public class JudpAttachment {
    private String fileId;
    private String orgId;
    private String compId;
    private String itemType;
    private String busiId;
    private String originalName;
    private String fileExt;
    private String mimeType;
    private Long attachmentSize;
    private String storetodb;
    private String createPerson;
    private Time createTime;
    private String modifyPerson;
    private Time modifyTime;
    private byte[] fileData;
    private String filePath;
    private String refImageId;
    private String thumbnail;

    @Id
    @Column(name = "FILE_ID", nullable = false, length = 32)
    public String getFileId() {
        return fileId;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId;
    }

    @Basic
    @Column(name = "ORG_ID", nullable = true, length = 32)
    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    @Basic
    @Column(name = "COMP_ID", nullable = true, length = 32)
    public String getCompId() {
        return compId;
    }

    public void setCompId(String compId) {
        this.compId = compId;
    }

    @Basic
    @Column(name = "ITEM_TYPE", nullable = true, length = 32)
    public String getItemType() {
        return itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    @Basic
    @Column(name = "BUSI_ID", nullable = true, length = 32)
    public String getBusiId() {
        return busiId;
    }

    public void setBusiId(String busiId) {
        this.busiId = busiId;
    }

    @Basic
    @Column(name = "ORIGINAL_NAME", nullable = true, length = 100)
    public String getOriginalName() {
        return originalName;
    }

    public void setOriginalName(String originalName) {
        this.originalName = originalName;
    }

    @Basic
    @Column(name = "FILE_EXT", nullable = true, length = 32)
    public String getFileExt() {
        return fileExt;
    }

    public void setFileExt(String fileExt) {
        this.fileExt = fileExt;
    }

    @Basic
    @Column(name = "MIME_TYPE", nullable = true, length = 100)
    public String getMimeType() {
        return mimeType;
    }

    public void setMimeType(String mimeType) {
        this.mimeType = mimeType;
    }

    @Basic
    @Column(name = "ATTACHMENT_SIZE", nullable = true, precision = 0)
    public Long getAttachmentSize() {
        return attachmentSize;
    }

    public void setAttachmentSize(Long attachmentSize) {
        this.attachmentSize = attachmentSize;
    }

    @Basic
    @Column(name = "STORETODB", nullable = false, length = 3)
    public String getStoretodb() {
        return storetodb;
    }

    public void setStoretodb(String storetodb) {
        this.storetodb = storetodb;
    }

    @Basic
    @Column(name = "CREATE_PERSON", nullable = true, length = 32)
    public String getCreatePerson() {
        return createPerson;
    }

    public void setCreatePerson(String createPerson) {
        this.createPerson = createPerson;
    }

    @Basic
    @Column(name = "CREATE_TIME", nullable = true)
    public Time getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Time createTime) {
        this.createTime = createTime;
    }

    @Basic
    @Column(name = "MODIFY_PERSON", nullable = true, length = 32)
    public String getModifyPerson() {
        return modifyPerson;
    }

    public void setModifyPerson(String modifyPerson) {
        this.modifyPerson = modifyPerson;
    }

    @Basic
    @Column(name = "MODIFY_TIME", nullable = true)
    public Time getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Time modifyTime) {
        this.modifyTime = modifyTime;
    }

    @Basic
    @Column(name = "FILE_DATA", nullable = true)
    public byte[] getFileData() {
        return fileData;
    }

    public void setFileData(byte[] fileData) {
        this.fileData = fileData;
    }

    @Basic
    @Column(name = "FILE_PATH", nullable = true, length = 200)
    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    @Basic
    @Column(name = "REF_IMAGE_ID", nullable = true, length = 32)
    public String getRefImageId() {
        return refImageId;
    }

    public void setRefImageId(String refImageId) {
        this.refImageId = refImageId;
    }

    @Basic
    @Column(name = "THUMBNAIL", nullable = true, length = 3)
    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JudpAttachment that = (JudpAttachment) o;
        return Objects.equals(fileId, that.fileId) &&
                Objects.equals(orgId, that.orgId) &&
                Objects.equals(compId, that.compId) &&
                Objects.equals(itemType, that.itemType) &&
                Objects.equals(busiId, that.busiId) &&
                Objects.equals(originalName, that.originalName) &&
                Objects.equals(fileExt, that.fileExt) &&
                Objects.equals(mimeType, that.mimeType) &&
                Objects.equals(attachmentSize, that.attachmentSize) &&
                Objects.equals(storetodb, that.storetodb) &&
                Objects.equals(createPerson, that.createPerson) &&
                Objects.equals(createTime, that.createTime) &&
                Objects.equals(modifyPerson, that.modifyPerson) &&
                Objects.equals(modifyTime, that.modifyTime) &&
                Arrays.equals(fileData, that.fileData) &&
                Objects.equals(filePath, that.filePath) &&
                Objects.equals(refImageId, that.refImageId) &&
                Objects.equals(thumbnail, that.thumbnail);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(fileId, orgId, compId, itemType, busiId, originalName, fileExt, mimeType, attachmentSize, storetodb, createPerson, createTime, modifyPerson, modifyTime, filePath, refImageId, thumbnail);
        result = 31 * result + Arrays.hashCode(fileData);
        return result;
    }
}
