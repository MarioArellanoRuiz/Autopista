-- MySQL Script generated by MySQL Workbench
-- Thu Jun 29 10:30:57 2017
-- Model: New Model    Version: 1.0
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `mydb` DEFAULT CHARACTER SET utf8 ;
-- -----------------------------------------------------
-- Schema DB_Autopista
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema DB_Autopista
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `DB_Autopista` ;
-- -----------------------------------------------------
-- Table `mydb`.`table1`
-- -----------------------------------------------------
USE `DB_Autopista` ;

-- -----------------------------------------------------
-- Table `DB_Autopista`.`Cobrador`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `DB_Autopista`.`Cobrador` (
  `idNumeroEmpleado` INT NOT NULL,
  `Nombre` VARCHAR(45) NULL,
  `FechaIngreso` DATE NULL,
  PRIMARY KEY (`idNumeroEmpleado`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `DB_Autopista`.`PeriodosTarifas`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `DB_Autopista`.`PeriodosTarifas` (
  `idPeriodoTarifa` INT NOT NULL,
  `FechaInicio` DATE NULL,
  `FechaFinal` DATE NULL,
  `M` INT NULL,
  `A` INT NULL,
  `AR1` INT NULL,
  `AR2` INT NULL,
  `AR3` INT NULL,
  `B2` INT NULL,
  `B3` INT NULL,
  `B4` INT NULL,
  `C2` INT NULL,
  `C3` INT NULL,
  `C4` INT NULL,
  `C5` INT NULL,
  `C6` INT NULL,
  `C7` INT NULL,
  `C8` INT NULL,
  `C9` INT NULL,
  `EEL` INT NULL,
  `EEP` INT NULL,
  PRIMARY KEY (`idPeriodoTarifa`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `DB_Autopista`.`Supervisor`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `DB_Autopista`.`Supervisor` (
  `idNumeroEmpleado` INT NOT NULL,
  `Nombre` VARCHAR(45) NULL,
  `FechaIngreso` DATE NULL,
  PRIMARY KEY (`idNumeroEmpleado`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `DB_Autopista`.`Evento`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `DB_Autopista`.`Evento` (
  `idFolioSistema` INT NOT NULL,
  `PlazaCobro` VARCHAR(45) NULL,
  `FechaOperativa` DATE NULL,
  `FechaHoraEvento` DATETIME NULL,
  `Turno` VARCHAR(45) NULL,
  `Via` VARCHAR(45) NULL,
  `Ticket` INT NULL,
  `ModoPago` VARCHAR(45) NULL,
  `ModoPaso` VARCHAR(45) NULL,
  `ModoPasoVerificado` VARCHAR(45) NULL,
  `TarjetaTelepeaje` VARCHAR(45) NULL,
  `ClaseTabulada` VARCHAR(45) NULL,
  `ClaseDetectada` VARCHAR(45) NULL,
  `ClaseVerificada` VARCHAR(4) NULL,
  `Importe` INT NULL,
  `Observaciones` VARCHAR(100) NULL,
  `Supervisor_idNumeroEmpleado` INT NOT NULL,
  `Cobrador_idNumeroEmpleado` INT NOT NULL,
  `PeriodosTarifas_idPeriodoTarifa` INT NOT NULL,
  PRIMARY KEY (`idFolioSistema`, `Supervisor_idNumeroEmpleado`, `Cobrador_idNumeroEmpleado`, `PeriodosTarifas_idPeriodoTarifa`),
  INDEX `fk_Evento_Supervisor1_idx` (`Supervisor_idNumeroEmpleado` ASC),
  INDEX `fk_Evento_Cobrador1_idx` (`Cobrador_idNumeroEmpleado` ASC),
  INDEX `fk_Evento_PeriodosTarifas1_idx` (`PeriodosTarifas_idPeriodoTarifa` ASC),
  CONSTRAINT `fk_Evento_Supervisor1`
    FOREIGN KEY (`Supervisor_idNumeroEmpleado`)
    REFERENCES `DB_Autopista`.`Supervisor` (`idNumeroEmpleado`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Evento_Cobrador1`
    FOREIGN KEY (`Cobrador_idNumeroEmpleado`)
    REFERENCES `DB_Autopista`.`Cobrador` (`idNumeroEmpleado`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Evento_PeriodosTarifas1`
    FOREIGN KEY (`PeriodosTarifas_idPeriodoTarifa`)
    REFERENCES `DB_Autopista`.`PeriodosTarifas` (`idPeriodoTarifa`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `DB_Autopista`.`Certificacion`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `DB_Autopista`.`Certificacion` (
  `idCertificacion` INT NOT NULL,
  `Faltante` INT NULL,
  `Sobrante` INT NULL,
  `Discrepancias` INT NULL,
  `FechaOperativa` DATE NULL,
  `Cobrador_idNumeroEmpleado` INT NOT NULL,
  PRIMARY KEY (`idCertificacion`, `Cobrador_idNumeroEmpleado`),
  INDEX `fk_Certificacion_Cobrador1_idx` (`Cobrador_idNumeroEmpleado` ASC),
  CONSTRAINT `fk_Certificacion_Cobrador1`
    FOREIGN KEY (`Cobrador_idNumeroEmpleado`)
    REFERENCES `DB_Autopista`.`Cobrador` (`idNumeroEmpleado`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `DB_Autopista`.`Eludidos`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `DB_Autopista`.`Eludidos` (
  `idEludidos` INT NOT NULL,
  `FormaEludir` VARCHAR(45) NULL,
  `EfectivoArrojado` INT NULL,
  `Evento_idFolioSistema` INT NOT NULL,
  `Evento_Supervisor_idNumeroEmpleado` INT NOT NULL,
  `Evento_Cobrador_idNumeroEmpleado` INT NOT NULL,
  `Evento_PeriodosTarifas_idPeriodoTarifa` INT NOT NULL,
  PRIMARY KEY (`idEludidos`, `Evento_idFolioSistema`, `Evento_Supervisor_idNumeroEmpleado`, `Evento_Cobrador_idNumeroEmpleado`, `Evento_PeriodosTarifas_idPeriodoTarifa`),
  INDEX `fk_Eludidos_Evento1_idx` (`Evento_idFolioSistema` ASC, `Evento_Supervisor_idNumeroEmpleado` ASC, `Evento_Cobrador_idNumeroEmpleado` ASC, `Evento_PeriodosTarifas_idPeriodoTarifa` ASC),
  CONSTRAINT `fk_Eludidos_Evento1`
    FOREIGN KEY (`Evento_idFolioSistema` , `Evento_Supervisor_idNumeroEmpleado` , `Evento_Cobrador_idNumeroEmpleado` , `Evento_PeriodosTarifas_idPeriodoTarifa`)
    REFERENCES `DB_Autopista`.`Evento` (`idFolioSistema` , `Supervisor_idNumeroEmpleado` , `Cobrador_idNumeroEmpleado` , `PeriodosTarifas_idPeriodoTarifa`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
