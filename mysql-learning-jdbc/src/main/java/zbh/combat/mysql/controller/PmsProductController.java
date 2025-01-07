package zbh.combat.mysql.controller;

import zbh.combat.mysql.domain.vo.CommonResult;
import zbh.combat.mysql.domain.vo.PmsProductVO;
import zbh.combat.mysql.service.PmsProductService;
import zbh.combat.mysql.service.impl.PmsProductServiceImpl;

import java.math.BigDecimal;
import java.sql.SQLException;
import java.util.List;

public class PmsProductController {

    /**
     * 查询商品列表
     * @return
     * @throws SQLException
     */
    public CommonResult<List<PmsProductVO>> getList() throws SQLException {
        PmsProductService pmsProductService = new PmsProductServiceImpl();
        List<PmsProductVO> productList = pmsProductService.list();
        return CommonResult.success(productList);
    }

    public CommonResult<Integer> insert() throws SQLException {
        PmsProductService pmsProductService = new PmsProductServiceImpl();
        return CommonResult.success(pmsProductService.insert());
    }

    public CommonResult<Integer> insert(String name, BigDecimal price) throws SQLException {
        PmsProductService pmsProductService = new PmsProductServiceImpl();
        return CommonResult.success(pmsProductService.insert(name, price));
    }
}
