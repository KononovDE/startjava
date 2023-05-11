\echo 'Select entire table'
SELECT *
  FROM Jaeger;

\echo 'Select only non-destroyed robots'
SELECT *
  FROM Jaeger
 WHERE status <> 'Destroyed';

\echo 'Select multiple series: Mark-1 and Mark-4'
SELECT *
  FROM Jaeger
 WHERE mark IN ('Mark-1', 'Mark-4');

\echo 'Select all robots except Mark-1 and Mark-4'
SELECT *
  FROM Jaeger
 WHERE mark NOT IN ('Mark-1', 'Mark-4');

\echo 'Sort table in descending order by column mark'
SELECT *
  FROM Jaeger
 ORDER BY mark DESC;

\echo 'Select information about the oldest robot'
SELECT *
  FROM Jaeger
 ORDER BY launch LIMIT 1;

\echo 'Select robots that have destroyed the most kaiju'
SELECT *
  FROM Jaeger
 WHERE kaijukill =
       (SELECT MAX(kaijukill)
          FROM Jaeger);

\echo 'Select average weight of robots'
SELECT AVG(weight)
  FROM Jaeger;

\echo 'Increase by one the number of destroyed kaiju for robots that have not yet been destroyed'
UPDATE Jaeger
   SET kaijukill = kaijukill + 1
 WHERE status <> 'Destroyed';

\echo 'Delete destroyed robots'
DELETE FROM Jaeger
 WHERE status = 'Destroyed';

