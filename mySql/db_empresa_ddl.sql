insert into departamento (nome, andar) values ('Presidencia', 1);
insert into departamento values (null, 'Engenharia', 1);
insert into departamento values (null, 'Infraestrutura', 2),
                                (null, 'Telecomunicacoes', 3),
                                (null, 'Desenvolvimento', 4);
                                
select * from departamento;

insert into projeto values (null, 'Sistema Gestao Escolar'),
						   (null, 'Dashboard Mercado Fincanceiro'),
						   (null, 'Folha de Pagamento'),
						   (null, 'Ecommerce');

select * from projeto;

insert into funcionario values (null, 'Jose Alberto', 'jose@empresa.com', 10000, 1, null),
                               (null, 'Ana Pinheiro', 'ana@empresa.com', 8000, 2, 1),
                               (null, 'Pedro Oliveira', 'pedro@empresa.com', 6000, 3, 2);
                               
select * from funcionario;

insert into funcionario values (null, 'Gilmar Menezes', 'gilmar@empresa.com', 5000, 4, 2),
                               (null, 'Alberto Nunes', 'alberto@empresa.com', 5000, 5, 3),
                               (null, 'Maria da Gloria', 'mariag@empresa.com', 5230, 5, 3),
                               (null, 'Paula de Luca', 'paula@empresa.com', 4930, 5, 3),
                               (null, 'Joao das Neves', 'joao@empresa.com', 4580, 5, 3);
                               
select * from funcionario;

insert into participa values (null, 5, 1, '2021-01-04', '2021-06-30');
insert into participa values (null, 6, 2, '2021-01-04', '2021-06-30'),
							 (null, 7, 3, '2021-01-04', '2021-01-31'),
                             (null, 8, 4, '2021-01-04', '2021-01-31');
                             
select * from participa;
