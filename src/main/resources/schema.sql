DROP TABLE IF EXISTS feed;

CREATE TABLE feed
(
    feed_id INT,
    user_id INT,
    content varchar(2200),
    created_at datetime,
    created_by varchar(100),
    modified_at datetime,
    modified_by varchar(100)
);

DROP TABLE IF EXISTS USER;

CREATE TABLE USER
(
    user_id INT ,
    user_nickname	varchar(60),
    password		varchar(60),
    email			varchar(60),
    name			varchar(60),
    phone			varchar(20),
    content			varchar(100),
    created_at		datetime,
    created_by		varchar(100),
    modified_at		datetime,
    modified_by		varchar(100)
) ;