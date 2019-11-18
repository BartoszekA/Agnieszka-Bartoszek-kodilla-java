1. Dodanie nowych postów do tabeli POSTS

INSERT INTO POSTS (USER_ID, BODY)
VALUES (1, "And you?");

INSERT INTO POSTS (USER_ID, BODY)
VALUES (2, "Fine, thanks! Hello Thomas!");

INSERT INTO POSTS (USER_ID, BODY)
VALUES (1, "Hi Thomas!");

COMMIT;


2. Modyfikacje w rekordach

UPDATE POSTS
SET BODY = "To delete"
WHERE ID >= 7 AND ID <= 9;

COMMIT;

3. Usuwanie nowych postów

DELETE FROM POSTS
WHERE ID >= 7 AND ID <= 9;

COMMIT;