package zbh.combat.mysql.service;


import zbh.combat.mysql.domain.vo.PmsProductVO;

import java.sql.SQLException;
import java.util.List;

public interface PmsProductService {
    List<PmsProductVO> list() throws SQLException;
}
