/**
 * Author:  Quemuel
 * Created: 23/09/2019
 *
 * Este script contém os comandos SQL necessários para criar as tabelas 
 * da base de dados bd_locadora
 */
--criando tabela tb_cliente
CREATE TABLE tb_cliente(
	id SERIAL PRIMARY KEY,
	nome varchar(100),
	cpf varchar(50),
	email varchar(50),
	telefone varchar(50)	
);

--criando tabela tb_filme
CREATE TABLE tb_filme(
	id SERIAL PRIMARY KEY,
	nome varchar(50),
	valor double precision,
	classificacao varchar(50)
);

--criando tabela tb_locacao
CREATE TABLE tb_locacao(
	id SERIAL PRIMARY KEY,
	cliente varchar(100) ,
        valor double precision,
	data varchar(20),
        filme1 varchar(50),
        filme2 varchar(50),
        filme3 varchar(50)
);




