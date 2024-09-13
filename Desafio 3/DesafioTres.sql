-- Criação da tabela de carros
CREATE TABLE carros (
    id INT PRIMARY KEY,
    marca VARCHAR(50) NULL,
    modelo VARCHAR(50) NULL,
    ano VARCHAR(4) NOT NULL,
    cor INTEGER,
    preco DECIMAL(10, 2)
);

-- Inserção de dados
INSERT INTO carros (id, marca, modelo, ano, cor, preco) VALUES (1, 'Toyota', 'Corolla', '2020', 'Azul', 85000.50);
INSERT INTO carros (id, marca, modelo, ano, cor, preco) VALUES (2, 'Honda', 'Civic', '2019', 3, 95000);
INSERT INTO carros (id, marca, modelo, ano, cor, preco) VALUES (3, 'Ford', 'Focus', '202a', 'Vermelho', 70000);
INSERT INTO carros (id, marca, modelo, ano, cor, preco) VALUES (4, 'Chevrolet', 'Onix', '2018', NULL, -50000);