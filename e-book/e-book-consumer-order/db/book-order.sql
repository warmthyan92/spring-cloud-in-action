/*
Navicat MySQL Data Transfer

Source Server         : twf
Source Server Version : 50520
Source Host           : 127.0.0.1:3306
Source Database       : book-order

Target Server Type    : MYSQL
Target Server Version : 50520
File Encoding         : 65001

Date: 2019-01-17 16:46:51
*/
CREATE DATABASE /*!32312 IF NOT EXISTS*/`book-order` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `book-order`;

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for order
-- ----------------------------
DROP TABLE IF EXISTS `order`;
CREATE TABLE `order` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `product_id` int(10) NOT NULL DEFAULT '0' COMMENT '产品ID',
  `price` int(10) DEFAULT '0' COMMENT '价格',
  `user_id` int(10) DEFAULT '0' COMMENT '用户账号ID',
  `trade_id` int(10) DEFAULT '0' COMMENT '交易号ID',
  `trade_status` int(1) DEFAULT '0' COMMENT '支付状态 0=未支付 1=已支付',
  `deleted` int(1) unsigned DEFAULT '0' COMMENT '删除标志，默认0不删除，1删除',
  `create_time` varchar(20) DEFAULT NULL COMMENT '创建时间',
  `update_time` varchar(20) DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8;
