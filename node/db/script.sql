CREATE SCHEMA `curso_nodejs` ;

CREATE TABLE `curso_nodejs`.`livros` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `titulo` VARCHAR(255) NULL,
  `descricao` TEXT NULL,
  `preco` DECIMAL(10,2) NULL,
  PRIMARY KEY (`id`));


INSERT INTO `curso_nodejs`.`livros`(`titulo`, `descricao`, `preco`) VALUES('Comecando com nodejs','livro sobre nodejs', 40);
INSERT INTO `curso_nodejs`.`livros`(`titulo`, `descricao`, `preco`) VALUES('Comecando com javascript','livro sobre javascript', 40);
INSERT INTO `curso_nodejs`.`livros`(`titulo`, `descricao`, `preco`) VALUES('Comecando com express','livro sobre express', 40);
INSERT INTO `curso_nodejs`.`livros`(`titulo`, `descricao`, `preco`) VALUES('Indo alem com javascript','javascript avancado', 39.9);
