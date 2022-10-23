/* 1. Recuperar todos os Departamentos*/
	select * from departamento;
    select numero_id, nome, andar from departamento;
    select departamento.numero_id, departamento.nome, departamento.andar from departamento;
    select numero_id as 'identificacao',
				nome as 'departamento',
			   andar as 'numero do andar' from departamento; /* o select com o as apelida o cabeçalho*/

/* 2. Recuperar todos os Funcionarios*/
	select * from funcionario;
	

/* 3. Recuperar os funcionarios em ordem alfabetica*/
	select * from funcionario order by nome;

/* 4. Recuperar quantos funcionarios ha na empresa*/
	select count(num_funcional) as 'quantidade' from funcionario;

/* 5. Recuperar quantos funcionarios ha por departamento*/
	select count(numero_id) as 'quantidade', numero_id as 'departamento' from funcionario group by numero_id;

/* 6. Recuperar qual o numero do departamento que tem + de 2 funcionarios*/
	select count(numero_id) as 'quantidade', numero_id as 'departamento' from funcionario group by numero_id having count(numero_id) > 2;
    
/* 7. Filtrar todos os funcionarios que ganham acima de 5000*/
	select * from funcionario where salario > 5000;

/* 8. Filtrar todos os funcionarios que começam com a letra P*/
	select * from funcionario where nome like 'P%';
    
/* 9. Consultar todos os funcionarios que tenham 'da' em alguma parte do nome*/
	select * from funcionario where nome like '% da %';
    select * from funcionario where nome like '%da%';

/* 10. Consultar todos os funcionarios que tenham o nome Menezes*/
	select * from funcionario where nome like '% Menezes';

/* 11. Consultar todos os funcionarios que possuem um chefe*/
	 select * from funcionario where num_chefe is not null; /* Se o campo está preechido, ou seja diferente de null, é porque há um chefe */
    select * from funcionario where num_chefe is null; /* Se o campo está null é porque ele não possui chefe, logo é o chefe de todos*/
   
