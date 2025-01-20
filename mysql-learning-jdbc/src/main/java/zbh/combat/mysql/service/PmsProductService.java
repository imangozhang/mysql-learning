package zbh.combat.mysql.service;


import zbh.combat.mysql.domain.vo.PmsProductVO;

import java.math.BigDecimal;
import java.sql.SQLException;
import java.util.List;

public interface PmsProductService {
    List<PmsProductVO> list() throws SQLException;

    int insert() throws SQLException;

    int insert(String name, BigDecimal price, String sn) throws SQLException;
}
