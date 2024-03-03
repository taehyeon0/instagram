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