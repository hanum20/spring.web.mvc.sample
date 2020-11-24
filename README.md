# README

## DB 구성

* Docker 컨테이너 실행

  ```
  docker run -p 5432:5432 -e POSTGRES_PASSWORD=oneum -e POSTGRES_USER=oneum -e POSTGRES_DB=sample --name postgres -d postgres
  ```

* 테이블 생성

  ```
  # pgadmin에서
  CREATE SEQUENCE mem_id_seq;
  
  CREATE TABLE member (
      seq integer NOT NULL DEFAULT nextval('mem_id_seq') PRIMARY KEY,
      username varchar(200) NOT NULL UNIQUE,
      password varchar(300)
  );
  ```