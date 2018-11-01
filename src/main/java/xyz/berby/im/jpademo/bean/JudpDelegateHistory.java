package xyz.berby.im.jpademo.bean;

import javax.persistence.*;
import java.sql.Time;
import java.util.Objects;

@Entity
@Table(name = "JUDP_DELEGATE_HISTORY", schema = "TICKET", catalog = "")
public class JudpDelegateHistory {
    private String delegateHistoryId;
    private String assignee;
    private String attorney;
    private Time createTime;
    private String taskId;
    private Time finishedTime;

    @Id
    @Column(name = "DELEGATE_HISTORY_ID", nullable = false, length = 32)
    public String getDelegateHistoryId() {
        return delegateHistoryId;
    }

    public void setDelegateHistoryId(String delegateHistoryId) {
        this.delegateHistoryId = delegateHistoryId;
    }

    @Basic
    @Column(name = "ASSIGNEE", nullable = false, length = 32)
    public String getAssignee() {
        return assignee;
    }

    public void setAssignee(String assignee) {
        this.assignee = assignee;
    }

    @Basic
    @Column(name = "ATTORNEY", nullable = false, length = 32)
    public String getAttorney() {
        return attorney;
    }

    public void setAttorney(String attorney) {
        this.attorney = attorney;
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
    @Column(name = "TASK_ID", nullable = true, length = 100)
    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    @Basic
    @Column(name = "FINISHED_TIME", nullable = true)
    public Time getFinishedTime() {
        return finishedTime;
    }

    public void setFinishedTime(Time finishedTime) {
        this.finishedTime = finishedTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JudpDelegateHistory that = (JudpDelegateHistory) o;
        return Objects.equals(delegateHistoryId, that.delegateHistoryId) &&
                Objects.equals(assignee, that.assignee) &&
                Objects.equals(attorney, that.attorney) &&
                Objects.equals(createTime, that.createTime) &&
                Objects.equals(taskId, that.taskId) &&
                Objects.equals(finishedTime, that.finishedTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(delegateHistoryId, assignee, attorney, createTime, taskId, finishedTime);
    }
}
