CREATE TABLE IF NOT EXISTS token
(
    expired    TINYINT      NOT NULL,
    revoked    TINYINT      NOT NULL,
    id         BIGINT AUTO_INCREMENT PRIMARY KEY,
    user_id    BIGINT       NOT NULL,
    token      VARCHAR(255) NOT NULL,
    token_type TINYINT      NOT NULL
    ) DEFAULT CHARSET = utf8mb4
    COLLATE = utf8mb4_unicode_ci;
