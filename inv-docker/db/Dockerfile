FROM postgres:9.4

ENV POSTGRES_DB invdb
ENV POSTGRES_USER invdb
ENV POSTGRES_PASSWORD inv_123

COPY ./*.sql /docker-entrypoint-initdb.d/

