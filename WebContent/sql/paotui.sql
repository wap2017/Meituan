/*
SQLyog Ultimate - MySQL GUI v8.2 
MySQL - 5.5.27 : Database - paotui
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`paotui` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `paotui`;

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
  `ad_sex` varchar(4) DEFAULT NULL COMMENT '性别',
  PRIMARY KEY (`ad_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `address` */

insert  into `address`(`ad_id`,`u_id`,`ad_name`,`ad_phone`,`ad_province`,`ad_city`,`ad_address`,`ad_flag`,`ad_sex`) values ('881628bc-9a37-4082-b688-896560a37400','234','小路','123424342','广东','桂林','广西桂林xxxxxx',0,NULL),('e1','234','Matten','12345678900','广东','汕头','北区8427',1,NULL),('rrrqwe3','ttt1','你无理，总之好犀利','13695876534','广东省','广州市','纺织路500号',0,NULL),('s1',NULL,'Cindy','13456789099',NULL,NULL,'北区公告栏中通快递',NULL,NULL);

/*Table structure for table `admin` */

DROP TABLE IF EXISTS `admin`;

CREATE TABLE `admin` (
  `a_id` varchar(40) NOT NULL COMMENT '管理员ID',
  `a_number` varchar(40) DEFAULT NULL COMMENT '管理员账号',
  `a_pwd` varchar(40) DEFAULT NULL COMMENT '管理员密码',
  PRIMARY KEY (`a_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `admin` */

insert  into `admin`(`a_id`,`a_number`,`a_pwd`) values ('admin','13609747823','123456');

/*Table structure for table `business` */

DROP TABLE IF EXISTS `business`;

CREATE TABLE `business` (
  `b_id` varchar(40) NOT NULL COMMENT '商家ID',
  `b_shopName` varchar(50) DEFAULT NULL COMMENT '店铺名',
  `b_shopLogo` varchar(100) DEFAULT NULL COMMENT '店铺LOGO',
  `b_notice` varchar(100) DEFAULT NULL COMMENT '店铺公告',
  `b_accountId` varchar(64) DEFAULT NULL,
  `b_accountPassword` varchar(64) DEFAULT NULL,
  `b_commission` float(7,2) DEFAULT '0.10',
  `b_isBan` int(2) DEFAULT NULL COMMENT '是否禁止商家',
  `s_type` varchar(40) DEFAULT NULL COMMENT '店铺类型ID',
  `s_stateType` varchar(40) DEFAULT NULL,
  `s_telephone` varchar(11) DEFAULT NULL COMMENT '店铺手机号码',
  `s_responsible` varchar(20) DEFAULT NULL COMMENT '店铺负责人',
  `s_rPhone` varchar(11) DEFAULT NULL COMMENT '联系人号码',
  `s_province` varchar(10) DEFAULT NULL COMMENT '店铺所在省',
  `s_city` varchar(10) DEFAULT NULL COMMENT '店铺所在市',
  `s_school` varchar(30) DEFAULT NULL COMMENT '店铺附近学校',
  `s_address` varchar(100) DEFAULT NULL COMMENT '店铺详细地址',
  `s_IdCardPos` varchar(100) DEFAULT NULL COMMENT '身份证正面',
  `s_IdCardBack` varchar(100) DEFAULT NULL COMMENT '身份证反面',
  `s_license` varchar(100) DEFAULT NULL COMMENT '营业执照许可证',
  `s_hygiene` varchar(100) DEFAULT NULL COMMENT '卫生许可证',
  `s_apply` datetime DEFAULT NULL COMMENT '申请时间',
  `s_hours` varchar(40) DEFAULT NULL COMMENT '营业时间',
  `s_notReason` varchar(255) DEFAULT NULL COMMENT '不通过理由',
  PRIMARY KEY (`b_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `business` */

insert  into `business`(`b_id`,`b_shopName`,`b_shopLogo`,`b_notice`,`b_accountId`,`b_accountPassword`,`b_commission`,`b_isBan`,`s_type`,`s_stateType`,`s_telephone`,`s_responsible`,`s_rPhone`,`s_province`,`s_city`,`s_school`,`s_address`,`s_IdCardPos`,`s_IdCardBack`,`s_license`,`s_hygiene`,`s_apply`,`s_hours`,`s_notReason`) values ('13609747823','麻辣小火锅','ggg2.jpg','有辣有不辣，但辣妹子都会来我这吃辣','qwexca',NULL,0.10,0,'1','已拒绝','13077569685','jack','13609747823','广东省','广州市','仲恺农业工程学院','东沙街24号','pos2.jpg','back2.jpg','license2.jpg','','2018-04-19 18:56:41','10:00-22:00','身份证过期'),('13660349798','纯情香锅',NULL,'越吃越纯情','egef',NULL,0.10,0,'1','营业中','13538428429','mary','13660349798','广西省','桂林市','艺术学院','某某街道8号',NULL,NULL,NULL,NULL,'2018-03-01 00:00:00','10:00-21:00',''),('13750412082','1纯情小店铺','ggg1.jpg','小店专卖纯品，有意私聊','sxfowjms',NULL,0.10,0,'1','未认证','13077569685','kolo','13750412082','广东省','广州市','仲恺农业工程学院','东沙街24号','pos1.jpg','back1.jpg','license1.jpg','hygiene1.jpg','2018-04-04 18:56:38','10:00-22:00','');

/*Table structure for table `collection` */

DROP TABLE IF EXISTS `collection`;

CREATE TABLE `collection` (
  `u_id` varchar(40) NOT NULL COMMENT '用户ID',
  `b_id` varchar(40) DEFAULT NULL COMMENT '商家ID',
  PRIMARY KEY (`u_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `collection` */

/*Table structure for table `feedback` */

DROP TABLE IF EXISTS `feedback`;

CREATE TABLE `feedback` (
  `f_id` varchar(40) NOT NULL COMMENT '评价ID',
  `f_receiveId` varchar(40) DEFAULT NULL COMMENT '用户ID',
  `f_content` varchar(255) DEFAULT NULL COMMENT '评价内容',
  `f_readed` int(2) DEFAULT NULL COMMENT '是否被回复了',
  `m_id` varchar(40) DEFAULT NULL COMMENT '商家回复则提示用户信息',
  `o_id` varchar(40) DEFAULT NULL COMMENT '对应的订单ID',
  PRIMARY KEY (`f_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `feedback` */

insert  into `feedback`(`f_id`,`f_receiveId`,`f_content`,`f_readed`,`m_id`,`o_id`) values ('3254','234','XXX的饭菜不好吃',0,'66b88f2e-154b-4167-83f2-9ad2b08dac02',NULL),('ff2ff354-0eae-45a6-814c-73e913610a0e','234','没有',0,'b5c07d7c-d628-4066-b187-76ffcf5e6e8e',NULL);

/*Table structure for table `good_type` */

DROP TABLE IF EXISTS `good_type`;

CREATE TABLE `good_type` (
  `g_type` varchar(20) DEFAULT NULL,
  `b_id` varchar(40) DEFAULT NULL,
  `g_typeName` varchar(40) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `good_type` */

insert  into `good_type`(`g_type`,`b_id`,`g_typeName`) values ('qwqw','ggg3','宵夜'),('tktk','ggg3','小吃');

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

insert  into `goods`(`g_id`,`b_id`,`g_name`,`g_detail`,`g_type`,`g_price`,`g_stock`,`g_picture`,`g_sale`,`g_add`) values ('asdq','ggg3','萝卜脆','非常好吃的小吃','小吃',3,65,'good2.jpg',1,'2018-04-13 10:17:43'),('dsfd','ggg4','番茄炒蛋','酸甜可口','宵夜',5,34,NULL,0,'2018-03-23 00:00:00'),('fgd','ggg4','扬州炒蛋','美味可口','小吃',5,65,NULL,1,'2018-05-04 00:00:00'),('qwew','ggg3','扬州炒饭','正宗炒饭，招牌菜','宵夜',8,95,'good1.jpg',1,'2018-04-07 10:16:43'),('sfd','sfd','薯条','好吃不腻','小吃',6,6,'good4.jpg',1,'2018-04-03 10:20:06');

/*Table structure for table `identification` */

DROP TABLE IF EXISTS `identification`;

CREATE TABLE `identification` (
  `s_id` varchar(40) NOT NULL COMMENT '商家认证ID',
  `s_type` varchar(40) DEFAULT NULL COMMENT '店铺类型ID',
  `s_stateId` varchar(40) DEFAULT NULL COMMENT '认证状态ID',
  `s_telephone` varchar(11) DEFAULT NULL COMMENT '店铺手机号码',
  `s_responsible` varchar(20) DEFAULT NULL COMMENT '店铺负责人',
  `s_province` varchar(10) DEFAULT NULL COMMENT '店铺所在省',
  `s_city` varchar(10) DEFAULT NULL COMMENT '店铺所在市',
  `s_school` varchar(30) DEFAULT NULL COMMENT '店铺附近学校',
  `s_address` varchar(100) DEFAULT NULL COMMENT '店铺详细地址',
  `s_IdCardPos` varchar(100) DEFAULT NULL COMMENT '身份证正面',
  `s_IdCardBack` varchar(100) DEFAULT NULL COMMENT '身份证反面 ',
  `s_license` varchar(100) DEFAULT NULL COMMENT '营业执照正面',
  `s_hygiene` varchar(100) DEFAULT NULL COMMENT '卫生许可证',
  `s_apply` datetime DEFAULT NULL COMMENT '申请时间',
  `s_hours` varchar(40) DEFAULT NULL COMMENT '营业时间',
  `s_notReason` varchar(255) DEFAULT NULL COMMENT '不通过理由',
  PRIMARY KEY (`s_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `identification` */

insert  into `identification`(`s_id`,`s_type`,`s_stateId`,`s_telephone`,`s_responsible`,`s_province`,`s_city`,`s_school`,`s_address`,`s_IdCardPos`,`s_IdCardBack`,`s_license`,`s_hygiene`,`s_apply`,`s_hours`,`s_notReason`) values ('sss1','1','3','13077569685','kolo','广东省','广州市','仲恺农业工程学院','东沙街24号','pos1.jpg','back1.jpg','license1.jpg',NULL,'2018-04-03 15:00:31','10:00-22:00',NULL),('sss2','2','3','13596543651','jack','广东省','广州市','仲恺农业工程学院','东沙街24号','pos2.jpg','back2.jpg','license2.jpg',NULL,'2018-04-12 15:02:27','10:00-22:00',NULL);

/*Table structure for table `message` */

DROP TABLE IF EXISTS `message`;

CREATE TABLE `message` (
  `m_id` varchar(40) NOT NULL COMMENT '消息中心ID',
  `m_receiveId` varchar(40) DEFAULT NULL COMMENT '消息接受者ID',
  `m_date` datetime DEFAULT NULL COMMENT '消息日期',
  `m_content` varchar(255) DEFAULT NULL COMMENT '消息内容',
  `m_readed` varchar(10) DEFAULT NULL COMMENT '消息是否已读',
  PRIMARY KEY (`m_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `message` */

/*Table structure for table `orderitem` */

DROP TABLE IF EXISTS `orderitem`;

CREATE TABLE `orderitem` (
  `o_id` varchar(40) DEFAULT NULL COMMENT '订单项ID',
  `g_id` varchar(40) DEFAULT NULL COMMENT '商品ID',
  `o_num` int(11) DEFAULT '1' COMMENT '商品数量'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `orderitem` */

insert  into `orderitem`(`o_id`,`g_id`,`o_num`) values ('35842b799d0a45418ce3b807aa3870b8','asd',2),('575210d0fc31429e86562fb168bc38a7','qwew',1);

/*Table structure for table `orders` */

DROP TABLE IF EXISTS `orders`;

CREATE TABLE `orders` (
  `o_id` varchar(40) NOT NULL COMMENT '订单号',
  `u_id` varchar(40) DEFAULT NULL COMMENT '用户ID',
  `o_money` double DEFAULT '0' COMMENT '配送费',
  `o_orderPrice` double DEFAULT '0' COMMENT '订单总价',
  `o_paymentState` varchar(10) DEFAULT NULL COMMENT '支付状态',
  `o_shopState` varchar(10) DEFAULT NULL COMMENT '订单状态（包括商家接单，送达等）',
  `b_id` varchar(40) DEFAULT NULL COMMENT '商家ID',
  `ad_endId` varchar(40) DEFAULT NULL COMMENT '收货地址',
  `o_remark` varchar(100) DEFAULT NULL COMMENT '备注信息',
  `o_sendTime` datetime DEFAULT NULL COMMENT '送达时间',
  `o_openTime` datetime DEFAULT NULL COMMENT '下单时间',
  `o_finishTime` datetime DEFAULT NULL COMMENT '完成时间',
  PRIMARY KEY (`o_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `orders` */

insert  into `orders`(`o_id`,`u_id`,`o_money`,`o_orderPrice`,`o_paymentState`,`o_shopState`,`b_id`,`ad_endId`,`o_remark`,`o_sendTime`,`o_openTime`,`o_finishTime`) values ('171027b4db4e47afb942380141319b6f','ttt1',2,65.63,'已支付','1','ggg3','shouhuodizhi_ID','我要猛辣，谢谢。不辣退货！','2018-04-25 12:20:30','2018-04-26 16:17:11',NULL),('s1','ttt1',1,0,'0','2',NULL,'e1','一定要女的送','2017-10-10 12:00:00','2017-10-10 11:00:00','2017-10-10 12:34:00'),('s2','u2',2,0,'0','1',NULL,'e1','要帅哥送',NULL,NULL,NULL);

/*Table structure for table `remainingsum` */

DROP TABLE IF EXISTS `remainingsum`;

CREATE TABLE `remainingsum` (
  `rs_id` varchar(40) NOT NULL COMMENT '余额ID',
  `b_id` varchar(40) DEFAULT NULL COMMENT '商家ID',
  `rs_depositMoney` double DEFAULT NULL COMMENT '未提现现金',
  `rs_totalMoney` double DEFAULT NULL COMMENT '总金额',
  PRIMARY KEY (`rs_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `remainingsum` */

/*Table structure for table `shopcart` */

DROP TABLE IF EXISTS `shopcart`;

CREATE TABLE `shopcart` (
  `u_id` varchar(40) NOT NULL COMMENT '用户ID',
  `b_id` varchar(40) DEFAULT NULL COMMENT '商家ID',
  `g_id` varchar(40) DEFAULT NULL COMMENT '商品ID',
  `num` int(11) DEFAULT NULL COMMENT '商品数量',
  PRIMARY KEY (`u_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `shopcart` */

/*Table structure for table `shoptype` */

DROP TABLE IF EXISTS `shoptype`;

CREATE TABLE `shoptype` (
  `shoptype_id` varchar(40) NOT NULL COMMENT '店铺类型ID',
  `shoptype` varchar(20) DEFAULT NULL COMMENT '店铺类型',
  PRIMARY KEY (`shoptype_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `shoptype` */

insert  into `shoptype`(`shoptype_id`,`shoptype`) values ('1','美食'),('2','超市'),('3','水果'),('4','其他');

/*Table structure for table `user` */

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `u_id` varchar(40) NOT NULL COMMENT '用户ID',
  `u_picture` varchar(50) DEFAULT NULL COMMENT '头像',
  `u_password` varchar(40) DEFAULT NULL COMMENT '密码',
  `u_account` double DEFAULT NULL COMMENT '账户余额',
  `u_nickname` varchar(40) DEFAULT NULL,
  `u_isban` int(11) DEFAULT NULL,
  PRIMARY KEY (`u_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `user` */

insert  into `user`(`u_id`,`u_picture`,`u_password`,`u_account`,`u_nickname`,`u_isban`) values ('14bbe2aa233e4c8bb9d0085965d51959','14bbe2aa233e4c8bb9d0085965d51959_ccc.jpg','12',12,'好学生',1),('46fb5d55fb3b42bf97566d951e8a3157','46fb5d55fb3b42bf97566d951e8a3157_fff.jpg','123456',6,'大可爱',0),('8cf278b42c5045c6b7876d38003c0656','8cf278b42c5045c6b7876d38003c0656_bbb.jpg','123',234.3,'忧郁女孩',0),('91087153883a4da0bdc5b6f33c9e01fa','91087153883a4da0bdc5b6f33c9e01fa_libai.jpg','123',123.45,'李白',0),('c7b682b6de3c4e659064e206b5464103','c7b682b6de3c4e659064e206b5464103_aaa.jpg','123',12.34,'潮流boy',0),('ccfe091677f64fe2af71565c78c18df2','ccfe091677f64fe2af71565c78c18df2_ddd.jpg','123456',12,'薛之谦的老婆',1);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
