CREATE TABLE IF NOT EXISTS livro
(
    id BIGSERIAL PRIMARY KEY,
    titulo VARCHAR(100) NOT NULL,
    autor VARCHAR(80),
    anoPublicacao INT
);

CREATE TABLE IF NOT EXISTS membro
(
    id   BIGSERIAL PRIMARY KEY,
    nome VARCHAR(80) NOT NULL,
    endereco VARCHAR(255) NOT NULL ,
    telefone VARCHAR(12) NOT NULL
);

CREATE TABLE IF NOT EXISTS emprestimo
(
    id           BIGSERIAL PRIMARY KEY,
    id_livro     BIGINT NOT NULL,
    id_membro    BIGINT NOT NULL,
    data_emprestimo DATE NOT NULL,
    data_devolucao DATE NOT NULL,
    FOREIGN KEY (id_livro) REFERENCES livro (id),
    FOREIGN KEY (id_membro) REFERENCES membro (id)
);

CREATE TABLE IF NOT EXISTS visitante
(
    id   BIGSERIAL PRIMARY KEY,
    nome VARCHAR(80) NOT NULL,
    telefone VARCHAR(12) NOT NULL
);

CREATE TABLE IF NOT EXISTS bibliotecario
(
    id   BIGSERIAL PRIMARY KEY,
    nome VARCHAR(80) NOT NULL,
    email VARCHAR(255) NOT NULL,
    senha VARCHAR(55) NOT NULL
);

