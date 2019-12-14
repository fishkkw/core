/*
Navicat MySQL Data Transfer

Source Server         : dev
Source Server Version : 50728
Source Host           : 192.168.1.104:3306
Source Database       : idoop

Target Server Type    : MYSQL
Target Server Version : 50728
File Encoding         : 65001

Date: 2019-12-14 12:27:33
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for tb_catalog
-- ----------------------------
DROP TABLE IF EXISTS `tb_catalog`;
CREATE TABLE `tb_catalog` (
  `id` char(32) CHARACTER SET utf8 NOT NULL COMMENT '主键',
  `name` varchar(64) CHARACTER SET utf8 NOT NULL COMMENT '商品类别名称',
  `image` binary(1) DEFAULT NULL COMMENT '商品分类图片',
  `mch_id` char(32) CHARACTER SET utf8 NOT NULL COMMENT '所属商户',
  `sort` varchar(10) DEFAULT NULL,
  `remark` varchar(200) DEFAULT NULL COMMENT '备注',
  `create_time` varchar(25) CHARACTER SET utf8 DEFAULT NULL COMMENT '创建时间',
  `create_user` varchar(32) CHARACTER SET utf8 DEFAULT NULL COMMENT '创建人',
  `modify_time` varchar(25) CHARACTER SET utf8 DEFAULT NULL,
  `modify_user` varchar(32) CHARACTER SET utf8 DEFAULT NULL COMMENT '修改人',
  `is_enable` tinyint(1) DEFAULT NULL COMMENT '是否有效 1-有效 0-无效',
  `is_del` tinyint(1) DEFAULT NULL COMMENT '是否删除 1-已删除 0-未删除',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Table structure for tb_catalog_product
-- ----------------------------
DROP TABLE IF EXISTS `tb_catalog_product`;
CREATE TABLE `tb_catalog_product` (
  `product_id` char(32) NOT NULL COMMENT '商品id',
  `catalog_id` char(32) NOT NULL COMMENT '商品分类id',
  PRIMARY KEY (`product_id`,`catalog_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Table structure for tb_mch
-- ----------------------------
DROP TABLE IF EXISTS `tb_mch`;
CREATE TABLE `tb_mch` (
  `id` char(32) NOT NULL COMMENT '标识每一个商家，同时也是小程序appid',
  `name` varchar(64) CHARACTER SET utf8 NOT NULL COMMENT '每个商家的名称',
  `create_time` varchar(25) NOT NULL COMMENT '商户创建时间',
  `trial_version` tinyint(1) NOT NULL COMMENT '试用版？',
  `address` varchar(128) DEFAULT NULL COMMENT '商铺地址',
  `tel` varchar(11) DEFAULT NULL COMMENT '商铺联系电话',
  `contact_name` varchar(32) DEFAULT NULL COMMENT '商铺联系人',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Table structure for tb_order
-- ----------------------------
DROP TABLE IF EXISTS `tb_order`;
CREATE TABLE `tb_order` (
  `order_no` char(32) CHARACTER SET utf8 NOT NULL COMMENT '订单号',
  `create_time` varchar(25) NOT NULL COMMENT '订单创建时间',
  `wx_user_id` varchar(64) NOT NULL COMMENT '订单所属用户id',
  `status` int(11) NOT NULL COMMENT '订单状态，具体数字代表什么意思待定',
  `total_fee` double DEFAULT NULL COMMENT '订单总数额',
  `pay_type` tinyint(1) DEFAULT NULL COMMENT '1、微信支付；2、支付宝支付',
  `mch_id` char(32) CHARACTER SET utf8 NOT NULL COMMENT '所属商户id',
  `pay_time` varchar(0) CHARACTER SET utf8 DEFAULT NULL,
  PRIMARY KEY (`order_no`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Table structure for tb_order_detail
-- ----------------------------
DROP TABLE IF EXISTS `tb_order_detail`;
CREATE TABLE `tb_order_detail` (
  `order_no` char(32) NOT NULL COMMENT '订单id',
  `product_id` char(32) NOT NULL COMMENT '商品id',
  `price` decimal(10,0) DEFAULT NULL COMMENT '商品进价',
  `sale_price` decimal(10,0) DEFAULT NULL COMMENT '商品卖价',
  `count` int(11) DEFAULT NULL COMMENT '商品数量',
  `mch_id` char(32) NOT NULL COMMENT '所属商户id',
  PRIMARY KEY (`order_no`,`product_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Table structure for tb_product
-- ----------------------------
DROP TABLE IF EXISTS `tb_product`;
CREATE TABLE `tb_product` (
  `id` char(32) NOT NULL COMMENT '每一个商品的唯一标识id',
  `name` varchar(64) CHARACTER SET utf8 NOT NULL COMMENT '商品名称',
  `image` binary(1) DEFAULT NULL COMMENT '商品图片展示',
  `store` int(11) DEFAULT NULL COMMENT '库存',
  `price` decimal(2,0) NOT NULL COMMENT '商品的进价',
  `sale_price` decimal(2,0) DEFAULT NULL COMMENT '商品的卖价',
  `mch_id` char(32) CHARACTER SET utf8 NOT NULL COMMENT '商品所属商户',
  `sort` varchar(10) CHARACTER SET utf8 DEFAULT NULL,
  `remark` varchar(200) DEFAULT NULL COMMENT '备注',
  `create_time` varchar(25) CHARACTER SET utf8 DEFAULT NULL COMMENT '创建时间',
  `create_user` varchar(32) CHARACTER SET utf8 DEFAULT NULL COMMENT '创建人',
  `modify_time` varchar(25) CHARACTER SET utf8 DEFAULT NULL,
  `modify_user` varchar(32) CHARACTER SET utf8 DEFAULT NULL COMMENT '修改人',
  `is_enable` tinyint(1) DEFAULT NULL COMMENT '是否有效 1-有效 0-无效',
  `is_del` tinyint(1) DEFAULT NULL COMMENT '是否删除 1-已删除 0-未删除',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
DROP TABLE IF EXISTS `tb_user`;
CREATE TABLE `tb_user` (
  `account` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '账号',
  `user_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户名',
  `password` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '密码',
  `status` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '1' COMMENT ' 1：启用，0：禁用, -1：删除',
  `tel` varchar(20) DEFAULT NULL COMMENT '电话',
  `email` varchar(36) DEFAULT NULL COMMENT '邮箱',
  `create_time` varchar(32) DEFAULT NULL COMMENT '时间戳 创建时间',
  `mch_id` char(32) NOT NULL COMMENT '管理系统用户所属商户',
  PRIMARY KEY (`account`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
-- ----------------------------
-- Table structure for tb_wx_user
-- ----------------------------
DROP TABLE IF EXISTS `tb_wx_user`;
CREATE TABLE `tb_wx_user` (
  `openid` varchar(64) NOT NULL COMMENT '微信点餐的客户的唯一标识',
  `nick_name` varchar(64) CHARACTER SET utf8 DEFAULT NULL COMMENT '昵称',
  `mch_id` char(32) NOT NULL COMMENT '所属商户',
  PRIMARY KEY (`openid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
