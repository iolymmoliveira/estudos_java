create database db_empresa;

use db_empresa;

create table departamento (
	numero_id integer not null auto_increment primary key,
    nome varchar(100) not null,
    andar integer not null
);

create table projeto (
	codigo integer not null auto_increment,
    descricao varchar(100) not null,
    constraint pk_projeto primary key (codigo) /* Usado para chaves compostas*/
);

create table funcionario(
	num_funcional integer not null auto_increment primary key,
    nome varchar(100) not null,
    email varchar(100) not null unique,
    salario double not null,
    numero_id integer,
    num_chefe integer,
    
    constraint fk_depto foreign key (numero_id) references departamento(numero_id),
    constraint fk_chefe foreign key (num_chefe) references funcionario(num_funcional)
);

create table participa (
	num_contrato integer not null auto_increment primary key,
    num_funcional integer not null,
    codigo integer not null,
    data_ini date not null,
    data_fim date not null,
    constraint fk_func foreign key (num_funcional) references funcionario(num_funcional),
    constraint fk_proj foreign key (codigo) references projeto (codigo)
);

