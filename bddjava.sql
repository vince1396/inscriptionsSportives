CREATE TABLE candidat(
  id_cand smallint unsigned not null auto_increment,
  nom varchar(50),
  primary key(id_cand)
);

CREATE TABLE personne(
  id_p smallint unsigned not null auto_increment,
  prenom varchar(50),
  age int,
  primary key(id_p),
  foreign key(id_p) references candidat(id_cand)
);

CREATE TABLE equipe(
  id_e smallint unsigned not null auto_increment,
  primary key(id_e),
  foreign key(id_e) references candidat(id_cand)
);

CREATE TABLE appartenir(
  id_p smallint unsigned not null,
  id_e smallint unsigned not null,
  primary key(id_p, id_e),
  foreign key(id_p) references personne(id_p),
  foreign key(id_e) references equipe(id_e)
);

CREATE TABLE competition(
  id_comp smallint unsigned not null auto_increment,
  libelle varchar(50),
  primary key(id_comp)
);

CREATE TABLE inscription(
  id_cand smallint unsigned not null,
  id_comp smallint unsigned not null,
  primary key(id_comp, id_cand),
  foreign key(id_cand) references candidat(id_cand),
  foreign key(id_comp) references competition(id_comp)
);
