drop table if exists Bouteille cascade;

create table Bouteille (
nom text primary key,
region text ,
pays text ,
millesime text,
cuvee int, -- int et pas date pcq on repere  a l'annee et pas au jj-mm-aaaa 
robe text,
temperature int,
fournisseur text,
degre int,
volume int,
effervescent text,
note int,
quantite int,
disponibilite boolean,
emplacement text,
commentaire text
);

insert into Bouteille values
	('Chateau Lecroc','Bordeau','France',null,2002,'rouge',12,'Cuvelier Fauvarque',10,75,'non',4,4,true,'commentaire rien a dire'),
	('Chateau Leduc','Jura','France','20134',2003,'rouge', 13, 'Cuvelier Fauvarque',10,75,'non',3,4,true,'Viande rouge');

-- Afficher une bouteille --> test OK <--

/*select nom, robe from Bouteille
	where cuvee = 2002;
*/

create table Emplacement(
	id int primary key,
	nbBtll int ,
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