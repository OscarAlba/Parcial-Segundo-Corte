-- -----------------------------------------------------
-- Table `SUSCRIPTORES`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `SUS_SUSCRIPTORES` (
  `id` INT NOT NULL,
  `nombre` VARCHAR(45) NOT NULL,
  `anyo_nacimiento` INT NOT NULL,
  `total_suscripciones` INT NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `COMENTARIOS`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `SUS_COMENTARIOS` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `comentario` VARCHAR(200) NOT NULL,
  `puntaje` INT NOT NULL,
  `fecha` DATETIME NOT NULL,
  `CLIENTES_id` INT NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_COMENTARIOS_CLIENTES_idx` (`CLIENTES_id` ASC),
  CONSTRAINT `fk_COMENTARIOS_CLIENTES`
    FOREIGN KEY (`CLIENTES_id`)
    REFERENCES `SUS_SUSCRIPTORES` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;