package xyz.berby.im.jpademo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import xyz.berby.im.jpademo.bean.SjWtMethod;

import java.util.List;
import java.util.Map;

public interface SjWtMethodDao extends JpaRepository<SjWtMethod, String>, JpaSpecificationExecutor<SjWtMethod> {

    @Query("select m from SjWtMethod m left join JudpUser u1 on u1.userId = m.createPerson left join JudpUser u2 on u2.userId = m.modifyPerson")
    List<SjWtMethod> queryList();

    @Query(value = "select SJ_WT_METHOD.*, JUDP_USER.* " +
            "from SJ_WT_METHOD, JUDP_USER " +
            "where SJ_WT_METHOD.CREATE_PERSON = JUDP_USER.USER_ID",
            nativeQuery = true)
    List<Map<String, Object>> query();


}
