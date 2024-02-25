CREATE TABLE T_Main (
    ID_main INT PRIMARY KEY,
    Main_TotalVal INT
);


CREATE TABLE T_Cards_Pack (
	ID_Cards_Pack INT PRIMARY KEY ,
	Cards_Pack_Size INT
);

CREATE TABLE T_Player (
	ID_Player INT PRIMARY KEY ,
	Player_Username VARCHAR(25)	,
	Player_Balance INT,
	ID_main	INT ,
	FOREIGN KEY (ID_main) REFERENCES T_Main(ID_main)

);


CREATE TABLE T_Croupier (
	ID_croupier INT PRIMARY KEY ,
	valeurTotalLimit INT ,
	ID_main INT,
	FOREIGN KEY (ID_main) REFERENCES T_Main(ID_main)
);

CREATE TABLE T_cards (
    id_card SERIAL PRIMARY KEY,
    Card_Color VARCHAR(20),
    Card_Value INTEGER
);



INSERT INTO T_cards (Card_Color, Card_Value) VALUES
    ('Pikes ♠', 1), ('Pikes ♠', 2), ('Pikes ♠', 3),
    ('Pikes ♠', 4), ('Pikes ♠', 5), ('Pikes ♠', 6),
    ('Pikes ♠', 7), ('Pikes ♠', 8), ('Pikes ♠', 9),
    ('Pikes ♠', 10), ('Pikes ♠', 10), ('Pikes ♠', 10), ('Pikes ♠', 10),
    ('Tiles ♦', 1), ('Tiles ♦', 2), ('Tiles ♦', 3),
    ('Tiles ♦', 4), ('Tiles ♦', 5), ('Tiles ♦', 6),
    ('Tiles ♦', 7), ('Tiles ♦', 8), ('Tiles ♦', 9),
    ('Tiles ♦', 10), ('Tiles ♦', 10), ('Tiles ♦', 10), ('Tiles ♦', 10),
    ('Clovers ♣', 1), ('Clovers ♣', 2), ('Clovers ♣', 3),
    ('Clovers ♣', 4), ('Clovers ♣', 5), ('Clovers ♣', 6),
    ('Clovers ♣', 7), ('Clovers ♣', 8), ('Clovers ♣', 9),
    ('Clovers ♣', 10), ('Clovers ♣', 10), ('Clovers ♣', 10), ('Clovers ♣', 10),
    ('Hearts ♥', 1), ('Hearts ♥', 2), ('Hearts ♥', 3),
    ('Hearts ♥', 4), ('Hearts ♥', 5), ('Hearts ♥', 6),
    ('Hearts ♥', 7), ('Hearts ♥', 8), ('Hearts ♥', 9),
    ('Hearts ♥', 10), ('Hearts ♥', 10), ('Hearts ♥', 10), ('Hearts ♥', 10);
	
SELECT * FROM t_cards;



	