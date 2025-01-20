package zbh.combat.mysql.dao;

import zbh.combat.mysql.domain.entity.PmsProductDO;
import zbh.combat.mysql.utils.DBUtil;

import java.math.BigDecimal;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PmsProductDAO {
    public int insert() throws SQLException {
        // 获取数据库连接
        Connection con = DBUtil.getConnection();

        // 构建并执行 sql
        Statement stmt = con.createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_UPDATABLE);
        String sql = "INSERT into pms_product (name, price, product_sn) VALUES (" + "'红牛'" + ", 4.5" + ", 's10000678'" + ")";
        return stmt.executeUpdate(sql);
    }

    public int insert(String name, BigDecimal price, String sn) throws SQLException {
        // 获取数据库连接
        Connection con = DBUtil.getConnection();

        // 构建并执行 sql
        String sql = "INSERT into pms_product (name, price, product_sn) VALUES (?, ?, ?)";
        PreparedStatement pstmt = con.prepareStatement(sql);
        pstmt.setString(1, name);
        pstmt.setBigDecimal(2, price);
        pstmt.setString(3, sn);
        return pstmt.executeUpdate();
    }

    public void updateByPrimaryKey() throws SQLException {

    }

    public void deleteByPrimaryKey() {

    }

    public void selectByPrimaryKey(Long id) {

    }

    public List<PmsProductDO> selectAll() throws SQLException {
        // 获取数据库连接
        Connection con= DBUtil.getConnection();

        // 构建并执行 sql
        Statement stmt=con.createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_UPDATABLE);
        ResultSet rs=stmt.executeQuery("SELECT id, name, price FROM pms_product");
        List<PmsProductDO> pmsProductDOList=new ArrayList<PmsProductDO>();
        PmsProductDO pmsProductDOTmp=null;

        // 如果对象中有数据，就会循环打印出来
        while(rs.next()){
            pmsProductDOTmp=new PmsProductDO();
            //rs.updateBigDecimal("price", BigDecimal.valueOf(200.00));
            //rs.updateRow();
            pmsProductDOTmp.setName(rs.getString("name"));
            pmsProductDOTmp.setPrice(rs.getBigDecimal("price"));
            pmsProductDOList.add(pmsProductDOTmp);
        }
        return pmsProductDOList;
    }
}
