INSERT INTO plan (nombre, duracion_meses, precio)
SELECT 'Plan mensual', 1, 120000 WHERE NOT EXISTS (SELECT 1 FROM plan WHERE nombre = 'Plan mensual');
INSERT INTO plan (nombre, duracion_meses, precio)
SELECT 'Plan trimestral', 3, 330000 WHERE NOT EXISTS (SELECT 1 FROM plan WHERE nombre = 'Plan trimestral');
INSERT INTO plan (nombre, duracion_meses, precio)
SELECT 'Plan anual', 12, 1200000 WHERE NOT EXISTS (SELECT 1 FROM plan WHERE nombre = 'Plan anual');
