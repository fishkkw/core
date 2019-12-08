DROP TABLE IF EXISTS `user_info`;
CREATE TABLE `user_info` (
  `account` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '账号',
  `user_Name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户名',
  `password` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '密码',
  `enabled` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '1' COMMENT '是否启用 1：启用，0：禁用',
  `tel` varchar(20) DEFAULT NULL COMMENT '电话',
  `email` varchar(36) DEFAULT NULL COMMENT '邮箱',
  `create_time` decimal(20,0) DEFAULT NULL COMMENT '时间戳 创建时间',
  `remark` varchar(255) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`account`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
