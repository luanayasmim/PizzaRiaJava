-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema db_pizzaria
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema db_pizzaria
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `db_pizzaria` DEFAULT CHARACTER SET utf8 ;
USE `db_pizzaria` ;

-- -----------------------------------------------------
-- Table `db_pizzaria`.`entrega`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `db_pizzaria`.`entrega` (
  `idendereco` VARCHAR(255) NOT NULL,
  `telefone` VARCHAR(25) NOT NULL,
  `nome` VARCHAR(255) NOT NULL,
  PRIMARY KEY (`idendereco`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `db_pizzaria`.`pagamento`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `db_pizzaria`.`pagamento` (
  `idforma_de_pagamento` BIGINT NOT NULL AUTO_INCREMENT,
  `cartao` DOUBLE NULL,
  `pix` DOUBLE NULL,
  `dinheiro` DOUBLE NULL,
  `entrega_idendereco` VARCHAR(255) NOT NULL,
  PRIMARY KEY (`idforma_de_pagamento`, `entrega_idendereco`),
  INDEX `fk_pagamento_entrega1_idx` (`entrega_idendereco` ASC) VISIBLE,
  CONSTRAINT `fk_pagamento_entrega1`
    FOREIGN KEY (`entrega_idendereco`)
    REFERENCES `db_pizzaria`.`entrega` (`idendereco`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `db_pizzaria`.`produtos`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `db_pizzaria`.`produtos` (
  `idcod_produto` VARCHAR(255) NOT NULL,
  `nome_produto` VARCHAR(255) NOT NULL,
  `quantidade_produto` INT NOT NULL,
  `precoUnid` DOUBLE NULL,
  `preco_Total` DOUBLE NULL,
  `pagamento_idforma_de_pagamento` BIGINT NOT NULL,
  PRIMARY KEY (`idcod_produto`, `pagamento_idforma_de_pagamento`),
  INDEX `fk_produtos_pagamento1_idx` (`pagamento_idforma_de_pagamento` ASC) VISIBLE,
  CONSTRAINT `fk_produtos_pagamento1`
    FOREIGN KEY (`pagamento_idforma_de_pagamento`)
    REFERENCES `db_pizzaria`.`pagamento` (`idforma_de_pagamento`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `db_pizzaria`.`tela_do_usuario`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `db_pizzaria`.`tela_do_usuario` (
  `idcpf` INT NOT NULL,
  `pedidos` VARCHAR(255) NULL,
  `notificacao` VARCHAR(255) NULL,
  PRIMARY KEY (`idcpf`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `db_pizzaria`.`cadastro_cliente`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `db_pizzaria`.`cadastro_cliente` (
  `idcpf` VARCHAR(15) NULL,
  `nome` VARCHAR(255) NULL,
  `email` VARCHAR(255) NULL,
  `nascimento` VARCHAR(25) NULL,
  `telefone` VARCHAR(25) NULL,
  `senha` VARCHAR(255) NULL,
  `login` VARCHAR(255) NULL,
  `bairro` VARCHAR(25) NULL,
  `endereco` VARCHAR(255) NULL,
  `tela_do_usuario_idcpf` INT NULL,
  PRIMARY KEY (`idcpf`),
  INDEX `fk_cadastro_cliente_produtos1_idx` (`endereco` ASC) VISIBLE,
  INDEX `fk_cadastro_cliente_tela_do_usuario1_idx` (`tela_do_usuario_idcpf` ASC) VISIBLE,
  CONSTRAINT `fk_cadastro_cliente_produtos1`
    FOREIGN KEY (`endereco`)
    REFERENCES `db_pizzaria`.`produtos` (`idcod_produto`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_cadastro_cliente_tela_do_usuario1`
    FOREIGN KEY (`tela_do_usuario_idcpf`)
    REFERENCES `db_pizzaria`.`tela_do_usuario` (`idcpf`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `db_pizzaria`.`ingredientes`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `db_pizzaria`.`ingredientes` (
  `idcod_ingredientes` INT NOT NULL,
  `quantidade` INT NOT NULL,
  `valor_unid` DOUBLE NOT NULL,
  PRIMARY KEY (`idcod_ingredientes`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `db_pizzaria`.`contas a pagar`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `db_pizzaria`.`contas a pagar` (
  `idcodCompra` INT NOT NULL,
  `data` DATE NOT NULL,
  `descricao` VARCHAR(255) NOT NULL,
  `valor` DOUBLE NOT NULL,
  `ingredientes_idcod_ingredientes` INT NOT NULL,
  PRIMARY KEY (`idcodCompra`, `ingredientes_idcod_ingredientes`),
  INDEX `fk_contas a pagar_ingredientes1_idx` (`ingredientes_idcod_ingredientes` ASC) VISIBLE,
  CONSTRAINT `fk_contas a pagar_ingredientes1`
    FOREIGN KEY (`ingredientes_idcod_ingredientes`)
    REFERENCES `db_pizzaria`.`ingredientes` (`idcod_ingredientes`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `db_pizzaria`.`fornecedor`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `db_pizzaria`.`fornecedor` (
  `idcnpj` VARCHAR(25) NULL,
  `nome` VARCHAR(255) NULL,
  `endereco` VARCHAR(255) NULL,
  `telefone` VARCHAR(255) NULL,
  `contas a pagar_idcodCompra` INT NULL,
  PRIMARY KEY (`idcnpj`),
  INDEX `fk_fornecedor_contas a pagar1_idx` (`contas a pagar_idcodCompra` ASC) VISIBLE,
  CONSTRAINT `fk_fornecedor_contas a pagar1`
    FOREIGN KEY (`contas a pagar_idcodCompra`)
    REFERENCES `db_pizzaria`.`contas a pagar` (`idcodCompra`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `db_pizzaria`.`funcionarios`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `db_pizzaria`.`funcionarios` (
  `idcod_funcionario` INT NOT NULL,
  `nome` VARCHAR(255) NULL,
  PRIMARY KEY (`idcod_funcionario`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `db_pizzaria`.`horario`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `db_pizzaria`.`horario` (
  `idhorario_dia` INT NOT NULL,
  `horario_funcionamento` DOUBLE NOT NULL,
  `funcionarios_idcod_funcionario` INT NOT NULL,
  `fornecedor_idcnpj` VARCHAR(25) NOT NULL,
  `cadastro_cliente_idcpf` VARCHAR(15) NOT NULL,
  PRIMARY KEY (`idhorario_dia`, `fornecedor_idcnpj`, `cadastro_cliente_idcpf`),
  INDEX `fk_horario_funcionarios_idx` (`funcionarios_idcod_funcionario` ASC) VISIBLE,
  INDEX `fk_horario_fornecedor1_idx` (`fornecedor_idcnpj` ASC) VISIBLE,
  INDEX `fk_horario_cadastro_cliente1_idx` (`cadastro_cliente_idcpf` ASC) VISIBLE,
  CONSTRAINT `fk_horario_funcionarios`
    FOREIGN KEY (`funcionarios_idcod_funcionario`)
    REFERENCES `db_pizzaria`.`funcionarios` (`idcod_funcionario`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_horario_fornecedor1`
    FOREIGN KEY (`fornecedor_idcnpj`)
    REFERENCES `db_pizzaria`.`fornecedor` (`idcnpj`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_horario_cadastro_cliente1`
    FOREIGN KEY (`cadastro_cliente_idcpf`)
    REFERENCES `db_pizzaria`.`cadastro_cliente` (`idcpf`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
