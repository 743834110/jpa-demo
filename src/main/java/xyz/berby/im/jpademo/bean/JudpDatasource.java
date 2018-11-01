package xyz.berby.im.jpademo.bean;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "JUDP_DATASOURCE", schema = "TICKET", catalog = "")
public class JudpDatasource {
    private String dataSourceId;
    private String dataSourceDesc;
    private String connUrl;
    private String userName;
    private String password;
    private String driverClass;
    private Long minPoolSize;
    private Long maxPoolSize;
    private Long initialPoolSize;
    private String dbSchema;
    private String dbCharSet;
    private String jndi;
    private String jndiName;
    private Long maxWait;
    private Long tberm;
    private Long meitm;
    private String validationQuery;
    private Long testWhileIdle;
    private Boolean testOnBorrow;
    private Boolean testOnReturn;
    private Integer poolPreparedStatements;
    private Integer mppspcs;
    private String filters;
    private Long timeBetweenLogStatsMillis;
    private String statLogger;
    private String drNum;
    private String status;

    @Id
    @Column(name = "DATA_SOURCE_ID", nullable = false, length = 60)
    public String getDataSourceId() {
        return dataSourceId;
    }

    public void setDataSourceId(String dataSourceId) {
        this.dataSourceId = dataSourceId;
    }

    @Basic
    @Column(name = "DATA_SOURCE_DESC", nullable = true, length = 200)
    public String getDataSourceDesc() {
        return dataSourceDesc;
    }

    public void setDataSourceDesc(String dataSourceDesc) {
        this.dataSourceDesc = dataSourceDesc;
    }

    @Basic
    @Column(name = "CONN_URL", nullable = true, length = 200)
    public String getConnUrl() {
        return connUrl;
    }

    public void setConnUrl(String connUrl) {
        this.connUrl = connUrl;
    }

