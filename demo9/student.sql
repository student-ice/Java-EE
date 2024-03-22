/*
 Navicat Premium Data Transfer

 Source Server         : mysql
 Source Server Type    : MySQL
 Source Server Version : 100307
 Source Host           : localhost:3306
 Source Schema         : tarrow

 Target Server Type    : MySQL
 Target Server Version : 100307
 File Encoding         : 65001

 Date: 13/03/2024 10:54:59
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for student
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student`  (
  `stuNo` int(11) NOT NULL,
  `stuName` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `stuAge` int(11) NULL DEFAULT NULL,
  `graName` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`stuNo`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of student
-- ----------------------------
INSERT INTO `student` VALUES (1, '张三', 18, '就业班');
INSERT INTO `student` VALUES (2, '李四', 23, '就业班');
INSERT INTO `student` VALUES (31, '王五', 21, '就业班');
INSERT INTO `student` VALUES (32, '汤姆', 22, '就业班');
INSERT INTO `student` VALUES (33, '赵六', 30, '就业班');

SET FOREIGN_KEY_CHECKS = 1;
