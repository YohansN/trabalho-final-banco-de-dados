SELECT pessoa.id, pessoa.nome, pessoa.cpf, pessoa.cnpj, pessoa.tipo_pessoa_id, cliente.num_cliente, cliente.num_documento, rota.descricao, medidor.descricao
FROM rota
INNER JOIN medidor ON (medidor.rota_id = rota.id)
INNER JOIN poste ON (medidor.poste_id = poste.id)
INNER JOIN contrato ON (contrato.medidor_id = medidor.id)
INNER JOIN cliente ON (contrato.cliente_id = cliente.id)
INNER JOIN pessoa ON (cliente.pessoa_id = pessoa.id)
INNER JOIN tipo_pessoa ON (pessoa.tipo_pessoa_id = tipo_pessoa.id)
WHERE cliente.id = ?;