
--***************sql书写规则**********************************
--1：关键字必须要大写
--***************sql书写规则***********************************

--**********************创建数据库*****************************
CREATE DATABASE manage_project CHARACTER SET 'utf8';
--**********************创建数据库*****************************

--*************************************************************
--创建组织架构表sys_organization
--*************************************************************
CREATE TABLE manage_project.sys_organization (
  id bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '主键',
  name VARCHAR(50) DEFAULT NULL COMMENT '组织机构名称',
  create_date DATE COMMENT '创建时间',
   PRIMARY KEY (`id`)
);
--**************************************************************

--*************************************************************
--创建用户角色sys_role
--*************************************************************
CREATE TABLE manage_project.sys_role (
  id BIGINT(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '主键',
  name VARCHAR(50) DEFAULT NULL COMMENT '角色名称',
  create_date DATE COMMENT '创建时间',
   PRIMARY KEY (`id`)
);
--**************************************************************

--*************************************************************
--创建用户sys_user
--*************************************************************
CREATE TABLE manage_project.sys_user (
  id bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '主键',
  user_name VARCHAR(50) DEFAULT NULL COMMENT '用户名',
  real_name VARCHAR(50) DEFAULT NULL COMMENT '真实用户名',
  password VARCHAR(50) DEFAULT NULL COMMENT '密码',
  role_id  BIGINT(20) DEFAULT NULL COMMENT '角色id',
  organization_id  BIGINT(20) DEFAULT NULL COMMENT '组织机构id',
  create_date DATE COMMENT '创建时间',
   PRIMARY KEY (`id`)
);
--**************************************************************