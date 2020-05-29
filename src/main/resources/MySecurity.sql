/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 80019
 Source Host           : localhost:3306
 Source Schema         : test

 Target Server Type    : MySQL
 Target Server Version : 80019
 File Encoding         : 65001

 Date: 29/05/2020 13:16:07
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for oauth_client_details
-- ----------------------------
DROP TABLE IF EXISTS `oauth_client_details`;
CREATE TABLE `oauth_client_details`  (
  `client_id` varchar(48) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `resource_ids` varchar(256) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `client_secret` varchar(256) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `scope` varchar(256) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `authorized_grant_types` varchar(256) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `web_server_redirect_uri` varchar(256) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `authorities` varchar(256) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `access_token_validity` int(0) NULL DEFAULT NULL,
  `refresh_token_validity` int(0) NULL DEFAULT NULL,
  `additional_information` varchar(4096) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `autoapprove` varchar(256) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`client_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of oauth_client_details
-- ----------------------------
INSERT INTO `oauth_client_details` VALUES ('xiaowei', NULL, 'xiaowei123', 'all', 'password,refresh_token,authorization_code,client_credential', NULL, NULL, 3600, NULL, NULL, NULL);

-- ----------------------------
-- Table structure for persistent_logins
-- ----------------------------
DROP TABLE IF EXISTS `persistent_logins`;
CREATE TABLE `persistent_logins`  (
  `username` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `series` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `token` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `last_used` timestamp(0) NOT NULL,
  PRIMARY KEY (`series`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for t_menu
-- ----------------------------
DROP TABLE IF EXISTS `t_menu`;
CREATE TABLE `t_menu`  (
  `CREATE_DATE` datetime(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  `UPDATE_DATE` datetime(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '最后修改时间',
  `DELETE_DATE` datetime(0) NULL DEFAULT NULL COMMENT '删除时间',
  `CREATE_USER_LABEL` varchar(40) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建人',
  `UPDATE_USER_LABEL` varchar(40) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '最后修改人',
  `DELETE_USER_LABEL` varchar(40) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '删除人',
  `RECORD_VERSION` int(0) NOT NULL DEFAULT 0 COMMENT '版本号',
  `MENU_GUID` varchar(55) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '菜单主键',
  `MENU_NAME` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '菜单名称',
  `PARENT_ID` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '00000000' COMMENT '父菜单ID',
  `MENU_ORDER` int(0) NULL DEFAULT 0 COMMENT '显示顺序',
  `URL` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '#' COMMENT '请求地址',
  `TARGET` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '' COMMENT '打开方式（menuItem页签 menuBlank新窗口）',
  `MENU_TYPE` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '' COMMENT '菜单类型（M目录 C菜单 F按钮）',
  `MENU_STATUS` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '0' COMMENT '菜单状态（0显示 1隐藏）',
  `PERMS` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '权限标识',
  `ICON` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '#' COMMENT '菜单图标',
  `remark` varchar(500) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '' COMMENT '备注',
  PRIMARY KEY (`MENU_GUID`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_menu
-- ----------------------------
INSERT INTO `t_menu` VALUES ('2020-04-30 15:20:21', '2020-04-30 15:20:21', NULL, NULL, NULL, NULL, 0, '1', '系统管理', '00000000', 1, '#', '', 'M', '0', '', 'fa fa-gear', '');
INSERT INTO `t_menu` VALUES ('2020-04-30 15:22:42', '2020-04-30 15:22:42', NULL, NULL, NULL, NULL, 0, '100', '用户管理', '1', 1, '/user/findUser', '', 'C', '0', 'system:user:view', '#', '');
INSERT INTO `t_menu` VALUES ('2020-04-30 15:22:52', '2020-04-30 15:22:52', NULL, NULL, NULL, NULL, 0, '101', '角色管理', '1', 2, '/role/findRole', '', 'C', '0', 'system:role:view', '#', '');
INSERT INTO `t_menu` VALUES ('2020-04-30 15:23:00', '2020-04-30 15:23:00', NULL, NULL, NULL, NULL, 0, '102', '菜单管理', '1', 3, '/menu/findMenu', '', 'C', '0', 'system:menu:view', '#', '');
INSERT INTO `t_menu` VALUES ('2020-04-30 15:21:42', '2020-04-30 15:21:42', NULL, NULL, NULL, NULL, 0, '2', '系统监控', '00000000', 2, '#', '', 'M', '0', '', 'fa fa-video-camera', '');
INSERT INTO `t_menu` VALUES ('2020-04-30 15:22:24', '2020-04-30 15:22:24', NULL, NULL, NULL, NULL, 0, '3', '系统工具', '00000000', 3, '#', '', 'M', '0', '', 'fa fa-bars', '');

-- ----------------------------
-- Table structure for t_rm_map
-- ----------------------------
DROP TABLE IF EXISTS `t_rm_map`;
CREATE TABLE `t_rm_map`  (
  `CREATE_DATE` datetime(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  `UPDATE_DATE` datetime(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '最后修改时间',
  `DELETE_DATE` datetime(0) NULL DEFAULT NULL COMMENT '删除时间',
  `CREATE_USER_LABEL` varchar(40) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建人',
  `UPDATE_USER_LABEL` varchar(40) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '最后修改人',
  `DELETE_USER_LABEL` varchar(40) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '删除人',
  `RECORD_VERSION` int(0) NOT NULL DEFAULT 0 COMMENT '版本号',
  `RM_MAP` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '角色菜单主键',
  `ROLE_GUID` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '角色主键',
  `MENU_GUID` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '菜单主键',
  PRIMARY KEY (`RM_MAP`) USING BTREE,
  INDEX `FK_Reference_3`(`ROLE_GUID`) USING BTREE,
  INDEX `FK_Reference_4`(`MENU_GUID`) USING BTREE,
  CONSTRAINT `FK_Reference_3` FOREIGN KEY (`ROLE_GUID`) REFERENCES `t_role` (`ROLE_GUID`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `FK_Reference_4` FOREIGN KEY (`MENU_GUID`) REFERENCES `t_menu` (`MENU_GUID`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_rm_map
-- ----------------------------
INSERT INTO `t_rm_map` VALUES ('2020-04-30 15:25:14', '2020-04-30 15:25:14', NULL, NULL, NULL, NULL, 0, '1', '2', '1');
INSERT INTO `t_rm_map` VALUES ('2020-04-30 15:25:19', '2020-04-30 15:25:19', NULL, NULL, NULL, NULL, 0, '2', '2', '2');
INSERT INTO `t_rm_map` VALUES ('2020-04-30 15:26:50', '2020-04-30 15:26:50', NULL, NULL, NULL, NULL, 0, '3', '2', '100');
INSERT INTO `t_rm_map` VALUES ('2020-04-30 15:27:16', '2020-04-30 15:27:16', NULL, NULL, NULL, NULL, 0, '4', '2', '102');

-- ----------------------------
-- Table structure for t_role
-- ----------------------------
DROP TABLE IF EXISTS `t_role`;
CREATE TABLE `t_role`  (
  `CREATE_DATE` datetime(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  `UPDATE_DATE` datetime(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '最后修改时间',
  `DELETE_DATE` datetime(0) NULL DEFAULT NULL COMMENT '删除时间',
  `CREATE_USER_LABEL` varchar(40) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建人',
  `UPDATE_USER_LABEL` varchar(40) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '最后修改人',
  `DELETE_USER_LABEL` varchar(40) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '删除人',
  `RECORD_VERSION` int(0) NOT NULL DEFAULT 0 COMMENT '版本号',
  `ROLE_GUID` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '角色主键',
  `ROLE_NAME` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '角色名称',
  `ROLE_KEY` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '角色权限字符串',
  `ROLE_ORDER` int(0) NULL DEFAULT 0 COMMENT '显示顺序',
  `ROLE_STATUS` int(0) NOT NULL DEFAULT 0 COMMENT '角色状态（0正常 1停用）',
  `ROLE_DLE_FLAG` int(0) NOT NULL DEFAULT 0 COMMENT '删除标志（0代表存在 1代表删除）',
  PRIMARY KEY (`ROLE_GUID`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_role
-- ----------------------------
INSERT INTO `t_role` VALUES ('2020-04-28 14:12:39', '2020-04-28 14:12:39', NULL, NULL, NULL, NULL, 0, '1', 'admin', 'SysAdmin', 0, 0, 0);
INSERT INTO `t_role` VALUES ('2020-04-28 14:13:31', '2020-04-28 14:13:31', NULL, NULL, NULL, NULL, 0, '2', 'domestic', 'SysDomestic', 0, 0, 0);

-- ----------------------------
-- Table structure for t_ur_map
-- ----------------------------
DROP TABLE IF EXISTS `t_ur_map`;
CREATE TABLE `t_ur_map`  (
  `CREATE_DATE` datetime(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  `UPDATE_DATE` datetime(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '最后修改时间',
  `DELETE_DATE` datetime(0) NULL DEFAULT NULL COMMENT '删除时间',
  `CREATE_USER_LABEL` varchar(40) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建人',
  `UPDATE_USER_LABEL` varchar(40) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '最后修改人',
  `DELETE_USER_LABEL` varchar(40) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '删除人',
  `RECORD_VERSION` int(0) NOT NULL DEFAULT 0 COMMENT '版本号',
  `UR_GUID` varchar(55) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户角色主键',
  `USER_GUID` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户主键',
  `ROLE_GUID` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '角色主键',
  PRIMARY KEY (`UR_GUID`) USING BTREE,
  INDEX `FK_Reference_1`(`USER_GUID`) USING BTREE,
  INDEX `FK_Reference_2`(`ROLE_GUID`) USING BTREE,
  CONSTRAINT `FK_Reference_1` FOREIGN KEY (`USER_GUID`) REFERENCES `t_user` (`USER_GUID`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `FK_Reference_2` FOREIGN KEY (`ROLE_GUID`) REFERENCES `t_role` (`ROLE_GUID`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_ur_map
-- ----------------------------
INSERT INTO `t_ur_map` VALUES ('2020-04-28 14:28:18', '2020-04-28 14:28:18', NULL, NULL, NULL, NULL, 0, '1', '1', '1');
INSERT INTO `t_ur_map` VALUES ('2020-04-28 14:28:24', '2020-04-28 14:28:24', NULL, NULL, NULL, NULL, 0, '2', '2', '2');

-- ----------------------------
-- Table structure for t_user
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user`  (
  `CREATE_DATE` datetime(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  `UPDATE_DATE` datetime(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '最后修改时间',
  `DELETE_DATE` datetime(0) NULL DEFAULT NULL COMMENT '删除时间',
  `CREATE_USER_LABEL` varchar(40) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建人',
  `UPDATE_USER_LABEL` varchar(40) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '最后修改人',
  `DELETE_USER_LABEL` varchar(40) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '删除人',
  `RECORD_VERSION` int(0) NOT NULL DEFAULT 0 COMMENT '版本号',
  `USER_GUID` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户主键',
  `USER_NO` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户账号',
  `USER_NAME` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户姓名',
  `USER_PASSWORD` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户密码',
  `USER_SYSTEM` int(0) NOT NULL DEFAULT 0 COMMENT '是否系统保留用户(0否 1是)',
  `SEX` varchar(2) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '性别',
  `BIRTHDAY` datetime(0) NULL DEFAULT NULL COMMENT '生日',
  `EMAIL` varchar(128) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '电子邮箱',
  `REMARK` varchar(512) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注',
  `DIRECT_TEL` varchar(128) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '手机',
  `EXTRA1` varchar(500) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `EXTRA2` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `EXTRA3` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `EXTRA4` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `EXTRA5` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`USER_GUID`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_user
-- ----------------------------
INSERT INTO `t_user` VALUES ('2020-04-23 13:33:55', '2020-04-23 13:33:55', NULL, NULL, NULL, NULL, 0, '1', 'admin', '管理员', '$2a$10$5up6Z9Os7kIu1rMj6jxTTeKmsUUB9Gn4hWK6/dX9IXAofkaUQOOwe', 0, '男', '2011-04-01 12:41:34', '1248487360@qq.com', NULL, '111111111111111', '/profile/avatar/2020/05/20/00078a7dd7fb09cdd4d68663c0554391.png', NULL, NULL, NULL, NULL);
INSERT INTO `t_user` VALUES ('2020-04-28 14:07:22', '2020-04-28 14:07:22', NULL, NULL, NULL, NULL, 0, '2', '123', '张三', '$2a$10$2p1PSe1ugB3gxLxgc6Y/A.ZkAwkHAgneunXbUDcWY3oENOqvT.7eC', 0, '男', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `t_user` VALUES ('2020-04-28 14:08:18', '2020-04-28 14:08:18', NULL, NULL, NULL, NULL, 0, '3', '456', '李四', '$2a$10$tPQGSIKPcYmTeARFz6SXsO/dB7bDz5YUJze599VETLQDD0QNxcvci', 0, '男', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);

-- ----------------------------
-- Table structure for t_userconnection
-- ----------------------------
DROP TABLE IF EXISTS `t_userconnection`;
CREATE TABLE `t_userconnection`  (
  `userId` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `providerId` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `providerUserId` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '',
  `rank` int(0) NOT NULL,
  `displayName` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `profileUrl` varchar(512) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `imageUrl` varchar(512) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `accessToken` varchar(512) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `secret` varchar(512) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `refreshToken` varchar(512) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `expireTime` bigint(0) NULL DEFAULT NULL,
  PRIMARY KEY (`userId`, `providerId`, `providerUserId`) USING BTREE,
  UNIQUE INDEX `UserConnectionRank`(`userId`, `providerId`, `rank`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;
