INSERT INTO country(code,name,continent,region,surfacearea,indepyear,population,lifeexpectancy,gnp,gnpold,localname,governmentform,headofstate,capital,code2) VALUES ('AFG', 'Afghanistan', 'Asia', 'Southern and Central Asia', 652090, 1919, 22720000, 45.9000015, 5976.00, NULL, 'Afganistan/Afqanestan', 'Islamic Emirate', 'Mohammad Omar', 1, 'AF');
INSERT INTO country(code,name,continent,region,surfacearea,indepyear,population,lifeexpectancy,gnp,gnpold,localname,governmentform,headofstate,capital,code2) VALUES ('NLD', 'Netherlands', 'Europe', 'Western Europe', 41526, 1581, 15864000, 78.3000031, 371362.00, 360478.00, 'Nederland', 'Constitutional Monarchy', 'Beatrix', 5, 'NL');
INSERT INTO country(code,name,continent,region,surfacearea,indepyear,population,lifeexpectancy,gnp,gnpold,localname,governmentform,headofstate,capital,code2) VALUES ('ANT', 'Netherlands Antilles', 'North America', 'Caribbean', 800, NULL, 217000, 74.6999969, 1941.00, NULL, 'Nederlandse Antillen', 'Nonmetropolitan Territory of The Netherlands', 'Beatrix', 33, 'AN');
INSERT INTO country(code,name,continent,region,surfacearea,indepyear,population,lifeexpectancy,gnp,gnpold,localname,governmentform,headofstate,capital,code2) VALUES ('ALB', 'Albania', 'Europe', 'Southern Europe', 28748, 1912, 3401200, 71.5999985, 3205.00, 2500.00, 'Shqipëria', 'Republic', 'Rexhep Mejdani', 34, 'AL');
INSERT INTO country(code,name,continent,region,surfacearea,indepyear,population,lifeexpectancy,gnp,gnpold,localname,governmentform,headofstate,capital,code2) VALUES ('DZA', 'Algeria', 'Africa', 'Northern Africa', 2381741, 1962, 31471000, 69.6999969, 49982.00, 46966.00, 'Al-Jazair/Algérie', 'Republic', 'Abdelaziz Bouteflika', 35, 'DZ');
INSERT INTO country(code,name,continent,region,surfacearea,indepyear,population,lifeexpectancy,gnp,gnpold,localname,governmentform,headofstate,capital,code2) VALUES ('ASM', 'American Samoa', 'Oceania', 'Polynesia', 199, NULL, 68000, 75.0999985, 334.00, NULL, 'Amerika Samoa', 'US Territory', 'George W. Bush', 54, 'AS');
INSERT INTO country(code,name,continent,region,surfacearea,indepyear,population,lifeexpectancy,gnp,gnpold,localname,governmentform,headofstate,capital,code2) VALUES ('AND', 'Andorra', 'Europe', 'Southern Europe', 468, 1278, 78000, 83.5, 1630.00, NULL, 'Andorra', 'Parliamentary Coprincipality', '', 55, 'AD');
INSERT INTO country(code,name,continent,region,surfacearea,indepyear,population,lifeexpectancy,gnp,gnpold,localname,governmentform,headofstate,capital,code2) VALUES ('AGO', 'Angola', 'Africa', 'Central Africa', 1246700, 1975, 12878000, 38.2999992, 6648.00, 7984.00, 'Angola', 'Republic', 'José Eduardo dos Santos', 56, 'AO');
INSERT INTO country(code,name,continent,region,surfacearea,indepyear,population,lifeexpectancy,gnp,gnpold,localname,governmentform,headofstate,capital,code2) VALUES ('AIA', 'Anguilla', 'North America', 'Caribbean', 96, NULL, 8000, 76.0999985, 63.20, NULL, 'Anguilla', 'Dependent Territory of the UK', 'Elisabeth II', 62, 'AI');
INSERT INTO country(code,name,continent,region,surfacearea,indepyear,population,lifeexpectancy,gnp,gnpold,localname,governmentform,headofstate,capital,code2) VALUES ('ATG', 'Antigua and Barbuda', 'North America', 'Caribbean', 442, 1981, 68000, 70.5, 612.00, 584.00, 'Antigua and Barbuda', 'Constitutional Monarchy', 'Elisabeth II', 63, 'AG');


INSERT INTO city(id,name,countrycode,district,population) VALUES (1, 'Kabul', 'AFG', 'Kabol', 1780000);
INSERT INTO city(id,name,countrycode,district,population) VALUES (2, 'Qandahar', 'AFG', 'Qandahar', 237500);
INSERT INTO city(id,name,countrycode,district,population) VALUES (3, 'Herat', 'AFG', 'Herat', 186800);
INSERT INTO city(id,name,countrycode,district,population) VALUES (4, 'Mazar-e-Sharif', 'AFG', 'Balkh', 127800);
INSERT INTO city(id,name,countrycode,district,population) VALUES (5, 'Amsterdam', 'NLD', 'Noord-Holland', 731200);
INSERT INTO city(id,name,countrycode,district,population) VALUES (6, 'Rotterdam', 'NLD', 'Zuid-Holland', 593321);
INSERT INTO city(id,name,countrycode,district,population) VALUES (7, 'Haag', 'NLD', 'Zuid-Holland', 440900);
INSERT INTO city(id,name,countrycode,district,population) VALUES (8, 'Utrecht', 'NLD', 'Utrecht', 234323);
INSERT INTO city(id,name,countrycode,district,population) VALUES (9, 'Eindhoven', 'NLD', 'Noord-Brabant', 201843);
INSERT INTO city(id,name,countrycode,district,population) VALUES (10, 'Tilburg', 'NLD', 'Noord-Brabant', 193238);

INSERT INTO countrylanguage(countrycode,language,isofficial,percentage,id) VALUES ('AFG', 'Pashto', true, 52.4000015, 1);
INSERT INTO countrylanguage(countrycode,language,isofficial,percentage,id) VALUES ('NLD', 'Dutch', true, 95.5999985, 2);
INSERT INTO countrylanguage(countrycode,language,isofficial,percentage,id) VALUES ('ANT', 'Papiamento', true, 86.1999969, 3);
INSERT INTO countrylanguage(countrycode,language,isofficial,percentage,id) VALUES ('ALB', 'Albaniana', true, 97.9000015, 4);
INSERT INTO countrylanguage(countrycode,language,isofficial,percentage,id) VALUES ('DZA', 'Arabic', true, 86, 5);
INSERT INTO countrylanguage(countrycode,language,isofficial,percentage,id) VALUES ('ASM', 'Samoan', true, 90.5999985, 6);
INSERT INTO countrylanguage(countrycode,language,isofficial,percentage,id) VALUES ('AND', 'Spanish', false, 44.5999985, 7);
INSERT INTO countrylanguage(countrycode,language,isofficial,percentage,id) VALUES ('AGO', 'Ovimbundu', false, 37.2000008, 8);
INSERT INTO countrylanguage(countrycode,language,isofficial,percentage,id) VALUES ('AIA', 'English', true, 0, 9);
INSERT INTO countrylanguage(countrycode,language,isofficial,percentage,id) VALUES ('ATG', 'Creole English', false, 95.6999969, 10);