    @Basic
    @Column(name = "USER_NAME", nullable = true, length = 100)
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Basic
    @Column(name = "PASSWORD", nullable = true, length = 100)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "DRIVER_CLASS", nullable = true, length = 200)
    public String getDriverClass() {
        return driverClass;
    }

    public void setDriverClass(String driverClass) {
        this.driverClass = driverClass;
    }

    @Basic
    @Column(name = "MIN_POOL_SIZE", nullable = true, precision = 0)
    public Long getMinPoolSize() {
        return minPoolSize;
    }

    public void setMinPoolSize(Long minPoolSize) {
        this.minPoolSize = minPoolSize;
    }

    @Basic
    @Column(name = "MAX_POOL_SIZE", nullable = true, precision = 0)
    public Long getMaxPoolSize() {
        return maxPoolSize;
    }

    public void setMaxPoolSize(Long maxPoolSize) {
        this.maxPoolSize = maxPoolSize;
    }

    @Basic
    @Column(name = "INITIAL_POOL_SIZE", nullable = true, precision = 0)
    public Long getInitialPoolSize() {
        return initialPoolSize;
    }

    public void setInitialPoolSize(Long initialPoolSize) {
        this.initialPoolSize = initialPoolSize;
    }

    @Basic
    @Column(name = "DB_SCHEMA", nullable = true, length = 100)
    public String getDbSchema() {
        return dbSchema;
    }

    public void setDbSchema(String dbSchema) {
        this.dbSchema = dbSchema;
    }

    @Basic
    @Column(name = "DB_CHAR_SET", nullable = true, length = 20)
    public String getDbCharSet() {
        return dbCharSet;
    }

    public void setDbCharSet(String dbCharSet) {
        this.dbCharSet = dbCharSet;
    }

    @Basic
    @Column(name = "JNDI", nullable = true, length = 1)
    public String getJndi() {
        return jndi;
    }

    public void setJndi(String jndi) {
        this.jndi = jndi;
    }

    @Basic
    @Column(name = "JNDI_NAME", nullable = true, length = 100)
    public String getJndiName() {
        return jndiName;
    }

    public void setJndiName(String jndiName) {
        this.jndiName = jndiName;
    }

    @Basic
    @Column(name = "MAX_WAIT", nullable = true, precision = 0)
    public Long getMaxWait() {
        return maxWait;
    }

    public void setMaxWait(Long maxWait) {
        this.maxWait = maxWait;
    }

    @Basic
    @Column(name = "TBERM", nullable = true, precision = 0)
    public Long getTberm() {
        return tberm;
    }

    public void setTberm(Long tberm) {
        this.tberm = tberm;
    }

    @Basic
    @Column(name = "MEITM", nullable = true, precision = 0)
    public Long getMeitm() {
        return meitm;
    }

    public void setMeitm(Long meitm) {
        this.meitm = meitm;
    }

    @Basic
    @Column(name = "VALIDATION_QUERY", nullable = true, length = 256)
    public String getValidationQuery() {
        return validationQuery;
    }

    public void setValidationQuery(String validationQuery) {
        this.validationQuery = validationQuery;
    }

    @Basic
    @Column(name = "TEST_WHILE_IDLE", nullable = true, precision = 0)
    public Long getTestWhileIdle() {
        return testWhileIdle;
    }

    public void setTestWhileIdle(Long testWhileIdle) {
        this.testWhileIdle = testWhileIdle;
    }

    @Basic
    @Column(name = "TEST_ON_BORROW", nullable = true, precision = 0)
    public Boolean getTestOnBorrow() {
        return testOnBorrow;
    }

    public void setTestOnBorrow(Boolean testOnBorrow) {
        this.testOnBorrow = testOnBorrow;
    }

    @Basic
    @Column(name = "TEST_ON_RETURN", nullable = true, precision = 0)
    public Boolean getTestOnReturn() {
        return testOnReturn;
    }

    public void setTestOnReturn(Boolean testOnReturn) {
        this.testOnReturn = testOnReturn;
    }

    @Basic
    @Column(name = "POOL_PREPARED_STATEMENTS", nullable = true, precision = 0)
    public Integer getPoolPreparedStatements() {
        return poolPreparedStatements;
    }

    public void setPoolPreparedStatements(Integer poolPreparedStatements) {
        this.poolPreparedStatements = poolPreparedStatements;
    }

    @Basic
    @Column(name = "MPPSPCS", nullable = true, precision = 0)
    public Integer getMppspcs() {
        return mppspcs;
    }

    public void setMppspcs(Integer mppspcs) {
        this.mppspcs = mppspcs;
    }

    @Basic
    @Column(name = "FILTERS", nullable = true, length = 50)
    public String getFilters() {
        return filters;
    }

    public void setFilters(String filters) {
        this.filters = filters;
    }

    @Basic
    @Column(name = "TIME_BETWEEN_LOG_STATS_MILLIS", nullable = true, precision = 0)
    public Long getTimeBetweenLogStatsMillis() {
        return timeBetweenLogStatsMillis;
    }

    public void setTimeBetweenLogStatsMillis(Long timeBetweenLogStatsMillis) {
        this.timeBetweenLogStatsMillis = timeBetweenLogStatsMillis;
    }

    @Basic
    @Column(name = "STAT_LOGGER", nullable = true, length = 500)
    public String getStatLogger() {
        return statLogger;
    }

    public void setStatLogger(String statLogger) {
        this.statLogger = statLogger;
    }

    @Basic
    @Column(name = "DR_NUM", nullable = true, length = 100)
    public String getDrNum() {
        return drNum;
    }

    public void setDrNum(String drNum) {
        this.drNum = drNum;
    }

    @Basic
    @Column(name = "STATUS", nullable = true, length = 20)
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JudpDatasource that = (JudpDatasource) o;
        return Objects.equals(dataSourceId, that.dataSourceId) &&
                Objects.equals(dataSourceDesc, that.dataSourceDesc) &&
                Objects.equals(connUrl, that.connUrl) &&
                Objects.equals(userName, that.userName) &&
                Objects.equals(password, that.password) &&
                Objects.equals(driverClass, that.driverClass) &&
                Objects.equals(minPoolSize, that.minPoolSize) &&
                Objects.equals(maxPoolSize, that.maxPoolSize) &&
                Objects.equals(initialPoolSize, that.initialPoolSize) &&
                Objects.equals(dbSchema, that.dbSchema) &&
                Objects.equals(dbCharSet, that.dbCharSet) &&
                Objects.equals(jndi, that.jndi) &&
                Objects.equals(jndiName, that.jndiName) &&
                Objects.equals(maxWait, that.maxWait) &&
                Objects.equals(tberm, that.tberm) &&
                Objects.equals(meitm, that.meitm) &&
                Objects.equals(validationQuery, that.validationQuery) &&
                Objects.equals(testWhileIdle, that.testWhileIdle) &&
                Objects.equals(testOnBorrow, that.testOnBorrow) &&
                Objects.equals(testOnReturn, that.testOnReturn) &&
                Objects.equals(poolPreparedStatements, that.poolPreparedStatements) &&
                Objects.equals(mppspcs, that.mppspcs) &&
                Objects.equals(filters, that.filters) &&
                Objects.equals(timeBetweenLogStatsMillis, that.timeBetweenLogStatsMillis) &&
                Objects.equals(statLogger, that.statLogger) &&
                Objects.equals(drNum, that.drNum) &&
                Objects.equals(status, that.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dataSourceId, dataSourceDesc, connUrl, userName, password, driverClass, minPoolSize, maxPoolSize, initialPoolSize, dbSchema, dbCharSet, jndi, jndiName, maxWait, tberm, meitm, validationQuery, testWhileIdle, testOnBorrow, testOnReturn, poolPreparedStatements, mppspcs, filters, timeBetweenLogStatsMillis, statLogger, drNum, status);
    }
}
