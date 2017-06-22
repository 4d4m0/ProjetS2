drop table if exists Bouteille cascade;
drop table if exists Emplacement cascade;
drop table if exists Fournisseur cascade;

create table Emplacement(
	id int primary key,
	nbBttl int,
	nbBttlMax int ,
	superficie int,
	temperature int,
	humidite int
);

insert into Emplacement values
	(1,0,24,2,10,5),
	(2,0,54,8,8,5),
	(2,0,24,2,12,5);

-- Afficher Emplacement --> test OK <--
/*select id, temperature from Emplacement 
	where nbBtll = 24;
*/

create table Bouteille (
nom text primary key,
region text ,
pays text ,
millesime int,	-- annee remarquable
cuvee int, 	-- pcq date va donner un moi et un jour
robe text,
temperature real,
fournisseur text,
degre real,
volume real,
effervescent boolean,
note real,
quantite int,
disponibilite boolean,
emplacement int REFERENCES Emplacement(id),
commentaire text
);

--vider la table Bouteille
TRUNCATE TABLE Bouteille;

insert into Bouteille values
	('Chateau Lecroc','Bordeau','France',null,2002,'rouge',12,'Cuvelier Fauvarque',10,75,false,4,4,true,1,'commentaire rien a dire'),
	('Chateau Leduc','Jura','France','2003',2003,'rouge', 13, 'Cuvelier Fauvarque',10,75,false,3,4,true,2,'Viande rouge'),
	('Chateau Lassalle','Jura','France','2003',2003,'rouge', 13, 'Cuvelier Fauvarque',10,150,true,3,4,true,1,'Viande rouge'),
	('Chateau Pipeau','Saint-Emilion','France',2012,2012,'rouge',10,'La maison du vin',13.5,75,false,4,12,true,3,'Viandes rouges grillées, Fromages, Desserts au chocolat'),
	('Le vin de merde','Mèze','France',null,2017,'blanc',10,'Carrefour',12.5,75,false,1,6,true,1,'N achetez pas ce vin')
	('Chateau Beau Soleil','Thenay','France',null,2012,'blanc',8,'La maison du vin',12.5,75,true,3,6,true,'commentaire indisponible')

-- Afficher une bouteille --> test OK <--
/*select nom, robe from Bouteille
	where cuvee = 2002;
*/

create table Fournisseur (
	nom text primary key,
	adresse text,
	CP char(5) check (cp ~'^\d{5}$'),
	ville text,
	tel text
);

insert into Fournisseur values
	('Cuvelier Fauvarque','20 Rue des vignes','0123456','Bordeau','01.02.03.04.05'),
	('Fournisseur 1', '21 rue des vignes','020604','Sains les marquion','01.03.05.07.09'),
	('La maison du vin','45 avenue Colbert',58000,'Nevers','03.86.61.67.56'),
	('Carrefour','Quartier de l Epinette',59600,'Maubeuge','03.27.69.35.79'),

-- afficher fournisseur -->test OK <--
/*select * from Fournisseur 
	where ville ='Bordeau';
*/

--DELETE all pour fonction et trigger alerte_PlaceMax
DROP FUNCTION alerte_placeMax() CASCADE;

--Fonction Alerte placeMax

/*CREATE FUNCTION alerte_placeMax() RETURNS trigger AS $$
BEGIN
UPDATE Emplacement SET nbBttl = nbBttl + NEW.quantite
	Where type = 'insert';
	IF  nbBttl>nbBttlMax  THEN
		RAISE NOTICE 'Il n y a plus de place dans cet emplacement veuillez consommer la bouteille immediatement';
	END IF;
		RETURN NEW;
END;
$$LANGUAGE plpgsql;

CREATE TRIGGER trigger_placeMax AFTER INSERT ON Bouteille
	FOR EACH ROW EXECUTE PROCEDURE alerte_placeMax();
*/


--DELETE all pour function et trigger alerte Bttl
DROP FUNCTION alerte_Bttl() CASCADE;

--Fonction alerte Bouteille
CREATE FUNCTION alerte_Bttl() RETURNS trigger AS $$
DECLARE 
	cpt int=count(nom) FROM Bouteille;
BEGIN
	IF cpt<3 THEN
		RAISE NOTICE 'Il ne reste plus que % bouteille',cpt;
	END IF;
	RETURN NEW;
END;
$$LANGUAGE plpgsql;

CREATE TRIGGER trigger_Bttl AFTER DELETE ON Bouteille
	FOR EACH ROW EXECUTE PROCEDURE alerte_Bttl(); 


--DELETE une bouteille
DELETE FROM bouteille
	WHERE nom = 'Chateau Lecroc';

