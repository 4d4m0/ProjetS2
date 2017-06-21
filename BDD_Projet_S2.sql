drop table if exists Bouteille cascade;

create table Bouteille (
nom text primary key,
region text ,
pays text ,
millesime text,
cuvee text,
robe text,
temperature text,
fournisseur text,
degre text,
volume text,
effervescent text,
note text,
quantite text,
disponibilite text,
emplacement text, --REFERENCES Emplacement(id),
commentaire text
);

insert into Bouteille values
	('Chateau Lecroc','Bordeau','France',null,2002,'rouge',12,'Cuvelier Fauvarque',10,75,'non',4,4,true,'commentaire rien a dire'),
	('Chateau Leduc','Jura','France','2003',2003,'rouge', 13, 'Cuvelier Fauvarque',10,75,'non',3,4,true,'Viande rouge');
	('Chateau Lassalle','Jura','France','2003',2003,'rouge', 13, 'Cuvelier Fauvarque',10,1.5,'non',3,4,true,'Viande rouge');

-- Afficher une bouteille --> test OK <--

/*select nom, robe from Bouteille
	where cuvee = 2002;
*/

create table Emplacement(
	id int primary key,
	nbBtll int ,
	nbBttlMax int CHECK (nbBttl<=nbBttlMax),
	superficie int,
	temperature int,
	humidite int
);

insert into Emplacement values
	(1,24,2,10,5),
	(2,24,2,12,5);

-- Afficher Emplacement --> test OK <--
select id, temperature from Emplacement 
	where nbBtll = 24;

create table Fournisseur (
	nom text primary key,
	adresse text,
	CP text,
	ville text,
	tel text
);

insert into Fournisseur values
	('Cuvelier Fauvarque','Rue des vignes','0123456','Bordeau','01.02.03.04.05');

-- afficher fournisseur -->test OK <--
select * from Fournisseur 
	where ville ='Bordeau';

CREATE FUNCTION alerte_placeMax() RETURNS trigger AS $$
DECLARE
	cpt int=
BEGIN

IF    THEN
ELSE
	RAISE NOTICE 'Il n y a plus de place dans cet emplacement veuillez consommer la bouteille immediatement'
END;
$$LANGUAGE plpgsql;
CREATE TRIGGER trigger_placeMax AFTER INSERT ON Bouteille
	FOR EACH ROW EXECUTE PROCEDURE alerte_placeMax();
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

-- trigger --> alerte nb_bouteille trop petit
CREATE TRIGGER trigger_Bttl AFTER DELETE ON Bouteille
	FOR EACH ROW EXECUTE PROCEDURE alerte_Bttl(); 

--DELETE all pour function et trigger alerte Bttl
DROP FUNCTION alerte_Bttl() CASCADE;

--DELETE une bouteille
DELETE FROM bouteille
	WHERE nom = 'Chateau Lecroc';

