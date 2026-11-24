INSERT INTO plan (id, nombre, duracion_meses, precio)
SELECT 1, 'Plan mensual', 1, 120000 WHERE NOT EXISTS (SELECT 1 FROM plan WHERE id = 1);
INSERT INTO plan (id, nombre, duracion_meses, precio)
SELECT 2, 'Plan trimestral', 3, 330000 WHERE NOT EXISTS (SELECT 1 FROM plan WHERE id = 2);
INSERT INTO plan (id, nombre, duracion_meses, precio)
SELECT 3, 'Plan anual', 12, 1200000 WHERE NOT EXISTS (SELECT 1 FROM plan WHERE id = 3);
SELECT setval(pg_get_serial_sequence('plan', 'id'), (SELECT MAX(id) FROM plan));
