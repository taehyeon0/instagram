INSERT INTO FEED (feed_id, user_id, content, created_at, created_by, modified_at, modified_by)
values (1, 1, 'abc', '2021-05-30 23:53:46', 'than', '2021-05-30 23:53:46', 'than');

INSERT INTO USER (user_id, user_nickname, password, email, name, phone , content, created_at, created_by, modified_at, modified_by)
VALUES (1, 'admin', '1234', 'test@naver.com', '어드민', '010-1234-5678', 'test', CURDATE(), 'admin', CURDATE(), 'admin');