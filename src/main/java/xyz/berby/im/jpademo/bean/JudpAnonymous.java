package xyz.berby.im.jpademo.bean;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "JUDP_ANONYMOUS", schema = "TICKET", catalog = "")
public class JudpAnonymous {
    private String anonymousId;
    private String appId;
    private String url;
    private String httpmethod;

    @Id
    @Column(name = "ANONYMOUS_ID", nullable = false, length = 32)
    public String getAnonymousId() {
        return anonymousId;
    }

    public void setAnonymousId(String anonymousId) {
        this.anonymousId = anonymousId;
    }

    @Basic
    @Column(name = "APP_ID", nullable = true, length = 32)
    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    @Basic
    @Column(name = "URL", nullable = true, length = 100)
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Basic
    @Column(name = "HTTPMETHOD", nullable = true, length = 10)
    public String getHttpmethod() {
        return httpmethod;
    }

    public void setHttpmethod(String httpmethod) {
        this.httpmethod = httpmethod;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JudpAnonymous that = (JudpAnonymous) o;
        return Objects.equals(anonymousId, that.anonymousId) &&
                Objects.equals(appId, that.appId) &&
                Objects.equals(url, that.url) &&
                Objects.equals(httpmethod, that.httpmethod);
    }

    @Override
    public int hashCode() {
        return Objects.hash(anonymousId, appId, url, httpmethod);
    }
}
