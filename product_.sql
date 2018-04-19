/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50721
Source Host           : localhost:3306
Source Database       : product_

Target Server Type    : MYSQL
Target Server Version : 50721
File Encoding         : 65001

Date: 2018-04-19 18:12:22
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for t_menu
-- ----------------------------
DROP TABLE IF EXISTS `t_menu`;
CREATE TABLE `t_menu` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '菜单ID',
  `name` varchar(32) NOT NULL COMMENT '菜单名称',
  `menu_key` varchar(32) DEFAULT NULL COMMENT '菜单权限标识',
  `path` varchar(128) DEFAULT NULL COMMENT '前端URL',
  `url` varchar(128) DEFAULT NULL COMMENT '请求链接',
  `method` varchar(32) DEFAULT NULL COMMENT '请求方法',
  `parent_id` int(11) DEFAULT NULL COMMENT '父菜单ID',
  `icon` varchar(32) DEFAULT NULL COMMENT '图标',
  `component` varchar(64) DEFAULT NULL COMMENT 'VUE页面',
  `sort` int(11) DEFAULT NULL COMMENT '排序值',
  `type` char(1) DEFAULT NULL COMMENT '菜单类型 （0菜单 1按钮）',
  `description` varchar(255) DEFAULT NULL COMMENT '描述',
  `status` int(1) DEFAULT NULL COMMENT '状态（1：启用 0：禁用）',
  `datacompany` int(11) DEFAULT NULL COMMENT '所属公司',
  `create_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `del_flag` char(1) DEFAULT '0' COMMENT '0--正常 1--删除',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC COMMENT='菜单权限表';

-- ----------------------------
-- Records of t_menu
-- ----------------------------
INSERT INTO `t_menu` VALUES ('1', '用户管理', 'USER_MODULE', null, null, null, null, null, 'usermodule.vue', '0', '0', '用户管理模块', '1', '1', '2018-04-12 18:24:23', '2018-04-12 18:29:56', '0');
INSERT INTO `t_menu` VALUES ('2', '报价模块', 'QUOTED_MODULE', null, null, null, null, null, 'quotedmodule.vue', '0', '0', '报价管理', '1', '1', '2018-04-12 18:29:22', '2018-04-12 18:30:07', '0');

-- ----------------------------
-- Table structure for t_role
-- ----------------------------
DROP TABLE IF EXISTS `t_role`;
CREATE TABLE `t_role` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) NOT NULL COMMENT '角色名',
  `role_key` varchar(45) DEFAULT NULL COMMENT '角色代码',
  `description` varchar(50) DEFAULT NULL COMMENT '描述',
  `status` int(1) NOT NULL COMMENT '状态（1：启用 0：禁用）',
  `datacompany` int(11) NOT NULL COMMENT '所属公司',
  `del_flag` char(1) NOT NULL DEFAULT '0' COMMENT '逻辑删除标识（0-正常,1-删除）',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COMMENT='角色';

-- ----------------------------
-- Records of t_role
-- ----------------------------
INSERT INTO `t_role` VALUES ('1', '管理员', 'ADMIN', '管理员', '1', '1', '0');
INSERT INTO `t_role` VALUES ('2', '用户', 'GUEST', '用户', '1', '1', '0');

-- ----------------------------
-- Table structure for t_role_menu
-- ----------------------------
DROP TABLE IF EXISTS `t_role_menu`;
CREATE TABLE `t_role_menu` (
  `role_id` int(11) NOT NULL COMMENT '角色ID',
  `menu_id` int(11) NOT NULL COMMENT '菜单ID',
  PRIMARY KEY (`role_id`,`menu_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC COMMENT='角色菜单表';

-- ----------------------------
-- Records of t_role_menu
-- ----------------------------
INSERT INTO `t_role_menu` VALUES ('1', '1');
INSERT INTO `t_role_menu` VALUES ('1', '2');
INSERT INTO `t_role_menu` VALUES ('2', '2');

-- ----------------------------
-- Table structure for t_user
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) NOT NULL COMMENT '用户名',
  `login_nmae` varchar(45) NOT NULL COMMENT '登录名称',
  `password` varchar(255) NOT NULL COMMENT '密码',
  `image_url` varchar(255) DEFAULT NULL COMMENT '头像图片',
  `status` int(1) NOT NULL COMMENT '状态（1：启用 0：禁用）',
  `create_time` datetime DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  `datacompany` int(11) DEFAULT NULL COMMENT '所属公司',
  `phone` varchar(45) DEFAULT NULL,
  `mail` varchar(45) DEFAULT NULL,
  `qq` varchar(45) DEFAULT NULL,
  `wechat` varchar(45) DEFAULT NULL,
  `del_flag` char(1) NOT NULL DEFAULT '0' COMMENT '逻辑删除标识（0-正常,1-删除）',
  PRIMARY KEY (`id`),
  UNIQUE KEY `unique_login_name_idx` (`login_nmae`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COMMENT='用户';

-- ----------------------------
-- Records of t_user
-- ----------------------------
INSERT INTO `t_user` VALUES ('1', 'xxr', 'xxr', '$2a$10$1t0gswFgrAzOxJ.hD069OeaWTFnqRK5T9ZB4M8nxsJey6gkWEfHv.', '', '1', null, null, '1', '13088858249', 'xiexiangrui@163.com', '13088858249', '', '0');
INSERT INTO `t_user` VALUES ('2', '朱楚丹', 'zcd', '$2a$10$0mBF0njDJetdLf4dJ/vO/.UiyZI/0JUbkzwV5kD9/afcGOsr0tmNG', '', '1', null, null, '1', '13444445555', 'zcd@163.com', '1343422', '', '0');

-- ----------------------------
-- Table structure for t_user_role
-- ----------------------------
DROP TABLE IF EXISTS `t_user_role`;
CREATE TABLE `t_user_role` (
  `user_id` int(11) NOT NULL COMMENT '用户ID（t_user)',
  `role_id` int(11) NOT NULL COMMENT '角色ID（t_role)'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户角色关联';

-- ----------------------------
-- Records of t_user_role
-- ----------------------------
INSERT INTO `t_user_role` VALUES ('1', '1');
INSERT INTO `t_user_role` VALUES ('2', '2');
