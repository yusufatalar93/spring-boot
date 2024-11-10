CREATE TABLE IF NOT EXISTS users
(
    id        BIGINT AUTO_INCREMENT PRIMARY KEY,
    email     VARCHAR(255) NOT NULL,
    firstname VARCHAR(255) NULL DEFAULT NULL,
    lastname  VARCHAR(255) NULL DEFAULT NULL,
    password  VARCHAR(255) NOT NULL,
    role      TINYINT      NOT NULL
    ) DEFAULT CHARSET = utf8mb4
    COLLATE = utf8mb4_unicode_ci;