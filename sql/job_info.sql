DROP TABLE IF EXISTS `job_info`;
CREATE TABLE `job_info` (
  `id` int(9) NOT NULL AUTO_INCREMENT,
  `company_id` int(9) DEFAULT NULL,
  `company` varchar(100) DEFAULT NULL,
  `position_id` int(9) DEFAULT NULL,
  `position` varchar(100) DEFAULT NULL,
  `position_advantage` varchar(100) DEFAULT NULL,
  `salary` varchar(50) DEFAULT NULL,
  `education` varchar(20) DEFAULT NULL,
  `position_url` varchar(150) DEFAULT NULL,
  `address` varchar(100) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1423 DEFAULT CHARSET=utf8;
