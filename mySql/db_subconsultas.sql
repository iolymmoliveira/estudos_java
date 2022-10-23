/* 1. Quero saber o nome do projeto e quantos funcionários há em cada um dos projetos */
	select * from projeto;
    select * from participa;
    
    insert into participa values (null, 3, 2, '2021-01-04', '2021-06-30'),
								 (null, 4, 3, '2021-01-04', '2021-01-31');
                                 
	select projeto.descricao as 'Projeto', count(participa.codigo) as 'Numero de Funcionarios'
			from projeto 
            inner join participa 
            on projeto.codigo = participa.codigo
            group by participa.codigo;

/* 2. Vamos saber a média salarial de cada projeto */
	select projeto.descricao as 'Projeto', avg(salario) as 'Media Salarial'
			from funcionario
            inner join participa
				on funcionario.num_funcional = participa.num_funcional
			inner join projeto
				on participa.codigo = projeto.codigo
			group by participa.codigo;

/* 3. Quero saber o custo operacional (soma dos salários) por departamento */
	select departamento.nome, sum(salario) as 'Custo Operacional Departamento'
			from funcionario inner join departamento
            on funcionario.numero_id = departamento.numero_id
            group by departamento.numero_id;


/* 4. Quero saber o custo operacional (soma dos salários) por projeto */
	select projeto.descricao as 'Projeto', sum(salario) as 'Custo Operacional Projeto'
			from funcionario
            inner join participa
				on funcionario.num_funcional = participa.num_funcional
			inner join projeto
				on participa.codigo = projeto.codigo
			group by participa.codigo;

/* 5. Quais são os funcionários da empresa do Departamento de Desenvolvimento (5) que ganham mais do que a média salarial dos participantes do projeto Ecommerce (4) */
	select funcionario.nome, salario from funcionario
		where numero_id = 5 and salario > ( select avg(salario) from participa
												inner join funcionario
                                                on participa.num_funcional = funcionario.num_funcional
                                                where codigo = 4);