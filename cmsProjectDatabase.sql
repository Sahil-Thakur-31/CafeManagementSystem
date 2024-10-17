create database cms;
CREATE TABLE `cms`.`user` (
  `userFullName` VARCHAR(50) NOT NULL,
  `username` VARCHAR(45) NOT NULL,
  `mobNumber` VARCHAR(10) NOT NULL,
  `password` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`username`))
COMMENT = 'database for login user';
CREATE TABLE `cms`.`customer` (
  `customerId` INT NOT NULL AUTO_INCREMENT,
  `customerFullName` VARCHAR(45) NOT NULL,
  `mobNumber` VARCHAR(10) NOT NULL,
  `emailId` VARCHAR(45) NOT NULL,
  `address` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`customerId`));
  CREATE TABLE `cms`.`item` (
  `itemID` INT NOT NULL AUTO_INCREMENT,
  `itemName` VARCHAR(45) NOT NULL,
 `itemSerialNum` VARCHAR(45) NOT NULL,
  `itemPhoto` VARCHAR(45) NOT NULL,
  `tax` VARCHAR(30) NOT NULL,
  `Quantity` INT NOT NULL,
  `price` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`itemID`));
CREATE TABLE `cms`.`order` (
  `orderId` INT NOT NULL AUTO_INCREMENT,
  `customerName` VARCHAR(45) NOT NULL,
  `customerMobNum` VARCHAR(45) NOT NULL,
  `orderDate` VARCHAR(45) NOT NULL COMMENT 'create order Table ',
  `itemsList` VARCHAR(300) NOT NULL,
  `orderPrice` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`orderId`))
COMMENT = '\n\n\n\n\n';

