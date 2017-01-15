CREATE SCHEMA `curso_nodejs_test` ;

CREATE TABLE `curso_nodejs_test`.`livros` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `titulo` VARCHAR(255) NULL,
  `descricao` TEXT NULL,
  `preco` DECIMAL(10,2) NULL,
  PRIMARY KEY (`id`));
