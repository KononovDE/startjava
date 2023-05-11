CREATE DATABASE Jaeger;

\c jaeger

DROP TABLE IF EXISTS Jaeger;

CREATE TABLE Jaeger (
	id SERIAL PRIMARY KEY, 
	modelName TEXT,
	mark      TEXT,
	height    INTEGER,
              CONSTRAINT heightNotNegative
              CHECK(height > 0),
	weight    INTEGER,
              CONSTRAINT weightNotNegative
              CHECK(weight > 0),
	status    TEXT,
	origin    TEXT,
	launch    DATE,
	kaijuKill INTEGER
);

\i 'init_db.sql'

\i 'queries.sql'