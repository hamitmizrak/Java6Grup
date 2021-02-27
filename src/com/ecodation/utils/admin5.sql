	CREATE TABLE `hastane_otomasyonu`.`admin5` (
	  `id` INT NOT NULL AUTO_INCREMENT,
	  `name` VARCHAR(450) NULL,
	  `surname` VARCHAR(450) NULL,
	  `password` VARCHAR(450) NULL,
	  `email_address` VARCHAR(450) NULL,
	  `creation_date` TIMESTAMP NULL DEFAULT CURRENT_TIMESTAMP,
	  PRIMARY KEY (`id` ));
