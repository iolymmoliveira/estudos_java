/*
Dados os conjuntos A = {1, 2, 6, 7, 9, 15}
				   B = {2, 5, 6, 8, 15, 16}
				   C = {6, 15, 16, 17, 19, 20}
Criar uma tabela com duas colunas (numero, conjunto) e inserir os dados acima. Realizar os seguintes selects:
A ∩ B ∩ C
A ∩ B - (A ∩ B ∩ C)
B ∩ C - (A ∩ B ∩ C)
A ∩ C - (A ∩ B ∩ C)
 */

create database conjuntos;
use conjuntos;

create table conjuntosInterseccao (
	conjunto varchar(10) not null,
    numero integer not null
);

select * from conjuntosInterseccao;

insert into conjuntosInterseccao (numero, conjunto) values (1, 'A'), 
														   (2, 'A'), 
														   (6, 'A'),
														   (7, 'A'), 
														   (9, 'A'), 
														   (15, 'A');
                                                           
insert into conjuntosInterseccao (numero, conjunto) values (2, 'B'),
														   (5, 'B'),
                                                           (6, 'B'),
                                                           (8, 'B'),
                                                           (15, 'B'),
                                                           (16, 'B');
                                                           
insert into conjuntosInterseccao (numero, conjunto) values (6, 'C'),
														   (15, 'C'),
                                                           (16, 'C'),
                                                           (17, 'C'),
                                                           (19, 'C'),
                                                           (20, 'C');
													
/* A ∩ B ∩ C ==> Reposta: {6, 15} */
select numero from conjuntosInterseccao group by numero having count(*) = 3;

/* select * from conjuntosInterseccao where conjunto = 'A' and conjunto = 'B' and conjunto = 'C' group by numero; */

/* A ∩ B - (A ∩ B ∩ C) ==> Reposta: {2} */
select * from conjuntosInterseccao group by numero having count(*) = 2 ; /* Consegui selecionar os numeros que se repetem duas vezes, porém tenho que retirar o número 16 porque ele está contido em B e também está contido em C*/
                          

set @numerosDeA = (select conjunto from conjuntosInterseccao);
IdsOfBIntersectA = select from B in (IdsOfA)
select from C i (idsOfA) and (IdsOfBIntersectA)

/* B ∩ C - (A ∩ B ∩ C) ==> Reposta: {16}*/

/* A ∩ C - (A ∩ B ∩ C) ==> Reposta: { }*/

