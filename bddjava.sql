CREATE TABLE equipe(
  id_e smallint unsigned not null auto_increment,
  nom varchar(255),
  primary key(id_e)
);

CREATE TABLE competition(
  id_comp smallint unsigned not null auto_increment,
  libelle varchar(255),
  primary key(id_comp)
);

CREATE TABLE personne(
  id_p smallint unsigned not null auto_increment,
  nom varchar(50),
  prenom varchar(50),
  age int,
  id_e int,
  primary key(id_p),
  foreign key(id_e) references equipe(id_e)
);

CREATE TABLE candidat(
  id_cand smallint unsigned not null auto_increment,
  id_e int,
  id_p int,
  id_comp int,
  primary key(id_cand),
  foreign key(id_e) references equipe(id_e),
  foreign key(id_p) references personne(id_p),
  foreign key(id_comp) references competition(id_comp)
);
