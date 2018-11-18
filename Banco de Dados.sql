CREATE TABLE tbCurso(
 sigla_curso VARCHAR2(50) NOT NULL PRIMARY KEY,
 nome VARCHAR2(50) NOT NULL,
 carga_horaria NUMBER(10),
 valor NUMBER(10,2),
 data_vigencia VARCHAR2(50),
 valor_hora_instrutor NUMBER(10,2),
 programa VARCHAR2(50) 
);

CREATE TABLE tbTurma(
  sigla_turma VARCHAR2(50) NOT NULL PRIMARY KEY,
  sigla_curso VARCHAR2(50),
  FOREIGN KEY(sigla_curso) REFERENCES tbCurso(sigla_curso),
  descricao VARCHAR2(50) NOT NULL,
  data_inicio VARCHAR2(50),
  data_termino VARCHAR2(50),
  periodo VARCHAR2(50),
  qtde_vaga NUMBER(10),
  observacoes VARCHAR2(50)
);

CREATE TABLE tbInstrutor(
  nome VARCHAR2(50) NOT NULL,
  data_nasc VARCHAR2(50),
  endereco VARCHAR2(50),
  numero NUMBER(10),
  bairro VARCHAR2(50),
  cidade VARCHAR2(50),
  estado VARCHAR2(50),
  CEP VARCHAR2(50),
  telefone VARCHAR2(50),
  celular VARCHAR2(50),
  sexo VARCHAR2(50),
  estado_civil VARCHAR2(50),
  RG VARCHAR2(50),
  CPF VARCHAR2(50) NOT NULL PRIMARY KEY,
  email VARCHAR2(50),
  formacao VARCHAR2(50),
  area_atuacao VARCHAR2(50)
);

CREATE TABLE tbAluno(
  nome VARCHAR2(50) NOT NULL,
  data_nasc VARCHAR2(50),
  endereco VARCHAR2(50),
  numero NUMBER(10),
  bairro VARCHAR2(50),
  cidade VARCHAR2(50),
  estado VARCHAR2(50),
  CEP VARCHAR2(50),
  telefone VARCHAR2(50),
  celular VARCHAR2(50),
  sexo VARCHAR2(50),
  estado_civil VARCHAR2(50),
  RG VARCHAR2(50),
  CPF VARCHAR2(50) NOT NULL PRIMARY KEY,
  email VARCHAR2(50),
  escolaridade VARCHAR2(50)
);