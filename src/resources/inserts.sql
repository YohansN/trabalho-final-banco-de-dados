INSERT INTO tipo_fase (descricao) VALUES ('monofasico');
INSERT INTO tipo_fase (descricao) VALUES ('bifasico');
INSERT INTO tipo_fase (descricao) VALUES ('trifasico');

INSERT INTO tipo_pessoa (descricao) VALUES ('pessoa-fisica');
INSERT INTO tipo_pessoa (descricao) VALUES ('pessoa-juridica');

INSERT INTO classe (descricao, tipo_fase_id) VALUES ('A+', 1);
INSERT INTO classe (descricao, tipo_fase_id) VALUES ('A', 2);
INSERT INTO classe (descricao, tipo_fase_id) VALUES ('B', 3);
INSERT INTO classe (descricao, tipo_fase_id) VALUES ('B-', 2);
INSERT INTO classe (descricao, tipo_fase_id) VALUES ('C', 1);
INSERT INTO classe (descricao, tipo_fase_id) VALUES ('D', 2);
INSERT INTO classe (descricao, tipo_fase_id) VALUES ('E', 3);
INSERT INTO classe (descricao, tipo_fase_id) VALUES ('F', 1);

INSERT INTO pessoa (nome, cpf, tipo_pessoa_id ) VALUES ('Yohans', 11234567811, 1);
INSERT INTO pessoa (nome, cpf, tipo_pessoa_id ) VALUES ('Maria', 44332454342, 2);
INSERT INTO pessoa (nome, cpf, tipo_pessoa_id ) VALUES ('Joao', 11234567811, 1);
INSERT INTO pessoa (nome, cpf, tipo_pessoa_id ) VALUES ('Julia', 12332112332, 2);
INSERT INTO pessoa (nome, cpf, tipo_pessoa_id ) VALUES ('Pedro', 98734576548, 1);
INSERT INTO pessoa (nome, cpf, tipo_pessoa_id ) VALUES ('Bolsonaro', 45317828791, 1);

INSERT INTO cliente (num_documento, num_cliente, pessoa_id) VALUES ('123', '542', 1);
INSERT INTO cliente (num_documento, num_cliente, pessoa_id) VALUES ('456', '123', 4);
INSERT INTO cliente (num_documento, num_cliente, pessoa_id) VALUES ('789', '763', 5);

INSERT INTO funcionario(codigo_funcional, pessoa_id) VALUES  (666, 6);

INSERT INTO rota (descricao) VALUES ('Macaranau');
INSERT INTO rota (descricao) VALUES ('Caucaia');
INSERT INTO rota (descricao) VALUES ('Fortaleza');

INSERT INTO poste (latitude, longitude, codigo, observacao) VALUES ('123', '-234', 289213, 'poste massa');
INSERT INTO poste (latitude, longitude, codigo, observacao) VALUES ('435', '321', 123567, 'poste top');
INSERT INTO poste (latitude, longitude, codigo, observacao) VALUES ('-348', '34', 890342, 'poste brabo');

INSERT INTO medidor (descricao, rota_id, poste_id) VALUES ('medidor novo', 3, 1);
INSERT INTO medidor (descricao, rota_id, poste_id) VALUES ('medidor velhor', 1, 2);
INSERT INTO medidor (descricao, rota_id, poste_id) VALUES ('medidor quebrado', 2, 3);

INSERT INTO contrato (descricao, data_inicio, data_criacao, medidor_id, classe_id, cliente_id) VALUES ('contrato N1', '2023-05-17 12:30:43', '2023-05-17 09:15:42', 1, 1, 1);
INSERT INTO contrato (descricao, data_inicio, data_criacao, medidor_id, classe_id, cliente_id) VALUES ('contrato N2', '2023-03-24 10:44:15', '2023-03-24 08:30:35', 2, 3, 3);
INSERT INTO contrato (descricao, data_inicio, data_criacao, medidor_id, classe_id, cliente_id) VALUES ('contrato N3', '2023-01-12 17:20:12', '2023-01-12 12:05:14', 3, 4, 2);

SELECT * FROM tipo_pessoa;
SELECT * FROM tipo_fase;
SELECT * FROM classe;
SELECT * FROM pessoa;
SELECT * FROM cliente;
SELECT * FROM funcionario;
SELECT * FROM rota;
SELECT * FROM poste;
SELECT * FROM medidor;
SELECT * FROM contrato;
SELECT * FROM boleto_energia;