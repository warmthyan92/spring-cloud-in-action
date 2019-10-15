/*
Navicat MySQL Data Transfer

Source Server         : twf
Source Server Version : 50520
Source Host           : 127.0.0.1:3306
Source Database       : book-trader

Target Server Type    : MYSQL
Target Server Version : 50520
File Encoding         : 65001

Date: 2019-01-17 16:47:12
*/
CREATE DATABASE /*!32312 IF NOT EXISTS*/`book-trader` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `book-trader`;

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for trader
-- ----------------------------
DROP TABLE IF EXISTS `trader`;
CREATE TABLE `trader` (
  `id` int(10) NOT NULL AUTO_INCREMENT COMMENT 'IID',
  `order_id` int(10) NOT NULL COMMENT '订单ID',
  `user_id` int(10) NOT NULL COMMENT '用户ID',
  `price` int(10) NOT NULL COMMENT '支付价',
  `pay_status` tinyint(4) NOT NULL COMMENT '1 未付款 2 付款中 3 付款失败 4 付款完成',
  `pay_type` tinyint(4) NOT NULL COMMENT '支付类型:1-支付宝支付，2-网银在线，3-银联，4-微信支付',
  `gateway_pay_num` varchar(30) DEFAULT NULL COMMENT '网关支付流水号',
  `gateway_pay_time` datetime DEFAULT NULL COMMENT '网关支付时间',
  `gateway_pay_price` int(10) NOT NULL DEFAULT '0' COMMENT '网关实际支付金额',
  `deleted` tinyint(4) unsigned DEFAULT '0' COMMENT '删除标志，默认0不删除，1删除',
  `create_time` varchar(20) NOT NULL COMMENT '创建时间',
  `update_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8 COMMENT='交易';
