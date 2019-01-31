CREATE TABLE IF NOT EXISTS Account(
    id int auto_increment COMMENT 'ユーザID',
    email VARCHAR(255) NOT NULL COMMENT 'メールアドレス',
    password VARCHAR(255) NOT NULL COMMENT 'パスワード',
    unique index (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

Insert into Account(email, password) values(‘xxxx’,’xxxx’);