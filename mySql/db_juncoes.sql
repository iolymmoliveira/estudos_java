select * from departamento; /* Tabela departamento que possui 3 colunas e 5 tuplas */
select * from funcionario; /* Tabela Funcionario que possui 6 colunas e 8 tuplas */

select * from departamento JOIN funcionario; /* Resulta um nova tabela com 9 colunas e 40 tuplas*/

select * from departamento inner join funcionario on departamento.numero_id = funcionario.numero_id;

/* 1. Consultar todos os funcionarios e seus respectivos departamentos */
select funcionario.nome as 'Funcionario', 
      departamento.nome as 'Departamento' 
      from departamento inner join funcionario 
      on departamento.numero_id = funcionario.numero_id; /* Pode ser substituido pela linha abaixo que é um padrão do mysql*/
   /* using (numero_id);                                *//* Apenas em casos em que temos tabelas distintas com o nomes de campos que coincidem - iguais*/

/* 2. Consultar todos os funcionarios e o nome do chefe*/
select subordinado.nome as 'Nome do Funcionario', 
	         chefe.nome as 'Nome do Chefe'
			from funcionario subordinado 
            inner join funcionario chefe 
            on subordinado.num_chefe = chefe.num_funcional;
            
/* 3. Consultar quais os funcionarios trabalham em quais projetos */
	select * from funcionario;
    select * from projeto;
    select * from participa;
    
    select * from
		funcionario inner join participa
        on funcionario.num_funcional = participa.num_funcional
        inner join projeto
        on participa.codigo = projeto.codigo;
	/* ou */
	select num_contrato as 'Numero do Contrato',
		   nome as 'Funcionario',
           descricao as 'Projeto'
        from funcionario inner join participa
        on funcionario.num_funcional = participa.num_funcional
        inner join projeto
        on participa.codigo = projeto.codigo;