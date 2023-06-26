SELECT P.nome, P.cpf, P.cnpj, P.tipo_pessoa_id, C.num_cliente, C.num_documento, R.descricao, M.descricao, P.id FROM rota AS R
INNER JOIN medidor M ON (M.rota_id = R.id)
INNER JOIN poste AS PO ON (M.poste_id = PO.id)
INNER JOIN contrato AS CO ON (CO.medidor_id = M.id)
INNER JOIN cliente C ON (CO.cliente_id = C.id)
INNER JOIN pessoa P ON (C.pessoa_id = P.ID)
INNER JOIN tipo_pessoa AS TP ON (P.tipo_pessoa_id = TP.id)
WHERE C.id = ?;