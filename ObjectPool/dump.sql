CREATE TABLE `students` (
  `id` mediumint(8) unsigned NOT NULL auto_increment,
  `name` varchar(255) default NULL,
  `email` varchar(255) default NULL,
  `address` varchar(255) default NULL,
  `country` varchar(100) default NULL,
  `phone` varchar(100) default NULL,
  PRIMARY KEY (`id`)
) AUTO_INCREMENT=1;


INSERT INTO `myTable` (`name`,`email`,`address`,`country`,`phone`)
VALUES
  ("Buffy Valenzuela","ornare.libero@icloud.ca","Ap #610-7997 Vulputate, Rd.","Austria","1-316-646-9535"),
  ("Brandon Fowler","habitant.morbi@protonmail.ca","6188 In Ave","Russian Federation","(106) 720-5565"),
  ("Zeph Quinn","bibendum.sed.est@yahoo.couk","728 Ultricies Ave","Sweden","(966) 157-4827"),
  ("Simon Dickerson","elit.elit.fermentum@outlook.org","Ap #206-2147 Lorem Av.","Vietnam","1-454-423-4524"),
  ("Magee York","nullam.feugiat.placerat@yahoo.edu","P.O. Box 606, 3535 Praesent Rd.","India","(785) 243-1155");
