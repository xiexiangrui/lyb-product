/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50721
Source Host           : localhost:3306
Source Database       : demo

Target Server Type    : MYSQL
Target Server Version : 50721
File Encoding         : 65001

Date: 2018-04-09 18:05:38
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for t_account
-- ----------------------------
DROP TABLE IF EXISTS `t_account`;
CREATE TABLE `t_account` (
  `acc_id` int(11) NOT NULL AUTO_INCREMENT,
  `acc_code` char(20) NOT NULL COMMENT '账户编号',
  `acc_name` varchar(30) NOT NULL COMMENT '账户名称',
  `acc_password` varchar(255) NOT NULL COMMENT '密码',
  PRIMARY KEY (`acc_id`),
  UNIQUE KEY `acc_code_unique` (`acc_code`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COMMENT='用户表';

-- ----------------------------
-- Records of t_account
-- ----------------------------
INSERT INTO `t_account` VALUES ('1', '100000001', 'test1', '121');
INSERT INTO `t_account` VALUES ('2', '100000002', 'test2', '121');
INSERT INTO `t_account` VALUES ('3', '100000003', 'test3', '121');

-- ----------------------------
-- Table structure for t_account_role
-- ----------------------------
DROP TABLE IF EXISTS `t_account_role`;
CREATE TABLE `t_account_role` (
  `ar_id` int(11) NOT NULL AUTO_INCREMENT,
  `acc_code` char(20) NOT NULL COMMENT '用户编号',
  `role_code` char(20) NOT NULL COMMENT '角色编号',
  PRIMARY KEY (`ar_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COMMENT='用户角色表';

-- ----------------------------
-- Records of t_account_role
-- ----------------------------
INSERT INTO `t_account_role` VALUES ('1', '100000001', 'ROOT');
INSERT INTO `t_account_role` VALUES ('2', '100000002', 'ADMINSTRATOR');
INSERT INTO `t_account_role` VALUES ('3', '100000003', 'GUEST');

-- ----------------------------
-- Table structure for t_module
-- ----------------------------
DROP TABLE IF EXISTS `t_module`;
CREATE TABLE `t_module` (
  `mod_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '模块ID',
  `mod_code` char(20) NOT NULL COMMENT '模块编号',
  `mod_name` varchar(30) NOT NULL COMMENT '模块名称',
  `parent_code` char(20) DEFAULT NULL COMMENT '上级模块编号',
  `mod_url` varchar(255) DEFAULT '' COMMENT '模块URL',
  PRIMARY KEY (`mod_id`),
  UNIQUE KEY `mod_code_unique` (`mod_code`)
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8 COMMENT='模块表';

-- ----------------------------
-- Records of t_module
-- ----------------------------
INSERT INTO `t_module` VALUES ('1', 'REAR_MANAGE', '后台管理', null, null);
INSERT INTO `t_module` VALUES ('2', 'BLOG_M_MODULE', '博客管理', 'REAR_MANAGE', null);
INSERT INTO `t_module` VALUES ('3', 'COMMENT_M_MODULE', '评论管理', 'REAR_MANAGE', null);
INSERT INTO `t_module` VALUES ('4', 'SYSTEM_M_MODULE', '系统管理', 'REAR_MANAGE', null);
INSERT INTO `t_module` VALUES ('5', 'ACCOUNT_M_MODULE', '用户管理', 'REAR_MANAGE', null);
INSERT INTO `t_module` VALUES ('6', 'FRONT_MANAGE', '前台管理', null, null);
INSERT INTO `t_module` VALUES ('7', 'ADVERT_I_MODULE', '广告展现', 'FRONT_MANAGE', null);
INSERT INTO `t_module` VALUES ('8', 'DYNINFO_I_MODULE', '动态展现', 'FRONT_MANAGE', null);
INSERT INTO `t_module` VALUES ('9', 'SUBCLASS_I_MODULE', '主题展现', 'FRONT_MANAGE', null);
INSERT INTO `t_module` VALUES ('10', 'BLOG_CLASS_FUN', '博文分类', 'BLOG_M_MODULE', null);
INSERT INTO `t_module` VALUES ('11', 'BLOG_MANAGE_FUN', '博文管理', 'BLOG_M_MODULE', null);
INSERT INTO `t_module` VALUES ('12', 'ACCOUNT_INFO_FUN', '信息管理', 'ACCOUNT_M_MODULE', null);
INSERT INTO `t_module` VALUES ('13', 'ACCOUNT_SAFE_FUN', '安全中心', 'ACCOUNT_M_MODULE', null);
INSERT INTO `t_module` VALUES ('14', 'PRIVILEGE_SET_FUN', '权限点设置', 'SYSTEM_M_MODULE', null);
INSERT INTO `t_module` VALUES ('15', 'MODPRI_SET_FUN', '模块权限点设置', 'SYSTEM_M_MODULE', null);
INSERT INTO `t_module` VALUES ('16', 'PRLEPRI_SET_FUN', '角色权限设置', 'SYSTEM_M_MODULE', null);
INSERT INTO `t_module` VALUES ('17', 'ACCPRI_SET_FUN', '用户角色设置', 'SYSTEM_M_MODULE', null);
INSERT INTO `t_module` VALUES ('18', 'MODULE_M_MODULE', '系统模块管理', 'REAR_MANAGE', null);

-- ----------------------------
-- Table structure for t_module_privilege
-- ----------------------------
DROP TABLE IF EXISTS `t_module_privilege`;
CREATE TABLE `t_module_privilege` (
  `mp_id` int(11) NOT NULL AUTO_INCREMENT,
  `mod_code` char(20) NOT NULL COMMENT '模块编号',
  `pri_code` char(20) NOT NULL COMMENT '权限编号',
  PRIMARY KEY (`mp_id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8 COMMENT='模块权限';

-- ----------------------------
-- Records of t_module_privilege
-- ----------------------------
INSERT INTO `t_module_privilege` VALUES ('1', 'REAR_MANAGE', 'PRI_REARMOD_ACS');
INSERT INTO `t_module_privilege` VALUES ('2', 'FRONT_MANAGE', 'PRI_FRONTMOD_ACS');
INSERT INTO `t_module_privilege` VALUES ('3', 'BLOG_M_MODULE', 'PRI_BLOGMOD_ACS');
INSERT INTO `t_module_privilege` VALUES ('4', 'BLOG_CLASS_FUN', 'PRI_ADD');
INSERT INTO `t_module_privilege` VALUES ('5', 'BLOG_CLASS_FUN', 'PRI_DELETE');
INSERT INTO `t_module_privilege` VALUES ('6', 'SYSTEM_M_MODULE', 'PRI_SYSTEMMOD_ACS');
INSERT INTO `t_module_privilege` VALUES ('7', 'ACCPRI_SET_FUN', 'PRI_ADD');
INSERT INTO `t_module_privilege` VALUES ('8', 'ACCPRI_SET_FUN', 'PRI_DEIT');
INSERT INTO `t_module_privilege` VALUES ('9', 'ACCPRI_SET_FUN', 'PRI_DELETE');
INSERT INTO `t_module_privilege` VALUES ('10', 'ACCPRI_SET_FUN', 'PRI_QUERY');

-- ----------------------------
-- Table structure for t_privilege
-- ----------------------------
DROP TABLE IF EXISTS `t_privilege`;
CREATE TABLE `t_privilege` (
  `pri_id` int(11) NOT NULL AUTO_INCREMENT,
  `pri_code` char(20) NOT NULL COMMENT '权限编号',
  `pri_name` varchar(30) NOT NULL COMMENT '权限名称',
  PRIMARY KEY (`pri_id`),
  UNIQUE KEY `pri_code_unique` (`pri_code`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8 COMMENT='权限表';

-- ----------------------------
-- Records of t_privilege
-- ----------------------------
INSERT INTO `t_privilege` VALUES ('1', 'PRI_ADD', '增加');
INSERT INTO `t_privilege` VALUES ('2', 'PRI_DELETE', '删除');
INSERT INTO `t_privilege` VALUES ('3', 'PRI_DEIT', '更新');
INSERT INTO `t_privilege` VALUES ('4', 'PRI_QUERY', '查询');
INSERT INTO `t_privilege` VALUES ('5', 'PRI_REARMOD_ACS', '访问后台管理模块');
INSERT INTO `t_privilege` VALUES ('6', 'PRI_BLOGMOD_ACS', '访问博客管理模块');
INSERT INTO `t_privilege` VALUES ('7', 'PRI_COMMENTMOD_ACS', '访问评论管理模块');
INSERT INTO `t_privilege` VALUES ('8', 'PRI_SYSTEMMOD_ACS', '访问系统管理模块');
INSERT INTO `t_privilege` VALUES ('9', 'PRI_ACCOUNTMOD_ACS', '访问用户管理模块');
INSERT INTO `t_privilege` VALUES ('10', 'PRI_FRONTMOD_ACS', '访问前台管理模块');
INSERT INTO `t_privilege` VALUES ('11', 'PRI_ADVERTMOD_ACS', '访问光展现模块');
INSERT INTO `t_privilege` VALUES ('12', 'PRI_SUBCLASSMOD_ACS', '访问主题展现模块');
INSERT INTO `t_privilege` VALUES ('13', 'PRI_MODULEMOD_ACS', '访问模块管理模块');

-- ----------------------------
-- Table structure for t_role
-- ----------------------------
DROP TABLE IF EXISTS `t_role`;
CREATE TABLE `t_role` (
  `role_id` int(11) NOT NULL AUTO_INCREMENT,
  `role_code` char(20) NOT NULL COMMENT '角色编号',
  `role_name` varchar(30) NOT NULL COMMENT '角色名称',
  PRIMARY KEY (`role_id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8 COMMENT='角色';

-- ----------------------------
-- Records of t_role
-- ----------------------------
INSERT INTO `t_role` VALUES ('1', 'ROOT', '超级管理员');
INSERT INTO `t_role` VALUES ('2', 'ADMINSTRATOR', '管理员');
INSERT INTO `t_role` VALUES ('3', 'NORMAL', '普通用户');
INSERT INTO `t_role` VALUES ('4', 'GUEST', '访客');

-- ----------------------------
-- Table structure for t_role_privilege
-- ----------------------------
DROP TABLE IF EXISTS `t_role_privilege`;
CREATE TABLE `t_role_privilege` (
  `rp_id` int(11) NOT NULL AUTO_INCREMENT,
  `role_code` char(20) NOT NULL COMMENT '角色编号',
  `mp_id` int(11) NOT NULL COMMENT '模块权限ID',
  PRIMARY KEY (`rp_id`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8 COMMENT='角色权限';

-- ----------------------------
-- Records of t_role_privilege
-- ----------------------------
INSERT INTO `t_role_privilege` VALUES ('1', 'ROOT', '1');
INSERT INTO `t_role_privilege` VALUES ('2', 'ROOT', '2');
INSERT INTO `t_role_privilege` VALUES ('3', 'ROOT', '3');
INSERT INTO `t_role_privilege` VALUES ('4', 'ROOT', '4');
INSERT INTO `t_role_privilege` VALUES ('5', 'ROOT', '5');
INSERT INTO `t_role_privilege` VALUES ('6', 'ROOT', '6');
INSERT INTO `t_role_privilege` VALUES ('7', 'ROOT', '7');
INSERT INTO `t_role_privilege` VALUES ('8', 'ROOT', '8');
INSERT INTO `t_role_privilege` VALUES ('9', 'ROOT', '9');
INSERT INTO `t_role_privilege` VALUES ('10', 'ROOT', '10');
INSERT INTO `t_role_privilege` VALUES ('11', 'ADMINSTRATOR', '1');
INSERT INTO `t_role_privilege` VALUES ('12', 'ADMINSTRATOR', '2');
INSERT INTO `t_role_privilege` VALUES ('13', 'ADMINSTRATOR', '3');
INSERT INTO `t_role_privilege` VALUES ('14', 'ADMINSTRATOR', '4');
INSERT INTO `t_role_privilege` VALUES ('15', 'ADMINSTRATOR', '5');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(8) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) NOT NULL,
  `password` varchar(255) NOT NULL,
  `age` int(11) DEFAULT NULL,
  `sex` char(1) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `user_name_uindex` (`name`)
) ENGINE=InnoDB AUTO_INCREMENT=34 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', 'xxx', 'xxx', '18', 'M');
INSERT INTO `user` VALUES ('3', 'xcs22', 'xxxddd22', '18', 'M');
INSERT INTO `user` VALUES ('4', 'xcs2233', 'xxxddd2233', '18', 'M');
INSERT INTO `user` VALUES ('5', 'xcs223344', 'xxxddd223344', '18', 'M');
INSERT INTO `user` VALUES ('6', 'xcs22334455', 'xxxddd22334455', '18', 'M');
INSERT INTO `user` VALUES ('9', 'xcs22334455ss', 'xxxddd22334455ss', '18', 'M');
INSERT INTO `user` VALUES ('10', '何中宝', '5tesf', '18', 'M');
INSERT INTO `user` VALUES ('11', '何中宝1', '5tesf2', '18', 'M');
INSERT INTO `user` VALUES ('12', 'Hystrix', 'Hystrix', '18', 'M');
INSERT INTO `user` VALUES ('13', 'Hystrix1', 'Hystrix1', '18', 'M');
INSERT INTO `user` VALUES ('14', 'Hystrix12', 'Hystrix12', '18', 'M');
INSERT INTO `user` VALUES ('23', 'Hystrix2', 'Hystrix2', '18', 'M');
INSERT INTO `user` VALUES ('27', '123', '123', null, null);
INSERT INTO `user` VALUES ('30', '', '123', null, null);
INSERT INTO `user` VALUES ('31', 'jll', '789', null, null);
INSERT INTO `user` VALUES ('33', '能访问了吧', '123', null, null);
