/*
Navicat MySQL Data Transfer

Source Server         : twf
Source Server Version : 50520
Source Host           : 127.0.0.1:3306
Source Database       : book-product

Target Server Type    : MYSQL
Target Server Version : 50520
File Encoding         : 65001

Date: 2019-01-17 16:47:00
*/

CREATE DATABASE /*!32312 IF NOT EXISTS*/`book-product` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `book-product`;

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for product
-- ----------------------------
DROP TABLE IF EXISTS `product`;
CREATE TABLE `product` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `name` varchar(100) DEFAULT NULL COMMENT '产品名称',
  `status` int(4) NOT NULL DEFAULT '0' COMMENT '产品状态：0待审，1上架，2下架，3停售，4测试',
  `price` int(10) NOT NULL COMMENT '产品价格 单位分',
  `detail` varchar(1000) DEFAULT NULL COMMENT '产品详情',
  `deleted` int(4) NOT NULL DEFAULT '0' COMMENT '删除标志，默认0不删除，1删除',
  `create_time` varchar(20) NOT NULL COMMENT '创建时间',
  `update_time` varchar(20) NOT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COMMENT='产品信息';

-- ----------------------------
-- Records of product
-- ----------------------------
INSERT INTO `product` VALUES ('1', '漫谈spring cloud与spring boot基础架构（微服务基础篇）', '1', '100', '漫谈spring cloud与spring boot基础架构（微服务基础篇）', '0', '2017-12-03 09:08:12', '2017-12-17 16:44:39');
INSERT INTO `product` VALUES ('2', '漫谈spring cloud分布式服务架构（微服务进阶篇）', '1', '200', '漫谈spring cloud分布式服务架构（微服务进阶篇）', '0', '2017-12-03 09:08:12', '2017-12-17 16:44:41');
INSERT INTO `product` VALUES ('3', '漫谈spring cloud 与docker架构部署（微服务高级篇）', '1', '300', '漫谈spring cloud 与docker架构部署（微服务高级篇）', '0', '2017-12-17 16:44:35', '2017-12-17 16:45:15');
