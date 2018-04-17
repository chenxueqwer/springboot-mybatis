/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 80002
Source Host           : localhost:3306
Source Database       : demo

Target Server Type    : MYSQL
Target Server Version : 80002
File Encoding         : 65001

Date: 2018-04-17 19:45:09
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `user`
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` bigint(10) NOT NULL AUTO_INCREMENT,
  `username` varchar(20) NOT NULL,
  `password` varchar(20) NOT NULL DEFAULT '1',
  `sex` varchar(2) DEFAULT NULL,
  `nickname` varchar(20) DEFAULT NULL,
  `email` varchar(30) DEFAULT NULL,
  `regtime` date DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', 'xiaoming1', '1231', '女', '小明1', 'hh@hh.com', '2015-04-25');
INSERT INTO `user` VALUES ('10', 'cxc', '123', '男', 'cxc', '123', '2018-04-15');
INSERT INTO `user` VALUES ('12', 'dac', 'adca', '女', 'czc ', 'dad', '2018-04-01');
INSERT INTO `user` VALUES ('14', 'wahaha1', 'whh1', '男', '娃哈哈1', 'wahaha@email.com1', '2018-04-15');
INSERT INTO `user` VALUES ('15', 'd', 'dad', '男', 'ad', 'ada', '2018-04-01');
INSERT INTO `user` VALUES ('16', 'adad', 'adad', '女', 'ada', 'daadad', '2018-04-01');
