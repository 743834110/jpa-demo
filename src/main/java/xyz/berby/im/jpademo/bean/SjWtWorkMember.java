package xyz.berby.im.jpademo.bean;

import javax.persistence.*;
import java.sql.Time;
import java.util.Objects;

@Entity
@Table(name = "SJ_WT_WORK_MEMBER", schema = "TICKET", catalog = "")
public class SjWtWorkMember {
    private String workMemberId;
    private String workTicketId;
    private String leaguer;
    private String membername;
    private String createPerson;
    private Time createTime;
    private String modifyPerson;
    private Time modifyTime;

    @Id
    @Column(name = "WORK_MEMBER_ID", nullable = false, length = 32)
    public String getWorkMemberId() {
        return workMemberId;
    }

    public void setWorkMemberId(String workMemberId) {
        this.workMemberId = workMemberId;
    }

    @Basic
    @Column(name = "WORK_TICKET_ID", nullable = true, length = 32)
    public String getWorkTicketId() {
        return workTicketId;
    }

    public void setWorkTicketId(String workTicketId) {
        this.workTicketId = workTicketId;
    }

    @Basic
    @Column(name = "LEAGUER", nullable = true, length = 32)
    public String getLeaguer() {
        return leaguer;
    }

    public void setLeaguer(String leaguer) {
        this.leaguer = leaguer;
    }

    @Basic
    @Column(name = "MEMBERNAME", nullable = true, length = 20)
    public String getMembername() {
        return membername;
    }

    public void setMembername(String membername) {
        this.membername = membername;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SjWtWorkMember that = (SjWtWorkMember) o;
        return Objects.equals(workMemberId, that.workMemberId) &&
                Objects.equals(workTicketId, that.workTicketId) &&
                Objects.equals(leaguer, that.leaguer) &&
                Objects.equals(membername, that.membername) &&
                Objects.equals(createPerson, that.createPerson) &&
                Objects.equals(createTime, that.createTime) &&
                Objects.equals(modifyPerson, that.modifyPerson) &&
                Objects.equals(modifyTime, that.modifyTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(workMemberId, workTicketId, leaguer, membername, createPerson, createTime, modifyPerson, modifyTime);
    }
}
