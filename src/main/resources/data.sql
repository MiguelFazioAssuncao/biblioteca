INSERT INTO livro (titulo, autor, anoPublicacao)
VALUES
    ('Dom Casmurro', 'Machado de Assis', 1899),
    ('O Primo Basílio', 'José de Alencar', 1878),
    ('Memórias Póstumas de Brás Cubas', 'Machado de Assis', 1881);

INSERT INTO membro (nome, endereco, telefone)
VALUES
    ('João Silva', 'Rua A, 123, São Paulo', '11999999999'),
    ('Maria Oliveira', 'Rua B, 456, Rio de Janeiro', '21988888888'),
    ('Carlos Souza', 'Rua C, 789, Belo Horizonte', '31977777777');

INSERT INTO emprestimo (id_livro, id_membro, data_emprestimo, data_devolucao)
VALUES
    (1, 1, '2025-01-20', '2025-02-20'),
    (2, 2, '2025-01-22', '2025-02-22'),
    (3, 3, '2025-01-25', '2025-02-25');

INSERT INTO visitante (nome, telefone)
VALUES
    ('Pedro Lima', '11966666666'),
    ('Ana Costa', '21955555555'),
    ('Lucas Almeida', '31944444444');

INSERT INTO bibliotecario (nome, email, senha)
VALUES
    ('Roberta Silva', 'roberta@biblioteca.com', 'senha123'),
    ('Carlos Pereira', 'carlos@biblioteca.com', 'senha456'),
    ('Fernanda Souza', 'fernanda@biblioteca.com', 'senha789');
