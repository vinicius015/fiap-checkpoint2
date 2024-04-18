# fiap-checkpoint2

Aplicação Java proposta como Checkpoint 2 do primeiro semestre da matéria de Engenharia Web e Microserviços

## Pré-requisitos

- Java 17+
- Docker
- Acesso a internet
- Acesso ao Docker Hub

# Instalação

#### Clone

```
git clone https://github.com/vinicius015/fiap-checkpoint2.git
```

## Execução


#### Docker

* Criação de imagem

```
docker build -t fiap-checkpoint2 .
```

* Executar container

```
docker run -d -p 8080:8080 -e PROFILE=<prd|dev|stg> fiap-checkpoint2
```

* Executar container a partir do Docker Hub


Profile dev
```
docker run -d -p 8080:8080 -e PROFILE=dev vinicius015/fiap-checkpoint2
```

Profile stg
```
docker run -d -p 8080:8080 -e PROFILE=stg vinicius015/fiap-checkpoint2
```

Profile prd
```
docker run -d -p 8080:8080 -e PROFILE=prd vinicius015/fiap-checkpoint2
```
#### Navegação

- Base

http://localhost:8080/h2-console

- Login para acesso do Banco de Dados

## Features (Funcionalidades)

- Múltiplos profiles
- Banco de Dados

## Contatos

- Gabriel Penna de Lima - rm94841@fiap.com.br
- Vinicius dos Santos Amaral - rm96108@fiap.com.br