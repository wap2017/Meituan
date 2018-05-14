/*
SQLyog Ultimate - MySQL GUI v8.2 
MySQL - 5.5.27 : Database - meituan
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`meituan` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `meituan`;

/*Table structure for table `address` */

DROP TABLE IF EXISTS `address`;

CREATE TABLE `address` (
  `ad_id` varchar(40) NOT NULL COMMENT '地址ID',
  `u_id` varchar(40) DEFAULT NULL COMMENT '用户ID',
  `ad_name` varchar(20) DEFAULT NULL COMMENT '姓名',
  `ad_phone` varchar(11) DEFAULT NULL COMMENT '手机号码',
  `ad_province` varchar(10) DEFAULT NULL COMMENT '省',
  `ad_city` varchar(10) DEFAULT NULL COMMENT '市',
  `ad_address` varchar(100) DEFAULT NULL COMMENT '地址详细信息',
  `ad_flag` int(2) DEFAULT NULL COMMENT '设为常用地址',
  PRIMARY KEY (`ad_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `address` */

/*Table structure for table `admin` */

DROP TABLE IF EXISTS `admin`;

CREATE TABLE `admin` (
  `a_id` varchar(40) NOT NULL COMMENT '管理员ID',
  `a_account` varchar(40) DEFAULT NULL COMMENT '管理员账号',
  `a_pwd` varchar(40) DEFAULT NULL COMMENT '管理员密码',
  PRIMARY KEY (`a_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `admin` */

insert  into `admin`(`a_id`,`a_account`,`a_pwd`) values ('1','123','123');

/*Table structure for table `bussiness` */

DROP TABLE IF EXISTS `bussiness`;

CREATE TABLE `bussiness` (
  `b_id` varchar(40) NOT NULL COMMENT '商家ID',
  `b_address` varchar(40) DEFAULT NULL COMMENT '商家地址',
  `b_shopName` varchar(50) DEFAULT NULL COMMENT '店铺名',
  `b_shopLogo` varchar(100) DEFAULT NULL COMMENT '店铺LOGO',
  `b_notice` varchar(100) DEFAULT NULL COMMENT '店铺公告',
  `b_isBan` int(2) DEFAULT NULL COMMENT '是否禁止商家',
  PRIMARY KEY (`b_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `bussiness` */

/*Table structure for table `feedback` */

DROP TABLE IF EXISTS `feedback`;

CREATE TABLE `feedback` (
  `f_id` varchar(40) NOT NULL COMMENT '反馈ID',
  `f_receiveId` varchar(40) DEFAULT NULL COMMENT '反馈者ID',
  `f_time` datetime DEFAULT NULL COMMENT '反馈日期',
  `f_content` varchar(255) DEFAULT NULL COMMENT '反馈内容',
  `f_readed` int(2) DEFAULT NULL COMMENT '是否已读',
  PRIMARY KEY (`f_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `feedback` */

/*Table structure for table `goods` */

DROP TABLE IF EXISTS `goods`;

CREATE TABLE `goods` (
  `g_id` varchar(40) NOT NULL COMMENT '商品ID',
  `b_id` varchar(40) DEFAULT NULL COMMENT '商家ID',
  `g_name` varchar(20) DEFAULT NULL COMMENT '商品名称',
  `g_detail` varchar(40) DEFAULT NULL COMMENT '商品描述',
  `g_type` varchar(20) DEFAULT NULL COMMENT '商品类型',
  `g_price` double DEFAULT NULL COMMENT '商品单价',
  `g_stock` int(11) DEFAULT NULL COMMENT '商品库存',
  `g_picture` varchar(100) DEFAULT NULL COMMENT '商品图片',
  `g_sale` int(2) DEFAULT NULL COMMENT '是否上架销售',
  `g_add` datetime DEFAULT NULL COMMENT '商品添加时间',
  PRIMARY KEY (`g_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `goods` */

/*Table structure for table `order_item` */

DROP TABLE IF EXISTS `order_item`;

CREATE TABLE `order_item` (
  `o_id` varchar(40) NOT NULL COMMENT '订单项ID',
  `p_id` varchar(40) DEFAULT NULL COMMENT '代买订单ID',
  `g_id` varchar(40) DEFAULT NULL COMMENT '商品ID',
  `o_num` int(11) DEFAULT '1' COMMENT '商品数量',
  PRIMARY KEY (`o_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `order_item` */

/*Table structure for table `purchase` */

DROP TABLE IF EXISTS `purchase`;

CREATE TABLE `purchase` (
  `p_id` varchar(40) NOT NULL COMMENT '订单ID',
  `u_id` varchar(4) DEFAULT NULL COMMENT '用户ID',
  `p_State` varchar(40) DEFAULT NULL COMMENT '订单状态',
  `p_addressId` varchar(40) DEFAULT NULL COMMENT '地址ID',
  `b_id` varchar(40) DEFAULT NULL COMMENT '商家ID',
  `p_orderRemark` varchar(100) DEFAULT NULL COMMENT '备注信息',
  `p_cancelTime` datetime DEFAULT NULL COMMENT '自动取消时间',
  `p_openTime` datetime DEFAULT NULL COMMENT '下单时间',
  `p_receiveTime` datetime DEFAULT NULL COMMENT '接单时间',
  `p_finishTime` datetime DEFAULT NULL COMMENT '完成时间',
  PRIMARY KEY (`p_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `purchase` */

/*Table structure for table `user` */

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `u_id` varchar(40) NOT NULL COMMENT '用户ID',
  `u_picture` varchar(50) DEFAULT NULL COMMENT '头像',
  `u_nickName` varchar(20) DEFAULT NULL COMMENT '昵称',
  `u_sex` varchar(2) DEFAULT NULL COMMENT '性别',
  `u_address` varchar(30) DEFAULT NULL COMMENT '学校',
  `u_isBan` int(2) DEFAULT NULL COMMENT '是否禁止',
  PRIMARY KEY (`u_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `user` */

insert  into `user`(`u_id`,`u_picture`,`u_nickName`,`u_sex`,`u_address`,`u_isBan`) values ('1','AAA/BBB.jpg','鲁班大师','男',NULL,0),('2','CCC.JPG','狂铁','男',NULL,0),('3','obj.JPG','阿珂','女',NULL,1),('4','abc.JPG','项羽','男',NULL,1),('5','caca.JPG','后裔','男',NULL,0);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
