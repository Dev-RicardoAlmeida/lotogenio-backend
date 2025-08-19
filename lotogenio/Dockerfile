# Usar Tomcat com JDK 17 (slim)
FROM tomcat:10.1-jdk17-temurin

# Remover apps padrão (ROOT, manager, etc.)
RUN rm -rf /usr/local/tomcat/webapps/*

# Copiar seu .war (gerado pelo Maven) e renomear para ROOT.war
COPY target/lotogenio.war /usr/local/tomcat/webapps/ROOT.war

# Expor a porta padrão do Tomcat
EXPOSE 8080

# Rodar o Tomcat
CMD ["catalina.sh", "run"]