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

DROP TABLE IF EXISTS instauser;

CREATE TABLE instauser
(
    user_id INT NOT NULL ,
    user_nickname	varchar(60) NOT NULL ,
    password		varchar(60) NOT NULL ,
    email			varchar(60) NOT NULL ,
    name			varchar(60) NOT NULL ,
    phone			varchar(20) NOT NULL ,
    content			varchar(100) NOT NULL ,
    created_at		datetime NOT NULL ,
    created_by		varchar(100) NOT NULL ,
    modified_at		datetime NOT NULL ,
    modified_by		varchar(100) NOT NULL
) ;