-- ----------------------------
-- Table structure for pms_product
-- ----------------------------
DROP TABLE IF EXISTS `pms_product`;
CREATE TABLE `pms_product`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `brand_id` bigint(20) NULL DEFAULT NULL COMMENT '品牌ID',
  `brand_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '品牌名称',
  `name` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '名称',
  `product_sn` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '货号',
  `pic` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `price` decimal(10, 2) NULL DEFAULT NULL COMMENT '售价',
  `sale` int(11) NULL DEFAULT NULL COMMENT '销量',
  `stock` int(11) NULL DEFAULT NULL COMMENT '库存',
  `description` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '商品描述',
  `create_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  `delete_status` int(1) NULL DEFAULT NULL COMMENT '删除状态：0->未删除；1->已删除',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 46 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '商品信息' ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of pms_product
-- ----------------------------
INSERT INTO `pms_product` (`brand_id`, `brand_name`, `name`, `product_sn`, `pic`, `price`, `sale`, `stock`, `description`, `delete_status`) VALUES (49, '七匹狼', '银色星芒刺绣网纱底裤', 'No86577', 'http://zhangbh-oss.com/mall/images/20180522/web.png', 100.00, 0, 100, '111', 0);
INSERT INTO `pms_product` (`brand_id`, `brand_name`, `name`, `product_sn`, `pic`, `price`, `sale`, `stock`, `description`, `delete_status`) VALUES (49, '七匹狼', '银色星芒刺绣网纱底裤2', 'No86578', 'http://zhangbh-oss.com/mall/images/20180522/web.png', 100.00, 0, 100, '111', 0);
INSERT INTO `pms_product` (`brand_id`, `brand_name`, `name`, `product_sn`, `pic`, `price`, `sale`, `stock`, `description`, `delete_status`) VALUES (1, '七匹狼', '银色星芒刺绣网纱底裤3', 'No86579', 'http://zhangbh-oss.com/mall/images/20180522/web.png', 100.00, 0, 100, '111', 0);
INSERT INTO `pms_product` (`brand_id`, `brand_name`, `name`, `product_sn`, `pic`, `price`, `sale`, `stock`, `description`, `delete_status`) VALUES (1, '万和', '银色星芒刺绣网纱底裤4', 'No86580', 'http://zhangbh-oss.com/mall/images/20180522/web.png', 100.00, 0, 100, '111', 0);
INSERT INTO `pms_product` (`brand_id`, `brand_name`, `name`, `product_sn`, `pic`, `price`, `sale`, `stock`, `description`, `delete_status`) VALUES (1, '万和', '银色星芒刺绣网纱底裤5', 'No86581', 'http://zhangbh-oss.com/mall/images/20180522/web.png', 100.00, 0, 100, '111', 0);
INSERT INTO `pms_product` (`brand_id`, `brand_name`, `name`, `product_sn`, `pic`, `price`, `sale`, `stock`, `description`, `delete_status`) VALUES (1, '万和', '银色星芒刺绣网纱底裤6', 'No86582', 'http://zhangbh-oss.com/mall/images/20180522/web.png', 100.00, 0, 100, '111', 0);
