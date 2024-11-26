package zbh.combat.mysql;

import zbh.combat.mysql.controller.PmsProductController;
import zbh.combat.mysql.domain.vo.CommonResult;
import zbh.combat.mysql.domain.vo.PmsProductVO;
import zbh.combat.mysql.domain.vo.ResultCode;

import java.util.List;
import java.util.Objects;

public class JDBCApplication {

    public static void main(String[] args) throws Exception {
        // 调用接口
        PmsProductController productController = new PmsProductController();
        CommonResult<List<PmsProductVO>> productResult = productController.getList();
        if (productResult == null
                || productResult.getCode() != ResultCode.SUCCESS.getCode()
                || productResult.getData() == null) {
            System.out.println("product controller getList error, result: "
                    + Objects.requireNonNull(productResult).toString());
            return;
        }
        // 解析响应
        productResult.getData().forEach(
                item -> System.out.println(item.getName() + ": " + item.getPrice())
        );
    }
}
