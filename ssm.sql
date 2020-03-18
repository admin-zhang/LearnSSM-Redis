/*
 Navicat Premium Data Transfer

 Source Server         : panda
 Source Server Type    : MySQL
 Source Server Version : 50729
 Source Host           : localhost:3306
 Source Schema         : ssm

 Target Server Type    : MySQL
 Target Server Version : 50729
 File Encoding         : 65001

 Date: 18/03/2020 12:53:27
*/
CREATE database ssm;
USE ssm;

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for t_female_health
-- ----------------------------
DROP TABLE IF EXISTS `t_female_health`;
CREATE TABLE `t_female_health`  (
  `id` int(12) NOT NULL AUTO_INCREMENT,
  `user_id` int(12) NOT NULL,
  `heart` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `liver` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `spleen` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `lung` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `kidney` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `uterus` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `check_date` date NOT NULL,
  `note` varchar(5120) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for t_male_health
-- ----------------------------
DROP TABLE IF EXISTS `t_male_health`;
CREATE TABLE `t_male_health`  (
  `id` int(12) NOT NULL AUTO_INCREMENT,
  `user_id` int(12) NOT NULL,
  `heart` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `liver` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `spleen` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `lung` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `kidney` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `prostate` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `check_date` date NOT NULL,
  `note` varchar(5120) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for t_role
-- ----------------------------
DROP TABLE IF EXISTS `t_role`;
CREATE TABLE `t_role`  (
  `id` int(12) NOT NULL AUTO_INCREMENT,
  `role_name` varchar(60) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `note` varchar(512) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for t_user
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user`  (
  `id` int(12) NOT NULL,
  `user_name` varchar(60) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `password` varchar(60) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `sex` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `mobile` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `tel` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `email` varchar(60) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `note` varchar(512) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for t_user_info
-- ----------------------------
DROP TABLE IF EXISTS `t_user_info`;
CREATE TABLE `t_user_info`  (
  `id` int(12) NOT NULL,
  `user_id` int(12) NOT NULL,
  `head_image` blob NOT NULL,
  `note` varchar(1024) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for t_user_role
-- ----------------------------
DROP TABLE IF EXISTS `t_user_role`;
CREATE TABLE `t_user_role`  (
  `id` int(12) NOT NULL AUTO_INCREMENT,
  `role_id` int(12) NOT NULL,
  `user_id` int(12) NOT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  UNIQUE INDEX `role_user_idx`(`user_id`, `role_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;
