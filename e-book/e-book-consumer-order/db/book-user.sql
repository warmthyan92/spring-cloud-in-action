/*
Navicat MySQL Data Transfer

Source Server         : twf
Source Server Version : 50520
Source Host           : 127.0.0.1:3306
Source Database       : book-user

Target Server Type    : MYSQL
Target Server Version : 50520
File Encoding         : 65001

Date: 2019-01-17 16:47:23
*/
CREATE DATABASE /*!32312 IF NOT EXISTS*/`book-user` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `book-user`;

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(10) NOT NULL AUTO_INCREMENT COMMENT '自增主键',
  `user_name` varchar(50) DEFAULT NULL COMMENT '用户名',
  `password` varchar(50) NOT NULL COMMENT '密码',
  `email` varchar(50) NOT NULL COMMENT 'email',
  `deleted` int(4) NOT NULL DEFAULT '0' COMMENT '删除标志，默认0不删除，1删除',
  `create_time` varchar(50) NOT NULL COMMENT '创建时间',
  `update_time` varchar(20) NOT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COMMENT='用户表';

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', 'admin', 'admin', 'bobo0218bo@126.com', '0', '2019-01-15 14:57:31', '2019-01-15 14:59:44');
INSERT INTO `user` VALUES ('2', 'twf', '123456', '1643327713@qq.com', '0', '2019-01-15 14:57:31', '2019-01-15 15:01:08');
