create database db_pizzaria;
use db_pizzaria;

create table tbl_usuario(
	id int primary key auto_increment,
	email varchar(255) not null,
    senha varchar(255) not null,
    tipo_perfil enum('admin', 'funcionario', 'cliente') default 'cliente'
);

create table tbl_funcionario(
	cpf varchar(15) primary key,
    nome varchar(255) not null,
    data_nascimento date,
    cargo varchar(50) not null,
    salario double not null,
    id_usuario int,
    
    foreign key(id_usuario) references tbl_usuario(id) 
);

create table tbl_endereco(
    cep int(9) primary key,
    logradouro varchar(90),
    bairro varchar(50),
    cidade varchar(50),
    estado char(2)
);

create table tbl_cliente(
	cpf varchar(15) primary key,
    nome varchar(255) not null,
    data_nascimento date, 
    telefone varchar(25) not null,
    id_usuario int,
    cep int(9),
    numero varchar(10),
    complemento varchar(20),
    
    foreign key(id_usuario) references tbl_usuario(id),
    foreign key(cep) references tbl_endereco(cep)
);

create table tbl_produto(
	id int primary key auto_increment,
    nome nvarchar(100) not null,
    tipo nvarchar(50),
    descricao nvarchar(255),
    preco_unitario double not null
);

create table tbl_pagamento(
	id int primary key auto_increment,
    forma_pagamento enum('pix', 'débito', 'vouncher', 'crédito', 'dinheiro') not null,
    valor decimal(10, 2) not null
);

create table tbl_pedido(
	id int primary key auto_increment,
    data_pedido datetime,
    cpf_cliente varchar(15),
    id_pagamento int,
    
    foreign key(cpf_cliente) references tbl_cliente(cpf),
    foreign key(id_pagamento) references tbl_pagamento(id)
);

create table tbl_itempedido(
	qtde int(10),
    id_pedido int(10),
    id_produto int(10),
    valor decimal(10, 2),
    
    foreign key(id_pedido) references tbl_pedido(id),
    foreign key(id_produto) references tbl_produto(id)
);

create table tbl_entrega(
	id_entrega int primary key auto_increment, 
    cpf_entregador varchar(15) not null,
    id_pedido int not null,
    
    foreign key(cpf_entregador) references tbl_funcionario(cpf),
    foreign key(id_pedido) references tbl_pedido(id)
);