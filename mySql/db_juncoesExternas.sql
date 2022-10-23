select * from funcionario;
select * from departamento;

insert into departamento values(null, 'DevOps', 3);

/* Consultar a partir do departamento quais são os funcionarios que trabalham nele - inner join*/
	select * from departamento inner join funcionario /* Neste casso o inner join não trará nenhum funcionario, visto que nao ha funcionario registrado nele*/
		on departamento.numero_id = funcionario.numero_id;
        
/* Consultar a partir do departamento quais são os funcionarios que trabalham nele - outer join*/
        select * from departamento left outer join funcionario /* Neste casso o left demonstra que a tabela a esquerda é a dominante, ou seja a tabela departamento é a dominante. Como resultado trará todos os departamentos, eles tendo registro de funcionario ou nao. */
		on departamento.numero_id = funcionario.numero_id;
        
/* Consultar quais os departamentos não possuem funcionarios alocados*/
/*Neste caso funcionario é a tabela dominante, porém não trará nenhum resultado, pois não ha funcionario que esteja sem alocacao de departamento */
	select * from departamento right outer join funcionario
		on departamento.numero_id = funcionario.numero_id
        where num_funcional is null;
        
/* Consultar todos os funcionarios e seus respectivos chefes*/
	select funcionario.nome as 'Funcionario', chefe.nome as 'Chefe'
		from funcionario left outer join funcionario chefe
        on funcionario.num_chefe = chefe.num_funcional;
        