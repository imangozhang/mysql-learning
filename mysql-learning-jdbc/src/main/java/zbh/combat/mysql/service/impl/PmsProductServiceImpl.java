package zbh.combat.mysql.service.impl;

import zbh.combat.mysql.dao.PmsProductDAO;
import zbh.combat.mysql.domain.entity.PmsProductDO;
import zbh.combat.mysql.domain.vo.PmsProductVO;
import zbh.combat.mysql.service.PmsProductService;

import java.math.BigDecimal;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PmsProductServiceImpl implements PmsProductService {
    @Override
    public List<PmsProductVO> list() throws SQLException {
        // 批量查询
        PmsProductDAO pmsProductDAO = new PmsProductDAO();
        List<PmsProductDO> pmsProductDOList = pmsProductDAO.selectAll();

        // 其他业务
        List<PmsProductVO> pmsProductVOList = new ArrayList<>();

        // 构造 VO 返回结果
        pmsProductDOList.forEach(item -> pmsProductVOList.add(item.toPmsProductVO()));
        return pmsProductVOList;
    }

    @Override
    public int insert() throws SQLException {
        PmsProductDAO pmsProductDAO = new PmsProductDAO();
        return pmsProductDAO.insert();
    }

    @Override
    public int insert(String name, BigDecimal price, String sn) throws SQLException {
        PmsProductDAO pmsProductDAO = new PmsProductDAO();
        return pmsProductDAO.insert(name, price, sn);
    }
}
